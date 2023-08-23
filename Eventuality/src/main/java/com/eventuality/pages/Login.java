package com.eventuality.pages;

import com.eventuality.controls.DbConnect;
import com.eventuality.controls.LecturerDAO;
import com.eventuality.controls.StudentDAO;
import com.eventuality.objects.Lecturer;
import com.eventuality.objects.Student;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {
    
    DbConnect db;
    Student stu;
    Lecturer lec;
    /**
     * Creates new form Login
     */
    public Login() {
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

        navHome = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        tabLogin = new javax.swing.JTabbedPane();
        pnlLogin = new javax.swing.JPanel();
        txtPass = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnLog = new javax.swing.JButton();
        btnForgotPass = new javax.swing.JButton();
        imgAvatar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboRoll = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        pnlSignIn = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtSID = new javax.swing.JTextField();
        txtSEmail = new javax.swing.JTextField();
        txtSPass = new javax.swing.JTextField();
        txtConfirmPass = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblWlcome1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbxRoll = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(null);

        navHome.setBackground(new java.awt.Color(102, 153, 255));
        navHome.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        navHome.setText("HOME");
        navHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        navHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navHomeActionPerformed(evt);
            }
        });
        getContentPane().add(navHome);
        navHome.setBounds(800, 20, 130, 30);

        lblLogo.setText("LOGO");
        getContentPane().add(lblLogo);
        lblLogo.setBounds(0, 10, 340, 50);

        tabLogin.setBackground(new java.awt.Color(102, 153, 255));
        tabLogin.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N

        pnlLogin.setOpaque(false);
        pnlLogin.setLayout(null);

        txtPass.setBackground(new java.awt.Color(102, 153, 255));
        txtPass.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlLogin.add(txtPass);
        txtPass.setBounds(300, 290, 316, 37);
        txtPass.getAccessibleContext().setAccessibleName("txtPass");

        txtEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtEmail.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlLogin.add(txtEmail);
        txtEmail.setBounds(300, 230, 316, 37);
        txtEmail.getAccessibleContext().setAccessibleName("txtEmail");

        btnLog.setBackground(new java.awt.Color(102, 153, 255));
        btnLog.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnLog.setText("LOGIN");
        btnLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLog);
        btnLog.setBounds(300, 360, 316, 24);

        btnForgotPass.setBackground(new java.awt.Color(102, 153, 255));
        btnForgotPass.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnForgotPass.setForeground(new java.awt.Color(0, 0, 204));
        btnForgotPass.setText("FORGOT PASSWORD");
        btnForgotPass.setBorder(null);
        btnForgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPassActionPerformed(evt);
            }
        });
        pnlLogin.add(btnForgotPass);
        btnForgotPass.setBounds(360, 320, 195, 40);

        imgAvatar.setText("AVATAR");
        pnlLogin.add(imgAvatar);
        imgAvatar.setBounds(390, 40, 130, 130);
        imgAvatar.getAccessibleContext().setAccessibleName("imgAvatar");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Password:");
        pnlLogin.add(jLabel10);
        jLabel10.setBounds(300, 270, 70, 20);

        jLabel11.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel11.setText("Email:");
        pnlLogin.add(jLabel11);
        jLabel11.setBounds(300, 210, 50, 20);

        cboRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer" }));
        pnlLogin.add(cboRoll);
        cboRoll.setBounds(110, 150, 160, 22);

        jLabel2.setText("jLabel2");
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(-20, 0, 930, 420);

        tabLogin.addTab("LOGIN", pnlLogin);

        pnlSignIn.setOpaque(false);
        pnlSignIn.setLayout(null);

        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtName);
        txtName.setBounds(520, 90, 370, 30);

        txtSurname.setBackground(new java.awt.Color(102, 153, 255));
        txtSurname.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSurname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSurname);
        txtSurname.setBounds(520, 140, 370, 30);

        txtSID.setBackground(new java.awt.Color(102, 153, 255));
        txtSID.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSID);
        txtSID.setBounds(520, 190, 370, 30);

        txtSEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtSEmail.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSEmail);
        txtSEmail.setBounds(520, 240, 370, 30);

        txtSPass.setBackground(new java.awt.Color(102, 153, 255));
        txtSPass.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSPass);
        txtSPass.setBounds(520, 290, 370, 30);

        txtConfirmPass.setBackground(new java.awt.Color(102, 153, 255));
        txtConfirmPass.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtConfirmPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtConfirmPass);
        txtConfirmPass.setBounds(520, 340, 370, 30);

        btnSignIn.setBackground(new java.awt.Color(102, 153, 255));
        btnSignIn.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnSignIn.setText("SIGN IN");
        btnSignIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        pnlSignIn.add(btnSignIn);
        btnSignIn.setBounds(520, 380, 370, 24);

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Name:");
        pnlSignIn.add(jLabel4);
        jLabel4.setBounds(520, 70, 150, 20);

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Surname:");
        pnlSignIn.add(jLabel5);
        jLabel5.setBounds(520, 120, 150, 20);

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Campus ID:");
        pnlSignIn.add(jLabel6);
        jLabel6.setBounds(520, 170, 150, 20);

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        pnlSignIn.add(jLabel7);
        jLabel7.setBounds(520, 220, 150, 20);

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel8.setText("Password:");
        pnlSignIn.add(jLabel8);
        jLabel8.setBounds(520, 270, 150, 20);

        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel9.setText("Confirm Password:");
        pnlSignIn.add(jLabel9);
        jLabel9.setBounds(520, 320, 150, 20);

        jLabel13.setText("jLabel13");
        pnlSignIn.add(jLabel13);
        jLabel13.setBounds(20, 90, 480, 310);

        lblWlcome1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblWlcome1.setForeground(new java.awt.Color(51, 0, 51));
        lblWlcome1.setText("SIGN UP TO VIEW ALL UPCOMING EVENTS");
        pnlSignIn.add(lblWlcome1);
        lblWlcome1.setBounds(270, 0, 360, 60);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        pnlSignIn.add(jPanel1);
        jPanel1.setBounds(20, 50, 870, 10);

        cbxRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer" }));
        pnlSignIn.add(cbxRoll);
        cbxRoll.setBounds(110, 160, 150, 22);
        pnlSignIn.add(jLabel3);
        jLabel3.setBounds(-10, 0, 940, 420);

        tabLogin.addTab("SIGN UP", pnlSignIn);

        getContentPane().add(tabLogin);
        tabLogin.setBounds(23, 78, 910, 450);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgotPassActionPerformed

    private void navHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navHomeActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
                if(evt.getSource()==btnLog){
            String email = txtEmail.getText();
            String[] array;
            array = email.split("@");
            if(cboRoll.getSelectedIndex()==0){
                try{
                    db = new DbConnect();
                    StudentDAO dao = new StudentDAO();
                    stu = dao.SelectLogin(db.getS(), txtEmail.getText(), txtPass.getText());
                    this.setVisible(false);
                    new Student_Live_Events().setVisible(true); 
                }
                
                catch(SQLException ex){
                    System.out.println("Error during sign in");
                }
            }
            if(cboRoll.getSelectedIndex()==1){
                try{
                    db = new DbConnect();
                    LecturerDAO dao = new LecturerDAO();
                    lec = dao.SelectLogin(db.getS(), txtEmail.getText(), txtPass.getText());
                    this.setVisible(false);
                    new Lecture_Live_Events().setVisible(true); 
                }
                
                catch(SQLException ex){
                    System.out.println("Error during sign in");
                }
            }
            
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed

    }//GEN-LAST:event_btnSignInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPass;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JComboBox<String> cboRoll;
    private javax.swing.JComboBox<String> cbxRoll;
    private javax.swing.JLabel imgAvatar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblWlcome1;
    private javax.swing.JButton navHome;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlSignIn;
    private javax.swing.JTabbedPane tabLogin;
    private javax.swing.JTextField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSEmail;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSPass;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
