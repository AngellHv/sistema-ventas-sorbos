/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author angel
 */
public class Conexion {

    private static final String URL = "jdbc:postgresql://localhost:5432/sorbos_db";
    private static final String USER = "sorbos_user";
    private static final String PASSWORD = "1234"; // contraseña

    public static Connection conectar() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a PostgreSQL");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }

        return conn;
    }

}
