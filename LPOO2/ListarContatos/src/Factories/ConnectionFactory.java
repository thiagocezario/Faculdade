/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Thiago
 */
public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/java?verifyServerCertificate=false&useSSL=false";
            String login = "root";
            String senha = "admin";
            Properties properties = new Properties();
            properties.setProperty("user", login);
            properties.setProperty("password", senha);
            properties.setProperty("useSSL", "false");
            return DriverManager.getConnection(url, properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
