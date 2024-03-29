package com.eventuality.pages;

import com.eventuality.controls.BookingDAO;
import com.eventuality.controls.DbConnect;
import com.eventuality.controls.EventDAO;
import com.eventuality.controls.EventTypeDAO;
import com.eventuality.controls.LocationDAO;
import com.eventuality.controls.VolunteerDAO;
import com.eventuality.objects.Booking;
import com.eventuality.objects.Event;
import com.eventuality.objects.Event_Category;
import com.eventuality.objects.Location;
import com.eventuality.objects.Student;
import com.eventuality.objects.Volunteer;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Student_Live_Events extends javax.swing.JFrame {

    private Student loggedin = new Student();
    LocationDAO locDAO;
    private DbConnect db;
    private ArrayList<Volunteer> volArr = new ArrayList();
    private ArrayList<Location> locArr;
    private String eventID = "BOR267W";
    private ArrayList<Event> events = new ArrayList();
    DefaultListModel<String> dlmBook = new DefaultListModel<String>();
    private ArrayList<Booking> book = new ArrayList();
    Booking studBook;
    BookingDAO bookDAO;

    /**
     * Creates new form Student_Live_Events
     */
    public Student_Live_Events() {
        initComponents();

        try {

            db = new DbConnect();
            EventTypeDAO evtTypeDAO = new EventTypeDAO();
            ArrayList<Event_Category> evtType = evtTypeDAO.SelectTable(db.getS());

            for (var i : evtType) {
                cbxCategory.addItem(i.getEventKeyword());
            }

            locDAO = new LocationDAO();
            ArrayList<Location> locArr = locDAO.SeleteAll(db.getS());

            for (var i : locArr) {
                cbxCampus.addItem(i.getCampus() + " - " + i.getDepartment() + " - " + i.getBuilding());
                String cap = Integer.toString(i.getCapacity());
                cbxCapacity.addItem(cap);
            }

            VolunteerDAO volDAO = new VolunteerDAO();
            ArrayList<Volunteer> volArr = volDAO.SelectVols(db.getS());
            for (var i : volArr) {
                cbxVolunteer.addItem(i.getRole());
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
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

        tabStudent = new javax.swing.JTabbedPane();
        pnlMyEvents = new javax.swing.JPanel();
        txtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        cbxCategory = new javax.swing.JComboBox<>();
        jCalender = new com.toedter.calendar.JDateChooser();
        lblDescription = new javax.swing.JLabel();
        cbxSTime = new javax.swing.JComboBox<>();
        cbxETime = new javax.swing.JComboBox<>();
        cbxCapacity = new javax.swing.JComboBox<>();
        txtStudentNo = new javax.swing.JTextField();
        cbxVolunteer = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        lblCreate = new javax.swing.JLabel();
        btnRedo = new javax.swing.JButton();
        txtDescription = new javax.swing.JScrollPane();
        txtDescript = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        lblSTime = new javax.swing.JLabel();
        lblETime = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        cbxCampus = new javax.swing.JComboBox<>();
        lblCapacity = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblStudNo = new javax.swing.JLabel();
        lblRoll = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtAVols = new javax.swing.JScrollPane();
        txtVolsArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pnlLiveEvents = new javax.swing.JPanel();
        lblLive = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        lblDetails = new javax.swing.JLabel();
        lblBooked = new javax.swing.JLabel();
        spBookedE = new javax.swing.JScrollPane();
        lstBooked = new javax.swing.JList<>();
        spLiveEvents = new javax.swing.JScrollPane();
        lstLiveEvents = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        lblApprove = new javax.swing.JLabel();
        lblTCreate = new javax.swing.JLabel();
        btnStatus = new javax.swing.JButton();
        lblMyEvents = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEventDetails = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        navHome = new javax.swing.JButton();
        navGallery = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabStudent.setBackground(new java.awt.Color(102, 153, 255));
        tabStudent.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        tabStudent.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Student_Live_Events.this.stateChanged(evt);
            }
        });

        pnlMyEvents.setLayout(null);

        txtTitle.setBackground(new java.awt.Color(102, 153, 255));
        txtTitle.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(0, 0, 0));
        txtTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlMyEvents.add(txtTitle);
        txtTitle.setBounds(30, 80, 410, 30);

        lblTitle.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Title:");
        pnlMyEvents.add(lblTitle);
        lblTitle.setBounds(30, 60, 110, 17);

        cbxCategory.setBackground(new java.awt.Color(102, 153, 255));
        cbxCategory.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        cbxCategory.setForeground(new java.awt.Color(0, 0, 0));
        cbxCategory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyEvents.add(cbxCategory);
        cbxCategory.setBounds(30, 310, 410, 22);

        jCalender.setBackground(new java.awt.Color(102, 153, 255));
        jCalender.setForeground(new java.awt.Color(255, 255, 255));
        jCalender.setDateFormatString("dd MMM yyyy");
        jCalender.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jCalender.setOpaque(false);
        pnlMyEvents.add(jCalender);
        jCalender.setBounds(30, 260, 180, 30);

        lblDescription.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(0, 0, 0));
        lblDescription.setText("Description:");
        pnlMyEvents.add(lblDescription);
        lblDescription.setBounds(30, 110, 110, 17);

        cbxSTime.setBackground(new java.awt.Color(102, 153, 255));
        cbxSTime.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        cbxSTime.setForeground(new java.awt.Color(0, 0, 0));
        cbxSTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", " " }));
        cbxSTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyEvents.add(cbxSTime);
        cbxSTime.setBounds(230, 260, 100, 22);

        cbxETime.setBackground(new java.awt.Color(102, 153, 255));
        cbxETime.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        cbxETime.setForeground(new java.awt.Color(0, 0, 0));
        cbxETime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00" }));
        cbxETime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyEvents.add(cbxETime);
        cbxETime.setBounds(340, 260, 100, 22);

        cbxCapacity.setBackground(new java.awt.Color(102, 153, 255));
        cbxCapacity.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        cbxCapacity.setForeground(new java.awt.Color(0, 0, 0));
        cbxCapacity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyEvents.add(cbxCapacity);
        cbxCapacity.setBounds(340, 360, 100, 22);

        txtStudentNo.setBackground(new java.awt.Color(102, 153, 255));
        txtStudentNo.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        txtStudentNo.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlMyEvents.add(txtStudentNo);
        txtStudentNo.setBounds(490, 80, 170, 30);

        cbxVolunteer.setBackground(new java.awt.Color(102, 153, 255));
        cbxVolunteer.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        cbxVolunteer.setForeground(new java.awt.Color(0, 0, 0));
        cbxVolunteer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyEvents.add(cbxVolunteer);
        cbxVolunteer.setBounds(670, 80, 230, 30);

        btnRegister.setBackground(new java.awt.Color(102, 153, 255));
        btnRegister.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("REGISTER STAFF");
        btnRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnlMyEvents.add(btnRegister);
        btnRegister.setBounds(490, 120, 410, 21);

        btnApprove.setBackground(new java.awt.Color(102, 153, 255));
        btnApprove.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 0, 0));
        btnApprove.setText("REQUEST APPROVAL");
        btnApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        pnlMyEvents.add(btnApprove);
        btnApprove.setBounds(490, 330, 410, 21);

        lblCreate.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblCreate.setForeground(new java.awt.Color(0, 0, 0));
        lblCreate.setText("CREATE EVENT");
        pnlMyEvents.add(lblCreate);
        lblCreate.setBounds(400, 20, 200, 22);

        btnRedo.setBackground(new java.awt.Color(102, 153, 255));
        btnRedo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnRedo.setForeground(new java.awt.Color(0, 0, 0));
        btnRedo.setText("RE-CREATE EVENT");
        btnRedo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedoActionPerformed(evt);
            }
        });
        pnlMyEvents.add(btnRedo);
        btnRedo.setBounds(490, 360, 410, 21);

        txtDescript.setBackground(new java.awt.Color(102, 153, 255));
        txtDescript.setColumns(20);
        txtDescript.setForeground(new java.awt.Color(0, 0, 0));
        txtDescript.setRows(5);
        txtDescription.setViewportView(txtDescript);

        pnlMyEvents.add(txtDescription);
        txtDescription.setBounds(30, 130, 410, 80);

        lblDate.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setText("Date: ");
        pnlMyEvents.add(lblDate);
        lblDate.setBounds(30, 240, 110, 17);

        lblSTime.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblSTime.setForeground(new java.awt.Color(0, 0, 0));
        lblSTime.setText("Start Time:");
        pnlMyEvents.add(lblSTime);
        lblSTime.setBounds(230, 240, 110, 17);

        lblETime.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblETime.setForeground(new java.awt.Color(0, 0, 0));
        lblETime.setText("End Time:");
        pnlMyEvents.add(lblETime);
        lblETime.setBounds(340, 240, 110, 17);

        lblLocation.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(0, 0, 0));
        lblLocation.setText("Location:");
        pnlMyEvents.add(lblLocation);
        lblLocation.setBounds(30, 340, 110, 17);

        cbxCampus.setBackground(new java.awt.Color(102, 153, 255));
        cbxCampus.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        cbxCampus.setForeground(new java.awt.Color(0, 0, 0));
        cbxCampus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyEvents.add(cbxCampus);
        cbxCampus.setBounds(30, 360, 300, 22);

        lblCapacity.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblCapacity.setForeground(new java.awt.Color(0, 0, 0));
        lblCapacity.setText("Capacity:");
        pnlMyEvents.add(lblCapacity);
        lblCapacity.setBounds(340, 340, 110, 17);

        lblCategory.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(0, 0, 0));
        lblCategory.setText("Category:");
        pnlMyEvents.add(lblCategory);
        lblCategory.setBounds(30, 290, 110, 17);

        lblStudNo.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblStudNo.setForeground(new java.awt.Color(0, 0, 0));
        lblStudNo.setText("Volunteer ID:");
        pnlMyEvents.add(lblStudNo);
        lblStudNo.setBounds(490, 60, 150, 17);

        lblRoll.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblRoll.setForeground(new java.awt.Color(0, 0, 0));
        lblRoll.setText("Registered Roll:");
        pnlMyEvents.add(lblRoll);
        lblRoll.setBounds(670, 60, 100, 17);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        pnlMyEvents.add(jPanel1);
        jPanel1.setBounds(460, 80, 10, 310);

        txtVolsArea.setColumns(20);
        txtVolsArea.setRows(5);
        txtAVols.setViewportView(txtVolsArea);

        pnlMyEvents.add(txtAVols);
        txtAVols.setBounds(490, 150, 410, 170);

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        pnlMyEvents.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 450);

        tabStudent.addTab("MY EVENTS", pnlMyEvents);

        pnlLiveEvents.setLayout(null);

        lblLive.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblLive.setForeground(new java.awt.Color(0, 0, 0));
        lblLive.setText("LIVE EVENTS");
        pnlLiveEvents.add(lblLive);
        lblLive.setBounds(180, 20, 230, 20);

        btnBook.setBackground(new java.awt.Color(102, 153, 255));
        btnBook.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnBook.setForeground(new java.awt.Color(0, 0, 0));
        btnBook.setText("BOOK EVENT");
        btnBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        pnlLiveEvents.add(btnBook);
        btnBook.setBounds(490, 210, 410, 21);

        lblDetails.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        lblDetails.setForeground(new java.awt.Color(0, 0, 0));
        lblDetails.setText("EVENT DETAILS");
        pnlLiveEvents.add(lblDetails);
        lblDetails.setBounds(630, 20, 280, 22);

        lblBooked.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblBooked.setForeground(new java.awt.Color(0, 0, 0));
        lblBooked.setText("BOOKED EVENTS");
        pnlLiveEvents.add(lblBooked);
        lblBooked.setBounds(490, 240, 120, 17);

        spBookedE.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N

        lstBooked.setBackground(new java.awt.Color(0, 51, 102));
        lstBooked.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        spBookedE.setViewportView(lstBooked);

        pnlLiveEvents.add(spBookedE);
        spBookedE.setBounds(490, 260, 410, 130);

        lstLiveEvents.setBackground(new java.awt.Color(0, 51, 102));
        lstLiveEvents.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                DisplayDetails(evt);
            }
        });
        spLiveEvents.setViewportView(lstLiveEvents);

        pnlLiveEvents.add(spLiveEvents);
        spLiveEvents.setBounds(30, 50, 410, 180);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 3, true));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        lblApprove.setBackground(new java.awt.Color(0, 0, 0));
        lblApprove.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        lblApprove.setForeground(new java.awt.Color(0, 0, 153));
        lblApprove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApprove.setText("STATUS ");
        lblApprove.setEnabled(false);
        jPanel4.add(lblApprove);
        lblApprove.setBounds(0, 50, 410, 17);

        lblTCreate.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblTCreate.setForeground(new java.awt.Color(0, 0, 0));
        lblTCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTCreate.setText("NO CURRENT EVENT CREATED");
        lblTCreate.setToolTipText("");
        lblTCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        lblTCreate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(lblTCreate);
        lblTCreate.setBounds(10, 10, 390, 30);

        pnlLiveEvents.add(jPanel4);
        jPanel4.setBounds(30, 260, 410, 80);

        btnStatus.setBackground(new java.awt.Color(102, 153, 255));
        btnStatus.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnStatus.setForeground(new java.awt.Color(0, 0, 0));
        btnStatus.setText("CHECK EVENT STATUS");
        btnStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        pnlLiveEvents.add(btnStatus);
        btnStatus.setBounds(30, 360, 410, 21);

        lblMyEvents.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        lblMyEvents.setForeground(new java.awt.Color(0, 0, 0));
        lblMyEvents.setText("MY EVENT");
        pnlLiveEvents.add(lblMyEvents);
        lblMyEvents.setBounds(30, 240, 120, 17);

        lstEventDetails.setBackground(new java.awt.Color(0, 51, 102));
        lstEventDetails.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(lstEventDetails);

        pnlLiveEvents.add(jScrollPane1);
        jScrollPane1.setBounds(490, 50, 410, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLiveEvents.add(jLabel3);
        jLabel3.setBounds(-10, 0, 950, 410);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        pnlLiveEvents.add(jPanel3);
        jPanel3.setBounds(460, 50, 10, 340);

        tabStudent.addTab("LIVE EVENTS", pnlLiveEvents);

        getContentPane().add(tabStudent);
        tabStudent.setBounds(10, 90, 940, 440);
        tabStudent.getAccessibleContext().setAccessibleName("LIVE EVENTS");

        navHome.setBackground(new java.awt.Color(102, 153, 255));
        navHome.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        navHome.setForeground(new java.awt.Color(0, 0, 0));
        navHome.setText("HOME");
        navHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        navHome.setMaximumSize(new java.awt.Dimension(46, 26));
        navHome.setMinimumSize(new java.awt.Dimension(46, 26));
        getContentPane().add(navHome);
        navHome.setBounds(560, 30, 120, 30);

        navGallery.setBackground(new java.awt.Color(102, 153, 255));
        navGallery.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        navGallery.setForeground(new java.awt.Color(0, 0, 0));
        navGallery.setText("GALLERY");
        navGallery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(navGallery);
        navGallery.setBounds(690, 30, 120, 30);

        btnSignOut.setBackground(new java.awt.Color(102, 153, 255));
        btnSignOut.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        btnSignOut.setForeground(new java.awt.Color(0, 0, 0));
        btnSignOut.setText("SIGN OUT");
        btnSignOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignOut);
        btnSignOut.setBounds(820, 30, 130, 30);

        lblLogo.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/logo (1).png")); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(0, 30, 400, 50);

        jLabel2.setBackground(new java.awt.Color(102, 153, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/white_blue_marble_hd_marble.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        try {
            db = new DbConnect();
            EventDAO evtDAO = new EventDAO();
            ArrayList<Event> evtArray = new ArrayList();
            evtArray = evtDAO.SelectTable(db.getS());

            for (var i : evtArray) {
                if (i.getLeader() == loggedin.getStudNum()) {
                    lblApprove.setText(Boolean.toString(i.isApprovalStatus()));
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStatusActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        int i = lstLiveEvents.getSelectedIndex();
        Event ev = events.get(i);
        studBook = new Booking();

        studBook.setTicketNumber(5831509);
        loggedin.setStudNum(47891324);
        studBook.setAttdNumberStud(loggedin.getStudNum());
        studBook.setTime(ev.getTime());
        studBook.setEventId(ev.getEventId());
        studBook.setAttdType("S".charAt(0));
        studBook.setDate(ev.getDate());
        studBook.setAttdNumberLec(ev.getIsApprovedBy());

        bookDAO = new BookingDAO();

        try {
            bookDAO.InsertRecord(db.getC(), studBook);
            dlmBook.addElement(studBook.getEventId() + " - " + studBook.getTicketNumber() + " - " + studBook.getDate() + " - " + studBook.getTime());
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnBookActionPerformed

    private void btnRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedoActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if (evt.getSource() == btnRegister) {
            Volunteer vol = new Volunteer();
            vol.setStudentNumber(Integer.parseInt(txtStudentNo.getText()));
            vol.setRole((String) cbxVolunteer.getSelectedItem());
            volArr.add(vol);
            txtVolsArea.append(vol.getStudentNumber() + "\t" + vol.getRole() + "\n");
            txtStudentNo.setText("");
            cbxVolunteer.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        if (evt.getSource() == btnApprove) {
            Event e = new Event();
            e.setEventId(eventID);
            e.setEventType((String) cbxCategory.getSelectedItem());

            loggedin.setStudNum(47891324);

            e.setLeader(loggedin.getStudNum());
            e.setTitle(txtTitle.getText());
            e.setDescription(txtDescript.getText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime localTime = LocalTime.parse(cbxSTime.getSelectedItem().toString(), formatter);
            e.setTime(localTime);
            try {
                locArr = locDAO.SeleteAll(db.getS());
            } catch (SQLException ex) {
                System.out.println("Err:" + ex.getMessage());
            }

            e.setLocation(locArr.get(cbxCampus.getSelectedIndex()).getEventLocation());
            e.setApprovalStatus(false);
            e.setIsApprovedBy(34156738);

            java.sql.Date sqlDate = new java.sql.Date(jCalender.getDate().getTime());
            e.setDate(sqlDate);
            EventDAO evtDAO = new EventDAO();
            try {
                evtDAO.InsertRecord(db.getC(), e);
            } catch (SQLException ex) {
                System.out.println("Err: " + ex.getMessage());
            }

            for (var i : volArr) {
                i.setEventId(eventID);
            }

            try {
                VolunteerDAO volDAO = new VolunteerDAO();
                for (var i : volArr) {
                    volDAO.InserRecord(db.getC(), i);
                }
            } catch (Exception ex) {
                System.out.println("Err: " + ex.getMessage());

            }

            try {
                db.CloseAll();
            } catch (SQLException ex) {
                Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
            }

            cbxCategory.setSelectedIndex(0);
            txtTitle.setText("");
            txtDescript.setText("");
            cbxSTime.setSelectedIndex(0);
            cbxCampus.setSelectedIndex(0);
            cbxVolunteer.setSelectedIndex(0);
            txtVolsArea.setText("");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void stateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateChanged
        try {
            db = new DbConnect();
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
            lstLiveEvents.setModel(dlm);

            Boolean eventFound = false;
            loggedin.setStudNum(47891324);
            
            for (var i : evtArray) {
                if (i.getLeader() == loggedin.getStudNum()) {
                    lblTCreate.setText(i.getEventId() + " - " + i.getTitle());
                    eventFound = true;
                    break;
                }
            }

            if (!eventFound) {
                btnStatus.setEnabled(false);
            }
        } catch (SQLException e) {
            System.out.println("Err: " + e.getMessage());
        }

        bookDAO = new BookingDAO();

        try {
            book = bookDAO.SelectStudRecords(db.getC(), loggedin.getStudNum());
            for (var x : book) {
                System.out.println("Event: " + x.getEventId());
                dlmBook.addElement(x.getEventId() + " - " + x.getTicketNumber() + " - " + x.getDate() + " - " + x.getTime());
            }
            lstBooked.setModel(dlmBook);

        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stateChanged

    private void DisplayDetails(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_DisplayDetails
        int i = lstLiveEvents.getSelectedIndex();
        DefaultListModel<String> dlm = new DefaultListModel<String>();
        Event ev = events.get(i);

        dlm.addElement("TITLE: " + ev.getTitle());
        dlm.addElement("DESCRIPTION: " + ev.getDescription());
        dlm.addElement("START TIME:" + ev.getTime());
        dlm.addElement("EVENT DATE: " + ev.getDate());
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
        lstEventDetails.setModel(dlm);
    }//GEN-LAST:event_DisplayDetails

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        try {
            db.CloseAll();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Live_Events.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSignOutActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Live_Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Live_Events().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnRedo;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnStatus;
    private javax.swing.JComboBox<String> cbxCampus;
    private javax.swing.JComboBox<String> cbxCapacity;
    private javax.swing.JComboBox<String> cbxCategory;
    private javax.swing.JComboBox<String> cbxETime;
    private javax.swing.JComboBox<String> cbxSTime;
    private javax.swing.JComboBox<String> cbxVolunteer;
    private com.toedter.calendar.JDateChooser jCalender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApprove;
    private javax.swing.JLabel lblBooked;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblETime;
    private javax.swing.JLabel lblLive;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMyEvents;
    private javax.swing.JLabel lblRoll;
    private javax.swing.JLabel lblSTime;
    private javax.swing.JLabel lblStudNo;
    private javax.swing.JLabel lblTCreate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstBooked;
    private javax.swing.JList<String> lstEventDetails;
    private javax.swing.JList<String> lstLiveEvents;
    private javax.swing.JButton navGallery;
    private javax.swing.JButton navHome;
    private javax.swing.JPanel pnlLiveEvents;
    private javax.swing.JPanel pnlMyEvents;
    private javax.swing.JScrollPane spBookedE;
    private javax.swing.JScrollPane spLiveEvents;
    private javax.swing.JTabbedPane tabStudent;
    private javax.swing.JScrollPane txtAVols;
    private javax.swing.JTextArea txtDescript;
    private javax.swing.JScrollPane txtDescription;
    private javax.swing.JTextField txtStudentNo;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextArea txtVolsArea;
    // End of variables declaration//GEN-END:variables
}
