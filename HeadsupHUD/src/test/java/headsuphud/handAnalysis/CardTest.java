/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handAnalysis;

import static headsuphud.handAnalysis.Rank.*;
import static headsuphud.handAnalysis.Suit.*;
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
        Card cardThree = new Card(Three, Hearts);
        
        assertTrue(cardThree.compareTo(cardDeuce) > 0);
    }
}