/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;


import headsuphud.handdata.DataStorage;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import headsuphud.gui.HudGUI;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {

    public static void main(String[] args) {

        DataStorage datastorage = loadStatistics();
        HudGUI jframe = new HudGUI(datastorage);
        jframe.run(datastorage);

    }

    /**
     * Metodi lataa analysoitavat kädet ja palauttaa datastoragen, jotta
     * käsiin pääsee kiinni myöhemmin.
     */
    public static DataStorage loadStatistics() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("handhistory");

        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();

        return converter.getDatastorage(); 
    }
}
