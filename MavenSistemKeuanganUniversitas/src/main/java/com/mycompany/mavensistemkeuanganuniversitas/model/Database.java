/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.model;

/**
 *
 * @author MIAfandi
 */

import com.mycompany.mavensistemkeuanganuniversitas.view.MenuAdmin;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuFakultas;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuMahasiswa;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuWakilRektor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Database {

    private String server = "jdbc:mysql://localhost:3306/keuanganuniversitas";
    private String dbuser = "root";
    private Statement statement = null;
    private ResultSet rs;
    private String failed = "failed";
    private String done = "Done!";
    private String tootal = "Total";
    private String idPeembayaran = "ID Pembayaran";
    private String statuus = "Status";
    private String tujuuan = "Tujuan";
    private String idFakultaas = "ID Fakultas";
    private String idPeengajuan = "ID Pengajuan";
    private DefaultTableModel tabel;
    private String tahuunAjar = "Tahun Ajar";
    
    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage(), "Eror Driver", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void connect() {
        try {
            Connection connection =null;
            connection = DriverManager.getConnection(server, dbuser, "");
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
            rs = statement.executeQuery(query);
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
            rs = statement.executeQuery(query);
            while (rs.next()) {
                f = new Fakultas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            return f;
        } catch (Exception ex) {
            return null;
        }
    }

    public void loadDataTagihan(MenuMahasiswa view, String idMahasiswa) {
        String[] kolom = {idPeembayaran, tahuunAjar, tootal, statuus};
        tabel = new DefaultTableModel(null, kolom) {
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelTagihan().setModel(tabel);
        try {
            hapusTabel();
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
                tabel.addRow(data);
            }
            view.getTabelTagihan().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelTagihan().getColumnModel().getColumn(1).setPreferredWidth(30);
            view.getTabelTagihan().getColumnModel().getColumn(2).setPreferredWidth(30);
            view.getTabelTagihan().getColumnModel().getColumn(3).setPreferredWidth(100);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public void hapusTabel(){
        int row = tabel.getRowCount();
        for (int i = 0;i < row;i++){
            tabel.removeRow(0);
        }
    }

    public Pembayaran cekIDPembayaran(String id, String idMahasiswa) {
        Pembayaran p = null;
        try {
            String query = "SELECT * FROM PEMBAYARAN WHERE idPembayaran= '" + id + "' "
                    + "AND idMahasiswa = '" + idMahasiswa + "'";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                p = new Pembayaran(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            }
            return p;
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean updatePembayaranMahasiswa(String id) {
        try {
            String sql = "UPDATE PEMBAYARAN SET statusbayar= 1 WHERE idPembayaran= '"+id+"'";
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Your Status is being processed");
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,failed);
            return false;
        }
    }

    public void konfirmasiPengajuanDana(String text, String setuju) {
        try {
            String sql = "UPDATE PENGAJUANDANA SET status= '"+setuju+"' WHERE idPengajuan= '"+text+"'";
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, done);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,failed);
        }
    }
    
    public void konfirmasiPembayaranMahasiswa(String text, String setuju) {
        try {
            String sql = "UPDATE PEMBAYARAN SET status= '"+setuju+"' WHERE idPembayaran= '"+text+"'";
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, done);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,failed);
        }
    }

    public PengajuanDana findIDPengajuan(String text) {
        PengajuanDana pd = null;
        try {
            String query = "SELECT * FROM PENGAJUANDANA WHERE idPengajuan= '" + text +"'";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                pd = new PengajuanDana(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
            }
            return pd;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public Pembayaran findIDPembayaran(String text) {
        Pembayaran pb = null;
        try {
            String query = "SELECT * FROM PEMBAYARAN WHERE idPembayaran= '" + text +"'";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                pb = new Pembayaran(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            }
            return pb;
        } catch (Exception ex) {
            return null;
        }
    }

    public void loadDataPengajuanWR(MenuWakilRektor view) {
        String[] kolom = {idPeengajuan, idFakultaas, tujuuan, tootal};
        tabel = new DefaultTableModel(null, kolom) {
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPengajuanWR().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PENGAJUANDANA where status = 0";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPengajuan = rs.getString(1);
                String idFakultas = rs.getString(2);
                String tujuan = rs.getString(3);
                int total = rs.getInt(4);
                Object[] data = {idPengajuan, idFakultas, tujuan, total};
                tabel.addRow(data);
            }
            view.getTabelPengajuanWR().getColumnModel().getColumn(0).setPreferredWidth(20);
            view.getTabelPengajuanWR().getColumnModel().getColumn(1).setPreferredWidth(20);
            view.getTabelPengajuanWR().getColumnModel().getColumn(2).setPreferredWidth(100);
            view.getTabelPengajuanWR().getColumnModel().getColumn(3).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public void loadDataPengajuanDiterima(MenuWakilRektor view) {
        String[] kolom = {idPeengajuan, idFakultaas, tujuuan, tootal};
        tabel = new DefaultTableModel(null, kolom) {
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPengajuanDiterima().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PENGAJUANDANA where status = 1";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPengajuan = rs.getString(1);
                String idFakultas = rs.getString(2);
                String tujuan = rs.getString(3);
                int total = rs.getInt(4);
                Object[] data = {idPengajuan, idFakultas, tujuan, total};
                tabel.addRow(data);
            }
            view.getTabelPengajuanDiterima().getColumnModel().getColumn(0).setPreferredWidth(20);
            view.getTabelPengajuanDiterima().getColumnModel().getColumn(1).setPreferredWidth(20);
            view.getTabelPengajuanDiterima().getColumnModel().getColumn(2).setPreferredWidth(100);
            view.getTabelPengajuanDiterima().getColumnModel().getColumn(3).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public void loadDataPengajuanDitolak(MenuWakilRektor view) {
        String[] kolom = {idPeengajuan, idFakultaas, tujuuan, tootal};
        tabel = new DefaultTableModel(null, kolom) {
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPengajuanDitolak().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PENGAJUANDANA where status = -1";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPengajuan = rs.getString(1);
                String idFakultas = rs.getString(2);
                String tujuan = rs.getString(3);
                int total = rs.getInt(4);
                Object[] data = {idPengajuan, idFakultas, tujuan, total};
                tabel.addRow(data);
            }
            view.getTabelPengajuanDitolak().getColumnModel().getColumn(0).setPreferredWidth(20);
            view.getTabelPengajuanDitolak().getColumnModel().getColumn(1).setPreferredWidth(20);
            view.getTabelPengajuanDitolak().getColumnModel().getColumn(2).setPreferredWidth(100);
            view.getTabelPengajuanDitolak().getColumnModel().getColumn(3).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }

    void loadDataDanaMasuk(MenuWakilRektor view) {
        String[] kolom = {idPeembayaran,"ID Mahasiswa", tahuunAjar, tootal};
        tabel = new DefaultTableModel(null, kolom) {
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelDanaMasuk().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PEMBAYARAN where status = 1";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPembayaran = rs.getString(1);
                String idMahasiswa = rs.getString(2);
                String tahunAjar = rs.getString(3);
                int total = rs.getInt(4);
                Object[] data = {idPembayaran, idMahasiswa, tahunAjar, total};
                tabel.addRow(data);
            }
            view.getTabelDanaMasuk().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelDanaMasuk().getColumnModel().getColumn(1).setPreferredWidth(30);
            view.getTabelDanaMasuk().getColumnModel().getColumn(2).setPreferredWidth(30);
            view.getTabelDanaMasuk().getColumnModel().getColumn(3).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }

    void loadDataDanaKeluar(MenuWakilRektor view) {
        String[] kolom = {"ID Pengeluaran", idFakultaas, tahuunAjar,"Keterangan", tootal};
        tabel = new DefaultTableModel(null, kolom) {
            Class[] types = new Class[]{
                java.lang.String.class,
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelDanaKeluar().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PENGELUARANDANA";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPengeluaran = rs.getString(1);
                String idFakultas = rs.getString(2);
                String tahunAjar = rs.getString(3);
                String keterangan = rs.getString(4);
                int total = rs.getInt(5);
                Object[] data = {idPengeluaran, idFakultas, tahunAjar, keterangan, total};
                tabel.addRow(data);
            }
            view.getTabelDanaKeluar().getColumnModel().getColumn(0).setPreferredWidth(15);
            view.getTabelDanaKeluar().getColumnModel().getColumn(1).setPreferredWidth(15);
            view.getTabelDanaKeluar().getColumnModel().getColumn(2).setPreferredWidth(15);
            view.getTabelDanaKeluar().getColumnModel().getColumn(3).setPreferredWidth(100);
            view.getTabelDanaKeluar().getColumnModel().getColumn(4).setPreferredWidth(15);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }

    public void loadPembagianWR(MenuWakilRektor view) {
        String[] kolom = {"ID PEMBAGIAN", idFakultaas, tootal};
        tabel = new DefaultTableModel(null, kolom) {
            Class[] types = new Class[]{
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPembagianWR().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PEMBAGIANDANA";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPembagian = rs.getString(1);
                String idFakultas = rs.getString(2);
                int total = rs.getInt(3);
                Object[] data = {idPembagian, idFakultas, total};
                tabel.addRow(data);
            }
            view.getTabelDanaKeluar().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelDanaKeluar().getColumnModel().getColumn(1).setPreferredWidth(30);
            view.getTabelDanaKeluar().getColumnModel().getColumn(2).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
      void loadDataPembayaran(MenuAdmin view) {
        String[] kolom = {idPeembayaran, "ID Mahasiswa", tootal, statuus};
        tabel = new DefaultTableModel(null, kolom) {
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPembayaran().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT * from PEMBAYARAN";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPembayaran = rs.getString(1);
                String idMahasiswa = rs.getString(2);
                int total = rs.getInt(3);
                String status = rs.getString(4);
                Object[] data = {idPembayaran, idMahasiswa, total, status};
                tabel.addRow(data);
            }
            view.getTabelPembayaran().getColumnModel().getColumn(0).setPreferredWidth(15);
            view.getTabelPembayaran().getColumnModel().getColumn(1).setPreferredWidth(15);
            view.getTabelPembayaran().getColumnModel().getColumn(2).setPreferredWidth(15);
            view.getTabelPembayaran().getColumnModel().getColumn(3).setPreferredWidth(100);
            view.getTabelPembayaran().getColumnModel().getColumn(4).setPreferredWidth(15);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }

    public Fakultas searchFakultas(String text) {
        Fakultas f = null;
        try {
            String query = "SELECT * FROM ADMINFAKULTAS WHERE idFakultas= '" + text +"'";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                f = new Fakultas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            return f;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public Pembayaran searchPembayaran(String text) {
        Pembayaran p = null;
        try {
            String query = "SELECT * FROM PEMBAYARAN WHERE idMahasiswa= '" + text +"'";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                p = new Pembayaran(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            }
            return p;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public Mahasiswa searchMahasiswa(String text) {
        Mahasiswa m = null;
        try {
            String query = "SELECT * FROM MAHASISWA WHERE idMahasiswa= '" + text +"'";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                m = new Mahasiswa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
            return m;
        } catch (Exception ex) {
            return null;
        }
    }

    public void addPembagianDana(PembagianDana pd) {
        try {
            String sql = "INSERT INTO PEMBAGIANDANA (idPembagian,idFakultas,TotalDana) VALUES ("+
                    "'"+pd.getIdPembagian()+"',"+
                    "'"+pd.getIdFakultas()+"',"+
                    "'"+pd.getTotalDana()+"')";
            statement.execute(sql,Statement.RETURN_GENERATED_KEYS);
            rs=statement.getGeneratedKeys();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public void addPembayaran(Pembayaran pb) {
        try {
            String sql = "INSERT INTO PEMBAYARAN (idPembayaran,idMahasiswa,ajaran,total,status,statusbayar) VALUES ("+
                    "'"+pb.getIdPembayaran()+"',"+
                    "'"+pb.getIdMahasiswa()+"',"+
                    "'"+pb.getAjaran()+"',"+
                    "'"+pb.getTotal()+"',"+
                    "'"+pb.getStatus()+"',"+
                    "'"+pb.getStatusBayar()+"')";
            statement.execute(sql,Statement.RETURN_GENERATED_KEYS);
            rs=statement.getGeneratedKeys();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }

    public void updateDanaF(PembagianDana pd, Fakultas f) {
        try {
            int total = f.getDanaFakultas() + pd.getTotalDana();
            String sql = "UPDATE ADMINFAKULTAS SET danafakultas= '"+total+"' WHERE idFakultas= '"+pd.getIdFakultas()+"'";
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Done!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,failed);
        }
    }
    
    public int sumPembayaran(){
        try {
            String query = "SELECT SUM(total) FROM PEMBAYARAN where Status= 1";
            rs = statement.executeQuery(query);
            int totalDanaMasuk=0;
            while (rs.next()) {
                totalDanaMasuk = rs.getInt(1);
            }
            return totalDanaMasuk;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, failed);
            return 0;
        }
    }
    
    public int sumPengeluaran(){
         try {
            String query = "SELECT SUM(TotalDana) FROM PEMBAGIANDANA";
            rs = statement.executeQuery(query);
            int totalDanaKeluar=0;
            while (rs.next()) {
                totalDanaKeluar = rs.getInt(1);
            }
            return totalDanaKeluar;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, failed);
            return 0;
        }
    }
    
    public int sumPengajuan(){
        try {
            String query = "SELECT SUM(total) FROM PENGAJUANDANA where status = 1";
            rs = statement.executeQuery(query);
            int totalDanaKeluar=0;
            while (rs.next()) {
                totalDanaKeluar = rs.getInt(1);
            }
            return totalDanaKeluar;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, failed);
            return 0;
        }
    }
    
    public int showDanaUniversitas() {
        return sumPembayaran()-sumPengeluaran()-sumPengajuan();
    } 
    
      //======== Fakultas
    public void addPengeluaranFakultas (PengeluaranDana f){
        try {
            String sql = "INSERT INTO PENGELUARANDANA VALUES ("+
                    //"'"+a+"',"+
                    "'"+f.getIdPengeluaran()+"',"+
                    "'"+f.getIdFakultas()+"',"+
                    "'"+f.getTahunAjar()+"',"+
                    "'"+f.getKeterangan()+"',"
                    +f.getTotal()+");";
            statement.execute(sql,Statement.RETURN_GENERATED_KEYS);
            rs=statement.getGeneratedKeys();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public int sumPengeluranFakultas(String idFakultas){
        try {
            String query = "SELECT SUM(total) FROM PENGELUARANDANA where idFakultas = '"+idFakultas+"';";
            rs = statement.executeQuery(query);
            int totalPengeluaranFakultas=0;
            while (rs.next()) {
                totalPengeluaranFakultas = rs.getInt(1);
            }
            return totalPengeluaranFakultas;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, failed);
            return 0;
        }
    }
    
    public int sumPembagianDanaFakultas(String idFakultas){
        try {
            String query = "SELECT SUM(TotalDana) FROM PEMBAGIANDANA where idFakultas = '"+idFakultas+"';";
            rs = statement.executeQuery(query);
            int danaFakultas=0;
            while (rs.next()) {
                danaFakultas = rs.getInt(1);
            }
            return danaFakultas;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, failed);
            return 0;
        }
    }
    
    public void loadPembagianDanaFakultas(MenuFakultas view, String idFakultas) {
        String[] kolom = {"ID PEMBAGIAN", "Total Dana"};
        tabel = new DefaultTableModel(null, kolom) {
            Class[] types = new Class[]{
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPembagianDana().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT idPembagian,TotalDana from PEMBAGIANDANA where idFakultas='"+idFakultas+"';";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPembagian = rs.getString(1);
                int total = rs.getInt(2);
                Object[] data = {idPembagian, total};
                tabel.addRow(data);
            }
            view.getTabelPembagianDana().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelPembagianDana().getColumnModel().getColumn(1).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public void loadPengeluaranFakultas(MenuFakultas view, String idFakultas) {
        String[] kolom = {"ID Pengeluaran",tahuunAjar, "Total"};
        tabel = new DefaultTableModel(null, kolom) {
            Class[] types = new Class[]{
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPengeluaran().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT idPengeluaran,tahunajar, total from PENGELUARANDANA where idFakultas='"+idFakultas+"';";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPengeluaran = rs.getString(1);
                String tahunajar = rs.getString(2);
                int total = rs.getInt(3);
                Object[] data = {idPengeluaran, tahunajar, total};
                tabel.addRow(data);
            }
            view.getTabelPengeluaran().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelPengeluaran().getColumnModel().getColumn(1).setPreferredWidth(30);
            view.getTabelPengeluaran().getColumnModel().getColumn(2).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    
    public PengeluaranDana cariPengeluaran(String text) {
        PengeluaranDana keluar = null;
        try {
            String query = "SELECT * FROM PENGELUARANDANA WHERE idPengeluaran= '" + text +"';";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                keluar = new PengeluaranDana(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5));
            }
            return keluar;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public void tambahPengajuanDanaFakultas(PengajuanDana pj){
        try {
            String sql = "INSERT INTO PENGAJUANDANA VALUES ("+
                    "'"+pj.getIdPengajuan()+"',"+
                    "'"+pj.getIdFakultas()+"',"+
                    "'"+pj.getTujuan()+"',"+
                    pj.getTotal()+","+
                    "'"+pj.getStatus()+"');";
            statement.execute(sql,Statement.RETURN_GENERATED_KEYS);
            rs=statement.getGeneratedKeys();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
    

    public void loadPengajuanDanaFakultas(MenuFakultas view, String idFakultas) {
        String[] kolom = {idPeengajuan,tootal, statuus};
        tabel = new DefaultTableModel(null, kolom) {
            Class[] types = new Class[]{
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
                int cola = tabel.getColumnCount();
                return (col < cola) ? false : true;
            }
        };
        view.getTabelPengajuanDanaF().setModel(tabel);
        try {
            hapusTabel();
            String sql = "SELECT idPengajuan,total,status from PENGAJUANDANA where idFakultas='"+idFakultas+"';";
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                String idPengeluaran = rs.getString(1);
                int total = rs.getInt(2);
                String status = "";
                if(rs.getString(3).equals("1")){
                    status = "Diterima";
                }else if (rs.getString(3).equals("0")){
                    status = "Diajukan";
                }else if (rs.getString(3).equals("-1")){
                    status ="Ditolak";
                }

                Object[] data = {idPengeluaran, total, status};
                tabel.addRow(data);
            }
            view.getTabelPengajuanDanaF().getColumnModel().getColumn(0).setPreferredWidth(30);
            view.getTabelPengajuanDanaF().getColumnModel().getColumn(1).setPreferredWidth(30);
            view.getTabelPengajuanDanaF().getColumnModel().getColumn(2).setPreferredWidth(30);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, failed);
        }
    }
}

