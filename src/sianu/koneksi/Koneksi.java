/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sianu.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author BadikIrwan
 */
public class Koneksi {
    private static Connection con;
    public Koneksi() {   
    }
    public static Connection getKoneksi() {
        try {
            String alamat = "jdbc:ucanaccess://D:/anggota.accdb";
            con = DriverManager.getConnection(alamat);
            //JOptionPane.showMessageDialog(null, "Koneksi berhasil");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
        return con;
    }
}
