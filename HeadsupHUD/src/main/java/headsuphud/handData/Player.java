/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handAnalysis;

/**
 *
 * @author Juuso
 */
public class Player {
    private String playername;
    private int stacksize;
    private Card[] handcards;
    

    public Player(String playername, int stacksize, Card card1, Card card2) {      
        this.playername = playername;
        this.stacksize = stacksize;
        this.handcards = new Card[2];
        this.handcards[0] = card1;
        this.handcards[1] = card2;
    }

    public String getName() {
        return playername;
    }

    public int getStacksize() {
        return stacksize;
    }
    
    public Card[] getCards() {
        return this.handcards;
    }
    
    @Override
    public String toString() {
        return playername + " (" + stacksize + ") Cards: " + handcards[0].toString() + ", " + handcards[1].toString();
    }
    
    
}
