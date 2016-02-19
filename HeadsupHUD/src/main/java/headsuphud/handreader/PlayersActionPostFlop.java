package headsuphud.handreader;

import headsuphud.handdata.Action;
import headsuphud.handdata.Position;
import java.util.ArrayList;

/**
 * HandHistoryTextToObjectsConverter käyttää tätä luokkaa pelaajan actionien
 * tulkitsemiseen
 */
public class PlayersActionPostFlop {

    private ArrayList<Action> rawactions;
    private ArrayList<Action> realacttions;
    private Position position;

    public PlayersActionPostFlop(Position position) {
        this.position = position;
        rawactions = new ArrayList<>();
        realacttions = new ArrayList<>();
    }

    public void add(Action a) {
        rawactions.add(a);
    }

    /**
     * Kun kaikki käden aikana tapahtuneet komennot on luettu, aja tämä metodi.
     * Tämä metodi luo ArrayListin, joka kuvaa pelaajan tekemiä actioneitä käden
     * aikana.
     *
     */
    public ArrayList<Action> generateRealActionsForStreet() {

        for (Action rawaction : rawactions) {
            if (rawaction == Action.Fold && rawactions.size() == 1 && position == Position.SmallBlind) {
                realacttions.add(Action.Fold);
                return realacttions;
            }
        }
        return realacttions;
    }

}
