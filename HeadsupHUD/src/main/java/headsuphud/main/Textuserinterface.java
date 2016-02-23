/*
 * Tekstikäyttöliittymä.
 */
package headsuphud.main;

import headsuphud.handdata.DataStorage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Scanner;

public class Textuserinterface {

    private Scanner reader;
    private DataStorage datastorage;

    public Textuserinterface(DataStorage datastorage) {
        this.datastorage = datastorage;
        try {
            reader = new Scanner(new File("handhistory/hands/Commands.txt"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Tulostaa tekstikäyttöliittymän ja kysyy käyttäjältä komentoja.
     */
    public void mainmenu() {

        System.out.println("##################################################################################################");
        System.out.println("#                                                                                                #");
        System.out.println("#   Welcome to HeadsupHUD stats! Here you can view player stats before I get to making a GUI     #");
        System.out.println("#                                                                                                #");
        System.out.println("##################################################################################################");
        System.out.println("");

        while (true) {
            System.out.println("");
            System.out.println("Players in database:");
            System.out.println(datastorage.playerNames());
            System.out.println("Type a playername to view player stats");
            System.out.println("Leave blank to exit");

            String answer = reader.nextLine();

            if (answer.equals("") || answer.equals(" ")) {
                break;
            }

            if (datastorage.playerFound(answer)) {
                System.out.println(datastorage.allPlayerStats(answer));
            } else {
                System.out.println("Player not found");
            }

        }

        System.out.println("Goodbye, see you again!");

    }
}
