/*
 * Main luokka HeadsupHUD:ille. 
 */
package headsuphud.main;

import headsuphud.handdata.DataStorage;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import headsuphud.gui.HudGUI;

/**
 *
 * Main luokka HeadsupHUD:ille.
 */
public class HeadsupHUD {

    public static void main(String[] args) {

        DataStorage datastorage = loadStatistics();
        HudGUI hudGUI = new HudGUI(datastorage);
        hudGUI.run(datastorage);

    }

    /**
     * Metodi lataa analysoitavat kädet ja palauttaa datastoragen, jotta käsiin
     * pääsee kiinni myöhemmin.
     * @return datastorage.
     */
    public static DataStorage loadStatistics() {
        HandReader handreader = new HandReader();
        handreader.loadFilesFromDirectory("handhistory");

        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();

        return converter.getDatastorage();
    }
}
