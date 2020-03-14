package Aula02.Herancas;

public class Maritimo extends Veiculo {
    double profundidadeMaxima;

    Maritimo(String nome, double velocidadeMaxima, double lotacaoMaxima, double profundidadeMaxima) {
        super(nome, velocidadeMaxima, lotacaoMaxima);
        this.profundidadeMaxima = profundidadeMaxima;
    }
}
