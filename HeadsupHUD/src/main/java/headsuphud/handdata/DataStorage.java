/*
 * Luokkaa on yliluokka kaikelle tallennettavalle tiedolle pokeri käsihistoriaan liittyen
 */
package headsuphud.handdata;

import java.util.HashMap;
import java.util.Map;

public class DataStorage {

    private Map<String, Player> nameplayermap;

    /**
     * Konstruktori luokalle DataStorage.
     *
     */
    public DataStorage() {
        this.nameplayermap = new HashMap<>();
    }

    /**
     * Metodi lisää kyseisen nimisen pelaajan tämän luokan HashMappiin, jos
     * pelaajaa ei löydy ennestään.
     *
     * @param name Lisätttävän pelaajan nimi.
     */
    public void addPlayer(String name) {
        if (!playerFound(name)) {
            nameplayermap.put(name, new Player(name));
        }
    }

    /**
     * Metodi kertoo löytyykö hashmapistä tämännimistä pelaajaa.
     *
     * @param playername Nimi, jonka perusteella halutaan etsiä.
     *
     * @return Löytyikö tämännimistä pelaajaa voi ei.
     */
    public boolean playerFound(String playername) {
        for (String name : nameplayermap.keySet()) {
            if (name.equalsIgnoreCase(playername)) {
                return true;
            }
        }
        return false;

    }

    public Player getPlayer(String name) {
        if (nameplayermap.keySet().contains(name)) {
            return nameplayermap.get(name);
        }
        return null;

    }

    /**
     * Metodi palauttaa kaiken pelaajaan liittyvän statistiikan tekstimuodossa.
     *
     * @param name Pelaajan nimi.
     *
     * @return Statistiikka tekstimuodossa.
     */
    public String allPlayerStats(String name) {
        return nameplayermap.get(name).allPlayerStats();
    }

    /**
     * Metodi listaa kaikki pelaajat.
     *
     * @return Pelaajien nimet tekstimuodossa.
     */
    public String playerNames() {
        String names = "";
        //go through a list of players and add to 
        for (String name : nameplayermap.keySet()) {
            names += name + "\n";
        }

        if (names.equals("")) {
            return "No playerdata! Hence, no players to be listed";
        }

        return names;
    }
}
