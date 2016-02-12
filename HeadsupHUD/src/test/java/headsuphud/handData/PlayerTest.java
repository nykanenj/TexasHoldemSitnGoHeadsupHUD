/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

import headsuphud.handData.Player;
import headsuphud.handData.Card;
import static headsuphud.handData.Rank.*;
import static headsuphud.handData.Suit.*;
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
    private Player tiiatimonen;
    
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
        jonijokunen = new Player("jonijokunen");
        tiiatimonen = new Player("tiiatimonen", Position.BigBlind);
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
    public void playerPositionCorrect() {
        assertEquals(tiiatimonen.getPosition(), Position.BigBlind);
    }
    
    @Test
    public void playerSetPositionCorrect() {
        jonijokunen.setPosition(Position.SmallBlind);
        assertEquals(jonijokunen.getPosition(), Position.SmallBlind);
    }
    
    @Test
    public void statsCorrect() {
        assertEquals(jonijokunen.stats(), "");
    }
    
    @Test
    public void getPlayerStatsWorks() {
        assertEquals(new Playerstats().getClass(), tiiatimonen.getPlayerstats().getClass());
    }
    

}
