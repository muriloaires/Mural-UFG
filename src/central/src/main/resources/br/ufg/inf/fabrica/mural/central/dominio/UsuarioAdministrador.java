package br.ufg.inf.fabrica.mural.central.dominio;


import br.ufg.inf.fabrica.mural.central.persistencia.UsuarioAdministradorDAOimpl;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
@Entity
@Table (name = "USUARIO_ADMINISTRADOR")
public class UsuarioAdministrador {
    
    public static final long CREDENCIAIS_NAO_INFORMADAS = 20008;
    public static final long CREDENCIAIS_INVALIDAS = 20002;
    public static final long SOLICITACAO_ATENDIDA_SUCESSO = 20000;
    
 
    
    @Column(nullable = false, name = "login")
    @Id
    private String login;
    
    @Column(nullable = false, name = "senha")
    private String senha;
     
    @Column(nullable = false, name = "estado")
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
        boolean isUsuarioValido = false;
        UsuarioAdministradorDAOimpl usuarioDAOimpl = new UsuarioAdministradorDAOimpl();
        UsuarioAdministrador testeAdministrador = usuarioDAOimpl.buscar(login, senha);
       
        
        if (testeAdministrador.getLogin().equals(login) && testeAdministrador.getSenha().equals(senha)) {
            isUsuarioValido = true;
        }
        return isUsuarioValido;
    }
}
