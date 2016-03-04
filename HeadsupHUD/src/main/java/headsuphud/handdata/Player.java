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

    /**
     * Metodi palauttaa pelaajan nimen.
     */
    public String getName() {
        return playername;
    }

    /**
     * Metodi palauttaa pelaajan smallblind statistiikan.
     *
     * @return bigblind statistiikkaa sisältävä Positionstats olio.
     */
    public Positionstats getSmallblindstats() {
        return smallblindstats;
    }

    /**
     * Metodi palauttaa pelaajan bigblind statistiikan.
     *
     * @return bigblind statistiikkaa sisältävä Positionstats olio.
     */
    public Positionstats getBigblindstats() {
        return bigblindstats;
    }

    /**
     * Metodi palauttaa pelaajan smallblind tai bigblind statistiikan parametrin
     * perusteella.
     *
     * @param position Positio, jolle haluat hakea statistiikkaa.
     *
     * @return smallblind tai bigblind statistiikkaa sisältävä Positionstats
     * olio.
     */
    public Positionstats getPositionstats(Position position) {
        if (position == Position.SmallBlind) {
            return smallblindstats;
        } else {
            return bigblindstats;
        }
    }

    /**
     * Metodi palauttaa pelaajan smallblind tai bigblind statistiikan nykyisen
     * pelaajalle asetetun position perusteella.
     *
     * @return smallblind tai bigblind statistiikkaa sisältävä Positionstats
     * olio.
     */
    public Positionstats getPositionStatsAccordingToCurrentPosition() {
        if (position == Position.SmallBlind) {
            return smallblindstats;
        } else {
            return bigblindstats;
        }
    }

    /**
     * Metodi asettaa nykyisen position.
     *
     * @param position Positio, joka halutaan asettaa.
     *
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Metodi palauttaa nykyisen position.
     *
     * @return nykyinen positio.
     *
     */
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
