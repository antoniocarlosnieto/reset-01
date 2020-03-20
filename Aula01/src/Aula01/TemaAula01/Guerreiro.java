package Aula01.TemaAula01;

public class Guerreiro extends HomemDeArmas {


    Guerreiro(final String nome, final double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

}


/*
    //CRIANDO A CLASSE GUERREIRO
    class Guerreiro {
        String nome;
        int vida;
        int ataque;
        int defesa;

        Guerreiro(String nome, int vida, int ataque, int defesa) {
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;
        }

        double calcularDano(double defesa, double poder) {
            return ataque * poder - defesa;
        }


        void registrar(String alvo, String habilidade, double dano) {
            System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
        }

        void imprimirEstado() {
            System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
        }

        void atacar(Guerreiro alvo, Arma arma) {
            if (vida <= 0) {
                System.out.println(nome + "Não pôde atacar pois está morto...");
            } else {
                double dano = calcularDano(alvo.defesa, arma.poderAtaque);
                alvo.vida -= dano;
                registrar(alvo.nome, arma.nome, dano);
                if (alvo.vida <= 0){
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }
        void atacar(Barbaro alvo, Arma arma) {
            if (vida <= 0) {
                System.out.println(nome + "Não pôde atacar pois está morto...");
            } else {
                double dano = calcularDano(alvo.defesa, arma.poderAtaque);
                alvo.vida -= dano;
                registrar(alvo.nome, arma.nome, dano);
                if (alvo.vida <= 0){
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }

        void atacar(Mago alvo, Arma arma) {
            if (vida <= 0) {
                System.out.println(nome + "Não pôde atacar pois está morto...");
            } else {
                double dano = calcularDano(alvo.defesa, arma.poderAtaque);
                alvo.vida -= dano;
                registrar(alvo.nome, arma.nome, dano);
                if (alvo.vida <= 0){
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }

        void atacar(Feiticeiro alvo, Arma arma) {
            if (vida <= 0) {
                System.out.println(nome + "Não pôde atacar pois está morto...");
            } else {
                double dano = calcularDano(alvo.defesa, arma.poderAtaque);
                alvo.vida -= dano;
                registrar(alvo.nome, arma.nome, dano);
                if (alvo.vida <= 0){
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }

        void atacar(Clerigo alvo, Arma arma) {
            if (vida <= 0) {
                System.out.println(nome + "Não pôde atacar pois está morto...");
            } else {
                double dano = calcularDano(alvo.defesa, arma.poderAtaque);
                alvo.vida -= dano;
                registrar(alvo.nome, arma.nome, dano);
                if (alvo.vida <= 0){
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }

        void atacar(Druida alvo, Arma arma) {
            if (vida <= 0) {
                System.out.println(nome + "Não pôde atacar pois está morto...");
            } else {
                double dano = calcularDano(alvo.defesa, arma.poderAtaque);
                alvo.vida -= dano;
                registrar(alvo.nome, arma.nome, dano);
                if (alvo.vida <= 0){
                    System.out.println(alvo.nome + " morreu...");
                }
            }
        }

    }
*/
