/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.UsuarioAdministrador;




/**
 *
 * @author Murilo
 */
public interface DaoUsuarioAdministrador {
    public UsuarioAdministrador buscar(String login, String senha);
}
