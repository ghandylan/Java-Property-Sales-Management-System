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
    private String contactNo;
    LotSpecs lotspecs;
    Payment payment;
    boolean status;

    // create a constructor for Customer
    public Customer(String firstName, String lastName, String email, String contactNo, LotSpecs lotspecs, Payment payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
        this.lotspecs = lotspecs;
        this.payment = payment;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
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

    


}
