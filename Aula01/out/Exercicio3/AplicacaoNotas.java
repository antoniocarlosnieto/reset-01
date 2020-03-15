package Exercicio3;

//Criação da Classe Principal
public class AplicacaoNotas {
    //Criação da Classe Main
    public static void main(String[] args) {
        //Criando o novo Objeto
        GerenciaNotas aluno = new GerenciaNotas("Ricardo", 7);
        //Validando o Status do Aluno chamando o Método
        boolean nota = aluno.aprovado();
        //If para frase correta.
        if (nota) {
            // Se Aprovado
            System.out.println("O aluno " + aluno.nomeAluno + " com nota final " + aluno.nota + " esta aprovado");
        } else {
            // Se Reprovado
            System.out.println("O aluno " + aluno.nomeAluno + " com nota final " + aluno.nota + " esta reprovado");
        }

    }


}
