/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import conexion.Conexion;
import java.sql.Connection;

/**
 *
 * @author angel
 */
public class TestConexion {

    public static void main(String[] args) {
        Connection conn = Conexion.conectar();

        if (conn != null) {
            System.out.println("Todo funciona correctamente");
        }
    }

}
