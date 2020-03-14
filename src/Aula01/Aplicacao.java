package Aula01;

//Declarando da Clasee
public class Aplicacao {

    //Declarando do Método
    public static void main(String[] args){
        //Criando Instancia Aula01.Calculadora, nome do objeto sendo criado como novo
        Calculadora antonioCalculando = new Calculadora();
        //Guardando o retorno da operação dentro da variavel somatorio.
        int somatorio = antonioCalculando.somar(23, 54);
        //Apresentação do resultado.
        System.out.println(somatorio);
        //Guardando o retorno da operação dentro da variavel subtracao
        int subtracao = antonioCalculando.subtrair(23, 54);
        //Apresentação do resultado.
        System.out.println(subtracao);
        //Guardando o retorno da operação dentro da variavel multiplicacao
        int multiplicacao = antonioCalculando.multiplicar(23, 54);
        //Apresentação do resultado.
        System.out.println(multiplicacao);

        //Criar as outras operações....

        //Aula01.Comparador
        Comparador antonioComparando = new Comparador();
        boolean resultadoMenoQue = antonioComparando.menorQue(68,54);
        System.out.println(resultadoMenoQue);
        }
    }



