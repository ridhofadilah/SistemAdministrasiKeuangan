/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.MenuMahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    private Mahasiswa mahasiswa;
    private Fakultas fakultas;
    private ResultSet rs;
    
    private DefaultTableModel _tabel;
    
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

    public Mahasiswa cekMahasiswa(String username, String password) {
        Mahasiswa m = null;
        try {
            String query = "SELECT * FROM MAHASISWA WHERE idMahasiswa= '" + username + "' "
                    + "AND password = '" + password + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                m = new Mahasiswa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
            return m;
        } catch (Exception ex) {
            return null;
        }
    }

    public Fakultas cekFakultas(String uname, String pw) {
        Fakultas f = null;
        try {
            String query = "SELECT * FROM ADMINFAKULTAS WHERE idFakultas= '" + uname + "' "
                    + "AND password = '" + pw + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                f = new Fakultas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            return f;
        } catch (Exception ex) {
            return null;
        }
    }

    public void LoadDataTagihan(MenuMahasiswa view, String idMahasiswa) {
        String[] kolom = {"ID Pembayaran", "Tahun Ajar", "Total", "Status"};
        _tabel = new DefaultTableModel(null, kolom) {
            Class[] types = new Class[]{
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            // Agar table tidak bisa diedit
            @Override
            public boolean isCellEditable(int row, int col) {
                int cola = _tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelTagihan().setModel(_tabel);
        try {
            HapusTabel();
            String sql = "" + "SELECT * from PEMBAYARAN where idMahasiswa = '"+idMahasiswa+"'";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPembayaran = rs.getString(1);
                String tahunAjar = rs.getString(3);
                int total = rs.getInt(4);
                String status;
                if (rs.getString(5).equals("0")){
                    status = "Belum dikonfirmasi";
                } else if (rs.getString(5).equals("1")){
                    status = "Pembayaran telah diterima";
                } else {
                    status = "Pembayaran ditolak";
                }
                Object[] data = {idPembayaran, tahunAjar, total, status};
                _tabel.addRow(data);
            }
            view.getTabelTagihan().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelTagihan().getColumnModel().getColumn(1).setPreferredWidth(30);
            view.getTabelTagihan().getColumnModel().getColumn(2).setPreferredWidth(30);
            view.getTabelTagihan().getColumnModel().getColumn(3).setPreferredWidth(100);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }
    
    public void HapusTabel(){
        int row = _tabel.getRowCount();
        for (int i = 0;i < row;i++){
            _tabel.removeRow(0);
        }
    }

    public Pembayaran cekIDPembayaran(String id, String idMahasiswa) {
        Pembayaran p = null;
        try {
            String query = "SELECT * FROM PEMBAYARAN WHERE idPembayaran= '" + id + "' "
                    + "AND idMahasiswa = '" + idMahasiswa + "'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                p = new Pembayaran(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            }
            return p;
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean updatePembayaranMahasiswa(String id, String idMahasiswa) {
        try {
            String sql = "UPDATE PEMBAYARAN SET statusbayar= 1 WHERE idPembayaran= '"+id+"'";
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Your Status is being processed");
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Failed");
            return false;
        }
    }
  
}
