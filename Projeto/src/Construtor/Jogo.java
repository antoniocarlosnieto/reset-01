package Construtor;

import java.time.LocalDate;

public class Jogo {

    private int id;

    private String nome;

    private String publisher;

    private LocalDate lancamento;

    private CategoriaJogo categoriaJogo;

    private String plataforma;

    public Jogo(String nome, String publisher, LocalDate lancamento, CategoriaJogo categoriaJogo, String plataforma) {
        this.nome = nome;
        this.publisher = publisher;
        this.lancamento = lancamento;
        this.categoriaJogo = categoriaJogo;
        this.plataforma = plataforma;
    }


    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public CategoriaJogo getCategoriaJogo() {
        return categoriaJogo;
    }

    public void setCategoriaJogo(final CategoriaJogo categoriaJogo) {
        this.categoriaJogo = categoriaJogo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", publisher='" + publisher + '\'' +
                ", lancamento=" + lancamento +
                ", categoriaJogo=" + categoriaJogo +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
