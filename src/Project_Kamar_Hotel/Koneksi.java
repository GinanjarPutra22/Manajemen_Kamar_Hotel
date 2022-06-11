/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project_Kamar_Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ginanjar Putra
 */
public class Koneksi {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3307/kamarhotel";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection c = Koneksi.getConnection();
            System.out.println(String.format("Connected to database %s " + "successfully.", c.getCatalog()));
         } catch (SQLException e) {
            System.out.println(e);
        }
    }

    static class koneksi {

        public koneksi() {
        }
    }
}
