/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handAnalysis;

import java.util.Objects;

/**
 *
 * @author Juuso
 */
public class Card implements Comparable {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return rank.name() + " of " + suit.name();
    }
    
    

    @Override
    public int hashCode() {
        return this.rank.getrankValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.rank != other.rank) {
            return false;
        }
        if (this.suit != other.suit) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object other) {
        if (this.getClass() != other.getClass()) {
            return 0;
        } else {

            Card othercard = (Card) other;
            return this.getRank().getrankValue() - othercard.getRank().getrankValue();
        }
    }

}
