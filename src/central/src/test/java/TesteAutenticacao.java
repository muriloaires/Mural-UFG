
import br.ufg.inf.fabrica.mural.central.dominio.UsuarioAdministrador;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class TesteAutenticacao{

    public static UsuarioAdministrador usuarioTeste;
    
    @BeforeClass
    public static void carregaInfosIniciais(){
        usuarioTeste = new UsuarioAdministrador();
        usuarioTeste.setLogin("admin");
        usuarioTeste.setSenha("admin");
    }
    
    @Test
    public void validarCredenciaisTest(){
        boolean resultado = usuarioTeste.validarCredencial(usuarioTeste.getLogin(), usuarioTeste.getSenha());
        Assert.assertEquals(resultado, true);
    }
}
