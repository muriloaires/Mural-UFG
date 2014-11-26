package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.UsuarioAdministrador;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class UsuarioAdministradorDAOimpl implements DaoUsuarioAdministrador {

    /**
     * Método responsável por buscar um usuário do banco (aqui gerado como stub)
     * e comparar as credenciais informadas.
     *
     * @param usuario
     * @return
     */
    private static final String PERSISTENCE_UNIT_NAME = "br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU";
    private static EntityManagerFactory factory;
    Map<Long, String> usuarioESenha;

    public UsuarioAdministradorDAOimpl() {
        usuarioESenha = new HashMap<>();
        carregaUsuarioAdmin();
    }

    private void carregaUsuarioAdmin() {
        String login;
        String senha;
        login = "admin";
        senha = "admin";
        usuarioESenha.put(1l, login);
        usuarioESenha.put(2l, senha);

    }

    @Override
    public UsuarioAdministrador buscar(String usuario, String senha) {

        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("SELECT U FROM UsuarioAdministrador U WHERE U.login = '" + usuario + "' and u.senha = '" + senha + "'");

        UsuarioAdministrador usuarioAdministrador;

        try {
            usuarioAdministrador = (UsuarioAdministrador) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }

        return usuarioAdministrador;
    }

}
