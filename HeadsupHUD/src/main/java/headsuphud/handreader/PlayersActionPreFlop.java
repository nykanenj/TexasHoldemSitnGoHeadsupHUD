/**
 * HandHistoryTextToObjectsConverter käyttää tätä luokkaa pelaajan actionien
 * tulkitsemiseen.
 */
package headsuphud.handreader;

import headsuphud.handdata.Action;
import headsuphud.handdata.Position;
import java.util.ArrayList;

public class PlayersActionPreFlop {

    private ArrayList<Action> rawactions;
    private ArrayList<Action> realacttions;
    private Position position;

    public PlayersActionPreFlop(Position position) {
        this.position = position;
        rawactions = new ArrayList<>();
        realacttions = new ArrayList<>();
    }

    public void add(Action a) {
        rawactions.add(a);
    }

    /**
     * Kun kaikki käden aikana tapahtuneet komennot on luettu, aja tämä metodi.
     *
     * @return palauttaa ArrayListin, pelaajan tekemistä actioneistä.
     *
     */
    public ArrayList<Action> generateRealActionsForStreet() {

        for (Action rawaction : rawactions) {
            if (rawaction == Action.Fold && rawactions.size() == 1) {
                realacttions.add(Action.Fold);
                return realacttions;
            }
        }
        return realacttions;
    }

}
