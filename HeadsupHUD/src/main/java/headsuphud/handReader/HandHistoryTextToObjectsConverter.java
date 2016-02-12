/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handReader;

import headsuphud.handData.DataStorage;
import headsuphud.handData.Player;
import headsuphud.handData.Street;
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
    }

    public void convert() {
        divideIntoHands();

        smallBlindPlayer = null;
        bigBlindPlayer = null;

        for (String textLine : allHandHistoryText) {
            if (textLine.contains("posts smaal blind")) {
                readPlayerName(textLine, smallBlindPlayer);
            }
            if (textLine.contains("posts big blind")) {
                readPlayerName(textLine, bigBlindPlayer);
                break;
            }
        }

        if (smallBlindPlayer != null && bigBlindPlayer != null) {

        }
    }

    public void readPlayerName(String textLine, Player player) {
        String playername = "";
        for (int i = 0; i < textLine.length(); i++) {
            if (textLine.charAt(i) != ':') {
                playername += textLine.charAt(i);
            } else {
                datastorage.addPlayer(playername);
                player = datastorage.getPlayer(playername);
                break;
            }

        }
    }

    private void divideIntoHands() {
        ArrayList<String> helper = new ArrayList<String>();
        for (String textline : allHandHistoryText) {
            if (textline.equals("")) {
                dividedIntoHands.add(new Hand(helper));
                helper.clear();
                continue;
            }

            helper.add(textline);
        }

    }

    class Hand {

        private ArrayList<String> textRelatedToThisHand;

        public Hand(ArrayList<String> textRelatedToThisHand) {
            this.textRelatedToThisHand = textRelatedToThisHand;
        }

        public ArrayList<String> getTextRelatedToThisHand() {
            return textRelatedToThisHand;
        }

    }

}
