package headsuphud.handreader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import headsuphud.handreader.HandReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class HandReaderTest {

    private HandReader handreader;
    ByteArrayOutputStream tulosvirta;

    public HandReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tulosvirta = new ByteArrayOutputStream();
        System.setOut(new PrintStream(tulosvirta));
        handreader = new HandReader();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void fileReaderWorksCorrect() {
        handreader.loadFilesFromDirectory("handhistory/Testhandhistory");
        String tulos = tulosvirta.toString();
        assertTrue(!tulos.contains("Not file directory"));
    }

    @Test
    public void getHandDataWorksCorrect() {
        handreader.loadFilesFromDirectory("handhistory/Testhandhistory");
        ArrayList<String> helper = handreader.getHandData();
        String tulos = helper.get(0);
        assertTrue(tulos.contains("PokerStars Hand #147486167872: Tournament #1452807389"));
    }

}
