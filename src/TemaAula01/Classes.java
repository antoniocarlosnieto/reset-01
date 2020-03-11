package TemaAula01;

public class Classes {
    //CRIANDO A CLASSE GUERREIRO
    static class Guerreiro {
        String nomeGuerreiro;
        int vidaGuerreiro;
        int ataqueGuerreiro;
        int defesaGuerreiro;

        Guerreiro(String nomeGuerreiro, int vidaGuerreiro, int ataqueGuerreiro, int defesaGuerreiro) {
            this.nomeGuerreiro = nomeGuerreiro;
            this.vidaGuerreiro = vidaGuerreiro;
            this.ataqueGuerreiro = ataqueGuerreiro;
            this.defesaGuerreiro = defesaGuerreiro;
        }

    }
    //CRIANDO A CLASSE BARBARO
    static class Barbaro {
        String nomeBarbaro;
        int vidaBarbaro;
        int ataqueBarbaro;
        int defesaBarbaro;

        Barbaro(String nomeBarbaro, int vidaBarbaro, int ataqueBarbaro, int defesaBarbaro) {
            this.nomeBarbaro = nomeBarbaro;
            this.vidaBarbaro = vidaBarbaro;
            this.ataqueBarbaro = ataqueBarbaro;
            this.defesaBarbaro = defesaBarbaro;
        }
    }
    //CRIANDO A CLASSE MAGO
    static class Mago {
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

    }
    //CRIANDO A CLASSE FEITICEIRO
    static class Feiticeiro {
        String nome;
        int vida;
        int ataque;
        int defesa;
        int mana;

        Feiticeiro(String nome, int vida, int ataque, int defesa, int mana) {
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;
            this.mana = mana;
        }

    }
    //CRIANDO A CLASSE DRUIDA
    static class Druida {
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

    }
    //CRIANDO A CLASSE CLERIGO
    static class Clerigo {
        String nomeClerigo;
        int vidaClerigo;
        int ataqueClerigo;
        int defesaClerigo;
        int feClerigo;

        Clerigo(String nomeClerigo, int vidaClerigo, int ataqueClerigo, int defesaClerigo, int feClerigo) {
            this.nomeClerigo = nomeClerigo;
            this.vidaClerigo = vidaClerigo;
            this.ataqueClerigo = ataqueClerigo;
            this.defesaClerigo = defesaClerigo;
            this.feClerigo = feClerigo;
        }

    }

    /*
    //CRIANDO AS INTERAÇÕES DO GUERREIRO
    int ataqueGuerreiroGuerreiro(String nomeGuerreiro, int ataqueGuerreiro, int defesaGuerreiro, int poderArma ) {
        return ataqueGuerreiro * poderArma - defesaGuerreiro;
    }
    int ataqueGuerreiroBarbaro(int ataqueGuerreiro, int defesaBarbaro, int poderArma){
        return ataqueGuerreiro * poderArma - defesaBarbaro;
    }
    int ataqueGuerreiroMago(int ataqueGuerreiro, int defesaMago, int poderArma){
        return ataqueGuerreiro * poderArma - defesaMago;
    }
    int ataqueGuerreirofeiticeiro(int ataqueGuerreiro, int defesaFeiticeiro, int poderArma){
        return ataqueGuerreiro * poderArma - defesaFeiticeiro;
    }
    int ataqueGuerreiroDruida(int ataqueGuerreiro, int defesaDruida, int poderArma){
        return ataqueGuerreiro * poderArma - defesaDruida;
    }
    int ataqueGuerreiroClerigo(int ataqueGuerreiro, int defesaClerigo, int poderArma){
        return ataqueGuerreiro * poderArma - defesaClerigo;
    }
*/
    }
