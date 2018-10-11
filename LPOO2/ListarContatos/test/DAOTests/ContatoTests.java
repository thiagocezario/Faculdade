/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import DAO.Contato;

/**
 *
 * @author Thiago
 */
public class ContatoTests {
    @Test
    public void testConstructorWithValues() {
        Contato c = new Contato("nome", "telefone", "endereço", 1);
        
        assertNotNull(c);
        assertEquals("nome", c.getNome());
        assertEquals("endereço", c.getEndereco());
        assertEquals("telefone", c.getTelefone());
        assertEquals(1, c.getId());
    }
    
    @Test
    public void testConstructorWithoutValues() {
        Contato c = new Contato();
        
        assertNotNull(c);
        assertEquals("", c.getNome());
        assertEquals("", c.getEndereco());
        assertEquals("", c.getTelefone());
        assertEquals(-1, c.getId());
    }
    
    @Test
    public void testSetterNome(){
        Contato c = new Contato();
        
        c.setNome("test");
        
        assertEquals("test", c.getNome());
    }
    
    @Test
    public void testSetterTelefone(){
        Contato c = new Contato();
        
        c.setTelefone("test");
        
        assertEquals("test", c.getTelefone());
    }
    @Test
    public void testSetterEndereco(){
        Contato c = new Contato();
        
        c.setEndereco("test");
        
        assertEquals("test", c.getEndereco());
    }
    @Test
    public void testSetterId(){
        Contato c = new Contato();
        
        c.setId(1);
        
        assertEquals(1, c.getId());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
