package Aula02.Herancas;

public class AppHerancas {

    public static void main(String[] args) {

        Aviao aviao = new Aviao("Aero Boero",350,4,3000);
        Submarino submarino = new Submarino ("Torpedo9",200,50,800);


        System.out.println(aviao.velocidadeMaxima);
        System.out.println(aviao);
        System.out.println(submarino);
        System.out.println(aviao);


         }
}
