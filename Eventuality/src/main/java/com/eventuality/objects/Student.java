package com.eventuality.objects;

public class Student {
    private int studNum;
    private String studName, studSurname, studPassword, studEmail;

    public Student(int studNum, String studName, String studSurname, String studPassword, String studEmail) {
        this.studNum = studNum;
        this.studName = studName;
        this.studSurname = studSurname;
        this.studPassword = studPassword;
        this.studEmail = studEmail;
    }

    public Student() {
        this.studNum = 0;
        this.studName = "";
        this.studSurname = "";
        this.studPassword = "";
        this.studEmail = "";
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    public int getStudNum() {
        return studNum;
    }

    public String getStudName() {
        return studName;
    }

    public String getStudSurname() {
        return studSurname;
    }

    public String getStudPassword() {
        return studPassword;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudSurname(String studSurname) {
        this.studSurname = studSurname;
    }

    public void setStudPassword(String studPassword) {
        this.studPassword = studPassword;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    @Override
    public String toString() {
        return this.studName + "\n" + this.studSurname + "\n" + 
                this.studPassword + "\n" + this.studEmail +"\n" + this.studNum +"\n";
    }
}
