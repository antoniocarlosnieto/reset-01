package Gerenciador;

import Acervo.AcervoSerie;
import Construtor.Serie;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorSerie {

    private AcervoSerie acervo = new AcervoSerie();

    public Serie salvar(Serie serie) {

        List<Serie> series = acervo.listar();

        for (Serie serieExistente : series) {
            //Validando se Ele ja existe
            if (serie.getNome().equals(serieExistente.getNome())) {
                return serieExistente;
            }
        }
        //Validando a data
        if (serie.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(serie);
    }

    public Serie editar(int id, Serie serieAtualizada) {

        Serie serieParaEditar = procurar(id);

        if (serieParaEditar == null) {
            return null;
        } else {
            return acervo.editar(serieParaEditar, serieAtualizada);
        }
    }

    public List<Serie> listar() {
        return acervo.listar();
    }

    public Serie procurar(int id) {

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
