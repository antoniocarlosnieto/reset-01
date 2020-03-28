package Gerenciador;


import Acervo.AcervoCuriosidade;
import Construtor.Curiosidade;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorCuriosidade {

    private AcervoCuriosidade acervo = new AcervoCuriosidade();

    public Curiosidade salvar(Curiosidade curiosidade) {

        List<Curiosidade> curiosidades = acervo.listar();

        for (Curiosidade curiosidadeExistente : curiosidades) {
            //Validando se Ela ja existe
            if (curiosidade.getDescricao().equals(curiosidadeExistente.getDescricao())) {
                return curiosidadeExistente;
            }
        }


        return acervo.salvar(curiosidade);
    }

    public Curiosidade editar(int id, Curiosidade curiosidadeAtualizada) {

        Curiosidade curiosidadeParaEditar = procurar(id);

        if (curiosidadeParaEditar == null) {
            return null;
        } else {
            return acervo.editar(curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }

    public List<Curiosidade> listar() {
        return acervo.listar();
    }

    public Curiosidade procurar(int id) {

        if (id > 0) {
            return acervo.procurar(id);
        }

        return null;

    }

    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }

        return false;
    }
}