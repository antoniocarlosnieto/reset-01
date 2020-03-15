package Aula01.TemaAula01;

public class AppRpg {

    public static void main(String[] args) {

        // LUTADORES,
        Classes.Guerreiro Guerreiro = new Classes.Guerreiro("Geralt, o Guerreiro", 800, 15, 10);
        Classes.Barbaro Barbaro = new Classes.Barbaro("Dandelion, o Barbaro", 900, 20, 10);
        // MAGICOS
        Classes.Mago Mago = new Classes.Mago("Ciri, a Maga", 500, 10, 5, 500);
        Classes.Feiticeiro Feiticeiro = new Classes.Feiticeiro("Yennefer, a Feiticeira", 600, 10, 20, 500);
        // RELIGIOSOS
        Classes.Druida Druida = new Classes.Druida("Mousesack, o Druida", 550, 10, 20, 450);
        Classes.Clerigo Clerigo = new Classes.Clerigo("Skellige, o Clérigo", 450, 10, 20, 450);

                        //teste

        // ARMAS
        Armas.EspadaCurta EspadaCurta = new Armas.EspadaCurta("Espada Curta", 5);
        Armas.EspadaLonga EspadaLonga = new Armas.EspadaLonga("Espada Longa", 10);
        Armas.Machado Machado = new Armas.Machado("Machado", 15);
        // MAGIAS
        Magias.FireBolt FireBolt = new Magias.FireBolt("Fire Bolt", 10, 50);
        Magias.DeepIce DeepIce = new Magias.DeepIce("Deep Ice", 15, 70);
        Magias.Hurricane Hurricane = new Magias.Hurricane("Hurricane", 20, 100);
        // PODERES DIVINOS
        PoderesDivinos.JumpOfFaith JumpOfFaith = new PoderesDivinos.JumpOfFaith("Jump of Faith", 12, 85);
        PoderesDivinos.SacredWhisper SacredWhisper = new PoderesDivinos.SacredWhisper("Sacred Whisper", 18, 90);
        PoderesDivinos.HolyGun HolyGun = new PoderesDivinos.HolyGun("Holy Gun", 25, 110);


        //CÓDIGO
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("************* BATALHAS DE NILFGAARD *************");
        System.out.println("*************************************************");

        // PRIMEIRA BATALHA - GUERREIRO X BARBARO
        System.out.println("Primeira Batalha: " + Guerreiro.nomeGuerreiro + " x " + Barbaro.nomeBarbaro);
        System.out.println("vida do barbaro antes do ataque " + Barbaro.vidaBarbaro);
        Batalhas batalha1 = new Batalhas();
        int finalDaBatalha1 = batalha1.lutadorXLutador(Guerreiro.ataqueGuerreiro, EspadaCurta.poderEspadaCurta, Barbaro.defesaBarbaro);
        int vidaFinal1 = Barbaro.vidaBarbaro - finalDaBatalha1;
        Barbaro.vidaBarbaro = vidaFinal1;
        System.out.println(Guerreiro.nomeGuerreiro + " atacou " + Barbaro.nomeBarbaro + " com " + EspadaCurta.nomeEspadaCurta + " causando " + finalDaBatalha1 + " de dano.");
        System.out.println("vida do barbaro depois do ataque " + Barbaro.vidaBarbaro);
        System.out.println();

        // SEGUNDA BATALHA - BARBARO X GUERREIRO
        System.out.println("Segunda Batalha: " + Barbaro.nomeBarbaro + " x " + Guerreiro.nomeGuerreiro);
        System.out.println("vida do Guerreiro antes do ataque " + Guerreiro.vidaGuerreiro);
        Batalhas batalha2 = new Batalhas();
        int finalDaBatalha2 = batalha2.lutadorXLutador(Barbaro.ataqueBarbaro, EspadaLonga.poderEspadaLonga, Guerreiro.defesaGuerreiro);
        int vidaFinal2 = Guerreiro.vidaGuerreiro - finalDaBatalha2;
        Guerreiro.vidaGuerreiro = vidaFinal2;
        System.out.println(Barbaro.nomeBarbaro + " atacou " + Guerreiro.nomeGuerreiro + " com " + EspadaLonga.nomeEspadaLonga + " causando " + finalDaBatalha2 + " de dano.");
        System.out.println("vida do Guerreiro depois do ataque " + Guerreiro.vidaGuerreiro);
        System.out.println();

        // TERCEIRA BATALHA - MAGO X FEITICEIRO
        System.out.println("Terceira Batalha: " + Mago.nomeMago + " x " + Feiticeiro.nomeFeiticeiro);
        System.out.println("vida do feiticeiro antes do ataque " + Feiticeiro.vidaFeiticeiro);
        Batalhas batalha3 = new Batalhas();
        int finalDaBatalha3 = batalha3.lutadorXLutador(Mago.ataqueMago, FireBolt.poder, Feiticeiro.defesaFeiticeiro);
        int vidaFinal3 = Feiticeiro.vidaFeiticeiro - finalDaBatalha3;
        Feiticeiro.vidaFeiticeiro = vidaFinal3;
        Mago.manaMago = Mago.manaMago - FireBolt.custoMana;
        System.out.println(Mago.nomeMago + " atacou " + Feiticeiro.nomeFeiticeiro + " com " + FireBolt.nome + " causando " + finalDaBatalha3 + " de dano.");
        System.out.println("vida do Feiticeiro depois do ataque" + Feiticeiro.vidaFeiticeiro);
        System.out.println("Mana do " + Mago.nomeMago + " reduzida em " + FireBolt.custoMana + " restando " + Mago.manaMago);
        System.out.println();

        // QUARTA BATALHA - FEITICEIRO X MAGO
        System.out.println("Quarta Batalha: " + Feiticeiro.nomeFeiticeiro + " x " + Mago.nomeMago);
        System.out.println("vida do mago antes do ataque " + Mago.vidaMago);
        Batalhas batalha4 = new Batalhas();
        int finalDaBatalha4 = batalha4.lutadorXLutador(Feiticeiro.ataqueFeiticeiro, DeepIce.poder, Mago.defesaMago);
        int vidaFinal4 = Mago.vidaMago - finalDaBatalha4;
        Mago.vidaMago = vidaFinal4;
        Feiticeiro.manaFeiticeiro = Feiticeiro.manaFeiticeiro - DeepIce.custoMana;
        System.out.println(Feiticeiro.nomeFeiticeiro + " atacou " + Mago.nomeMago + " com " + DeepIce.nome + " causando " + finalDaBatalha4 + " de dano.");
        System.out.println("vida do Mago depois do ataque " + Mago.vidaMago);
        System.out.println("Mana do " + Feiticeiro.nomeFeiticeiro + " reduzida em " + DeepIce.custoMana + " restando " + Feiticeiro.manaFeiticeiro);
        System.out.println();

        //  QUINTA BATALHA - DRUIDA X CLERIGO
        System.out.println("Quinta Batalha: " + Druida.nomeDruida + " x " + Clerigo.nomeClerigo);
        System.out.println("vida do Clerigo antes do ataque " + Clerigo.vidaClerigo);
        Batalhas batalha5 = new Batalhas();
        int finalDaBatalha5 = batalha5.lutadorXLutador(Druida.ataqueDruida, HolyGun.poder, Clerigo.defesaClerigo);
        int vidaFinal5 = Clerigo.vidaClerigo - finalDaBatalha5;
        Clerigo.vidaClerigo = vidaFinal5;
        Druida.feDruida = Druida.feDruida - HolyGun.custoMana;
        System.out.println(Druida.nomeDruida + " atacou " + Clerigo.nomeClerigo + " com " + HolyGun.nome + " causando " + finalDaBatalha5 + " de dano.");
        System.out.println("vida do Clerigo depois do ataque " + Clerigo.vidaClerigo);
        System.out.println("Fé do " + Druida.nomeDruida + " reduzida em " + HolyGun.custoMana + " restando " + Druida.feDruida);
        System.out.println();

        //  SEXTA BATALHA - CLERIGO X DRUIDA
        System.out.println("Sexta Batalha: " + Clerigo.nomeClerigo + " x " + Druida.nomeDruida);
        System.out.println("vida do Druida antes do ataque " + Druida.vidaDruida);
        Batalhas batalha6 = new Batalhas();
        int finalDaBatalha6 = batalha6.lutadorXLutador(Clerigo.ataqueClerigo, SacredWhisper.poder, Druida.defesaDruida);
        int vidaFinal6 = Druida.vidaDruida - finalDaBatalha6;
        Druida.vidaDruida = vidaFinal6;
        Clerigo.feClerigo = Clerigo.feClerigo - SacredWhisper.custoMana;
        System.out.println(Clerigo.nomeClerigo + " atacou " + Druida.nomeDruida + " com " + SacredWhisper.nome + " causando " + finalDaBatalha6 + " de dano.");
        System.out.println("vida do Druida depois do ataque " + Druida.vidaDruida);
        System.out.println("Fé do " + Clerigo.nomeClerigo + " reduzida em " + SacredWhisper.custoMana + " restando " + Clerigo.feClerigo);
        System.out.println();

        //  SETIMA BATALHA - MAGO X DRUIDA
        System.out.println("Sétima Batalha: " + Mago.nomeMago + " x " + Druida.nomeDruida);
        System.out.println("vida do Druida antes do ataque " + Druida.vidaDruida);
        Batalhas batalha7 = new Batalhas();
        int finalDaBatalha7 = batalha7.lutadorXLutador(Mago.ataqueMago, Hurricane.poder, Druida.defesaDruida);
        int vidaFinal7 = Druida.vidaDruida - finalDaBatalha7;
        Druida.vidaDruida = vidaFinal7;
        Mago.manaMago = Mago.manaMago - Hurricane.custoMana;
        System.out.println(Mago.nomeMago + " atacou " + Druida.nomeDruida + " com " + Hurricane.nome + " causando " + finalDaBatalha7 + " de dano.");
        System.out.println("vida do Druida depois do ataque " + Druida.vidaDruida);
        System.out.println("Mana do " + Mago.nomeMago + " reduzida em " + Hurricane.custoMana + " restando " + Mago.manaMago);
        System.out.println();

        // OITAVA BATALHA - FEITICEIRO X CLERIGO
        System.out.println("Oitava Batalha: " + Feiticeiro.nomeFeiticeiro + " x " + Clerigo.nomeClerigo);
        System.out.println("vida do Clérigo antes do ataque " + Clerigo.vidaClerigo);
        Batalhas batalha8 = new Batalhas();
        int finalDaBatalha8 = batalha8.lutadorXLutador(Feiticeiro.ataqueFeiticeiro, DeepIce.poder, Clerigo.defesaClerigo);
        int vidaFinal8 = Clerigo.vidaClerigo - finalDaBatalha8;
        Clerigo.vidaClerigo = vidaFinal8;
        Feiticeiro.manaFeiticeiro = Feiticeiro.manaFeiticeiro - DeepIce.custoMana;
        System.out.println(Feiticeiro.nomeFeiticeiro + " atacou " + Clerigo.vidaClerigo + " com " + DeepIce.nome + " causando " + finalDaBatalha8 + " de dano.");
        System.out.println("vida do Clerigo depois do ataque " + Clerigo.vidaClerigo);
        System.out.println("Mana do " + Feiticeiro.nomeFeiticeiro + " reduzida em " + DeepIce.custoMana + " restando " + Feiticeiro.manaFeiticeiro);
        System.out.println();

        //  NONA BATALHA - DRUIDA X BARBARO
        System.out.println("Nona Batalha: " + Druida.nomeDruida + " x " + Barbaro.nomeBarbaro);
        System.out.println("vida do Barbaro antes do ataque " + Barbaro.vidaBarbaro);
        Batalhas batalha9 = new Batalhas();
        int finalDaBatalha9 = batalha9.lutadorXLutador(Druida.ataqueDruida, HolyGun.poder, Barbaro.defesaBarbaro);
        int vidaFinal9 = Barbaro.vidaBarbaro - finalDaBatalha9;
        Barbaro.vidaBarbaro = vidaFinal9;
        Druida.feDruida = Druida.feDruida - HolyGun.custoMana;
        System.out.println(Druida.nomeDruida + " atacou " + Barbaro.nomeBarbaro + " com " + HolyGun.nome + " causando " + finalDaBatalha9 + " de dano.");
        System.out.println("vida do Barbaro depois do ataque " + Barbaro.vidaBarbaro);
        System.out.println("Fé do " + Druida.nomeDruida + " reduzida em " + HolyGun.custoMana + " restando " + Druida.feDruida);
        System.out.println();

        // DECIMA BATALHA - GUERREIRO X FEITICEIRO
        System.out.println("Decima Batalha: " + Guerreiro.nomeGuerreiro + " x " + Feiticeiro.nomeFeiticeiro);
        System.out.println("vida do Feiticeiro antes do ataque " + Feiticeiro.vidaFeiticeiro);
        Batalhas batalha10 = new Batalhas();
        int finalDaBatalha10 = batalha10.lutadorXLutador(Guerreiro.ataqueGuerreiro, Machado.poderMachado, Feiticeiro.defesaFeiticeiro);
        int vidaFinal10 = Feiticeiro.vidaFeiticeiro - finalDaBatalha10;
        Feiticeiro.vidaFeiticeiro = vidaFinal10;
        System.out.println(Guerreiro.nomeGuerreiro + " atacou " + Feiticeiro.nomeFeiticeiro + " com " + Machado.nomeMachado + " causando " + finalDaBatalha10 + " de dano.");
        System.out.println("vida do Feiticeiro depois do ataque " + Feiticeiro.vidaFeiticeiro);
        System.out.println();

        // DECIMA PRIMEIRA BATALHA - BARBARO X MAGO
        System.out.println("Decima Primeira Batalha: " + Barbaro.nomeBarbaro + " x " + Mago.nomeMago);
        System.out.println("vida do Mago antes do ataque " + Mago.vidaMago);
        Batalhas batalha11 = new Batalhas();
        int finalDaBatalha11 = batalha11.lutadorXLutador(Barbaro.ataqueBarbaro, EspadaLonga.poderEspadaLonga, Mago.defesaMago);
        int vidaFinal11 = Mago.vidaMago - finalDaBatalha11;
        Mago.vidaMago = vidaFinal11;
        System.out.println(Barbaro.nomeBarbaro + " atacou " + Mago.nomeMago + " com " + EspadaLonga.nomeEspadaLonga + " causando " + finalDaBatalha11 + " de dano.");
        System.out.println("vida do Mago depois do ataque" + Mago.vidaMago);
        System.out.println();

        //  DECIMA SEGUNDA BATALHA - CLERIGO X GUERREIRO
        System.out.println("Décima Segunda Batalha: " + Clerigo.nomeClerigo + " x " + Guerreiro.nomeGuerreiro);
        System.out.println("vida do Guerreiro antes do ataque " + Guerreiro.vidaGuerreiro);
        Batalhas batalha12 = new Batalhas();
        int finalDaBatalha12 = batalha12.lutadorXLutador(Clerigo.ataqueClerigo, SacredWhisper.poder, Guerreiro.defesaGuerreiro);
        int vidaFinal12 = Guerreiro.vidaGuerreiro - finalDaBatalha12;
        Guerreiro.vidaGuerreiro = vidaFinal12;
        Clerigo.feClerigo = Clerigo.feClerigo - SacredWhisper.custoMana;
        System.out.println(Clerigo.nomeClerigo + " atacou " + Guerreiro.nomeGuerreiro + " com " + SacredWhisper.nome + " causando " + finalDaBatalha12 + " de dano.");
        System.out.println("vida do Guerreiro depois do ataque " + Guerreiro.vidaGuerreiro);
        System.out.println("Fé do " + Clerigo.nomeClerigo + " reduzida em " + SacredWhisper.custoMana + " restando " + Clerigo.feClerigo);

        //RESULTADOS FINAIS
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("****************** RESULTADOS FINAIS *************************");
        System.out.println("**************************************************************");
        System.out.println();
        System.out.println(Barbaro.nomeBarbaro + " terminou os combates com " + Barbaro.vidaBarbaro + " de vida.");
        System.out.println();
        System.out.println(Guerreiro.nomeGuerreiro + " terminou os combates com " + Guerreiro.vidaGuerreiro + " de vida.");
        System.out.println();
        System.out.println(Mago.nomeMago + " terminou os combates com " + Mago.vidaMago + " de vida e " + Mago.manaMago + " de Mana.");
        System.out.println();
        System.out.println(Feiticeiro.nomeFeiticeiro + " terminou os combates com " + Feiticeiro.vidaFeiticeiro + " de vida e " + Feiticeiro.manaFeiticeiro + " de Mana.");
        System.out.println();
        System.out.println(Druida.nomeDruida + " terminou os combates com " + Druida.vidaDruida + " de vida e " + Druida.feDruida + " de Fé.");
        System.out.println();
        System.out.println(Clerigo.nomeClerigo + " terminou os combates com " + Clerigo.vidaClerigo + " de vida e " + Clerigo.feClerigo + " de Fé.");
        System.out.println();

    }


}


