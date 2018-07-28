package com.example.roy.grocery.Database_Model;

public class Grocery {

    private int id;
    private String gName;
    private String gQuantity;
    private String gDate;

    public Grocery() {

    }

    public Grocery(int id, String gName, String gQuantity, String gDate) {
        this.id = id;
        this.gName = gName;
        this.gQuantity = gQuantity;
        this.gDate = gDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgQuantity() {
        return gQuantity;
    }

    public void setgQuantity(String gQuantity) {
        this.gQuantity = gQuantity;
    }

    public String getgDate() {
        return gDate;
    }

    public void setgDate(String gDate) {
        this.gDate = gDate;
    }
}
