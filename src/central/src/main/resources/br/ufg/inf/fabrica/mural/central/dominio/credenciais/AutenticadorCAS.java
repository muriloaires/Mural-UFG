/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio.credenciais;

import br.ufg.inf.fabrica.mural.central.dominio.credenciais.entity.Usuario;
import br.ufg.inf.fabrica.mural.central.dominio.credenciais.stub.UsuarioDAOstub;

/**
 *Classe responsável pela autenticação de usuários em um sistema administrador
 * @author Murilo
 */
public class AutenticadorCAS {
    public static final long CREDENCIAIS_NAO_INFORMADAS = 20008;
    public static final long CREDENCIAIS_INVALIDAS = 20002;
    public static final long SOLICITACAO_ATENDIDA_SUCESSO = 20000;
    private UsuarioDAOstub usuarioDAOimpl;
    
    /**
     * Método responsável pelo acesso a camada de dados,
     * de onde será buscada se o usuário é realmente válido.
     * @param usuario
     * @return boolean
     */
    
    public AutenticadorCAS(){
        usuarioDAOimpl = new UsuarioDAOstub();
    }
    public long validarCredenciais(Usuario usuario){
        long retorno;
        if(usuario.getSenha().equalsIgnoreCase("") || usuario.getSenha().equalsIgnoreCase("")){
            retorno = AutenticadorCAS.CREDENCIAIS_NAO_INFORMADAS;
        }else{
            if (usuarioDAOimpl.validarUsuario(usuario)) {
                retorno = AutenticadorCAS.SOLICITACAO_ATENDIDA_SUCESSO;
            } else {
                retorno = AutenticadorCAS.CREDENCIAIS_INVALIDAS;
            }
        }
        return retorno;
    }
}
