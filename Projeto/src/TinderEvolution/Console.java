package TinderEvolution;

import java.util.Scanner;


public class Console {

    public static void main(String[] args) {

        MenuMusica menuMusica = new MenuMusica();
        MenuUsuario menuUsuario = new MenuUsuario();
        MenuFilme menuFilme = new MenuFilme();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("* Seja bem vindo ao Tinder Evolution!!! *");
            System.out.println("Escolha uma das opções:");
            System.out.println("[U] para Usuarios;");
            System.out.println("[M] para Musicas;");
            System.out.println("[F] para Filmes;");
            System.out.println("[X} para encerrar;");
            System.out.print(":>");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'U':
                    System.out.println("Redirecionando para Menu de Usuários...");
                    menuUsuario.opcoes();
                    break;

                case 'M':
                    System.out.println("Redirecionando para Menu de Músicas...");
                    menuMusica.opcoes();
                    break;

                case 'F':
                    System.out.println("Redirecionando para Menu de Músicas...");
                    menuFilme.opcoes();
                    break;

                case 'X':
                    System.out.println("Encerrando aplicação...");
                    System.out.println("Isso pode levar alguns minutos...");
                    System.out.println("Tenha um ótimo dia!");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }


    }

}