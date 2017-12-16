package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Random;

public class MenuFakultas extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MenuFakultas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfDana = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelPembagianDana = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfIDPengeluaran = new javax.swing.JTextField();
        comboTahunAjar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taKeterangan = new javax.swing.JTextArea();
        tfTotalpengeluaran = new javax.swing.JTextField();
        btnAddPengeluaran = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPengeluaran = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfLihatIDPengeluaran = new javax.swing.JTextField();
        btnLihatKeterangan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelKeterangan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taTujuanPengajuan = new javax.swing.JTextArea();
        tfPengajuan = new javax.swing.JTextField();
        tfTotalPengajuan = new javax.swing.JTextField();
        btnAddPengajuan = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelPengajuanDanaF = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLogoutFakultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tfDana.setEditable(false);
        tfDana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDanaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dana saat ini : ");

        tabelPembagianDana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pembagian", "Total Dana"
            }
        ));
        jScrollPane5.setViewportView(tabelPembagianDana);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(tfDana, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Lihat Pembagian Dana", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("ID Pengeluaran      :");

        jLabel5.setText("Tahun Ajar             :");

        jLabel6.setText("Total                      :");

        jLabel7.setText("Keterangan            :");

        tfIDPengeluaran.setEditable(false);
        tfIDPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDPengeluaranActionPerformed(evt);
            }
        });

        comboTahunAjar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016/2017", "2017/2018", "2018/2019", "2019/2020" }));

        taKeterangan.setColumns(20);
        taKeterangan.setRows(5);
        jScrollPane1.setViewportView(taKeterangan);

        btnAddPengeluaran.setText("Add");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddPengeluaran)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotalpengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboTahunAjar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfIDPengeluaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfIDPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboTahunAjar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(tfTotalpengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPengeluaran)
                        .addGap(22, 22, 22))))
        );

        jTabbedPane1.addTab("Input Pengeluaran", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tabelPengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pengeluaran", "Tahun Ajar", "Total"
            }
        ));
        jScrollPane2.setViewportView(tabelPengeluaran);

        jLabel4.setText("ID Pengeluaran : ");

        btnLihatKeterangan.setText("Lihat Keterangan");
        btnLihatKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatKeteranganActionPerformed(evt);
            }
        });

        jLabel8.setText("Keterangan :");

        labelKeterangan.setText("ini ntar ditulis keterangannya");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLihatKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfLihatIDPengeluaran))
                .addGap(78, 78, 78)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(labelKeterangan)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfLihatIDPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(labelKeterangan))
                .addGap(46, 46, 46)
                .addComponent(btnLihatKeterangan)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lihat Pengeluaran", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("ID Pengajuan                    :");

        jLabel10.setText("Tujuan                               :");

        jLabel11.setText("Total                                 :");

        taTujuanPengajuan.setColumns(20);
        taTujuanPengajuan.setRows(5);
        jScrollPane3.setViewportView(taTujuanPengajuan);

        tfPengajuan.setEditable(false);

        btnAddPengajuan.setText("Add");

        tabelPengajuanDanaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Pengajuan", "Total", "Status"
            }
        ));
        jScrollPane4.setViewportView(tabelPengajuanDanaF);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddPengajuan)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotalPengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalPengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddPengajuan)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Pengajuan Dana", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ADMIN FAKULTAS");

        btnLogoutFakultas.setText("LOGOUT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(btnLogoutFakultas))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogoutFakultas)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDanaActionPerformed

    private void tfIDPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDPengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDPengeluaranActionPerformed

    private void btnLihatKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatKeteranganActionPerformed

    public void addListener(ActionListener e){
        btnAddPengajuan.addActionListener(e);
        btnAddPengeluaran.addActionListener(e);
        btnLihatKeterangan.addActionListener(e);
        btnLogoutFakultas.addActionListener(e);
    }
    
    public JButton getBtnAddPengajuan() {
        return btnAddPengajuan;
    }

    public JButton getBtnAddPengeluaran() {
        return btnAddPengeluaran;
    }

    public JButton getBtnLihatKeterangan() {
        return btnLihatKeterangan;
    }

    public JButton getBtnLogoutFakultas() {
        return btnLogoutFakultas;
    }

    public JComboBox<String> getComboTahunAjar() {
        return comboTahunAjar;
    }

    public JLabel getLabelKeterangan() {
        return labelKeterangan;
    }

    public JTextArea getTaKeterangan() {
        return taKeterangan;
    }

    public JTextArea getTaTujuanPengajuan() {
        return taTujuanPengajuan;
    }

    public JTable getTabelPembagianDana() {
        return tabelPembagianDana;
    }

    public JTable getTabelPengajuanDanaF() {
        return tabelPengajuanDanaF;
    }

    public JTable getTabelPengeluaran() {
        return tabelPengeluaran;
    }

    public JTextField getTfDana() {
        return tfDana;
    }

    public JTextField getTfIDPengeluaran() {
        return tfIDPengeluaran;
    }

    public JTextField getTfLihatIDPengeluaran() {
        return tfLihatIDPengeluaran;
    }

    public JTextField getTfPengajuan() {
        return tfPengajuan;
    }

    public JTextField getTfTotalPengajuan() {
        return tfTotalPengajuan;
    }
   public  JTextField getTfTotalPengeluaran(){
        return tfTotalpengeluaran;
    }
    
    public void refresh(String s){
        tfIDPengeluaran.setText(s);
        Random r = new Random();
        int randId = r.nextInt(999-111) + 111;
        tfIDPengeluaran.setText(""+Integer.toString(randId));
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPengajuan;
    private javax.swing.JButton btnAddPengeluaran;
    private javax.swing.JButton btnLihatKeterangan;
    private javax.swing.JButton btnLogoutFakultas;
    private javax.swing.JComboBox<String> comboTahunAjar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JTextArea taKeterangan;
    private javax.swing.JTextArea taTujuanPengajuan;
    private javax.swing.JTable tabelPembagianDana;
    private javax.swing.JTable tabelPengajuanDanaF;
    private javax.swing.JTable tabelPengeluaran;
    private javax.swing.JTextField tfDana;
    private javax.swing.JTextField tfIDPengeluaran;
    private javax.swing.JTextField tfLihatIDPengeluaran;
    private javax.swing.JTextField tfPengajuan;
    private javax.swing.JTextField tfTotalPengajuan;
    private javax.swing.JTextField tfTotalpengeluaran;
    // End of variables declaration//GEN-END:variables
}
