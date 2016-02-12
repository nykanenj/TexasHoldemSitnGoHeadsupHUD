/**
 * Luokka pitää sisllään tiedon pelaajaan liittyvästä statistiikasta
 *
 */
package headsuphud.handdata;

public class Player {

    private String playername;
    private Playerstats playerstats;
    private Position position;

    public Player(String playername) {
        this.playername = playername;
        this.playerstats = new Playerstats();
    }

    public Player(String playername, Position position) {
        this(playername);
        this.position = position;
    }

    public String getName() {
        return playername;
    }

    public Playerstats getPlayerstats() {
        return playerstats;
    }

    public Positionstats getPositionStatsAccordingToCurrentPosition() {
        return playerstats.getStats(position);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public String stats() {
        return "";

    }

}
