package Aula01.TemaAula01;

public class Mago extends Arcano {

    Mago(final String nome, final double vida, final double ataque, final double defesa, final int mana) {
        super(nome, vida, ataque, defesa, mana);
    }
}

/*
//CRIANDO A CLASSE MAGO
class Mago {
    String nome;
    int vida;
    int ataque;
    int defesa;
    int mana;

    Mago(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Guerreiro alvo, Magia magia) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, magia.poderAtaque);
            alvo.vida -= dano;
            this.mana -= magia.custoMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Barbaro alvo, Magia magia) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, magia.poderAtaque);
            alvo.vida -= dano;
            this.mana -= magia.custoMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Mago alvo, Magia magia) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, magia.poderAtaque);
            alvo.vida -= dano;
            this.mana -= magia.custoMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Feiticeiro alvo, Magia magia) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, magia.poderAtaque);
            alvo.vida -= dano;
            this.mana -= magia.custoMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

     void atacar(Druida alvo, Magia magia) {
         if (vida <= 0) {
             System.out.println(nome + "Não pôde atacar pois está morto...");
         } else {
             double dano = calcularDano(alvo.defesa, magia.poderAtaque);
             alvo.vida -= dano;
             this.mana -= magia.custoMana;
             registrar(alvo.nome, magia.nome, dano);
             if (alvo.vida <= 0){
                 System.out.println(alvo.nome + " morreu...");
             }
         }
    }

}

 */
