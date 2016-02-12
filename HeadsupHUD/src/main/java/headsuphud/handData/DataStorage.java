/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juuso
 */
public class DataStorage {

    private Map<String, Player> nameplayermap;

    public DataStorage() {
        this.nameplayermap = new HashMap<>();
    }

    public void addPlayer(String name) {
        if (!playerFound(name)) {
            nameplayermap.put(name, new Player(name));
        }
    }

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
    
    public String playerStats(String name) {
        return nameplayermap.get(name).stats();
    }

    public String playerNames() {
        String names = "";
        //go through a list of players and add to 
        for (String name : nameplayermap.keySet()) {
            names += name + "\n";
        }

        if (names.equals("")) {
            return "No playerdata! Hence, no players to be listed";
        }

        System.out.println(names);
        return names;
    }
}
