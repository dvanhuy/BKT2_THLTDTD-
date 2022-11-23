package com.example.btfirebasetonghop;

import java.io.Serializable;

public class Item implements Serializable {
    private String tenkhoahoc,tenthuong,maula,congdung;

    public Item() {
    }

    public Item(String tenthuong, String tenkhoahoc, String maula,String congdung) {
        this.tenkhoahoc = tenkhoahoc;
        this.tenthuong = tenthuong;
        this.maula = maula;
        this.congdung = congdung;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public void setTenkhoahoc(String tenkhoahoc) {
        this.tenkhoahoc = tenkhoahoc;
    }

    public String getTenthuong() {
        return tenthuong;
    }

    public void setTenthuong(String tenthuong) {
        this.tenthuong = tenthuong;
    }

    public String getMaula() {
        return maula;
    }

    public void setMaula(String maula) {
        this.maula = maula;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }
}
