package com.eventuality.pages;

import com.eventuality.controls.BookingDAO;
import com.eventuality.controls.DbConnect;
import com.eventuality.controls.EventDAO;
import com.eventuality.controls.LocationDAO;
import com.eventuality.controls.VolunteerDAO;
import com.eventuality.objects.Booking;
import com.eventuality.objects.Event;
import com.eventuality.objects.Lecturer;
import com.eventuality.objects.Location;
import com.eventuality.objects.Volunteer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Lecture_Live_Events extends javax.swing.JFrame {

    private DbConnect db = DbConnect.getInstance();
    private Lecturer loggedin;

    private ArrayList<Event> evtArray;
    private ArrayList<Event> pendevtArray;

    private ArrayList<Event> events = new ArrayList();

    /**
     * Creates new form Lecture_Live_Events
     */
    public Lecture_Live_Events(Lecturer lec, DbConnect thisDB) throws SQLException {
        db = thisDB;
        loggedin = lec;
        initComponents();
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
        btnLSignOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 540));
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
        lblPending.setForeground(new java.awt.Color(0, 0, 0));
        lblPending.setText("PENDING EVENTS");
        pnlPending.add(lblPending);
        lblPending.setBounds(130, 20, 270, 22);

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
        lblEDetails.setForeground(new java.awt.Color(0, 0, 0));
        lblEDetails.setText("EVENT DETAILS  ");
        pnlPending.add(lblEDetails);
        lblEDetails.setBounds(590, 20, 260, 22);

        btnAppStatus.setBackground(new java.awt.Color(102, 153, 255));
        btnAppStatus.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnAppStatus.setForeground(new java.awt.Color(0, 0, 0));
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
        btnDenyStatus.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        pnlPending.add(jLabel1);
        jLabel1.setBounds(-40, 0, 930, 410);

        tabLecturer.addTab("PENDING EVENTS", pnlPending);

        pnlLive.setBackground(new java.awt.Color(102, 153, 255));
        pnlLive.setLayout(null);

        lblLiveE.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblLiveE.setForeground(new java.awt.Color(0, 0, 0));
        lblLiveE.setText("LIVE EVENTS");
        pnlLive.add(lblLiveE);
        lblLiveE.setBounds(160, 20, 220, 22);

        lblDetailsEvent.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblDetailsEvent.setForeground(new java.awt.Color(0, 0, 0));
        lblDetailsEvent.setText("EVENT DETAILS");
        pnlLive.add(lblDetailsEvent);
        lblDetailsEvent.setBounds(590, 20, 250, 22);

        lstEventsL.setBackground(new java.awt.Color(0, 51, 102));
        lstEventsL.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
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
        btnBookEvent.setForeground(new java.awt.Color(0, 0, 0));
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
        lblBooked.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel3.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel3.setText("jLabel1");
        pnlLive.add(jLabel3);
        jLabel3.setBounds(-40, 0, 930, 410);

        tabLecturer.addTab("LIVE EVENTS", pnlLive);

        getContentPane().add(tabLecturer);
        tabLecturer.setBounds(40, 80, 880, 440);

        lblLectLogo.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/logo (1).png")); // NOI18N
        getContentPane().add(lblLectLogo);
        lblLectLogo.setBounds(0, 10, 390, 50);

        btnLSignOut.setBackground(new java.awt.Color(102, 153, 255));
        btnLSignOut.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        btnLSignOut.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAppStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppStatusActionPerformed
        try {
            // the below code executes when the user approves an event
            ApproveEvt();
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAppStatusActionPerformed

    private void btnLSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLSignOutActionPerformed
        try {
            this.dispose();
            new Login(db).setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLSignOutActionPerformed

    private void PendingEventsChane(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PendingEventsChane
        try {
            // if a user clicks on a pending event the below displays its details
            DisplayAllDetails(lstPending, lstEDetails, pendevtArray);
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_PendingEventsChane

    private void btnDenyStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyStatusActionPerformed
        try {
            // if the user deny an event it will delete it from the database, as well as any volunteers registered
            DenyEvt();
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDenyStatusActionPerformed
    private void LiveEventList(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LiveEventList
        try {
            //this function is used to populate the live events list on the second tab
            DisplayAllDetails(lstEventsL, lstDetails, events);
        } catch (SQLException ex) {
            Logger.getLogger(Lecture_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LiveEventList


    private void SwitchPage(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SwitchPage
        try {
            // the below try is used to populate the the pending events list
            PopulatePendingEvt();

            // this populates the booking section
            PopulateBookingEvt();

            //this populates the live event list
            PopulateLiveEvents();

        } catch (SQLException e) {
            System.out.println("Err: " + e.getMessage());
        }
    }//GEN-LAST:event_SwitchPage

    private void btnBookEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookEventActionPerformed

        // when the user books to an event the below writes it the database
        try {
            BookEvt();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_btnBookEventActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppStatus;
    private javax.swing.JButton btnBookEvent;
    private javax.swing.JButton btnDenyStatus;
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

    public void PopulatePendingEvt() throws SQLException {

        EventDAO evtDAO = new EventDAO();
        evtArray = new ArrayList();
        pendevtArray = new ArrayList<>();
        DefaultListModel<String> dlm = new DefaultListModel<String>();

        evtArray = evtDAO.SelectTable(db.getConnection());

        for (var i : evtArray) {
            if (i.isApprovalStatus() == false) {
                pendevtArray.add(i);
                dlm.addElement(i.getEventId() + " - " + i.getTitle() + " - " + i.getLeader() + " - " + i.getDate());
            }
        }
        lstPending.setModel(dlm);

    }

    public void PopulateBookingEvt() {
        DefaultListModel<String> dlmBook = new DefaultListModel<String>();
        ArrayList<Booking> book = new ArrayList();
        BookingDAO bookDAO = new BookingDAO();
        lstBooked.setModel(dlmBook);

        try {
            book = bookDAO.SelectRecords(db.getConnection(), loggedin.getStaffNumber());
            for (var x : book) {
                System.out.println("Event: " + x.getEventId());
                dlmBook.addElement(x.getEventId() + " - " + x.getTicketNumber() + " - " + x.getDate() + " - " + x.getTime());
            }
            lstBooked.setModel(dlmBook);
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void PopulateLiveEvents() throws SQLException {
        EventDAO evtDAO = new EventDAO();
        ArrayList<Event> evtArray = new ArrayList();
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        evtArray = evtDAO.SelectTable(db.getConnection());
        for (var i : evtArray) {
            if (i.isApprovalStatus() == true) {
                events.add(i);
                dlm.addElement(i.getEventId() + " - " + i.getTitle() + " - " + i.getLeader() + " - " + i.getDate());
            }
        }
        lstEventsL.setModel(dlm);
    }

    public void ApproveEvt() throws SQLException {
        int i = lstPending.getSelectedIndex();
        EventDAO evtDao = new EventDAO();
        int confirm = JOptionPane.showConfirmDialog(null, pendevtArray.get(i).toString() + "Are you sure you want to approve this event?");

        if (confirm == 0) {
            evtDao.UpdateRecord(db.getConnection(), "TRUE", pendevtArray.get(i).getEventId(), loggedin.getStaffNumber());
        }
    }

    public void DenyEvt() throws SQLException {
        EventDAO evtDao = new EventDAO();
        VolunteerDAO volDao = new VolunteerDAO();
        int i = lstPending.getSelectedIndex();
        int confirm = JOptionPane.showConfirmDialog(null, pendevtArray.get(i).toString() + "Are you sure you want to deny this event? please note this will delete the event.");

        if (confirm == 0) {
            volDao.DeleteRecord(db.getConnection(), pendevtArray.get(i).getEventId());
            evtDao.DeleteRecord(db.getConnection(), pendevtArray.get(i).getEventId());
        }
    }

    public void DisplayAllDetails(JList list1, JList list2, ArrayList<Event> array) throws SQLException {
        int i = list1.getSelectedIndex();
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        VolunteerDAO volsDAO = new VolunteerDAO();

        ArrayList<Volunteer> volsArr = new ArrayList();

        volsArr = volsDAO.SelectVols(db.getConnection(), array.get(i).getEventId());

        dlm.addElement("EVENT ID: " + array.get(i).getEventId());
        dlm.addElement("TITLE: " + array.get(i).getTitle());
        dlm.addElement("DESCRIPTION: " + array.get(i).getDescription());
        dlm.addElement("EVENT DATE: " + array.get(i).getDate());
        dlm.addElement("START TIME: " + array.get(i).getTime());

        LocationDAO locDAO = new LocationDAO();
        ArrayList<Location> locArr = new ArrayList();
        locArr = locDAO.SeleteAll(db.getStatement());

        for (var x : locArr) {
            if (array.get(i).getLocation().equalsIgnoreCase(x.getEventLocation())) {
                dlm.addElement("EVENT LOCATION: " + x.getCampus() + "---" + x.getBuilding() + "---" + x.getDepartment() + "---" + x.getRoom());
                break;
            }
        }

        dlm.addElement("====================================================");
        dlm.addElement("Volunteers:");
        for (var v : volsArr) {
            dlm.addElement(v.toString());
        }
        list2.setModel(dlm);
    }

    public void BookEvt() throws SQLException, SQLException {
        Event ev = events.get(lstEventsL.getSelectedIndex());
        Booking lecBook = new Booking();
        BookingDAO bookDAO = new BookingDAO();

        lecBook.setTicketNumber(generate8DigitInteger());
        lecBook.setAttdNumber(loggedin.getStaffNumber());
        lecBook.setTime(ev.getTime());
        lecBook.setEventId(ev.getEventId());
        lecBook.setAttdType("L".charAt(0));
        lecBook.setDate(ev.getDate());

        bookDAO.InsertRecord(db.getConnection(), lecBook);
        PopulateBookingEvt();

    }
    
    private static int generate8DigitInteger() {
        Random random = new Random();
        int min = 10000000; // Smallest 8-digit integer (10,000,000)
        int max = 99999999; // Largest 8-digit integer (99,999,999)
        return random.nextInt((max - min) + 1) + min;
    }
}
