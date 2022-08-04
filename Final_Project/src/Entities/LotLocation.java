/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Smurf
 */
public class LotLocation {

    private int lotBlock;
    private int lotNumber;

    public LotLocation(int block, int lot) {
        this.lotBlock = block;
        this.lotNumber = lot;
    }

    public int getLotBlock() {
        return lotBlock;
    }

    public void setLotBlock(int lotBlock) {
        this.lotBlock = lotBlock;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

}
