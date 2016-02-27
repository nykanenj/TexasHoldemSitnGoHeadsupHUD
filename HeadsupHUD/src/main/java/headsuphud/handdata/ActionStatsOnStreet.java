/**
 *
 * Luokka pitaa sisallaan tietyllä streetillä tehdyt pelaajan komennot.
 */
package headsuphud.handdata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionStatsOnStreet {

    private final Street street;
    private Map<Action, Integer> actions;
    private int count;

    /**
     * Konstruktori.
     *
     * @param street Street, jolla pelaajan actionit tapahtuvat
     *
     */
    public ActionStatsOnStreet(Street street) {
        this.street = street;
        actions = new HashMap<>();
        for (Action action : Action.values()) {
            actions.put(action, 0);
        }
        count = 0;
    }

    /**
     * Metodi lisaa tallennettavan komennon komentoja sisaltavaan listaan.
     *
     * @param action Tallennettava komento
     *
     */
    public void addAction(Action action) {
        actions.put(action, actions.get(action) + 1);
    }

    public void increase() {
        count++;
    }

    /**
     * Metodi antaa karkeaa statistiikkaa miten usein tiettyä komentoa on tehty.
     *
     * @param action Komento, josta halutaan tietää statistiikkaa.
     *
     * @return Miten usein pelaaja on käyttänyt tätä komentoa suhteessa muihin
     * komentoihin.
     */
    public String stats(Action action) {
        if (count == 0) {
            return "-";
        }
        return (int) (actions.get(action) * 100.0 / count) + "%";
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
