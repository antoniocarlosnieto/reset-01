package TinderEvolution;


import Construtor.EstiloMusical;
        import Construtor.Musica;
        import Gerenciador.GerenciadorMusica;


import java.time.LocalDate;
        import java.util.List;
        import java.util.Scanner;

public class MenuMusica {

    public GerenciadorMusica gerenciador;

    public MenuMusica() {
        this.gerenciador = new GerenciadorMusica();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Musicas *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Registro;");
            System.out.println("[L] - Gerar lista das Músicas;");
            System.out.println("[P] - Procurar Música;");
            System.out.println("[D] - Deletar Musica;");
            System.out.println("[X] - Voltar para o Menu Anterior;");
            System.out.println(":>");
            opcao = scanner.next().charAt(0);

            switch (opcao){
                case 'C':
                    criar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("Retornando ao Menu anterior.");
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida.");

            }
        }
    }

    public void criar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Novo Cadastro de Musica:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();
        System.out.print("Mes de Lançamento: ");
        int mes = scanner.nextInt();
        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();
        System.out.println("Escolha uma das opções de estilo:");
        System.out.println("[F] - Funk");
        System.out.println("[P] - Pagode");
        System.out.println("[R] - Rock");
        System.out.println("[I] - Indie");
        System.out.println("[S] - Sertanejo");
        System.out.println("[M] - Metal");
        System.out.print(":>");
        String estilo = scanner.next();

        EstiloMusical estiloMusical;
        switch (estilo) {
            case "F":
                estiloMusical = EstiloMusical.FUNK;
                break;
            case "P":
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case "R":
                estiloMusical = EstiloMusical.ROCK;
                break;
            case "I":
                estiloMusical = EstiloMusical.INDIE;
                break;
            case "S":
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case "M":
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.FUNK;
                break;
        }

        Musica musica = new Musica(nome, autor, LocalDate.of(ano, mes, dia), estiloMusical);
        gerenciador.salvar(musica);

    }


    public void listar() {

        System.out.println("Listagem de Música...");
        List<Musica> musicas = gerenciador.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Música...");
        System.out.println("Qual o código da música? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Musica musica = gerenciador.procurar(id);

        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Música...");
        System.out.println("Qual música deseja deletar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Música deletada.");
        } else {
            System.out.println("Música não encontrada.");
        }

    }

}
