/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Smurf
 */
public class Receipt {

    private Customer userInformation;
    private LotSpecs specs;

    public Receipt(Customer userInformation, LotSpecs specs) {
        this.userInformation = userInformation;
        this.specs = specs;
    }

    public Customer getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(Customer userInformation) {
        this.userInformation = userInformation;
    }

    public LotSpecs getSpecs() {
        return specs;
    }

    public void setSpecs(LotSpecs specs) {
        this.specs = specs;
    }
}
