/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;

import headsuphud.handdata.DataStorage;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class TextuserinterfaceTest {
    private Textuserinterface ui;
    ByteArrayOutputStream tulosvirta;
    
    
    public TextuserinterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        ui = new Textuserinterface(new DataStorage());
        tulosvirta = new ByteArrayOutputStream();
        System.setOut(new PrintStream(tulosvirta));
        ui.mainmenu();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void mainMenuOikeaTulostus1() {
        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("Welcome to HeadsupHUD stats! Here you can view player stats before I get to making a GUI"));
    }
    @Test
    public void mainMenuOikeaTulostus2() {
        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("Type a playername to view player stats"));
    }
    @Test
    public void mainMenuOikeaTulostus3() {
        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("Leave blank to exit"));
    }
    @Test
    public void mainMenuOikeaTulostus4() {
        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("##################################################################################################"));
    }
    @Test
    public void mainMenuOikeaTulostus5() {
        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("Players in database:"));
    }

    @Test
    public void mainMenuOikeaTulostus6() {
        String tulos = tulosvirta.toString();
        assertTrue(tulos.contains("Goodbye, see you again!"));
    }
}
