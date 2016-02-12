/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handdata;

import headsuphud.handdata.Card;
import static headsuphud.handdata.Rank.*;
import static headsuphud.handdata.Suit.*;
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
public class CardTest {

    private Card cardDeuce;
    private Card cardThree;

    public CardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cardDeuce = new Card(Deuce, Spades);
        cardThree = new Card(Three, Hearts);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cardRankCorrect() {
        assertEquals(cardDeuce.getRank(), Deuce);
    }

    @Test
    public void cardRankValueCorrect() {
        assertEquals(cardDeuce.getRank().getrankValue(), 2);
    }

    @Test
    public void cardSuitCorrect() {
        assertEquals(cardDeuce.getSuit(), Spades);
    }

    @Test
    public void cardEqualsWorks() {
        Card anotherDeuce = new Card(Deuce, Spades);
        assertEquals(cardDeuce, anotherDeuce);
    }

    @Test
    public void cardCompareWorks() {
        assertTrue(cardThree.compareTo(cardDeuce) > 0);
    }

    @Test
    public void cardCompareWorksTakeTwo() {

        assertTrue(cardDeuce.compareTo(cardThree) < 0);
    }

    @Test
    public void cardCompareWorksWithNOTACard() {
        Object object = new Object();
        assertTrue(cardDeuce.compareTo(object) == 0);
    }

    @Test
    public void hashcodeTest() {
        Card card = new Card(Jack, Hearts);
        assertEquals(card.hashCode(), 11);
    }

    @Test
    public void equalsWorksWithNULL() {
        assertFalse(Deuce.equals(null));
    }

    @Test
    public void equalsWorksWithNOTACard() {
        Object object = new Object();
        assertFalse(Deuce.equals(object));
    }

    @Test
    public void equalsWorksWithNOTSameRank() {
        assertFalse(Deuce.equals(cardThree));
    }

    @Test
    public void equalsWorksWithNOTSameSuit() {
        Card anotherDeuce = new Card(Deuce, Hearts);
        assertFalse(Deuce.equals(anotherDeuce));
    }

}
