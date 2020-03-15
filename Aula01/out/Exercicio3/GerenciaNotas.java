package Exercicio3;

public class GerenciaNotas {
    String nomeAluno;
    int nota;

    GerenciaNotas(String nomeAluno, int nota) {
        this.nomeAluno = nomeAluno;
        this.nota = nota;
    }

    boolean aprovado() {
        return nota >= 7;


    }
}
