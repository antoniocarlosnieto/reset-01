package exercicio2;

public class App {

    public static void main(String[] args) {


        Livro livro = new Livro("O Senhor dos Aneis", "JRR Tolkien", Categoria.FANTASIA, Status.DISPONIVEL);
        Livro livro1 = new Livro("Star Wars", "George Lucas", Categoria.TERROR, Status.EM_USO);
        Livro livro2 = new Livro("A volta dos que não foram", "Tiririca", Categoria.SUSPENSE, Status.EMPRESTADO);
        Livro livro3 = new Livro("Ligue Dja", "Valter Marcado", Categoria.ROMANCE, Status.DISPONIVEL);


        System.out.println(livro.toString());
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());

    }


}
