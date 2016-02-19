/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handreader;

import headsuphud.handdata.Action;
import headsuphud.handdata.Position;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Juuso
 */
public class PlayersActionPostFlopTest {
    private PlayersActionPostFlop p;
    
    public PlayersActionPostFlopTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new PlayersActionPostFlop(Position.SmallBlind);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void foldRecordingWorks() {
        p.add(Action.Fold);
        ArrayList<Action> a = p.generateRealActionsForStreet();
        Action action = a.get(0);
        assertEquals(Action.Fold, action);
    }
    @Test
    public void raiseRecordingWorks() {
        p.add(Action.Raise);
        ArrayList<Action> a = p.generateRealActionsForStreet();
        assertEquals(new ArrayList<>(), a);
    }
}
