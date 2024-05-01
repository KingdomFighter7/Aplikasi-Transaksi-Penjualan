/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.swing.aplikasipos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author LEGION
 */
public class koneksi {
    private String url = "jdbc:mysql://localhost/db_barang_fari";
    private String user = "root";
    private String pass = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
    
}
