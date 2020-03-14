package Aula01.TemaAula01;

public class Armas {

    //CRIANDO A ARMA
    static class EspadaCurta {
        String nomeEspadaCurta;
        int poderEspadaCurta;

        EspadaCurta(String nomeEspadaCurta, int poderEspadaCurta) {
            this.nomeEspadaCurta = nomeEspadaCurta;
            this.poderEspadaCurta = poderEspadaCurta;
        }

       }

        static class EspadaLonga {
            String nomeEspadaLonga;
            int poderEspadaLonga;

            EspadaLonga(String nome, int poder) {
                this.nomeEspadaLonga = nome;
                this.poderEspadaLonga = poder;
            }
        }

        static class Machado {
            String nomeMachado;
            int poderMachado;

            Machado(String nome, int poder) {
                this.nomeMachado = nome;
                this.poderMachado = poder;
            }
        }
    }
