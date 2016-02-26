/**
 * Luokka pitää sisllään tiedon pelaajaan liittyvästä statistiikasta
 * !!!!!PlayerStats luokka, toinen on turha!!!
 */
package headsuphud.handdata;

public class Player {

    private String playername;
    private Position position;
    private Positionstats smallblindstats;
    private Positionstats bigblindstats;

    /**
     * Konstruktori luokalle Player.
     *
     * @param playername Pelaajan nimi.
     */
    public Player(String playername) {
        this.playername = playername;
        this.smallblindstats = new Positionstats();
        this.bigblindstats = new Positionstats();

    }

    /**
     * Konstruktori luokalle Player.
     *
     * @param playername pelaajan nimi.
     * @param position positio, josta pelaaja pelaa, SmallBlind / BigBlind.
     */
    public Player(String playername, Position position) {
        this(playername);
        this.position = position;
        this.smallblindstats = new Positionstats();
        this.bigblindstats = new Positionstats();
    }

    public String getName() {
        return playername;
    }

    public Positionstats getSmallblindstats() {
        return smallblindstats;
    }

    public Positionstats getBigblindstats() {
        return bigblindstats;
    }

    public Positionstats getPositionstats(Position position) {
        if (position == Position.SmallBlind) {
            return smallblindstats;
        } else {
            return bigblindstats;
        }
    }

    public Positionstats getPositionStatsAccordingToCurrentPosition() {
        if (position == Position.SmallBlind) {
            return smallblindstats;
        } else {
            return bigblindstats;
        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    /**
     * Metodi palauttaa kaiken tähän pelaajaan liittyvän statistiikan
     * tekstimuodossa.
     *
     *
     * @return Statistiikka tekstimuodossa.
     */
    public String allPlayerStats() {
        String allplayerstats = "\n" + playername;
        allplayerstats += "\nSmall Blind:\n" + getSmallblindstats().allStats();
        allplayerstats += "\nBig Blind:\n" + getBigblindstats().allStats();

        return allplayerstats;

    }

}
