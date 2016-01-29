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
public class PlayerTest {
    
    private Player jonijokunen;
    
    public PlayerTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jonijokunen = new Player("jonijokunen", 1500, new Card(Queen, Clubs), new Card(Ace, Diamonds));
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void playerNameCorrect() {
        assertEquals(jonijokunen.getName(), "jonijokunen");
    }
    
    @Test
    public void stackSizeCorrect() {
        assertEquals(jonijokunen.getStacksize(), 1500);
    }
    
    @Test
    public void getCardsWorks() {
        
        Card[] similarHand = new Card[2];
        similarHand[0] = new Card(Queen, Clubs);
        similarHand[1] = new Card(Ace, Diamonds);
        assertEquals(jonijokunen.getCards()[0], similarHand[0]);
        assertEquals(jonijokunen.getCards()[1], similarHand[1]);
    }
    
    @Test
    public void toStringWorks() {
        assertEquals(jonijokunen.toString(), "jonijokunen (1500) Cards: Queen of Clubs, Ace of Diamonds");
    
    }
}
