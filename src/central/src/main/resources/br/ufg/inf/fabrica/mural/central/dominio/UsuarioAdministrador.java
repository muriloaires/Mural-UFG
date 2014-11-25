package br.ufg.inf.fabrica.mural.central.dominio;


import br.ufg.inf.fabrica.mural.central.persistencia.UsuarioAdministradorDAOimpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class UsuarioAdministrador {
    
    public static final long CREDENCIAIS_NAO_INFORMADAS = 20008;
    public static final long CREDENCIAIS_INVALIDAS = 20002;
    public static final long SOLICITACAO_ATENDIDA_SUCESSO = 20000;
    
    private UsuarioDAOstub usuarioDAOimpl;
    private String login;
    private String senha;
    private boolean estado;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean validarCredencial(String login, String senha){
        UsuarioAdministradorDAOimpl usuarioDAOimpl = new UsuarioAdministradorDAOimpl();
        return usuarioDAOimpl.validarCredencial(login, senha);
    }
}
