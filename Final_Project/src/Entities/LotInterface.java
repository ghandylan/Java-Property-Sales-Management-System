/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author smurf
 */
public interface LotInterface {

    public static ArrayList<Lots> al_units() throws IOException {
        Lots lot;
        ArrayList<Lots> lotList = new ArrayList<>();
        String location = "src/Data/lots.csv";
        String level = "";
        BufferedReader scan = null;
        try {
            scan = new BufferedReader(new FileReader(location));
            while ((level = scan.readLine()) != null) {
                String[] row = level.split(",");
                lot = new Lots(row[0], row[1], Double.parseDouble(row[2]), new Specifics(new LotLocation(Integer.parseInt(row[3]), Integer.parseInt(row[4])), Integer.parseInt(row[5])));
                lotList.add(lot);
            }
        } catch (IOException | NumberFormatException ignored) {
        }
        assert scan != null;
        scan.close();
        return lotList;
    }
}
