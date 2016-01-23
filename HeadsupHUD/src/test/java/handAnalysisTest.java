/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import handAnalysis.*;
import static handAnalysis.Rank.*;
import static handAnalysis.Suit.*;
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
public class handAnalysisTest {
    private Card cardDeuce;
    
    
    public handAnalysisTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
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
