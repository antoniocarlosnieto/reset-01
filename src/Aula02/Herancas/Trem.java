package Aula02.Herancas;

public class Trem extends Terrestre {
    @Override
    public String toString() {
        return "Trem{" +
                "numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }

    Trem(String nome, double velocidadeMaxima, double lotacaoMaxima, double numeroDeRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima, numeroDeRodas);
    }
}

