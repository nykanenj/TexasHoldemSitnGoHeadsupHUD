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

    public Tournament(String tournamentid) {
        this(tournamentid, new HashMap<>());

    }

    public Tournament(String tournamentid, HashMap<String, Hand> hands) {
        this.tournamentid = tournamentid;
        this.hands = hands;
    }

}