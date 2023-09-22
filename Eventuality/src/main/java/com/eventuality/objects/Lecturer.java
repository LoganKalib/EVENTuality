package com.eventuality.objects;

public class Lecturer {
    private String lectName, lectSurname, lectPassword, lectEmail;
    private int staffNumber;

    public Lecturer(String lectName, String lectSurname, String lectPassword, String lectEmail, int staffNumber) {
        this.lectName = lectName;
        this.lectSurname = lectSurname;
        this.lectPassword = lectPassword;
        this.lectEmail = lectEmail;
        this.staffNumber = staffNumber;
    }

    public Lecturer() {
        this.lectName = "";
        this.lectSurname = "";
        this.lectPassword = "";
        this.lectEmail = "";
        this.staffNumber = 0;
    }

    public String getLectName() {
        return lectName;
    }

    public String getLectSurname() {
        return lectSurname;
    }

    public String getLectPassword() {
        return lectPassword;
    }

    public String getLectEmail() {
        return lectEmail;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setLectName(String lectName) {
        this.lectName = lectName;
    }

    public void setLectSurname(String lectSurname) {
        this.lectSurname = lectSurname;
    }

    public void setLectPassword(String lectPassword) {
        this.lectPassword = lectPassword;
    }

    public void setLectEmail(String lectEmail) {
        this.lectEmail = lectEmail;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    @Override
    public String toString() {
        return this.lectName + "\n" + this.lectSurname + "\n" + 
                this.lectPassword + "\n" + this.lectEmail + "\n" + this.staffNumber + "\n";
    }
    
    
}
