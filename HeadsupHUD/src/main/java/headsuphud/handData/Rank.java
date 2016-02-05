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
public enum Rank {

    Deuce(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);

    private final int rankValue;

    Rank(int points) {
        this.rankValue = points;
    }

    public int getrankValue() {
    return this.rankValue;
    }

}
