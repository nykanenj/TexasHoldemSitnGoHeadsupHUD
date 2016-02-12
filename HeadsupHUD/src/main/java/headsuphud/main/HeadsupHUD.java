/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.main;

import headsuphud.handData.Action;
import headsuphud.handData.Card;
import headsuphud.handData.Hand;
import headsuphud.handData.Player;
import static headsuphud.handData.Rank.*;
import static headsuphud.handData.Suit.*;
import headsuphud.handReader.HandReader;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {
    public static void main(String[] args) {

//        HandReader handreader = new HandReader();
//        handreader.lataaTiedostonSisalto();
//        handreader.tulosta();
        Player pekka = new Player("Pekka");
        Player liisa = new Player("Liisa");
        Card[] cardsontable = new Card[5];
        cardsontable[0] = new Card(Jack,Hearts); 
        cardsontable[1] = new Card(Three,Clubs); 
        cardsontable[2] = new Card(Eight,Hearts); 
        Hand hand = new Hand("54321", pekka, liisa, cardsontable);

       

        HandReader handreader = new HandReader();
        handreader.loadFileContents();
        handreader.tulosta();
             
    }
}
