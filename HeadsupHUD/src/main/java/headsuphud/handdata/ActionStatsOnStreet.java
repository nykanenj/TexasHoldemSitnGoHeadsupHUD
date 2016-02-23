/**
 *
 * Luokka pitaa sisallaan tietyllä streetillä tehdyt pelaajan komennot.
 */
package headsuphud.handdata;

import static headsuphud.handdata.Action.*;
import java.util.ArrayList;
import java.util.List;

public class ActionStatsOnStreet {

    private final Street street;
    private List<Action> actions;
    private int count;

    /**
     * Konstruktori.
     *
     * @param street Street, jolla pelaajan actionit tapahtuvat
     *
     */
    public ActionStatsOnStreet(Street street) {
        this.street = street;
        actions = new ArrayList<>();
    }

    /**
     * Metodi lisaa tallennettavan komennon komentoja sisaltavaan listaan.
     *
     * @param action Tallennettava komento
     *
     */
    public void addAction(Action action) {
        if (action == Fold || action == Check || action == Raise) {  //PROBLEM: We should count calls when someone donk bets us! 
            count++;
        }
        actions.add(action);
    }

    public List<Action> getActions() {
        return actions;
    }

    /**
     * Metodi antaa karkeaa statistiikkaa miten usein tiettyä komentoa on tehty.
     *
     * @param action Komento, josta halutaan tietää statistiikkaa.
     *
     * @return Miten usein pelaaja on käyttänyt tätä komentoa suhteessa muihin
     * komentoihin.
     */
    public double stats(Action action) {
        if (count == 0) {
            return -1;
        }

        int occurrences = 0;
        for (Action actioninstance : actions) {
            if (actioninstance == action) {
                occurrences++;
            }
        }
        return occurrences / count;
    }

    /**
     * Metodi tulostaa kaiken pelaajaan liittyvän statistiikan tällä streetillä.
     *
     */
    public String allStats() {
        String stats = "";
        for (Action action : Action.values()) {
            stats += action + ": " + stats(action) + "\n";

        }
        return stats;
    }

}
