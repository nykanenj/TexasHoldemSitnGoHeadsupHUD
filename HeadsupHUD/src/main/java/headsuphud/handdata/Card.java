/**
 *
 * Luokka kuvaa pelikorttia, yksi luokan ilmentymä on yksi pelikortti
 */
package headsuphud.handdata;

import java.util.Objects;

public class Card implements Comparable {

    private final Rank rank;
    private final Suit suit;

    /**
     * Konstruktori luokalle Card.
     *
     * @param rank Kortin arvo.
     * @param suit Kortin maa.
     */
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
