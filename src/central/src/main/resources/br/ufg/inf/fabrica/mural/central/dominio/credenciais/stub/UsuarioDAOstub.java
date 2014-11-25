/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio.credenciais.stub;

import br.ufg.inf.fabrica.mural.central.dominio.credenciais.entity.Usuario;
import br.ufg.inf.fabrica.mural.central.persistencia.UsuarioDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Murilo
 */

public class UsuarioDAOstub implements UsuarioDAO{
    
    /**
     * Método responsável por buscar um usuário do banco (aqui gerado como stub)
     * e comparar as credenciais informadas.
     * @param usuario
     * @return 
     */
    
    Map<Long, Usuario> listaUsuarios;
    
    public UsuarioDAOstub(){
        listaUsuarios = new HashMap<>();
        carregaUsuarioAdmin();
    }
    
    private void carregaUsuarioAdmin(){
        Usuario usuarioAdmin = new Usuario();
        usuarioAdmin.setId(1);
        usuarioAdmin.setLogin("admin");
        usuarioAdmin.setSenha("admin");
        usuarioAdmin.setAdministrador(true);
        listaUsuarios.put(1l, usuarioAdmin);
    }
    
    @Override
    public boolean validarUsuario(Usuario usuario){
        
        boolean credenciaisValidas;
        Usuario teste = (Usuario) listaUsuarios.get(usuario.getId());
        
        if (usuario.getSenha().equals(teste.getSenha()) && usuario.getLogin().equals(teste.getLogin())
                && teste.isAdministrador() == true){
            credenciaisValidas = true;
        } else {
            credenciaisValidas = false;
        }
        return credenciaisValidas;
    }
    
}
