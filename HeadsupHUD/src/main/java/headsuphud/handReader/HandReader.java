/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juuso
 */
public class HandReader {

    private ArrayList<String> handDataRows;

    public HandReader() {
        this.handDataRows = new ArrayList<>();
    }

    
    
    public void lataaTiedostonSisalto() {

        try {
            File file = new File("handhistory/hands/HH20160122 T1452807389 No Limit Hold'em $1.38 + $0.12.txt");
            Scanner lukija = new Scanner(file, "UTF-8");
            while (lukija.hasNextLine()) {
                String next = lukija.nextLine();
                handDataRows.add(next);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }

    }

    public void tulosta() {
        for (String row : handDataRows) {
            System.out.println(row);
        }
    }
}
