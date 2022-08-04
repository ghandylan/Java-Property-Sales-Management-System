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

    private String firstName;
    private String lastName;
    private String email;
    private int contactNo;
    private LotSpecs lotspecs;
    private final Payment payment;
    private String status;
    private String daysReserved;

    // create a constructor for Customer
    public Customer(String firstName, String lastName, String email, int contactNo, LotSpecs lotspecs, Payment payment, String status, String daysReserved) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
        this.lotspecs = lotspecs;
        this.payment = payment;
        this.status = status;
        this.daysReserved = daysReserved;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public LotSpecs getLotspecs() {
        return lotspecs;
    }

    public void setLotspecs(LotSpecs lotspecs) {
        this.lotspecs = lotspecs;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDaysReserved() {
        return daysReserved;
    }

    public void setDaysReserved(String daysReserved) {
        this.daysReserved = daysReserved;
    }
}
