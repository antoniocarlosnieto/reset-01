package Construtor;

import java.time.LocalDate;

public class Musica {

    private int id;

    private String nome;

    private String autor;

    private EstiloMusical estiloMusical;

    private LocalDate lancamento;

    public Musica(String nome, String autor, LocalDate lancamento, EstiloMusical estiloMusical) {
        this.nome = nome;
        this.autor = autor;
        this.lancamento = lancamento;
        this.estiloMusical = estiloMusical;
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

    public String getAutor() {
        return autor;
    }

    public void setArtista(String autor) {
        this.autor = autor;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", artista: '" + autor + '\'' +
                ", estiloMusical: " + estiloMusical +
                ", lancamento: " + lancamento +
                '}';
    }
}
