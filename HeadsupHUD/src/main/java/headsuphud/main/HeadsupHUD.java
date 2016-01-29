/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;

import headsuphud.handAnalysis.Card;
import headsuphud.handAnalysis.Hand;
import headsuphud.handAnalysis.Player;
import static headsuphud.handAnalysis.Rank.*;
import static headsuphud.handAnalysis.Suit.*;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {
    public static void main(String[] args) {

//        HandReader handreader = new HandReader();
//        handreader.lataaTiedostonSisalto();
//        handreader.tulosta();
        Player pekka = new Player("Pekka", 1000, new Card(Seven, Diamonds), new Card(Ten, Hearts));
        Player liisa = new Player("Liisa", 2000, new Card(Ace, Clubs), new Card(Deuce, Spades));
        Card[] cardsontable = new Card[5];
        cardsontable[0] = new Card(Jack,Hearts); 
        cardsontable[1] = new Card(Three,Clubs); 
        cardsontable[2] = new Card(Eight,Hearts); 
        Hand hand = new Hand("54321", pekka, liisa, cardsontable);

             
    }
}
