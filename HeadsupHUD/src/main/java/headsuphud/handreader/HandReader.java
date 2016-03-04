/**
 * Luokka lukee pokerstars pokerikäsihistoria tekstitiedoston ArrayList muotoon.
 */
package headsuphud.handreader;

import headsuphud.main.HeadsupHUD;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class HandReader {

    private ArrayList<String> handDataRows;

    /**
     * Konstruktori luo uuden arraylistin.
     */
    public HandReader() {
        this.handDataRows = new ArrayList<>();
    }

    /**
     * Metodi palauttaa ArrayListin käsihistoriatiedostojen tekstirivit.
     *
     * @return Käsihistoriatiedostojen tekstirivit.
     */
    public ArrayList<String> getHandData() {
        return handDataRows;
    }

    /**
     * Metodi lukee annetunnnimisen tekstitiedoston ArrayListiin.
     *
     * @param filepath Tiedostopolku, jonka tiedostot halutaan avata. Default
     * polku, jossa käsihistoriatiedostoja: /handhistory/hands/
     *
     */
    public void loadFilesFromDirectory(String filepath) {

        try {
            File path = new File(filepath); // esim. HH20160122 T1452807389 No Limit Hold'em $1.38 + $0.12.txt
            File[] files = path.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile()) {

                        Scanner lukija = new Scanner(files[i], "UTF-8");
                        while (lukija.hasNextLine()) {
                            String next = lukija.nextLine();
                            handDataRows.add(next);
                        }
                    }
                }
            }
        } catch (Exception e) {
            return;
        }

    }

}
