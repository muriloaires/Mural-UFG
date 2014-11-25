/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;


import br.ufg.inf.fabrica.mural.central.dominio.credenciais.entity.Usuario;

/**
 *
 * @author Murilo
 */
public interface UsuarioDAO {
    public boolean validarUsuario(Usuario usuario);
}
