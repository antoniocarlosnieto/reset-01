package TinderEvolution;

import java.util.Scanner;


public class Console {

    public static void main(String[] args) {

        MenuMusica menuMusica = new MenuMusica();
        MenuUsuario menuUsuario = new MenuUsuario();
        MenuFilme menuFilme = new MenuFilme();
        MenuSerie menuSerie = new MenuSerie();
        MenuJogo menuJogo = new MenuJogo();
        MenuEsporte menuEsporte = new MenuEsporte();
        MenuCuriosidade menuCuriosidade = new MenuCuriosidade();



        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("* Seja bem vindo ao Tinder Evolution!!! *");
            System.out.println("Escolha uma das opções:");
            System.out.println("[U] para Usuarios;");
            System.out.println("[M] para Musicas;");
            System.out.println("[F] para Filmes;");
            System.out.println("[S] para Series;");
            System.out.println("[J] para Jogos;");
            System.out.println("[E] para Esportes;");
            System.out.println("[C] para Curiosidades;");
            System.out.println("[X} para Encerrar;");
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
                    System.out.println("Redirecionando para Menu de Filmes...");
                    menuFilme.opcoes();
                    break;

                case 'S':
                    System.out.println("Redirecionando para Menu de Series...");
                    menuSerie.opcoes();
                    break;

                case 'J':
                    System.out.println("Redirecionando para Menu de Jogos...");
                    menuJogo.opcoes();
                    break;

                case 'E':
                    System.out.println("Redirecionando para Menu de Esportes...");
                    menuEsporte.opcoes();
                    break;

                case 'C':
                    System.out.println("Redirecionando para Menu de Curiosidades...");
                    menuCuriosidade.opcoes();
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