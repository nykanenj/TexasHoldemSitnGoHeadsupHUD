package headsuphud.handanalysis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import headsuphud.handdata.DataStorage;
import headsuphud.handreader.HandHistoryTextToObjectsConverter;
import headsuphud.handreader.HandReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Juuso
 */
public class HandanalyzerTest {

    DataStorage datastorage;

    public HandanalyzerTest() {
        HandReader handreader = new HandReader();
        handreader.loadFileContents("Test.txt");
        HandHistoryTextToObjectsConverter converter = new HandHistoryTextToObjectsConverter(handreader.getHandData());
        converter.convert();
        datastorage = converter.getDatastorage();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    public void playerFoundByName() {

    }
}
