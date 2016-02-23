/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;


import headsuphud.handdata.DataStorage;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import headsuphud.gui.NewJFrame;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {

    public static void main(String[] args) {

        DataStorage datastorage = loadStatistics();
        Textuserinterface textui = new Textuserinterface(datastorage);
        textui.mainmenu();
        NewJFrame jframe = new NewJFrame(datastorage);
        jframe.run(datastorage);

    }

    /**
     * Metodi lataa analysoitavat kädet ja palauttaa datastoragen, jotta
     * käsiin pääsee kiinni myöhemmin.
     */
    public static DataStorage loadStatistics() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");

        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();

        return converter.getDatastorage(); 
    }
}
