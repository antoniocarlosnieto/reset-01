package TinderEvolution;

import Construtor.Usuario;
import Gerenciador.GerenciadorUsuario;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuUsuario {

    public GerenciadorUsuario gerenciador;

    public MenuUsuario() {
        this.gerenciador = new GerenciadorUsuario();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Usuarios *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Usuario;");
            System.out.println("[E] - Editar dados de um Usuario;");
            System.out.println("[L] - Listar todos Os Usuarios;");
            System.out.println("[P] - Procurar por um Usuario Específico;");
            System.out.println("[D] - Deletar Usuario;");
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
        System.out.println("Novo Cadastro de usuario:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Ano de Nascimento: ");
        int ano = scanner.nextInt();
        System.out.print("Mes de Nascimento: ");
        int mes = scanner.nextInt();
        System.out.print("Dia de Nascimento: ");
        int dia = scanner.nextInt();
        System.out.println("Telefone com DDD");
        String telefone = scanner.next();
        System.out.println("Bio");
        String bio = scanner.next();
        System.out.println("Dados de Localização:");
        System.out.println("Latitude:");
        String latitude = scanner.next();
        System.out.println("Longitude");
        String longitude = scanner.next();

//        EstiloMusical estiloMusical;
//        switch (estilo) {
//            case "F":
//                estiloMusical = EstiloMusical.FUNK;
//                break;
//            case "P":
//                estiloMusical = EstiloMusical.PAGODE;
//                break;
//            case "R":
//                estiloMusical = EstiloMusical.ROCK;
//                break;
//            case "I":
//                estiloMusical = EstiloMusical.INDIE;
//                break;
//            case "S":
//                estiloMusical = EstiloMusical.SERTANEJO;
//                break;
//            case "M":
//                estiloMusical = EstiloMusical.METAL;
//                break;
//            default:
//                estiloMusical = EstiloMusical.FUNK;
//                break;
//        }

        Usuario usuario = new Usuario(nome, email, LocalDate.of(ano, mes, dia), telefone, bio, latitude, longitude);
        gerenciador.salvar(usuario);

    }

    public void editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Usuario...");
        System.out.println("Qual Usuario deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("E-mail: ");
        String email = scanner.next();
        System.out.print("Ano de Nascimento: ");
        int ano = scanner.nextInt();
        System.out.print("Mês de Nascimento: ");
        int mes = scanner.nextInt();
        System.out.print("Dia de Nascimento: ");
        int dia = scanner.nextInt();
        System.out.println("Telefone com DDD: ");
        String telefone = scanner.next();
        System.out.println("Bio");
        String bio = scanner.next();
        System.out.println("Dados de Localização:");
        System.out.println("Latitude:");
        String latitude = scanner.next();
        System.out.println("Longitude");
        String longitude = scanner.next();

//
//        EstiloMusical estiloMusical;
//        switch (estilo) {
//            case "F":
//                estiloMusical = EstiloMusical.FUNK;
//                break;
//            case "P":
//                estiloMusical = EstiloMusical.PAGODE;
//                break;
//            case "R":
//                estiloMusical = EstiloMusical.ROCK;
//                break;
//            case "I":
//                estiloMusical = EstiloMusical.INDIE;
//                break;
//            case "S":
//                estiloMusical = EstiloMusical.SERTANEJO;
//                break;
//            case "M":
//                estiloMusical = EstiloMusical.METAL;
//                break;
//            default:
//                estiloMusical = EstiloMusical.FUNK;
//                break;
//        }

        Usuario atualizacao = new Usuario(nome, email, LocalDate.of(ano, mes, dia), telefone, bio, latitude, longitude);

        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if (usuarioAtualizado == null) {
            System.out.println("Usuario não encontrado.");
        } else {
            System.out.println(usuarioAtualizado);
        }

    }


    public void listar() {

        System.out.println("Listagem de Usuarios...");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Usuário...");
        System.out.println("Qual o código do Usuário? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if (usuario == null) {
            System.out.println("Usuário não encontrada.");
        } else {
            System.out.println(usuario);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Usuario...");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Usuário deletado.");
        } else {
            System.out.println("Usuário não encontrado.");
        }

    }

}
