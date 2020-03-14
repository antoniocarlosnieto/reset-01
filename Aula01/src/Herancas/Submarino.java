package Herancas;

public class Submarino extends Maritimo {

    @Override
    public String toString() {
        return "Submarino{" +
                "profundidadeMaxima=" + profundidadeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }

    Submarino(String nome, double velocidadeMaxima, double lotacaoMaxima, double profundidadeMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima, profundidadeMaxima);
    }
}

