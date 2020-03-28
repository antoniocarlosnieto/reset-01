package Gerenciador;

import Acervo.AcervoJogo;
import Construtor.Jogo;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorJogo {

    private AcervoJogo acervo = new AcervoJogo();

    public Jogo salvar(Jogo jogo) {

        List<Jogo> jogos = acervo.listar();

        for (Jogo jogoExistente : jogos) {
            //Validando se Ele ja existe
            if (jogo.getNome().equals(jogoExistente.getNome())) {
                return jogoExistente;
            }
        }
        //Validando a data
        if (jogo.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(jogo);
    }

    public Jogo editar(int id, Jogo jogoAtualizado) {

        Jogo jogoParaEditar = procurar(id);

        if (jogoParaEditar == null) {
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizado);
        }
    }

    public List<Jogo> listar() {
        return acervo.listar();
    }

    public Jogo procurar(int id) {

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
