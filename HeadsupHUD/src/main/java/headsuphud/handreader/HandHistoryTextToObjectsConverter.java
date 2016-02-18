/**
 * Luokka muuttaa täysin tekstimuodossa olevan tiedon pokerikäsistä oliomuotoon.
 * Tällöin pystymme myöhemmin tekemään laskelmia statistiikasta.
 */
package headsuphud.handreader;

import headsuphud.handdata.Position;
import headsuphud.handdata.DataStorage;
import headsuphud.handdata.Action;
import headsuphud.handdata.Player;
import headsuphud.handdata.Street;
import java.util.ArrayList;

/**
 *
 * @author Juuso
 */
public class HandHistoryTextToObjectsConverter {

    private ArrayList<String> allHandHistoryText;
    private ArrayList<Hand> dividedIntoHands;
    private DataStorage datastorage;
    private Player smallBlindPlayer;
    private Player bigBlindPlayer;
    private Street street;

    public HandHistoryTextToObjectsConverter(ArrayList<String> handHistoryText) {
        this.allHandHistoryText = handHistoryText;
        this.datastorage = new DataStorage();
        dividedIntoHands = new ArrayList<>();
    }

    public DataStorage getDatastorage() {
        return datastorage;
    }

    /**
     * Metodi muuttaa sille konstruktorissa annetun tiedon oliomuotoon. Tuloo
     * ajaa ennen getDatastorage metodia
     */
    public void convert() {
        divideIntoHands();
        goThroughIndividualHands();
    }

    private void goThroughIndividualHands() {
        for (Hand hand : dividedIntoHands) {
            goThroughHand(hand);
        }
    }

    private void goThroughHand(Hand hand) {
        smallBlindPlayer = null;
        bigBlindPlayer = null;
        for (String textLine : hand.textRelatedToThisHand) {
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
            if (textLine.contains("raises") || textLine.contains("bets")) {
                String playername = readPlayerName(textLine);
                if (datastorage.playerFound(playername)) {
                    datastorage.getPlayer(playername).getPositionStatsAccordingToCurrentPosition().getStatsFrom(street).addAction(Action.Raise);
                }
            }
        }
    }

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

    private void divideIntoHands() {
        ArrayList<String> helper = new ArrayList<String>();
        for (String textline : allHandHistoryText) {
            if (textline.equals("") && helper.isEmpty()) {
                continue;
            }

            if (textline.equals("")) {
                dividedIntoHands.add(new Hand(helper));
                helper.clear();
                continue;
            }

            helper.add(textline);
        }
        dividedIntoHands.add(new Hand(helper));
    }

    private class Hand {

        private ArrayList<String> textRelatedToThisHand;

        public Hand(ArrayList<String> textRelatedToThisHand) {
            this.textRelatedToThisHand = textRelatedToThisHand;
        }

        public ArrayList<String> getTextRelatedToThisHand() {
            return textRelatedToThisHand;
        }

    }

    private class PlayersActionPreFlop {

        private ArrayList<Action> rawactions;
        private ArrayList<Action> realacttions;
        private Position position;

        public PlayersActionPreFlop(Position position) {
            this.position = position;
            rawactions = new ArrayList<>();
            realacttions = new ArrayList<>();
        }

        public void add(Action a) {
            rawactions.add(a);
        }

        public ArrayList<Action> generateRealActionsForStreet() {

            for (Action rawaction : rawactions) {
                if (rawaction == Action.Fold && rawactions.size() == 1) {
                        realacttions.add(Action.Fold);
                        return realacttions;
                }
            }
            return realacttions;
        }

    }

    private class PlayersActionPostFlop {

        private ArrayList<Action> rawactions;
        private ArrayList<Action> realacttions;
        private Position position;

        public PlayersActionPostFlop(Position position) {
            this.position = position;
            rawactions = new ArrayList<>();
            realacttions = new ArrayList<>();
        }

        public void add(Action a) {
            rawactions.add(a);
        }

        public ArrayList<Action> generateRealActionsForStreet() {

            for (Action rawaction : rawactions) {
                if (rawaction == Action.Fold && rawactions.size() == 1 && position == Position.SmallBlind) {
                    realacttions.add(Action.Fold);
                    return realacttions;
                }
            }
            return realacttions;
        }

    }
}
