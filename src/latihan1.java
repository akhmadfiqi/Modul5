public class latihan1 extends javax.swing.JFrame {
    public latihan1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamat = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Nama = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Kelas = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Alamat1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        Nama1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        Kelas1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(Alamat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 130, 180, 22);

        jScrollPane2.setViewportView(Nama);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 70, 180, 22);

        jScrollPane3.setViewportView(Kelas);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(140, 100, 180, 22);

        jLabel1.setText("Alamat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 120, 80, 40);

        jLabel2.setText("Formulir");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 20, 50, 30);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 90, 80, 40);

        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 60, 80, 40);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 170, 90, 30);

        jScrollPane4.setViewportView(Alamat1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(140, 290, 180, 22);

        jScrollPane5.setViewportView(Nama1);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(140, 230, 180, 22);

        jScrollPane6.setViewportView(Kelas1);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(140, 260, 180, 22);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 280, 80, 40);

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 250, 80, 40);

        jLabel7.setText("Nama");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 220, 80, 40);

        setBounds(0, 0, 447, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = Nama.getText();
        Nama1.setText(nama);
        String kelas = Kelas.getText();
        Kelas1.setText(kelas);
        String alamat = Alamat.getText();
        Alamat1.setText(alamat);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Alamat;
    private javax.swing.JTextPane Alamat1;
    private javax.swing.JTextPane Kelas;
    private javax.swing.JTextPane Kelas1;
    private javax.swing.JTextPane Nama;
    private javax.swing.JTextPane Nama1;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
