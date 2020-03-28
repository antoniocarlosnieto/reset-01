package TinderEvolution;




import Construtor.CategoriaJogo;
import Construtor.Jogo;
import Gerenciador.GerenciadorJogo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuJogo {

    public GerenciadorJogo gerenciador;

    public MenuJogo() {
        this.gerenciador = new GerenciadorJogo();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Jogos *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Registro;");
            System.out.println("[E] - Editar dados de um Jogo;");
            System.out.println("[L] - Listar todos os Jogos;");
            System.out.println("[P] - Procurar por um Jogo Específico;");
            System.out.println("[D] - Deletar Jogo;");
            System.out.println("[X] - Voltar para o Menu Anterior;");
            System.out.println(":>");
            opcao = scanner.next().charAt(0);

            switch (opcao){
                case 'C':
                    criar();
                    break;
                case 'E':
                    editar();
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
        System.out.println("Novo Cadastro de Jogo:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();
        System.out.print("Mes de Lançamento: ");
        int mes = scanner.nextInt();
        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Escolha uma das opções de Categoria:");
        System.out.println("[D] - Drama");
        System.out.println("[C] - Comédia");
        System.out.println("[S] - Suspense");
        System.out.println("[T] - Terror");
        System.out.println("[A] - Ação");
        System.out.println("[M] - Musical");
        System.out.print(":>");
        String categoria = scanner.nextLine();
        scanner.nextLine();

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case "A":
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
        }

        System.out.print("Plataforma: ");
        String plataforma = scanner.nextLine();


        Jogo jogo = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataforma);
        gerenciador.salvar(jogo);

    }

    public void editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Publisher ");
        String publisher = scanner.next();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.print("> ");
        String categoria = scanner.nextLine();
        scanner.nextLine();

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case "A":
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
        }

        System.out.print("Plataforma ");
        String plataforma = scanner.next();

        Jogo atualizacao = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataforma);

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrada.");
        } else {
            System.out.println(jogoAtualizado);
        }

    }


    public void listar() {

        System.out.println("Listagem de Jogos...");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Jogo...");
        System.out.println("Qual o código do Jogo? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Jogo...");
        System.out.println("Qual jogo deseja deletar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletada.");
        } else {
            System.out.println("Jogo não encontrado.");
        }

    }

}
