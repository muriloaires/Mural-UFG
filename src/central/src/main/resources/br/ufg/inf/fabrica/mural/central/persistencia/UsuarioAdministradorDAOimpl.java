package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.UsuarioAdministrador;
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

  
    private static final String PERSISTENCE_UNIT_NAME = "br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU";
    private static EntityManagerFactory factory;

    public UsuarioAdministradorDAOimpl() {
       
    }

     
    @Override
     /**
     * Método responsável por buscar um usuário do banco (aqui gerado como stub)
     * @param String login
     * @param String senha
     * @return UsuarioAdministrador
     */
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
