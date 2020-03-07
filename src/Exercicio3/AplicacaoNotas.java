package Exercicio3;

public class AplicacaoNotas {
    public static void main(String[] args) {
        GerenciaNotas aluno = new GerenciaNotas("Ricardo", 7);
        boolean nota = aluno.aprovado();
        System.out.println("O aluno "+aluno.nomeAluno +" com nota final " + aluno.nota + " esta "+nota);

    }


}
