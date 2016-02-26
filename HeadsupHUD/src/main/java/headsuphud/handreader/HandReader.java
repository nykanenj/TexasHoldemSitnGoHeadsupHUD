/**
 * Luokka lukee pokerstars pokerikäsihistoria tekstitiedoston ArrayList muotoon.
 */
package headsuphud.handreader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HandReader {

    private ArrayList<String> handDataRows;

    public HandReader() {
        this.handDataRows = new ArrayList<>();
    }

    public ArrayList<String> getHandData() {
        return handDataRows;
    }

    /**
     * Metodi lukee annetunnnimisen tekstitiedoston ArrayListiin.
     *
     * @param filename Tiedosto, joka halutaan avata. Default polku:
     * /handhistory/hands/
     *
     */
    public void loadFileContents(String filename) {

        try {
            File file = new File("handhistory/hands/" + filename); // esim. HH20160122 T1452807389 No Limit Hold'em $1.38 + $0.12.txt
            Scanner lukija = new Scanner(file, "UTF-8");
            while (lukija.hasNextLine()) {
                String next = lukija.nextLine();
                handDataRows.add(next);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }

    }

}
