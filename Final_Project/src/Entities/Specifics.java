/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author
 */
public class Specifics {
    private LotLocation address;
    private int lotspace; 

    public Specifics(LotLocation address, int lotDimen) {
        this.address = address;
        this.lotspace = lotDimen;
    }

    public LotLocation getAddress() {
        return address;
    }

    public void setAddress(LotLocation address) {
        this.address = address;
    }

    public int getLotspace() {
        return lotspace;
    }

    public void setLotspace(int lotDimen) {
        this.lotspace = lotDimen;
    }
}
