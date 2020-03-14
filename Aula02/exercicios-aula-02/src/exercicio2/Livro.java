package exercicio2;

public class Livro {
    String nome;
    String autor;
    Categoria categoria;
    Status status;

    @Override
    public String toString() {
        return  categoria + "-" + nome +  autor + ": " + status ;
    }

    public Livro(String nome, String autor, Categoria categoria , Status status) {
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
        this.status = status;
    }

}
