package Construtor;



public class Curiosidade {

    private int id;

    private String descricao;

    private CategoriaCuriosidade categoriaCuriosidade;

    public Curiosidade(String descricao, CategoriaCuriosidade categoriaCuriosidade) {
        this.descricao = descricao;
        this.categoriaCuriosidade = categoriaCuriosidade;

        }


    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaCuriosidade getCategoriaCuriosidade() {
        return categoriaCuriosidade;
    }

    public void setCategoriaCuriosidade(final CategoriaCuriosidade categoriaCuriosidade) {
        this.categoriaCuriosidade = categoriaCuriosidade;
    }

    @Override
    public String toString() {
        return "Curiosidade{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", categoriaCuriosidade=" + categoriaCuriosidade +
                '}';
    }
}
