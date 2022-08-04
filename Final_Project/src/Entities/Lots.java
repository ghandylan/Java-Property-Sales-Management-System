/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Josh Gomez
 */
public class Lots {
    
    private String ID;
    private String lotStatus; 
    private double price;
    private Specifics lotInfo;

    public Lots(String ID, String lotStatus, double price, Specifics attributes) {
        this.ID = ID;
        this.lotStatus = lotStatus;
        this.price = price;
        this.lotInfo = attributes;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLotStatus() {
        return lotStatus;
    }

    public void setLotStatus(String lotStatus) {
        this.lotStatus = lotStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Specifics getLotInfo() {
        return lotInfo;
    }

    public void setLotInfo(Specifics lotInfo) {
        this.lotInfo = lotInfo;
    }
    
    
    
}
