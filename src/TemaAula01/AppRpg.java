package TemaAula01;

public class AppRpg {

    public static void main(String[] args) {
        // LUTADORES, MAGICOS E RELIGIOSOS
        Classes.Guerreiro Guerreiro = new Classes.Guerreiro("Guerreiro1", 1500, 15, 10);
        Classes.Barbaro Barbaro = new Classes.Barbaro("Barbaro1", 2000, 20, 10);
        Classes.Mago Mago = new Classes.Mago("Mago1", 1000, 10, 5, 1000);
        Classes.Feiticeiro Feiticeiro = new Classes.Feiticeiro("Feiticeiro1",1000,10,20,1000);
        Classes.Druida Druida = new Classes.Druida("Druida1",1000,10,20,1000);
        Classes.Clerigo Clerigo = new Classes.Clerigo("Clerigo1",1000, 10, 20, 1000);

        // ARMAS
        Armas.EspadaCurta EspadaCurta = new Armas.EspadaCurta("Espada Curta", 5);
        Armas.EspadaLonga EspadaLonga = new Armas.EspadaLonga("Espada Longa", 10);
        Armas.Machado Machado = new Armas.Machado("Machado", 15);


        //CÓDIGO
        System.out.println("*** BATALHAS FINAIS ***");

        System.out.println("Primeira Batalha: " + Guerreiro.nomeGuerreiro + " x " + Barbaro.nomeBarbaro);
        Batalhas batalha1 = new Batalhas();
        int finalDaBatalha1 = batalha1.lutadorXLutador(Guerreiro.ataqueGuerreiro, EspadaCurta.poderEspadaCurta, Barbaro.defesaBarbaro);
        System.out.println(Guerreiro.nomeGuerreiro + " atacou " + Barbaro.nomeBarbaro + " com " + EspadaCurta.nomeEspadaCurta + " causando " + finalDaBatalha1 + " de dano.");

        System.out.println("Segunda Batalha: " + Guerreiro.nomeGuerreiro + " x " + Barbaro.nomeBarbaro);
        Batalhas batalha2 = new Batalhas();
        int finalDaBatalha2 = batalha2.lutadorXLutador(Guerreiro.ataqueGuerreiro, EspadaCurta.poderEspadaCurta, Barbaro.defesaBarbaro);
        System.out.println(Guerreiro.nomeGuerreiro + " atacou " + Barbaro.nomeBarbaro + " com " + EspadaCurta.nomeEspadaCurta + " causando " + finalDaBatalha2 + " de dano.");

    }


    }


