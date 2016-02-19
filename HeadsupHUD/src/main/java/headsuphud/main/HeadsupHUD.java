/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;

import headsuphud.handanalysis.Handanalyzer;
import headsuphud.handdata.DataStorage;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {

    public static void main(String[] args) {

        Textuserinterface textui = new Textuserinterface(loadStatistics());
        textui.mainmenu();

    }

    /**
     * Metodi lataa analysoitavat kädet ja palauttaa handanalyzerin, jotta
     * käsiin pääsee kiinni myöhemmin.
     */
    public static Handanalyzer loadStatistics() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");

        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();

        Handanalyzer analyzer = new Handanalyzer(converter.getDatastorage());
        return analyzer;
    }
}
