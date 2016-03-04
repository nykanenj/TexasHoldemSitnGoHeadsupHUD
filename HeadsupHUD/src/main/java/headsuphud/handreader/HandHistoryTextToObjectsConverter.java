/**
 * Luokka muuttaa täysin tekstimuodossa olevan tiedon pokerikäsistä oliomuotoon.
 * Tällöin pystymme myöhemmin tekemään laskelmia pelatuista käsistä ja
 * näyttämään statistiikkaa.
 */
package headsuphud.handreader;

import headsuphud.handdata.Position;
import headsuphud.handdata.DataStorage;
import headsuphud.handdata.Action;
import headsuphud.handdata.Player;
import headsuphud.handdata.Street;
import java.util.ArrayList;

public class HandHistoryTextToObjectsConverter {

    private ArrayList<String> allHandHistoryText;
    private DataStorage datastorage;
    private Player smallBlindPlayer;
    private Player bigBlindPlayer;
    private Street street;

    /**
     * Konstruktori luokalle HandHistoryTextToObjectsConverter.
     *
     * @param handHistoryText ArrayList käsihistoriaan liittyvistä
     * tekstiriveistä.
     */
    public HandHistoryTextToObjectsConverter(ArrayList<String> handHistoryText) {
        this.allHandHistoryText = handHistoryText;
        this.datastorage = new DataStorage();
    }

    /**
     * Metodi palauttaa Datastorage oliomuuttujan.
     * @return datastorage.
     */
    public DataStorage getDatastorage() {
        return datastorage;
    }

    /**
     * Metodi palauttaa Street oliomuuttujan.
     * @return street.
     */
    public Street getStreet() {
        return street;
    }

    /**
     * Metodi muuttaa sille konstruktorissa annetun tiedon oliomuotoon. Tuloo
     * ajaa ennen getDatastorage metodia
     */
    public void convert() {
        goThroughAll();
    }

    /**
     * Metodi käy läpi kaikki käteen liityvät tekstirivit, ja luo niistä
     * objektit
     *
     * @param hand käsi, joka halutaan käsitellä
     */
    private void goThroughAll() {
        for (String textLine : allHandHistoryText) {
            if (textLine.contains("posts small blind")) {
                String playername = readPlayerName(textLine);
                datastorage.addPlayer(playername);
                smallBlindPlayer = datastorage.getPlayer(playername);
                smallBlindPlayer.setPosition(Position.SmallBlind);
            }
            if (textLine.contains("posts big blind")) {
                String playername = readPlayerName(textLine);
                datastorage.addPlayer(playername);
                bigBlindPlayer = datastorage.getPlayer(playername);
                bigBlindPlayer.setPosition(Position.BigBlind);
            }
            if (textLine.contains("*** HOLE CARDS ***")) {
                street = Street.Preflop;
            }
            if (textLine.contains("*** FLOP ***")) {
                street = Street.Flop;
            }
            if (textLine.contains("*** TURN ***")) {
                street = Street.Turn;
            }
            if (textLine.contains("*** RIVER ***")) {
                street = Street.River;
            }
            if (textLine.contains("folds")) {
                String playername = readPlayerName(textLine);
                if (datastorage.playerFound(playername)) {
                    datastorage.getPlayer(playername).getPositionStatsAccordingToCurrentPosition().getStatsFrom(street).addAction(Action.Fold);
                }
            }
            if (textLine.contains("checks")) {
                String playername = readPlayerName(textLine);
                if (datastorage.playerFound(playername)) {
                    datastorage.getPlayer(playername).getPositionStatsAccordingToCurrentPosition().getStatsFrom(street).addAction(Action.Check);
                }
            }
            if (textLine.contains("calls")) {
                String playername = readPlayerName(textLine);
                if (datastorage.playerFound(playername)) {
                    datastorage.getPlayer(playername).getPositionStatsAccordingToCurrentPosition().getStatsFrom(street).addAction(Action.Call);
                }
            }
            if (textLine.contains("bets")) {
                String playername = readPlayerName(textLine);
                if (datastorage.playerFound(playername)) {
                    datastorage.getPlayer(playername).getPositionStatsAccordingToCurrentPosition().getStatsFrom(street).addAction(Action.Bet);
                }
            }
            if (textLine.contains("raises")) {
                String playername = readPlayerName(textLine);
                if (datastorage.playerFound(playername)) {
                    datastorage.getPlayer(playername).getPositionStatsAccordingToCurrentPosition().getStatsFrom(street).addAction(Action.ReRaise);
                }
            }

        }
    }


    /**
     * Lukee tekstin rivin alusta ':' merkiin asti. Luettavat tiedostot ovat
     * määrämuotoisia, nimi esiintyy aina rivin alussa ja loppuu : merkkiin.
     */
    private String readPlayerName(String textLine) {
        String playername = "";
        for (int i = 0; i < textLine.length(); i++) {
            if (textLine.charAt(i) != ':') {
                playername += textLine.charAt(i);
            } else {
                return playername;
            }

        }
        return playername;
    }

}
