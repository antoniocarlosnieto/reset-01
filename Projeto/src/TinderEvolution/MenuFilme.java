package TinderEvolution;


import Construtor.CategoriaFilme;
import Construtor.Filme;
import Gerenciador.GerenciadorFilme;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuFilme {

    public GerenciadorFilme gerenciador;

    public MenuFilme() {
        this.gerenciador = new GerenciadorFilme();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Filmes *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Registro;");
            System.out.println("[E] - Editar dados de um Filme;");
            System.out.println("[L] - Listar todos os Filmes;");
            System.out.println("[P] - Procurar por um Filme Específico;");
            System.out.println("[D] - Deletar Filme;");
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
        System.out.println("Novo Cadastro de Filme:");
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

        System.out.println("Escolha uma das opções de Categoria:");
        System.out.println("[D] - Drama");
        System.out.println("[C] - Comédia");
        System.out.println("[S] - Suspense");
        System.out.println("[T] - Terror");
        System.out.println("[A] - Ação");
        System.out.println("[M] - Musical");
        System.out.print(":>");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case "D":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "C":
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "T":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "A":
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case "M":
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();


        Filme filme = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);
        gerenciador.salvar(filme);

    }

    public void editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Filme...");
        System.out.println("Qual filme deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
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

        System.out.println("Categoria: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] METAL");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case "D":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "C":
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "T":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "A":
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case "M":
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
        }

        System.out.print("Sinopse ");
        String sinopse = scanner.next();

        Filme atualizacao = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);

        Filme filmeAtualizado = gerenciador.editar(id, atualizacao);

        if (filmeAtualizado == null) {
            System.out.println("Filme não encontrada.");
        } else {
            System.out.println(filmeAtualizado);
        }

    }


    public void listar() {

        System.out.println("Listagem de Filmes...");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Filme...");
        System.out.println("Qual o código do filme? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Filme filme = gerenciador.procurar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Filme...");
        System.out.println("Qual filme deseja deletar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Filme deletada.");
        } else {
            System.out.println("Filme não encontrado.");
        }

    }

}
