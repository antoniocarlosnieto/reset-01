package Aula01.TemaAula01;

    public class Arcano extends Personagem {

        int mana;

        public Arcano(final String nome, final double vida, final double ataque, final double defesa, int mana) {
            super(nome, vida, ataque, defesa);
            this.mana = mana;
        }

        void imprimirEstado() {
            System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
        }

        void atacar(Personagem alvo, Magia magia) {

            if (vida <= 0) {
                System.out.println(nome + " Não pôde atacar pois já morreu...");
            } else {
                if (mana < magia.custoMana) {
                    System.out.println(nome + " Não pode atacar pois não possui Mana Suficiente.");
                } else {
                    double dano = calcularDano(alvo.defesa, magia.poderAtaque);
                    alvo.vida -= dano;
                    this.mana -= magia.custoMana;
                    registrar(alvo.nome, magia.nome, dano);
                    if (alvo.vida <= 0) {
                        System.out.println(alvo.nome + " morreu...");
                    }
                }
            }

        }
    }

