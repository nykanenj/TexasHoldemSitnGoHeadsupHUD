/**
 *
 * Luokka tuottaaa erilaisia tilastoja datastoragessa olevasta tiedosta
 */
package headsuphud.handanalysis;

import headsuphud.handdata.DataStorage;

/**
 *
 * @author Juuso
 */
public class Handanalyzer {

    private DataStorage datastorage;

    public Handanalyzer(DataStorage datastorage) {
        this.datastorage = datastorage;
    }

    public boolean playerFound(String name) {
        return this.datastorage.playerFound(name);
    }

    public String allPlayerStats(String answer) {
        return datastorage.allPlayerStats(answer);
    }

    public String playerNames() {
        return datastorage.playerNames();
    }

}
