package com.eventuality.pages;

import java.awt.*;
import javax.swing.*;

public class setSlashScreen extends JWindow {
    private JPanel content;
    
    public setSlashScreen(){
        
        content = new JPanel(new BorderLayout());
        content.setBackground(Color.CYAN);
        ImageIcon logo = new ImageIcon("/home/logan/Documents/GitHub/EVENTuality/Images/logo (1).png"); // Replace with your image file
        content.add(new JLabel(logo), BorderLayout.CENTER);
        JLabel loadingLabel = new JLabel("Loading...");
        loadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        content.add(loadingLabel, BorderLayout.SOUTH);
        setContentPane(content);
        setSize(600, 400);

        // Center the splash screen on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }
}
