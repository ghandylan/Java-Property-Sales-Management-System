/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;


/**
 *
 * @author Smurf
 */
public class Customer {
    String[] name;
    int[] age;
    String[] email;
    String[] address;
    LotDesc[] lot;
    Payment[] payment;

    // create a constructor to initialize the variables
    
    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public LotDesc[] getLot() {
        return lot;
    }

    public void setLot(LotDesc[] lot) {
        this.lot = lot;
    }

    public Payment[] getPayment() {
        return payment;
    }

    public void setPayment(Payment[] payment) {
        this.payment = payment;
    }
}
