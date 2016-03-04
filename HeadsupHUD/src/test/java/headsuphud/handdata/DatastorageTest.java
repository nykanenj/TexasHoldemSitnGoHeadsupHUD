/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handdata;

import headsuphud.handdata.DataStorage;
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
        handreader.loadFileContents("handhistory/Testhandhistory");
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

    @Test
    public void playerNamesArray() {

        assertEquals("PopcornMonk", datastorage.playerNamesAsArray()[1]);
    }

    @Test
    public void allPlayerStats() {
        String stats = datastorage.allPlayerStats("GraveleverX");
        assertTrue(stats.contains("GraveleverX\nSmall Blind:"));
    }

    @Test
    public void somePlayerStats() {
        String stats = datastorage.getStats("GraveleverX", Position.SmallBlind, Street.Preflop);
        assertTrue(stats.contains("Fold:"));
    }

}
