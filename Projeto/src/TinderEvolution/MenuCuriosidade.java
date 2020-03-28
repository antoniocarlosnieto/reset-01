package TinderEvolution;



import Construtor.CategoriaCuriosidade;
import Construtor.Curiosidade;
import Gerenciador.GerenciadorCuriosidade;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuCuriosidade {

    public GerenciadorCuriosidade gerenciador;

    public MenuCuriosidade() {
        this.gerenciador = new GerenciadorCuriosidade();
    }


    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X'){

            System.out.println("* Menu de Curiosidades *");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[C] - Criar novo Registro;");
            System.out.println("[E] - Editar dados de uma Curiosidade;");
            System.out.println("[L] - Listar todas as Curiosidades;");
            System.out.println("[P] - Procurar por uma Curiosidade Específica;");
            System.out.println("[D] - Deletar Curiosidade;");
            System.out.println("[X] - Voltar para o Menu Anterior;");
            System.out.print(":> ");
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
        System.out.println("Novo Cadastro de Curiosidade:");
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Escolha uma das opções de categoria:");
        System.out.println("[1] - Comportamento");
        System.out.println("[2] - Evento");
        System.out.println("[3] - Aparencia");
        System.out.println("[4] - Alimentação");
        System.out.print(":>");
        String categoria = scanner.nextLine();
        //scanner.nextLine();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case "1":
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case "2":
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case "3":
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case "4":
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, categoriaCuriosidade);
        gerenciador.salvar(curiosidade);

    }

    public void editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Curiosidade...");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        System.out.print("Descrição: ");
        String descricao = scanner.next(); //Alterado para Line para não pular o prox item
        scanner.nextLine();

        System.out.println("Escolha uma das opções de categoria:");
        System.out.println("[1] - Comportamento");
        System.out.println("[2] - Evento");
        System.out.println("[3] - Aparencia");
        System.out.println("[4] - Alimentação");
        System.out.print(":>");
        String categoria = scanner.nextLine();
        //scanner.nextLine();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case "1":
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case "2":
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case "3":
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case "4":
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade atualizacao = new Curiosidade(descricao, categoriaCuriosidade);

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidadeAtualizada);
        }

    }


    public void listar() {

        System.out.println("Listagem de Música...");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }

    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Curiosidade...");
        System.out.println("Qual o código da curiosidade? ");

        System.out.print(":> ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }
    }

    public void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exclusão de Curiosidade...");
        System.out.println("Qual curiosidade deseja deletar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print(":> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }

    }

}
