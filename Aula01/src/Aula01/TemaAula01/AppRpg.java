package Aula01.TemaAula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppRpg {

    public static void main(String[] args) {

        // LUTADORES,
        Guerreiro Geralt = new Guerreiro("Geralt", 300, 15, 10);
        Barbaro Dandelion = new Barbaro("Dandelion", 250, 20, 10);
        // MAGICOS
        Mago Ciri = new Mago("Ciri", 500, 10, 5, 200);
        Feiticeiro Yennefer = new Feiticeiro("Yennefer", 700, 10, 20, 200);
        // RELIGIOSOS
        Druida Mousesack = new Druida("Mousesack", 250, 10, 20, 100);
        Clerigo Skellige = new Clerigo("Skellige", 300, 10, 20, 150);


        // ARMAS
        Arma EspadaCurta = new Arma("Espada Curta", 5);
        Arma EspadaLonga = new Arma("Espada Longa", 10);
        Arma Machado = new Arma("Machado", 15);
        // MAGIAS
        Magia FireBolt = new Magia("Fire Bolt", 200, 50);
        Magia DeepIce = new Magia("Deep Ice", 150, 70);
        Magia Hurricane = new Magia("Hurricane", 250, 100);
        // PODERES DIVINOS
        PoderDivino JumpOfFaith = new PoderDivino("Jump of Faith", 12, 85);
        PoderDivino SacredWhisper = new PoderDivino("Sacred Whisper", 18, 90);
        PoderDivino HolyGun = new PoderDivino("Holy Gun", 25, 110);



        //CÓDIGO
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("************* BATALHAS DE NILFGAARD *************");
        System.out.println("*************************************************");

        Scanner scanner = new Scanner(System.in);
        int userInicial = 0;
        System.out.println("Crie seus próprios heróis!");
        System.out.println("Com quantos personagens deseja jogar?");
        int usersTotal = scanner.nextInt();

        List<Guerreiro> guerreiros = new ArrayList<>();
        List<Barbaro> barbaros = new ArrayList<>();
        List<Clerigo> clerigos = new ArrayList<>();
        List<Druida> druidas = new ArrayList<>();
        List<Mago> magos = new ArrayList<>();
        List<Feiticeiro> feiticeiros = new ArrayList<>();


        for (userInicial = 0; userInicial < usersTotal; userInicial++ ) {

            //Scanner in = new Scanner(System.in);
            System.out.println("Primeiro, escolha a classe do personagem:");
            System.out.println("G - Guerreiro");
            System.out.println("B - Bárbaro");
            System.out.println("C - Clérigo");
            System.out.println("D - Druida");
            System.out.println("M - Mago");
            System.out.println("F - Feiticeiro");

            System.out.print("Tipo: ");
            char tipo = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Vida: ");
            double vida = scanner.nextDouble();
            System.out.print("Ataque: ");
            double ataque = scanner.nextDouble();
            System.out.print("Defesa: ");
            double defesa = scanner.nextDouble();

            int fe;
            int mana;

            switch (tipo) {
                case 'G':
                    System.out.println("Criando guerreiro...");
                    Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa);
                    guerreiros.add(guerreiro);
                    guerreiro.imprimirEstado();
                    break;

                case 'B':
                    System.out.println("Criando bárbaro...");
                    Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa);
                    barbaros.add(barbaro);
                    barbaro.imprimirEstado();
                    break;

                case 'C':
                    System.out.print("Fé: ");
                    fe = scanner.nextInt();

                    System.out.println("Criando clérigo...");
                    Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
                    clerigos.add(clerigo);
                    clerigo.imprimirEstado();
                    break;

                case 'D':
                    System.out.print("Fé: ");
                    fe = scanner.nextInt();

                    System.out.println("Criando druida...");
                    Druida druida = new Druida(nome, vida, ataque, defesa, fe);
                    druidas.add(druida);
                    druida.imprimirEstado();
                    break;

                case 'M':
                    System.out.print("Mana: ");
                    mana = scanner.nextInt();

                    System.out.println("Criando mago...");
                    Mago mago = new Mago(nome, vida, ataque, defesa, mana);
                    magos.add(mago);
                    mago.imprimirEstado();
                    break;

                case 'F':
                    System.out.print("Mana: ");
                    mana = scanner.nextInt();

                    System.out.println("Criando feiticeiro...");
                    Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, mana);
                    feiticeiros.add(feiticeiro);
                    feiticeiro.imprimirEstado();
                    break;
            }

        }


        //Preparação e Apresentação do Combate

        //Combates


        if (guerreiros.size() > 0){
            guerreiros.get(0).atacar(Geralt,EspadaCurta);
        }
        Ciri.atacar(Mousesack, FireBolt);
        Ciri.atacar(Dandelion, DeepIce);
        if (magos.size() > 0){
            magos.get(0).atacar(Geralt,FireBolt);
        }
        Yennefer.atacar(Ciri, DeepIce);
        Mousesack.atacar(Ciri, JumpOfFaith);
        Skellige.atacar(Yennefer, SacredWhisper);
        Dandelion.atacar(Geralt, EspadaLonga);




        //Estados
        System.out.println("***************Estatisticas****************");
        Dandelion.imprimirEstado();
        Geralt.imprimirEstado();
        Ciri.imprimirEstado();
        Yennefer.imprimirEstado();
        Mousesack.imprimirEstado();
        Skellige.imprimirEstado();
        for (int i = 0; i < guerreiros.size(); i++) {
            System.out.println("Nome: " + guerreiros.get(i).nome + " | Vida: " + guerreiros.get(i).vida);
        }
        for (int i = 0; i < barbaros.size(); i++) {
            System.out.println("Nome: " + barbaros.get(i).nome + " | Vida: " + barbaros.get(i).vida);
        }
        for (int i = 0; i < clerigos.size(); i++) {
            System.out.println("Nome: " + clerigos.get(i).nome + " | Vida: " + clerigos.get(i).vida);
        }
        for (int i = 0; i < druidas.size(); i++) {
            System.out.println("Nome: " + druidas.get(i).nome + " | Vida: " + druidas.get(i).vida);
        }
        for (int i = 0; i < magos.size(); i++) {
            System.out.println("Nome: " + magos.get(i).nome + " | Vida: " + magos.get(i).vida);
        }
        for (int i = 0; i < feiticeiros.size(); i++) {
            System.out.println("Nome: " + feiticeiros.get(i).nome + " | Vida: " + feiticeiros.get(i).vida);
        }


    }

/*      ******** CÓDIGO ANTIGO *******
       //Combates
        Geralt.atacar(Yennefer, Machado);
        Geralt.atacar(Skellige, EspadaLonga);
        Ciri.atacar(Mousesack, FireBolt);
        Ciri.atacar(Dandelion, DeepIce);
        Yennefer.atacar(Geralt, FireBolt);
        Yennefer.atacar(Ciri, DeepIce);
        Mousesack.atacar(Dandelion, SacredWhisper);
        Mousesack.atacar(Ciri, JumpOfFaith);
        Skellige.atacar(Yennefer, SacredWhisper);
        Skellige.atacar(Mousesack, JumpOfFaith);
        Dandelion.atacar(Geralt, EspadaLonga);
        Dandelion.atacar(Ciri, EspadaCurta);
        Geralt.atacar(Yennefer, Machado);
        Geralt.atacar(Skellige, EspadaLonga);
        Ciri.atacar(Mousesack, FireBolt);
        Ciri.atacar(Dandelion, DeepIce);
        Yennefer.atacar(Geralt, FireBolt);
        Yennefer.atacar(Ciri, DeepIce);
        Mousesack.atacar(Dandelion, SacredWhisper);
        Mousesack.atacar(Ciri, JumpOfFaith);
        Skellige.atacar(Yennefer, SacredWhisper);
        Skellige.atacar(Mousesack, JumpOfFaith);

        //Estados
        Dandelion.imprimirEstado();
        Geralt.imprimirEstado();
        Ciri.imprimirEstado();
        Yennefer.imprimirEstado();
        Mousesack.imprimirEstado();
        Skellige.imprimirEstado();


        /*
        // PRIMEIRA BATALHA - GUERREIRO X BARBARO
        System.out.println("Primeira Batalha: " + Guerreiro.nome + " x " + Barbaro.nome);
        System.out.println("vida do barbaro antes do ataque " + Barbaro.vida);
        Batalhas batalha1 = new Batalhas();
        int finalDaBatalha1 = batalha1.lutadorXLutador(Guerreiro.ataque, EspadaCurta.poderAtaque, Barbaro.defesa);
        int vidaFinal1 = Barbaro.vida - finalDaBatalha1;
        Barbaro.vida = vidaFinal1;
        System.out.println(Guerreiro.nome + " atacou " + Barbaro.nome + " com " + EspadaCurta.nome + " causando " + finalDaBatalha1 + " de dano.");
        System.out.println("vida do barbaro depois do ataque " + Barbaro.vida);
        System.out.println();

        // SEGUNDA BATALHA - BARBARO X GUERREIRO
        System.out.println("Segunda Batalha: " + Barbaro.nome + " x " + Guerreiro.nome);
        System.out.println("vida do Guerreiro antes do ataque " + Guerreiro.vida);
        Batalhas batalha2 = new Batalhas();
        int finalDaBatalha2 = batalha2.lutadorXLutador(Barbaro.ataque, EspadaLonga.poderAtaque, Guerreiro.defesa);
        int vidaFinal2 = Guerreiro.vida - finalDaBatalha2;
        Guerreiro.vida = vidaFinal2;
        System.out.println(Barbaro.nome + " atacou " + Guerreiro.nome + " com " + EspadaLonga.poderAtaque + " causando " + finalDaBatalha2 + " de dano.");
        System.out.println("vida do Guerreiro depois do ataque " + Guerreiro.vida);
        System.out.println();

        // TERCEIRA BATALHA - MAGO X FEITICEIRO
        System.out.println("Terceira Batalha: " + Mago.nome + " x " + Feiticeiro.nome);
        System.out.println("vida do feiticeiro antes do ataque " + Feiticeiro.vida);
        Batalhas batalha3 = new Batalhas();
        int finalDaBatalha3 = batalha3.lutadorXLutador(Mago.ataque, FireBolt.poder, Feiticeiro.defesa);
        int vidaFinal3 = Feiticeiro.vida - finalDaBatalha3;
        Feiticeiro.vida = vidaFinal3;
        Mago.mana = Mago.mana - FireBolt.custoMana;
        System.out.println(Mago.nome + " atacou " + Feiticeiro.nome + " com " + FireBolt.nome + " causando " + finalDaBatalha3 + " de dano.");
        System.out.println("vida do Feiticeiro depois do ataque" + Feiticeiro.vida);
        System.out.println("Mana do " + Mago.nome + " reduzida em " + FireBolt.custoMana + " restando " + Mago.mana);
        System.out.println();

        // QUARTA BATALHA - FEITICEIRO X MAGO
        System.out.println("Quarta Batalha: " + Feiticeiro.nome + " x " + Mago.nome);
        System.out.println("vida do mago antes do ataque " + Mago.vida);
        Batalhas batalha4 = new Batalhas();
        int finalDaBatalha4 = batalha4.lutadorXLutador(Feiticeiro.ataque, DeepIce.poder, Mago.defesa);
        int vidaFinal4 = Mago.vida - finalDaBatalha4;
        Mago.vida = vidaFinal4;
        Feiticeiro.mana = Feiticeiro.mana - DeepIce.custoMana;
        System.out.println(Feiticeiro.nome + " atacou " + Mago.nome + " com " + DeepIce.nome + " causando " + finalDaBatalha4 + " de dano.");
        System.out.println("vida do Mago depois do ataque " + Mago.vida);
        System.out.println("Mana do " + Feiticeiro.nome + " reduzida em " + DeepIce.custoMana + " restando " + Feiticeiro.mana);
        System.out.println();

        //  QUINTA BATALHA - DRUIDA X CLERIGO
        System.out.println("Quinta Batalha: " + Druida.nome + " x " + Clerigo.nome);
        System.out.println("vida do Clerigo antes do ataque " + Clerigo.vida);
        Batalhas batalha5 = new Batalhas();
        int finalDaBatalha5 = batalha5.lutadorXLutador(Druida.ataque, HolyGun.poder, Clerigo.defesa);
        int vidaFinal5 = Clerigo.vida - finalDaBatalha5;
        Clerigo.vida = vidaFinal5;
        Druida.fe = Druida.fe - HolyGun.custoMana;
        System.out.println(Druida.nome + " atacou " + Clerigo.nome + " com " + HolyGun.nome + " causando " + finalDaBatalha5 + " de dano.");
        System.out.println("vida do Clerigo depois do ataque " + Clerigo.vida);
        System.out.println("Fé do " + Druida.nome + " reduzida em " + HolyGun.custoMana + " restando " + Druida.fe);
        System.out.println();

        //  SEXTA BATALHA - CLERIGO X DRUIDA
        System.out.println("Sexta Batalha: " + Clerigo.nome + " x " + Druida.nome);
        System.out.println("vida do Druida antes do ataque " + Druida.vida);
        Batalhas batalha6 = new Batalhas();
        int finalDaBatalha6 = batalha6.lutadorXLutador(Clerigo.ataque, SacredWhisper.poder, Druida.defesa);
        int vidaFinal6 = Druida.vida - finalDaBatalha6;
        Druida.vida = vidaFinal6;
        Clerigo.fe = Clerigo.fe - SacredWhisper.custoMana;
        System.out.println(Clerigo.nome + " atacou " + Druida.nome + " com " + SacredWhisper.nome + " causando " + finalDaBatalha6 + " de dano.");
        System.out.println("vida do Druida depois do ataque " + Druida.vida);
        System.out.println("Fé do " + Clerigo.nome + " reduzida em " + SacredWhisper.custoMana + " restando " + Clerigo.fe);
        System.out.println();

        //  SETIMA BATALHA - MAGO X DRUIDA
        System.out.println("Sétima Batalha: " + Mago.nome + " x " + Druida.nome);
        System.out.println("vida do Druida antes do ataque " + Druida.vida);
        Batalhas batalha7 = new Batalhas();
        int finalDaBatalha7 = batalha7.lutadorXLutador(Mago.ataque, Hurricane.poder, Druida.defesa);
        int vidaFinal7 = Druida.vida - finalDaBatalha7;
        Druida.vida = vidaFinal7;
        Mago.mana = Mago.mana - Hurricane.custoMana;
        System.out.println(Mago.nome + " atacou " + Druida.nome + " com " + Hurricane.nome + " causando " + finalDaBatalha7 + " de dano.");
        System.out.println("vida do Druida depois do ataque " + Druida.vida);
        System.out.println("Mana do " + Mago.nome + " reduzida em " + Hurricane.custoMana + " restando " + Mago.mana);
        System.out.println();

        // OITAVA BATALHA - FEITICEIRO X CLERIGO
        System.out.println("Oitava Batalha: " + Feiticeiro.nome + " x " + Clerigo.nome);
        System.out.println("vida do Clérigo antes do ataque " + Clerigo.vida);
        Batalhas batalha8 = new Batalhas();
        int finalDaBatalha8 = batalha8.lutadorXLutador(Feiticeiro.ataque, DeepIce.poder, Clerigo.defesa);
        int vidaFinal8 = Clerigo.vida - finalDaBatalha8;
        Clerigo.vida = vidaFinal8;
        Feiticeiro.mana = Feiticeiro.mana - DeepIce.custoMana;
        System.out.println(Feiticeiro.nome + " atacou " + Clerigo.vida + " com " + DeepIce.nome + " causando " + finalDaBatalha8 + " de dano.");
        System.out.println("vida do Clerigo depois do ataque " + Clerigo.vida);
        System.out.println("Mana do " + Feiticeiro.nome + " reduzida em " + DeepIce.custoMana + " restando " + Feiticeiro.mana);
        System.out.println();

        //  NONA BATALHA - DRUIDA X BARBARO
        System.out.println("Nona Batalha: " + Druida.nome + " x " + Barbaro.nome);
        System.out.println("vida do Barbaro antes do ataque " + Barbaro.vida);
        Batalhas batalha9 = new Batalhas();
        int finalDaBatalha9 = batalha9.lutadorXLutador(Druida.ataque, HolyGun.poder, Barbaro.defesa);
        int vidaFinal9 = Barbaro.vida - finalDaBatalha9;
        Barbaro.vida = vidaFinal9;
        Druida.fe = Druida.fe - HolyGun.custoMana;
        System.out.println(Druida.nome + " atacou " + Barbaro.nome + " com " + HolyGun.nome + " causando " + finalDaBatalha9 + " de dano.");
        System.out.println("vida do Barbaro depois do ataque " + Barbaro.vida);
        System.out.println("Fé do " + Druida.nome + " reduzida em " + HolyGun.custoMana + " restando " + Druida.fe);
        System.out.println();

        // DECIMA BATALHA - GUERREIRO X FEITICEIRO
        System.out.println("Decima Batalha: " + Guerreiro.nome + " x " + Feiticeiro.nome);
        System.out.println("vida do Feiticeiro antes do ataque " + Feiticeiro.vida);
        Batalhas batalha10 = new Batalhas();
        int finalDaBatalha10 = batalha10.lutadorXLutador(Guerreiro.ataque, Machado.poderAtaque, Feiticeiro.defesa);
        int vidaFinal10 = Feiticeiro.vida - finalDaBatalha10;
        Feiticeiro.vida = vidaFinal10;
        System.out.println(Guerreiro.nome + " atacou " + Feiticeiro.nome + " com " + Machado.nome + " causando " + finalDaBatalha10 + " de dano.");
        System.out.println("vida do Feiticeiro depois do ataque " + Feiticeiro.vida);
        System.out.println();

        // DECIMA PRIMEIRA BATALHA - BARBARO X MAGO
        System.out.println("Decima Primeira Batalha: " + Barbaro.nome + " x " + Mago.nome);
        System.out.println("vida do Mago antes do ataque " + Mago.vida);
        Batalhas batalha11 = new Batalhas();
        int finalDaBatalha11 = batalha11.lutadorXLutador(Barbaro.ataque, EspadaLonga.poderAtaque, Mago.defesa);
        int vidaFinal11 = Mago.vida - finalDaBatalha11;
        Mago.vida = vidaFinal11;
        System.out.println(Barbaro.nome + " atacou " + Mago.nome + " com " + EspadaLonga.nome + " causando " + finalDaBatalha11 + " de dano.");
        System.out.println("vida do Mago depois do ataque" + Mago.vida);
        System.out.println();

        //  DECIMA SEGUNDA BATALHA - CLERIGO X GUERREIRO
        System.out.println("Décima Segunda Batalha: " + Clerigo.nome + " x " + Guerreiro.nome);
        System.out.println("vida do Guerreiro antes do ataque " + Guerreiro.vida);
        Batalhas batalha12 = new Batalhas();
        int finalDaBatalha12 = batalha12.lutadorXLutador(Clerigo.ataque, SacredWhisper.poder, Guerreiro.defesa);
        int vidaFinal12 = Guerreiro.vida - finalDaBatalha12;
        Guerreiro.vida = vidaFinal12;
        Clerigo.fe = Clerigo.fe - SacredWhisper.custoMana;
        System.out.println(Clerigo.nome + " atacou " + Guerreiro.nome + " com " + SacredWhisper.nome + " causando " + finalDaBatalha12 + " de dano.");
        System.out.println("vida do Guerreiro depois do ataque " + Guerreiro.vida);
        System.out.println("Fé do " + Clerigo.nome + " reduzida em " + SacredWhisper.custoMana + " restando " + Clerigo.fe);

        //RESULTADOS FINAIS
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("****************** RESULTADOS FINAIS *************************");
        System.out.println("**************************************************************");
        System.out.println();
        System.out.println(Barbaro.nome + " terminou os combates com " + Barbaro.vida + " de vida.");
        System.out.println();
        System.out.println(Guerreiro.nome + " terminou os combates com " + Guerreiro.vida + " de vida.");
        System.out.println();
        System.out.println(Mago.nome + " terminou os combates com " + Mago.vida + " de vida e " + Mago.mana + " de Mana.");
        System.out.println();
        System.out.println(Feiticeiro.nome + " terminou os combates com " + Feiticeiro.vida + " de vida e " + Feiticeiro.mana + " de Mana.");
        System.out.println();
        System.out.println(Druida.nome + " terminou os combates com " + Druida.vida + " de vida e " + Druida.fe + " de Fé.");
        System.out.println();
        System.out.println(Clerigo.nome + " terminou os combates com " + Clerigo.vida + " de vida e " + Clerigo.fe + " de Fé.");
        System.out.println();
*/
    }






