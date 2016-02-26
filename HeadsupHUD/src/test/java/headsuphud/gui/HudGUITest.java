/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.gui;

import headsuphud.handdata.DataStorage;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import org.junit.Before;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.edt.GuiQuery;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juuso
 */
public class HudGUITest {

    private FrameFixture window;
    private DataStorage datastorage;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:

    
    
    @Before
    public void setUp() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");

        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();
        
        HudGUI frame = GuiActionRunner.execute(new GuiQuery<HudGUI>() {
            protected HudGUI executeInEDT() {
                return new HudGUI(converter.getDatastorage());
            }
        });
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }
}
