/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handAnalysis;

import headsuphud.handData.Player;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juuso
 */
public class Handanalyzer {
    private Map<String, Player> nameplayermap;

    public Handanalyzer() {
        this.nameplayermap = new HashMap<>();
    }
    
    public void addPlayer(String name, Player player) {
        
    }
    
    public boolean playerFound(String playername) {
        for (String name : nameplayermap.keySet()) {
            if (name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
      
    }



    public String playerStats(String playername) {
        return nameplayermap.get(playername).stats();  
    }

    public String playerNames() {
        String names = "";
        //go through a list of players and add to 
        for (String name: nameplayermap.keySet()) {
            names += name + "\n";
        }
        
        if (names.equals("")) {
            return "No playerdata! Hence, no players to be listed";
        }
        
        return names;
    }
    
}
