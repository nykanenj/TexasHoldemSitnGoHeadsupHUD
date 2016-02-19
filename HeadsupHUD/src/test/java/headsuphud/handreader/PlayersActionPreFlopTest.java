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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juuso
 */
public class PlayersActionPreFlopTest {

    private PlayersActionPreFlop p;

    public PlayersActionPreFlopTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p = new PlayersActionPreFlop(Position.SmallBlind);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
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
