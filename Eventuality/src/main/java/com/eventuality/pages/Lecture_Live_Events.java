package com.eventuality.pages;

import com.eventuality.controls.BookingDAO;
import com.eventuality.controls.DbConnect;
import com.eventuality.controls.EventDAO;
import com.eventuality.controls.LocationDAO;
import com.eventuality.objects.Booking;
import com.eventuality.objects.Event;
import com.eventuality.objects.Lecturer;
import com.eventuality.objects.Location;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Lecture_Live_Events extends javax.swing.JFrame {

    private DbConnect db;
    LocationDAO locDAO;
    private ArrayList<Event> evtArray;
    private ArrayList<Event> pendevtArray;
    private Lecturer loggedin = new Lecturer();
    private ArrayList<Event> events = new ArrayList();
    DefaultListModel<String> dlmBook = new DefaultListModel<String>();
    private ArrayList<Booking> book = new ArrayList();
    BookingDAO bookDAO;

    /**
     * Creates new form Lecture_Live_Events
     */
    public Lecture_Live_Events() {
        initComponents();
        try {
            db = new DbConnect();
            EventDAO evtDAO = new EventDAO();
            evtArray = new ArrayList();
            DefaultListModel<String> dlm = new DefaultListModel<String>();
            evtArray = evtDAO.SelectTable(db.getS());
            pendevtArray = new ArrayList<>();
            for (var i : evtArray) {
                if (i.isApprovalStatus() == false) {
                    pendevtArray.add(i);
                    dlm.addElement(i.getEventId() + " - " + i.getTitle() + " - " + i.getLeader() + " - " + i.getDate());
                }
            }
            lstPending.setModel(dlm);
        } catch (SQLException e) {

        } finally {
            try {
                db.CloseAll();
            } catch (SQLException ex) {
                Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        tabLecturer = new javax.swing.JTabbedPane();
        pnlPending = new javax.swing.JPanel();
        lblPending = new javax.swing.JLabel();
        spPending = new javax.swing.JScrollPane();
        lstPending = new javax.swing.JList<>();
        lblEDetails = new javax.swing.JLabel();
        btnAppStatus = new javax.swing.JButton();
        btnDenyStatus = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstEDetails = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlLive = new javax.swing.JPanel();
        lblLiveE = new javax.swing.JLabel();
        lblDetailsEvent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEventsL = new javax.swing.JList<>();
        btnBookEvent = new javax.swing.JButton();
        lblBooked = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstDetails = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBooked = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        lblLectLogo = new javax.swing.JLabel();
        btnLHome = new javax.swing.JButton();
        btnLGallery = new javax.swing.JButton();
        btnLSignOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabLecturer.setBackground(new java.awt.Color(102, 153, 255));
        tabLecturer.setForeground(new java.awt.Color(255, 255, 255));
        tabLecturer.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        tabLecturer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SwitchPage(evt);
            }
        });

        pnlPending.setBackground(new java.awt.Color(102, 153, 255));
        pnlPending.setLayout(null);

        lblPending.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblPending.setText("PENDING EVENTS");
        pnlPending.add(lblPending);
        lblPending.setBounds(130, 20, 150, 22);

        lstPending.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        lstPending.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PendingEventsChane(evt);
            }
        });
        spPending.setViewportView(lstPending);

        pnlPending.add(spPending);
        spPending.setBounds(30, 60, 370, 330);

        lblEDetails.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblEDetails.setText("EVENT DETAILS  ");
        pnlPending.add(lblEDetails);
        lblEDetails.setBounds(590, 20, 140, 22);

        btnAppStatus.setBackground(new java.awt.Color(102, 153, 255));
        btnAppStatus.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnAppStatus.setText("APPROVE");
        btnAppStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(255, 255, 255), null, null));
        btnAppStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppStatusActionPerformed(evt);
            }
        });
        pnlPending.add(btnAppStatus);
        btnAppStatus.setBounds(470, 330, 370, 21);

        btnDenyStatus.setBackground(new java.awt.Color(102, 153, 255));
        btnDenyStatus.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnDenyStatus.setText("DENY");
        btnDenyStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(255, 255, 255), null, null));
        btnDenyStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyStatusActionPerformed(evt);
            }
        });
        pnlPending.add(btnDenyStatus);
        btnDenyStatus.setBounds(470, 360, 370, 21);

        lstEDetails.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jScrollPane4.setViewportView(lstEDetails);

        pnlPending.add(jScrollPane4);
        jScrollPane4.setBounds(470, 60, 370, 260);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        pnlPending.add(jPanel1);
        jPanel1.setBounds(430, 60, 10, 330);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("jLabel1");
        pnlPending.add(jLabel1);
        jLabel1.setBounds(-40, 0, 930, 410);

        tabLecturer.addTab("PENDING EVENTS", pnlPending);

        pnlLive.setBackground(new java.awt.Color(102, 153, 255));
        pnlLive.setLayout(null);

        lblLiveE.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblLiveE.setText("LIVE EVENTS");
        pnlLive.add(lblLiveE);
        lblLiveE.setBounds(160, 20, 110, 22);

        lblDetailsEvent.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblDetailsEvent.setText("EVENT DETAILS");
        pnlLive.add(lblDetailsEvent);
        lblDetailsEvent.setBounds(590, 20, 142, 22);

        lstEventsL.setBackground(new java.awt.Color(0, 51, 102));
        lstEventsL.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        lstEventsL.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstEventsL.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LiveEventList(evt);
            }
        });
        jScrollPane1.setViewportView(lstEventsL);

        pnlLive.add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 370, 350);

        btnBookEvent.setBackground(new java.awt.Color(102, 153, 255));
        btnBookEvent.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnBookEvent.setText("BOOK EVENT");
        btnBookEvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBookEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookEventActionPerformed(evt);
            }
        });
        pnlLive.add(btnBookEvent);
        btnBookEvent.setBounds(470, 200, 370, 30);

        lblBooked.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblBooked.setText("BOOKED EVENTS");
        pnlLive.add(lblBooked);
        lblBooked.setBounds(470, 240, 120, 17);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        pnlLive.add(jPanel2);
        jPanel2.setBounds(430, 50, 10, 350);

        lstDetails.setBackground(new java.awt.Color(0, 51, 102));
        lstDetails.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jScrollPane5.setViewportView(lstDetails);

        pnlLive.add(jScrollPane5);
        jScrollPane5.setBounds(470, 50, 370, 140);

        lstBooked.setBackground(new java.awt.Color(0, 51, 102));
        lstBooked.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(lstBooked);

        pnlLive.add(jScrollPane2);
        jScrollPane2.setBounds(470, 260, 370, 134);

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("jLabel1");
        pnlLive.add(jLabel3);
        jLabel3.setBounds(-40, 0, 930, 410);

        tabLecturer.addTab("LIVE EVENTS", pnlLive);

        getContentPane().add(tabLecturer);
        tabLecturer.setBounds(40, 80, 880, 440);
        getContentPane().add(lblLectLogo);
        lblLectLogo.setBounds(0, 10, 340, 50);

        btnLHome.setBackground(new java.awt.Color(102, 153, 255));
        btnLHome.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        btnLHome.setText("HOME");
        btnLHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, null));
        getContentPane().add(btnLHome);
        btnLHome.setBounds(530, 20, 120, 30);

        btnLGallery.setBackground(new java.awt.Color(102, 153, 255));
        btnLGallery.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        btnLGallery.setText("GALLERY");
        btnLGallery.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, null));
        getContentPane().add(btnLGallery);
        btnLGallery.setBounds(660, 20, 120, 30);

        btnLSignOut.setBackground(new java.awt.Color(102, 153, 255));
        btnLSignOut.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        btnLSignOut.setText("SIGN OUT");
        btnLSignOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, null));
        btnLSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLSignOut);
        btnLSignOut.setBounds(790, 20, 120, 30);

        jLabel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAppStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppStatusActionPerformed
        try {
            int i = lstPending.getSelectedIndex();
            EventDAO evtDao = new EventDAO();
            db = new DbConnect();
            evtDao.UpdateRecord(db.getC(), "TRUE", pendevtArray.get(i).getEventId());
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                db.CloseAll();
            } catch (SQLException ex) {
                Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAppStatusActionPerformed

    private void btnLSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLSignOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLSignOutActionPerformed

    private void PendingEventsChane(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PendingEventsChane
        int i = lstPending.getSelectedIndex();
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        dlm.addElement("EVENT ID: " + pendevtArray.get(i).getEventId());
        dlm.addElement("TITLE: " + pendevtArray.get(i).getTitle());
        dlm.addElement("DESCRIPTION: " + pendevtArray.get(i).getDescription());
        dlm.addElement("EVENT DATE: " + pendevtArray.get(i).getDate());
        dlm.addElement("START TIME: " + pendevtArray.get(i).getTime());
        dlm.addElement("EVENT ID: " + pendevtArray.get(i).getLocation());
        lstEDetails.setModel(dlm);

    }//GEN-LAST:event_PendingEventsChane

    private void btnDenyStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyStatusActionPerformed
        try {
            EventDAO evtDao = new EventDAO();
            BookingDAO bookDao = new BookingDAO();
            int i = lstPending.getSelectedIndex();
            db = new DbConnect();
            bookDao.DeleteRecord(db.getC(), pendevtArray.get(i).getEventId());
            evtDao.DeleteRecord(db.getC(), pendevtArray.get(i).getEventId());
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                db.CloseAll();
            } catch (SQLException ex) {
                Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDenyStatusActionPerformed

    private void LiveEventList(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LiveEventList
        int i = lstEventsL.getSelectedIndex();
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        Event ev = events.get(i);
        LocationDAO locDAO = new LocationDAO();
        
        dlm.addElement("TITLE: " + ev.getTitle());
        dlm.addElement("DESCRIPTION: " + ev.getDescription());
        dlm.addElement("START TIME:" + ev.getTime());
        dlm.addElement("EVENT DATE: " + ev.getDate());
        ArrayList<Location> locArr = new ArrayList();
        try {
            locArr = locDAO.SeleteAll(db.getS());
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (var x : locArr) {
            if (ev.getLocation().equalsIgnoreCase(x.getEventLocation())) {
                dlm.addElement("EVENT LOCATION: " + x.getCampus() + "-" + x.getBuilding() + " -" + x.getDepartment() + "-" + x.getRoom());
            }
        }
        dlm.addElement("EVENT TYPE: " + ev.getEventType());
        lstDetails.setModel(dlm);    }//GEN-LAST:event_LiveEventList

    private void SwitchPage(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SwitchPage
        try {
            db = new DbConnect();
            loggedin.setStaffNumber(34156738);
            EventDAO evtDAO = new EventDAO();
            ArrayList<Event> evtArray = new ArrayList();
            DefaultListModel<String> dlm = new DefaultListModel<String>();
            evtArray = evtDAO.SelectTable(db.getS());
            for (var i : evtArray) {
                if (i.isApprovalStatus() == true) {
                    events.add(i);
                    dlm.addElement(i.getEventId() + " - " + i.getTitle() + " - " + i.getLeader() + " - " + i.getDate());
                }
            }
            lstEventsL.setModel(dlm);
        } catch (SQLException e) {
            System.out.println("Err: " + e.getMessage());
        }

        bookDAO = new BookingDAO();

        try {
            book = bookDAO.SelectLectRecords(db.getC(), loggedin.getStaffNumber());
            for (var x : book) {
                System.out.println("Event: " + x.getEventId());
                dlmBook.addElement(x.getEventId() + " - " + x.getTicketNumber() + " - " + x.getDate() + " - " + x.getTime());
            }
            lstBooked.setModel(dlmBook);
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SwitchPage

    private void btnBookEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookEventActionPerformed
        int i = lstEventsL.getSelectedIndex();
        Event ev = events.get(i);
        Booking lecBook = new Booking();

        lecBook.setTicketNumber(5631509);
        lecBook.setAttdNumberLec(loggedin.getStaffNumber());
        lecBook.setTime(ev.getTime());
        lecBook.setEventId(ev.getEventId());
        lecBook.setAttdType("L".charAt(0));
        lecBook.setDate(ev.getDate());
        lecBook.setAttdNumberLec(ev.getIsApprovedBy());
        lecBook.setAttdNumberStud(ev.getLeader());

        bookDAO = new BookingDAO();

        try {
            bookDAO.InsertRecord(db.getC(), lecBook);
            dlmBook.addElement(lecBook.getEventId() + " - " + lecBook.getTicketNumber() + " - " + lecBook.getDate() + " - " + lecBook.getTime());
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_btnBookEventActionPerformed

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
            java.util.logging.Logger.getLogger(Lecture_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecture_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecture_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecture_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecture_Live_Events().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppStatus;
    private javax.swing.JButton btnBookEvent;
    private javax.swing.JButton btnDenyStatus;
    private javax.swing.JButton btnLGallery;
    private javax.swing.JButton btnLHome;
    private javax.swing.JButton btnLSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblBooked;
    private javax.swing.JLabel lblDetailsEvent;
    private javax.swing.JLabel lblEDetails;
    private javax.swing.JLabel lblLectLogo;
    private javax.swing.JLabel lblLiveE;
    private javax.swing.JLabel lblPending;
    private javax.swing.JList<String> lstBooked;
    private javax.swing.JList<String> lstDetails;
    private javax.swing.JList<String> lstEDetails;
    private javax.swing.JList<String> lstEventsL;
    private javax.swing.JList<String> lstPending;
    private javax.swing.JPanel pnlLive;
    private javax.swing.JPanel pnlPending;
    private javax.swing.JScrollPane spPending;
    private javax.swing.JTabbedPane tabLecturer;
    // End of variables declaration//GEN-END:variables
}
