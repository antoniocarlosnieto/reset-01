package Aula01.TemaAula01;

public class PoderDivino {

    String nome;

    double poderAtaque;

    double custoFe;

    PoderDivino(String nome, double poderAtaque, double custoFe) {
        this.nome = nome;
        this.poderAtaque = poderAtaque;
        this.custoFe = custoFe;
    }
}



/*
public class PoderDivino {
    static class JumpOfFaith {
        String nome;
        int poder;
        int custoMana;

        JumpOfFaith(String nome, int poder, int custoMana) {
            this.nome = nome;
            this.poder = poder;
            this.custoMana = custoMana;
        }
    }

    static class HolyGun {
        String nome;
        int poder;
        int custoMana;

        HolyGun(String nome, int poder, int custoMana) {
            this.nome = nome;
            this.poder = poder;
            this.custoMana = custoMana;
        }
    }

    static class SacredWhisper {
        String nome;
        int poder;
        int custoMana;

        SacredWhisper(String nome, int poder, int custoMana) {
            this.nome = nome;
            this.poder = poder;
            this.custoMana = custoMana;
        }
    }


}
*/