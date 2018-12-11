/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;

/**
 *
 * @author Ricardo Antonio Diaz
 */
public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "utec";
    private static final String url = "jdbc:mysql://localhost:3306/";
    
    
}
