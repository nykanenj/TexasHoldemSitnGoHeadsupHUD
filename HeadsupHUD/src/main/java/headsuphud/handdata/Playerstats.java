/**
 * Luokka pitää sisällään kaksi statistiikkaoliota position mukaan. Pokerissa
 * haluamme tarkkailla pelaajan liikkeitä position mukaan.
 *
 */
package headsuphud.handdata;

public class Playerstats {

    private Positionstats smallblindstats;
    private Positionstats bigblindstats;

    public Playerstats() {
        smallblindstats = new Positionstats();
        bigblindstats = new Positionstats();
    }

    public Positionstats getSmallblindstats() {
        return smallblindstats;
    }

    public Positionstats getBigblindstats() {
        return bigblindstats;
    }

    public Positionstats getStats(Position position) {
        if (position == Position.SmallBlind) {
            return getSmallblindstats();
        } else {
            return getBigblindstats();
        }

    }

}
