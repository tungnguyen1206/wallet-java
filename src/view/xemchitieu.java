/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class xemchitieu extends javax.swing.JFrame {

    
    DefaultTableModel tableModel = new DefaultTableModel();
    
    /**
     * Creates new form xemchitieu
     */
    public xemchitieu() {
        initComponents();
        tableModel = (DefaultTableModel) walletTable.getModel();
        HienThi();
    }
    
    public void HienThi(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sonoButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sochitieuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        walletTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sonoButton.setBackground(new java.awt.Color(242, 242, 242));
        sonoButton.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        sonoButton.setText("SỔ NỢ");
        sonoButton.setBorder(null);
        sonoButton.setFocusPainted(false);
        getContentPane().add(sonoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 110, 280));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        jButton4.setText("Đăng xuất");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 110, -1));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Phuong Anh Tuan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 240, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/person-male.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        moneyLabel.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(255, 255, 51));
        moneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        moneyLabel.setText("1000000");
        getContentPane().add(moneyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel8.setText("Số tiền trong ví (VND):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/wallet-with-money-icon-10.png"))); // NOI18N
        jLabel7.setRequestFocusEnabled(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, -1));

        jLabel1.setBackground(new java.awt.Color(51, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 151));

        sochitieuButton.setBackground(new java.awt.Color(255, 255, 255));
        sochitieuButton.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        sochitieuButton.setText("SỔ CHI TIÊU");
        sochitieuButton.setBorder(null);
        sochitieuButton.setFocusPainted(false);
        getContentPane().add(sochitieuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 110, 280));

        walletTable.setFont(new java.awt.Font("Corbel", 0, 20)); // NOI18N
        walletTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ngày", "Nội dung", "Số tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(walletTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 605, 560));

        jLabel6.setBackground(new java.awt.Color(0, 102, 0));
        jLabel6.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THỐNG KÊ");
        jLabel6.setPreferredSize(new java.awt.Dimension(91, 22));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 170, 40));

        jLabel4.setBackground(new java.awt.Color(248, 248, 248));
        jLabel4.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-----------------------");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 200, 380));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm bản ghi");
        jButton1.setFocusPainted(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 554, 155, 30));

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sửa");
        jButton2.setFocusPainted(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 603, 155, 30));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Xóa");
        jButton3.setFocusPainted(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 652, 155, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn đăng xuất khỏi tài khoản hiện tại?")==0){
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JButton sochitieuButton;
    private javax.swing.JButton sonoButton;
    private javax.swing.JTable walletTable;
    // End of variables declaration//GEN-END:variables

}