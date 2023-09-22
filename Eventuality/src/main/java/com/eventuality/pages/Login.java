package com.eventuality.pages;

import com.eventuality.controls.DbConnect;
import com.eventuality.controls.LecturerDAO;
import com.eventuality.controls.StudentDAO;
import com.eventuality.objects.Lecturer;
import com.eventuality.objects.Student;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    DbConnect db;

    /**
     * Creates new form Login
     */
    public Login() throws SQLException {
        initComponents();
        db = new DbConnect();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblWlcome1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbxRoll = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/logo (1).png")); // NOI18N
        lblLogo.setText("LOGO");
        getContentPane().add(lblLogo);
        lblLogo.setBounds(0, 10, 390, 50);

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
        btnLog.setForeground(new java.awt.Color(0, 0, 0));
        btnLog.setText("LOGIN");
        btnLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLog);
        btnLog.setBounds(300, 360, 316, 21);

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
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Password:");
        pnlLogin.add(jLabel10);
        jLabel10.setBounds(300, 270, 70, 17);

        jLabel11.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email:");
        pnlLogin.add(jLabel11);
        jLabel11.setBounds(300, 210, 50, 17);

        cboRoll.setBackground(new java.awt.Color(102, 153, 255));
        cboRoll.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        cboRoll.setForeground(new java.awt.Color(0, 0, 0));
        cboRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer" }));
        cboRoll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        pnlLogin.add(cboRoll);
        cboRoll.setBounds(380, 190, 160, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
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
        txtName.setBounds(260, 90, 370, 30);

        txtSurname.setBackground(new java.awt.Color(102, 153, 255));
        txtSurname.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSurname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSurname);
        txtSurname.setBounds(260, 140, 370, 30);

        txtSID.setBackground(new java.awt.Color(102, 153, 255));
        txtSID.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSID);
        txtSID.setBounds(260, 190, 370, 30);

        txtSEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtSEmail.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSEmail);
        txtSEmail.setBounds(260, 240, 370, 30);

        txtSPass.setBackground(new java.awt.Color(102, 153, 255));
        txtSPass.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtSPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtSPass);
        txtSPass.setBounds(260, 290, 370, 30);

        txtConfirmPass.setBackground(new java.awt.Color(102, 153, 255));
        txtConfirmPass.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtConfirmPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        pnlSignIn.add(txtConfirmPass);
        txtConfirmPass.setBounds(260, 340, 370, 30);

        btnSignIn.setBackground(new java.awt.Color(102, 153, 255));
        btnSignIn.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(0, 0, 0));
        btnSignIn.setText("SIGN IN");
        btnSignIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        pnlSignIn.add(btnSignIn);
        btnSignIn.setBounds(260, 380, 370, 21);

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Name:");
        pnlSignIn.add(jLabel4);
        jLabel4.setBounds(260, 70, 150, 17);

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Surname:");
        pnlSignIn.add(jLabel5);
        jLabel5.setBounds(260, 120, 150, 17);

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Campus ID:");
        pnlSignIn.add(jLabel6);
        jLabel6.setBounds(260, 170, 150, 17);

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email:");
        pnlSignIn.add(jLabel7);
        jLabel7.setBounds(260, 220, 150, 17);

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Password:");
        pnlSignIn.add(jLabel8);
        jLabel8.setBounds(260, 270, 150, 17);

        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Confirm Password:");
        pnlSignIn.add(jLabel9);
        jLabel9.setBounds(260, 320, 150, 17);

        lblWlcome1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblWlcome1.setForeground(new java.awt.Color(51, 0, 51));
        lblWlcome1.setText("SIGN UP TO VIEW ALL UPCOMING EVENTS");
        pnlSignIn.add(lblWlcome1);
        lblWlcome1.setBounds(270, 0, 450, 60);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        pnlSignIn.add(jPanel1);
        jPanel1.setBounds(20, 50, 870, 10);

        cbxRoll.setBackground(new java.awt.Color(102, 153, 255));
        cbxRoll.setForeground(new java.awt.Color(0, 0, 0));
        cbxRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer" }));
        pnlSignIn.add(cbxRoll);
        cbxRoll.setBounds(60, 190, 150, 25);
        pnlSignIn.add(jLabel3);
        jLabel3.setBounds(-10, 0, 940, 420);

        tabLogin.addTab("SIGN UP", pnlSignIn);

        getContentPane().add(tabLogin);
        tabLogin.setBounds(23, 78, 910, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPassActionPerformed
        // this is used to update password for a user, depending on if its a stud or lec
        String user;
        String num;

        if (cboRoll.getSelectedIndex() == 0) {
            user = JOptionPane.showInputDialog(null, "Please enter your email...");
            num = JOptionPane.showInputDialog(null, "Please enter your student number...");

            try {
                ForgotPass(user, num);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            user = JOptionPane.showInputDialog(null, "Please enter your email...");
            num = JOptionPane.showInputDialog(null, "Please enter you staff number...");

            try {
                ForgotPass(user, Integer.parseInt(num));

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnForgotPassActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        if (evt.getSource() == btnLog) {

            if (cboRoll.getSelectedIndex() == 0) {
                //if the logging in user is a student the below will execute
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            LoginStud();
                        } catch (SQLException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            } else {
                //if its a lecturer the below will execute
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            LoginStaff();
                        } catch (SQLException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        if (evt.getSource() == btnSignIn) {

            if (cbxRoll.getSelectedIndex() == 0) {
                // this if will run in the user being created is a student
                try {
                    NewStud();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // this if will run in the user being created is a lecturer
                try {
                    NewLec();
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnSignInActionPerformed

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

    public void ForgotPass(String studEmail, String studNum) throws SQLException {
        StudentDAO dao = new StudentDAO();
        dao.Checkuser(db.getC(), studEmail, studNum);
    }

    public void ForgotPass(String lecEmail, int staffNum) throws SQLException {
        LecturerDAO dao = new LecturerDAO();
        dao.Checkuser(db.getC(), lecEmail, staffNum);
    }

    public void LoginStud() throws SQLException {
        StudentDAO dao = new StudentDAO();
        Student stud = new Student();
        stud = dao.SelectLogin(db.getC(), txtEmail.getText(), txtPass.getText());
        if (stud == null) {
            JOptionPane.showMessageDialog(null, "This Lecturer does not exist");
        } else {
            db.CloseAll();
            new Student_Live_Events(stud).setVisible(true);
            this.dispose();
        }
    }

    public void LoginStaff() throws SQLException {
        LecturerDAO dao = new LecturerDAO();
        Lecturer lec = new Lecturer();
        lec = dao.SelectLogin(db.getC(), txtEmail.getText(), txtPass.getText());
        if (lec == null) {
            JOptionPane.showMessageDialog(null, "This user does not exist");
        } else {
            db.CloseAll();
            new Lecture_Live_Events(lec).setVisible(true);
            this.dispose();
        }
    }

    public void NewStud() throws SQLException {
        Student stu = new Student();
        stu.setStudName(txtName.getText());
        stu.setStudSurname(txtSurname.getText());
        stu.setStudNum(Integer.parseInt(txtSID.getText()));
        stu.setStudEmail(txtEmail.getText());

        if (txtSPass.getText().equals(txtConfirmPass.getText())) {
            stu.setStudPassword(txtSPass.getText());
            UserCreated(stu);
            tabLogin.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Passwords do not match.");
        }
    }

    public void NewLec() throws SQLException {
        Lecturer staff = new Lecturer();
        staff.setLectName(txtName.getText());
        staff.setLectSurname(txtSurname.getText());
        staff.setStaffNumber(Integer.parseInt(txtSID.getText()));
        staff.setLectEmail(txtEmail.getText());

        if (txtSPass.getText().equals(txtConfirmPass.getText())) {
            staff.setLectPassword(txtSPass.getText());
            UserCreated(staff);
            tabLogin.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Passwords do not match.");
        }
    }

    private void UserCreated(Student stud) throws SQLException {
        StudentDAO studDao = new StudentDAO();
        int confirm = JOptionPane.showConfirmDialog(null, stud.toString() + "Are you sure your want to create this Student?");

        if (confirm == 0) {
            studDao.InsertRecord(db.getC(), stud);
        }

    }

    private void UserCreated(Lecturer lec) throws SQLException {
        LecturerDAO studDao = new LecturerDAO();
        int confirm = JOptionPane.showConfirmDialog(null, lec.toString() + "Are you sure your want to create this Lecturer?");

        if (confirm == 0) {
            studDao.InsertRecord(db.getC(), lec);
        }

    }
}
