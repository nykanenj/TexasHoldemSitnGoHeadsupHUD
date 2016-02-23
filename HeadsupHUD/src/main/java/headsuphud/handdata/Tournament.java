/**
 * Luokka sisältää kaikki pokeriturnaukseen liittyvät pelatut kädet
 */
package headsuphud.handdata;

import headsuphud.handdata.Hand;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tournament {

    private String tournamentid;
    private Map<String, Hand> hands;

    /**
     * Konstruktori luokalle Tournament.
     *
     * @param tournamentid turnauksen id.
     */
    public Tournament(String tournamentid) {
        this(tournamentid, new HashMap<>());

    }

    /**
     * Konstruktori luokalle Tournament.
     *
     * @param tournamentid turnauksen id.
     * @param hands turnaukseen liittyvät pelatut kädet.
     */
    public Tournament(String tournamentid, HashMap<String, Hand> hands) {
        this.tournamentid = tournamentid;
        this.hands = hands;
    }

}
