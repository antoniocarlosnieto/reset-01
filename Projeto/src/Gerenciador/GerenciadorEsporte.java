package Gerenciador;


import Acervo.AcervoEsporte;
import Construtor.Esporte;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorEsporte {

    private AcervoEsporte acervo = new AcervoEsporte();

    public Esporte salvar(Esporte esporte) {

        List<Esporte> esportes = acervo.listar();

        for (Esporte esporteExistente : esportes) {
            //Validando se Ele ja existe
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                return esporteExistente;
            }
        }


        return acervo.salvar(esporte);
    }

    public Esporte editar(int id, Esporte esporteAtualizado) {

        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null) {
            return null;
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizado);
        }
    }

    public List<Esporte> listar() {
        return acervo.listar();
    }

    public Esporte procurar(int id) {

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
