/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

/**
 *
 * @author Juuso
 */
public class Hand {

    private final String handid;
    private final Player player1;
    private final Player player2;
    private Card[] flopTurnRiverCards;

    public Hand(String handid, Player player1, Player player2, Card[] flopTurnRiverCards) {
        this.handid = handid;
        this.player1 = player1;
        this.player2 = player2;
        this.flopTurnRiverCards = flopTurnRiverCards;
    }

    public String getHandid() {
        return handid;
    }
    
    public Player[] getPlayers() {
        Player[] players = new Player[2];
        players[0] = player1;
        players[1] = player2;
        return players;
    }

    public Card[] getFlopTurnRiverCards() {
        return flopTurnRiverCards;
    }


    
    

}
