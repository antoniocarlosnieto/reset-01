package Construtor;

import java.time.LocalDate;

public class Serie {

    private int id;

    private String nome;

    private String diretor;

    private LocalDate lancamento;

    private int temporadas;

    private int episodios;

    private CategoriaSerie categoriaSerie;

    private String sinopse;

    public Serie(String nome, String diretor, LocalDate lancamento, int temporadas, int episodios, CategoriaSerie categoriaSerie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.categoriaSerie = categoriaSerie;
        this.sinopse = sinopse;
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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }


    public CategoriaSerie getCategoriaSerie() {
        return categoriaSerie;
    }

    public void setCategoriaSerie(final CategoriaSerie categoriaSerie) {
        this.categoriaSerie = categoriaSerie;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", lancamento=" + lancamento +
                ", temporadas=" + temporadas +
                ", episodios=" + episodios +
                ", categoriaSerie=" + categoriaSerie +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
