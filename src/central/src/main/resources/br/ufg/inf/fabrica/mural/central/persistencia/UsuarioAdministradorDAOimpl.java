package br.ufg.inf.fabrica.mural.central.persistencia;


import br.ufg.inf.fabrica.mural.central.persistencia.DaoUsuarioAdministrador;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class UsuarioAdministradorDAOimpl implements DaoUsuarioAdministrador{

   /**
     * Método responsável por buscar um usuário do banco (aqui gerado como stub)
     * e comparar as credenciais informadas.
     * @param usuario
     * @return 
     */
    
    Map<Long, String> usuarioESenha;
    
    public UsuarioAdministradorDAOimpl(){
        usuarioESenha = new HashMap<>();
        carregaUsuarioAdmin();
    }
    
    private void carregaUsuarioAdmin(){
        String login;
        String senha;
        login = "admin";
        senha = "admin";
        usuarioESenha.put(1l, login);
        usuarioESenha.put(2l, senha);
        
    }
    
    @Override
    public boolean validarCredencial(String usuario, String senha){
        boolean credenciaisValidas;
        String usuarioStub = (String) usuarioESenha.get(1l);
        String senhaStub = (String) usuarioESenha.get(2l);
        
        if (usuario.equals(usuarioStub) && senha.equals(senhaStub)) {
            credenciaisValidas = true;
        } else {
            credenciaisValidas = false;
        }
        return credenciaisValidas;
    }
    
    
}
