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

}
