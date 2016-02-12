/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handdata;

import headsuphud.handdata.DataStorage;
import headsuphud.handanalysis.Handanalyzer;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juuso
 */
public class DatastorageTest {

    DataStorage datastorage;

    public DatastorageTest() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");
        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        datastorage = converter.getDatastorage();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");
        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();
        datastorage = converter.getDatastorage();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void playerFoundByName() {
        assertEquals("GraveleverX", datastorage.getPlayer("GraveleverX").getName());
    }

    @Test
    public void playerFound() {
        assertTrue(datastorage.playerFound("GraveleverX"));
    }

    @Test
    public void playerNames() {
        assertEquals("GraveleverX\nPopcornMonk\n", datastorage.playerNames());
    }

    @Test
    public void noPlayerNames() {
        DataStorage emptystorage = new DataStorage();
        assertEquals("No playerdata! Hence, no players to be listed", emptystorage.playerNames());
    }

}
