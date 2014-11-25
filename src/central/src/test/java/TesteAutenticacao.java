
import br.ufg.inf.fabrica.mural.central.dominio.credenciais.AutenticadorCAS;
import br.ufg.inf.fabrica.mural.central.dominio.credenciais.entity.Usuario;
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

    public static Usuario usuarioTeste;
    
    @BeforeClass
    public static void carregaInfosIniciais(){
        usuarioTeste = new Usuario();
        usuarioTeste.setId(1l);
        usuarioTeste.setLogin("admin");
        usuarioTeste.setSenha("admin");
        usuarioTeste.setAdministrador(true);
    }
    
    @Test
    public void validarCredenciaisTest(){
        long resultado = new AutenticadorCAS().validarCredenciais(usuarioTeste);
        Assert.assertEquals(resultado, AutenticadorCAS.SOLICITACAO_ATENDIDA_SUCESSO);
    }
}
