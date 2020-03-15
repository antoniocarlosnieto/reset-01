package exercicio2;

public enum Status {
    DISPONIVEL("Disponivel"),
    EM_USO("Em Uso"),
    EMPRESTADO("Emprestado");

    String descricao;

    Status(String descricao) {
        this.descricao = descricao;

    }
}

