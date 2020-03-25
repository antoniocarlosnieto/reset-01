package Acervo;

import Construtor.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AcervoUsuario {

    private static int contador = 1;
    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {
        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar() {
        return usuarios;
    }

    public Usuario procurar(int id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;

    }

    public boolean deletar(int id) {

        Usuario usuarioParaDeletar = procurar(id);
        if (usuarioParaDeletar != null) {
            return usuarios.remove(usuarioParaDeletar);
        }

        return false;
    }

    public Usuario editar(final Usuario usuarioParaEditar, final Usuario usuarioAtualizado) {

        //*******************************************************
        //*****PAREI AQUI PRA CONFIRMAR OS DADOS DE ENTRADA******
        //*******************************************************

        usuarioParaEditar.setNome(usuarioAtualizado.getNome());
        usuarioParaEditar.setEmail(usuarioAtualizado.getEmail());
        usuarioParaEditar.setNascimento(usuarioAtualizado.getNascimento());
        usuarioParaEditar.setTelefone(usuarioAtualizado.getTelefone());
        usuarioParaEditar.setBio(usuarioAtualizado.getBio());
        usuarioParaEditar.setLatitude(usuarioAtualizado.getLatitude());
        usuarioParaEditar.setLongitude(usuarioAtualizado.getLongitude());


        return usuarioParaEditar;

    }
}
