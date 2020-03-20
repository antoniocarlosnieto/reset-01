package Aula01.TemaAula01;

public class Druida extends Sacerdote {

    Druida(final String nome, final double vida, final double ataque, final double defesa, final int fe) {
        super(nome, vida, ataque, defesa, fe);
    }
}

/*
//CRIANDO A CLASSE DRUIDA
class Druida {
    String nome;
    int vida;
    int ataque;
    int defesa;
    int fe;

    Druida(String nome, int vida, int ataque, int defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    void atacar(Guerreiro alvo, PoderDivino poderDivino) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Barbaro alvo, PoderDivino poderDivino) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Mago alvo, PoderDivino poderDivino) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Feiticeiro alvo, PoderDivino poderDivino) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Clerigo alvo, PoderDivino poderDivino) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }

    void atacar(Druida alvo, PoderDivino poderDivino) {
        if (vida <= 0) {
            System.out.println(nome + "Não pôde atacar pois está morto...");
        } else {
            double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
            alvo.vida -= dano;
            this.fe -= poderDivino.custoFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0){
                System.out.println(alvo.nome + " morreu...");
            }
        }
    }
}


 */
