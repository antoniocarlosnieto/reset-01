package Aula02.Herancas;

public class Aereo extends Veiculo {
    double altitudeMaxima;


    Aereo(String nome, double velocidadeMaxima, double lotacaoMaxima, double altitudeMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
        this.altitudeMaxima = altitudeMaxima;
    }
}
