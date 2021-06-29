package com.release.demoapk;

import android.os.Parcelable;

import java.io.Serializable;

public class Student implements Serializable {
    String name , roll , clas , mark;

    public Student(String name, String roll, String clas, String mark) {
        this.name = name;
        this.roll = roll;
        this.clas = clas;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
