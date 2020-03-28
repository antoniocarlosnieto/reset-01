package TinderEvolution;


import Construtor.Esporte;
import Gerenciador.GerenciadorEsporte;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuEsporte {

    public GerenciadorEsporte gerenciador;

    public MenuEsporte() {
        this.gerenciador = new GerenciadorEsporte();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Esportes *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Registro;");
            System.out.println("[E] - Editar dados de um Esporte;");
            System.out.println("[L] - Listar todos os Esportes;");
            System.out.println("[P] - Procurar por um Esporte Específico;");
            System.out.println("[D] - Deletar Esporte;");
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
        System.out.println("Novo Cadastro de Esporte:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Esporte esporte = new Esporte(nome);
        gerenciador.salvar(esporte);

    }

    public void editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Esporte...");
        System.out.println("Qual esporte deseja editar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        System.out.print("Nome: ");
        String nome = scanner.next();


        Esporte atualizacao = new Esporte(nome);

        Esporte esporteAtualizado = gerenciador.editar(id, atualizacao);

        if (esporteAtualizado == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporteAtualizado);
        }

    }


    public void listar() {

        System.out.println("Listagem de Esporte...");
        List<Esporte> esportes = gerenciador.listar();

        for (Esporte esporte : esportes) {
            System.out.println(esporte);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Esporte...");
        System.out.println("Qual o código do Esporte? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Esporte esporte = gerenciador.procurar(id);

        if (esporte == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporte);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Esporte...");
        System.out.println("Qual esporte deseja deletar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[" + esporte.getId() + "] - " + esporte.getNome());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Esporte deletado.");
        } else {
            System.out.println("Esporte não encontrado.");
        }

    }

}
