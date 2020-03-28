package Gerenciador;

import Acervo.AcervoUsuario;
import Construtor.Usuario;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorUsuario {

    private AcervoUsuario acervo = new AcervoUsuario();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();

        for (Usuario usuarioExistente : usuarios) {
            //Validando se Ele ja existe
            if (usuario.getNome().equals(usuarioExistente.getNome())) {
                return usuarioExistente;
            }
        }


        return acervo.salvar(usuario);
    }

    public Usuario editar(int id, Usuario usuarioAtualizado) {

        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
        } else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario procurar(int id) {

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
