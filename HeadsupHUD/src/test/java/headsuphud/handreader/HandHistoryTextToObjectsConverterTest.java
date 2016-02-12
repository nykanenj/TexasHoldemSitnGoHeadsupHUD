/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handreader;

import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
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
public class HandHistoryTextToObjectsConverterTest {

    private HandHistoryTextToObjectsConverter converter;
    private HandReader handreader;

    public HandHistoryTextToObjectsConverterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        handreader = new HandReader();
        handreader.loadFileContents("Test.txt");
        converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
    }

    @After
    public void tearDown() {
    }

}
