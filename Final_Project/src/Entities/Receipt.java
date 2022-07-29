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
    private LotDesc specs;

    public Customer getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(Customer userInformation) {
        this.userInformation = userInformation;
    }

    public LotDesc getSpecs() {
        return specs;
    }

    public void setSpecs(LotDesc specs) {
        this.specs = specs;
    }
}
