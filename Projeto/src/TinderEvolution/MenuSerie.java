package TinderEvolution;


//import Construtor.CategoriaFilme;
//import Construtor.Filme;
//import Gerenciador.GerenciadorFilme;

import Construtor.CategoriaSerie;
import Construtor.Serie;
import Gerenciador.GerenciadorSerie;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuSerie {

    public GerenciadorSerie gerenciador;

    public MenuSerie() {
        this.gerenciador = new GerenciadorSerie();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Series *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Registro;");
            System.out.println("[E] - Editar dados de uma Série;");
            System.out.println("[L] - Listar todas as Séries;");
            System.out.println("[P] - Procurar por uma Série Especifica;");
            System.out.println("[D] - Deletar Série;");
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
        System.out.println("Novo Cadastro de Série:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();
        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();
        System.out.print("Mes de Lançamento: ");
        int mes = scanner.nextInt();
        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();
        System.out.print("Número de Temporadas: ");
        int temporadas = scanner.nextInt();
        System.out.print("Número de Episódios: ");
        int episodios = scanner.nextInt();

        System.out.println("Escolha uma das opções de Categoria:");
        System.out.println("[D] - Drama");
        System.out.println("[C] - Comédia");
        System.out.println("[S] - Suspense");
        System.out.println("[T] - Terror");
        System.out.println("[A] - Ação");
        System.out.println("[I] - Sitcom");
        System.out.print(":>");
        String categoria = scanner.nextLine();
        scanner.nextLine();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case "D":
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case "C":
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case "S":
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case "T":
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case "A":
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case "I":
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();


        Serie serie = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), temporadas, episodios, categoriaSerie, sinopse);
        gerenciador.salvar(serie);

    }

    public void editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Série...");
        System.out.println("Qual Série deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Diretor ");
        String diretor = scanner.next();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.print("Número de Temporadas: ");
        int temporadas = scanner.nextInt();

        System.out.print("Número de Episódios: ");
        int episodios = scanner.nextInt();


        System.out.println("Categoria: ");
        System.out.println("[D] DRAMA");
        System.out.println("[C] COMÉDIA");
        System.out.println("[S] SUSPENSE");
        System.out.println("[T] TERROR");
        System.out.println("[A] AÇÃO");
        System.out.println("[I] SITCOM");
        System.out.print("> ");
        String categoria = scanner.nextLine();
        scanner.nextLine();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case "D":
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case "C":
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case "S":
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case "T":
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case "A":
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case "I":
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
        }

        System.out.print("Sinopse ");
        String sinopse = scanner.next();

        Serie atualizacao = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), temporadas, episodios, categoriaSerie, sinopse);

        Serie serieAtualizado = gerenciador.editar(id, atualizacao);

        if (serieAtualizado == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serieAtualizado);
        }

    }


    public void listar() {

        System.out.println("Listagem de Series...");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Série...");
        System.out.println("Qual o código da Série? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Serie não encontrada.");
        } else {
            System.out.println(serie);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Série...");
        System.out.println("Qual série deseja deletar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Serie deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }

    }

}
