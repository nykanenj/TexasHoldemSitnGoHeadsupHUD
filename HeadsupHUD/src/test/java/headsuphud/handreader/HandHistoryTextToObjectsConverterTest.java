/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handreader;

import headsuphud.handdata.Position;
import headsuphud.handdata.Street;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import java.util.ArrayList;
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
public class HandHistoryTextToObjectsConverterTest {

    private HandHistoryTextToObjectsConverter converter;
    private HandReader handreader;

    public HandHistoryTextToObjectsConverterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        handreader = new HandReader();
        handreader.loadFilesFromDirectory("handhistory");
        converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void setSmallBlindWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("a: posts small blind");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertEquals(Position.SmallBlind, converter2.getDatastorage().getPlayer("a").getPosition());
    }

    @Test
    public void setBigBlindWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("b: posts big blind");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertEquals(Position.BigBlind, converter2.getDatastorage().getPlayer("b").getPosition());
    }

    @Test
    public void setStreetPreflopWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("\"*** HOLE CARDS ***\"");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertEquals(Street.Preflop, converter2.getStreet());
    }

    @Test
    public void setStreetFlopWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("\"*** FLOP ***\"");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertEquals(Street.Flop, converter2.getStreet());
    }

    @Test
    public void setStreetTurnWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("\"*** TURN ***\"");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertEquals(Street.Turn, converter2.getStreet());
    }

    @Test
    public void setStreetRiverWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("\"*** RIVER ***\"");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertEquals(Street.River, converter2.getStreet());
    }

    @Test
    public void setFoldReadingWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("a: posts small blind");
        komentoja.add("\"*** HOLE CARDS ***\"");
        komentoja.add("a: folds");
        HandHistoryTextToObjectsConverter converter2 = new HandHistoryTextToObjectsConverter(komentoja);
        converter2.convert();
        assertTrue(converter2.getDatastorage().getPlayer("a").getPositionStatsAccordingToCurrentPosition().getStatsFrom(Street.Preflop).allStats().contains("Fold: 100%"));
    }

    @Test
    public void setCheckReadingWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("c: posts small blind");
        komentoja.add("*** FLOP ***");
        komentoja.add("c: checks");
        HandHistoryTextToObjectsConverter converter3 = new HandHistoryTextToObjectsConverter(komentoja);
        converter3.convert();
        assertTrue(converter3.getDatastorage().getPlayer("c").getPositionstats(Position.SmallBlind).getStatsFrom(Street.Flop).allStats().contains("Check: 100%"));
    }

    @Test
    public void setRaiseReadingWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("cc: posts big blind");
        komentoja.add("*** TURN ***");
        komentoja.add("cc: raises ");
        HandHistoryTextToObjectsConverter converterfour = new HandHistoryTextToObjectsConverter(komentoja);
        converterfour.convert();
        String stats = converterfour.getDatastorage().getPlayer("cc").getPositionstats(Position.BigBlind).getStatsFrom(Street.Turn).allStats();
        assertTrue(stats.contains("Raise: 100%"));
    }

    @Test
    public void setCallReadingWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("cc: posts big blind");
        komentoja.add("*** RIVER ***");
        komentoja.add("cc: calls ");
        HandHistoryTextToObjectsConverter converterfour = new HandHistoryTextToObjectsConverter(komentoja);
        converterfour.convert();
        String stats = converterfour.getDatastorage().getPlayer("cc").getPositionstats(Position.BigBlind).getStatsFrom(Street.River).allStats();
        assertTrue(stats.contains("Call: 100%"));
    }
    
    @Test
    public void setBetReadingWorks() {
        ArrayList<String> komentoja = new ArrayList<>();
        komentoja.add("cc: posts big blind");
        komentoja.add("*** RIVER ***");
        komentoja.add("cc: bets ");
        HandHistoryTextToObjectsConverter converterfour = new HandHistoryTextToObjectsConverter(komentoja);
        converterfour.convert();
        String stats = converterfour.getDatastorage().getPlayer("cc").getPositionstats(Position.BigBlind).getStatsFrom(Street.River).allStats();
        assertTrue(stats.contains("Bet: 100%"));
    }

}
