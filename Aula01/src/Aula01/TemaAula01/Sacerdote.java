package Aula01.TemaAula01;

public class Sacerdote extends Personagem {

    int fe;

    public Sacerdote(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {

        if (vida <= 0) {
            System.out.println(nome + " Não pôde atacar pois já morreu...");
        } else {
            if (fe < poderDivino.custoFe){
                System.out.println(nome + " Não pode atacar pois não possui Fé Suficiente.");
            } else {
                double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
                alvo.vida -= dano;
                this.fe -= poderDivino.custoFe;
                registrar(alvo.nome, poderDivino.nome, dano);
                if (alvo.vida <= 0) {
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }
    }
}

