/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MIAfandi
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/keuanganuniversitas";
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection connection = null;
    private String status;
    //private ResultSet result;
    //private MenuMentor view;

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Eror Driver", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void connect() {
        try {
            this.connection = DriverManager.getConnection(server, dbuser, dbpasswd);
            this.statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Terjadi kesalahan saat konek", JOptionPane.WARNING_MESSAGE);
        }
    }
}
