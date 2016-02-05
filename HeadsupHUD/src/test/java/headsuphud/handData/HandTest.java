/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handAnalysis;

import static headsuphud.handAnalysis.Rank.*;
import static headsuphud.handAnalysis.Suit.*;
import java.util.Arrays;
import java.util.Collections;
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
public class HandTest {

    private Hand testHand;

    public HandTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Player player1 = new Player("Johnny", 1200, new Card(Ten, Hearts), new Card(Nine, Hearts));
        Player player2 = new Player("Sally", 1800, new Card(King, Diamonds), new Card(Jack, Clubs));
        Card[] cardsOnAllStreets = new Card[5];
        cardsOnAllStreets[0] = new Card(Five, Spades);
        cardsOnAllStreets[1] = new Card(Six, Hearts);
        cardsOnAllStreets[2] = new Card(Seven, Diamonds);
        cardsOnAllStreets[3] = new Card(Eight, Spades);
        cardsOnAllStreets[4] = new Card(Nine, Clubs);
        testHand = new Hand("1234", player1, player2, cardsOnAllStreets);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getHandidWorks() {
        assertEquals(testHand.getHandid(), "1234");
    }

    @Test
    public void getPlayersWorks() {
        assertEquals(testHand.getPlayers()[0].getName(), "Johnny");
        assertEquals(testHand.getPlayers()[1].getName(), "Sally");
    }

    @Test
    public void getFlopTurnRiverCardsWorks() {
        Card[] cardsOnStreets = testHand.getFlopTurnRiverCards();
        Arrays.sort(cardsOnStreets);
        
        assertEquals(cardsOnStreets[0],new Card(Five, Spades));
        assertEquals(cardsOnStreets[2],new Card(Seven, Diamonds));
        
    }
}
