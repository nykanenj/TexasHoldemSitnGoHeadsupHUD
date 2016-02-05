/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

import static headsuphud.handData.Action.*;
import static headsuphud.handData.Street.*;
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
public class ActionStatsOnStreetTest {
    private ActionStatsOnStreet preflop;
    private ActionStatsOnStreet flop;
    private ActionStatsOnStreet turn;
    private ActionStatsOnStreet river;
    
    
    
    
    public ActionStatsOnStreetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        preflop = new ActionStatsOnStreet(Preflop);
        flop = new ActionStatsOnStreet(Flop);
        turn = new ActionStatsOnStreet(Turn);
        river = new ActionStatsOnStreet(River);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void addactionWorksWithOneAction() {
         preflop.addAction(Raise);
         assertEquals(Raise, preflop.getActions().get(0));
     }
     
     @Test
     public void addactionWorksWithSeveralAction() {
         flop.addAction(Raise);
         flop.addAction(Fold);
         flop.addAction(Check);
         assertEquals(Check, flop.getActions().get(2));
     }
     
     @Test
     public void StatsWorksCorrectlyWithNoActionsAdded() {
         assertEquals(-1, (int) preflop.Stats(Raise));
     }
     
     @Test
     public void StatsWorksCorrectlyWithActionsAdded() {
         turn.addAction(Check);
         turn.addAction(Check);
         turn.addAction(Check);
         assertEquals(1, (int) turn.Stats(Raise));
     }
     
     
}
