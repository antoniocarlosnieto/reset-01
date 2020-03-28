package Acervo;

import Construtor.Curiosidade;

import java.util.ArrayList;
import java.util.List;

public class AcervoCuriosidade {

    private static int contador = 1;
    private static final List<Curiosidade> curiosidades = new ArrayList<>();

    public Curiosidade salvar(Curiosidade curiosidade) {
        curiosidade.setId(contador++);
        curiosidades.add(curiosidade);
        return curiosidade;
    }

    public List<Curiosidade> listar() {
        return curiosidades;
    }

    public Curiosidade procurar(int id) {

        for (Curiosidade curiosidade : curiosidades) {
            if (curiosidade.getId() == id) {
                return curiosidade;
            }
        }

        return null;

    }

    public boolean deletar(int id) {

        Curiosidade curiosidadeParaDeletar = procurar(id);
        if (curiosidadeParaDeletar != null) {
            return curiosidades.remove(curiosidadeParaDeletar);
        }

        return false;
    }

    public Curiosidade editar(final Curiosidade curiosidadeParaEditar, final Curiosidade curiosidadeAtualizada) {

        curiosidadeParaEditar.setDescricao(curiosidadeAtualizada.getDescricao());
        curiosidadeParaEditar.setCategoriaCuriosidade(curiosidadeAtualizada.getCategoriaCuriosidade());

        return curiosidadeParaEditar;

    }
}
