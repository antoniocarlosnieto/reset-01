package Aula01.TemaAula01;

    public class Personagem {

        String nome;

        double vida;

        double ataque;

        double defesa;

        public Personagem(final String nome, final double vida, final double ataque, final double defesa) {
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;
        }

        double calcularDano(double defesa, double poder) {
            return ataque * poder - defesa;
        }

        void registrar(String nomeAlvo, String habilidade, double dano) {
            System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + dano + " de dano");
        }

    }

