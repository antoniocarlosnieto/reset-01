package Herancas;

public class Terrestre extends Veiculo {
    double numeroDeRodas;

    Terrestre(String nome, double velocidadeMaxima, double lotacaoMaxima, double numeroDeRodas) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
    }
}
