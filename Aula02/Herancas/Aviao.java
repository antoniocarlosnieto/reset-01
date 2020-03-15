package Herancas;

public class Aviao extends Aereo {

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", lotacaoMaxima=" + lotacaoMaxima +
                '}';
    }

    Aviao(String nome, double velocidadeMaxima, double lotacaoMaxima, double altitudeMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima, altitudeMaxima);


    }
}
