/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoriesTests;

import Factories.ConnectionFactory;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiago
 */
public class ConnectionFactoryTests {
    @Test
    public void testGetConnectionSuccess(){
        Connection con = null;
        
        con = ConnectionFactory.getConnection();
        
        assertNotNull(con);
    }
}
