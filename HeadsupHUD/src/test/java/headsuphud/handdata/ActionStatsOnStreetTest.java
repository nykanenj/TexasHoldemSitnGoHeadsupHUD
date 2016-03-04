/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handdata;

import headsuphud.handdata.ActionStatsOnStreet;
import static headsuphud.handdata.Action.*;
import static headsuphud.handdata.Street.*;
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
        preflop.addAction(Bet);
        preflop.increase();
        assertEquals("100%", preflop.stats(Bet));
    }

    @Test
    public void addactionWorksWithSeveralAction() {
        flop.addAction(ReRaise);
        flop.addAction(Fold);
        flop.addAction(Check);
        flop.increase();
        flop.increase();
        flop.increase();
        assertEquals("33%", flop.stats(ReRaise));
    }

    @Test
    public void StatsWorksCorrectlyWithNoActionsAdded() {
        assertEquals("-", preflop.stats(ReRaise));
    }

    @Test
    public void StatsWorksCorrectlyWithoutAnyActionsAdded() {
        assertEquals("-", turn.stats(Check));
    }

    @Test
    public void StatsWorksCorrectlyWithoutActionsOfSpecificTypeAdded() {
        turn.addAction(Fold);
        assertEquals("-", turn.stats(Check));
    }

    @Test
    public void StatsWorksCorrectlyWithActionsAdded() {
        turn.addAction(Check);
        turn.addAction(Check);
        turn.addAction(Check);
        turn.increase();
        turn.increase();
        turn.increase();
        assertEquals("100%", turn.stats(Check));
    }

}
