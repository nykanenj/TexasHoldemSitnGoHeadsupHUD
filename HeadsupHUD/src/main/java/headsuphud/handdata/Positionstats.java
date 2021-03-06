/**
 * Luokka pitää sisällään tiedon kaikista eri streeteistä, jokaisella streetillä
 * on oma olio.
 */
package headsuphud.handdata;

import static headsuphud.handdata.Street.*;

public class Positionstats {

    private ActionStatsOnStreet[] allstreetsstats;

    /**
     * Konstruktori luo valmiiksi taulukkoon olion jokaiselle streetille..
     */
    public Positionstats() {
        allstreetsstats = new ActionStatsOnStreet[4];

        int index = 0;
        for (Street street : Street.values()) {
            allstreetsstats[index] = new ActionStatsOnStreet(street);
            index++;
        }
    }

    /**
     * Metodi palauttaa statistiikkaa sisältävän olion kyseiseltä streetiltä.
     *
     * @param street Halutaan statistiikka tältä streetiltä.
     *
     * @return palauttaa statistiikkaolion halutulta streetiltä.
     */
    public ActionStatsOnStreet getStatsFrom(Street street) {
        return allstreetsstats[street.getStreetValue()];
    }

    /**
     * Metodi palauttaa statistiikkaa sisältävän olion kyseiseltä streetiltä.
     *
     * @param street Halutaan statistiikka tältä streetiltä.
     *
     * @return palauttaa statistiikkaolion halutulta streetiltä.
     */
    public String getStatsAsStringFrom(Street street) {
        return allstreetsstats[street.getStreetValue()].allStats();
    }

    /**
     * Metodi palauttaa statistiikan kaikilta streeteiltä.
     *
     * @return palauttaa statistiikan string muodossa rivitettynä.
     */
    public String allStats() {
        String stats = "";
        int index = 0;
        for (Street street : Street.values()) {
            stats += street + "\n";
            stats += allstreetsstats[index].allStats();
            index++;
        }

        return stats;
    }
}
