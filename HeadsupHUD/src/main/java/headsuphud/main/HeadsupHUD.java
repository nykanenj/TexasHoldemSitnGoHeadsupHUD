/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;

import headsuphud.handAnalysis.Handanalyzer;
import headsuphud.handData.DataStorage;
import headsuphud.handReader.HandHistoryTextToObjectsConverter;
import headsuphud.handReader.HandReader;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {

    public static void main(String[] args) {

        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");
        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();
        Handanalyzer analyzer = new Handanalyzer(converter.getDatastorage());
        DataStorage storage = converter.getDatastorage();
        System.out.println(storage.getPlayer("GraveleverX").getName());
       
    }
}
