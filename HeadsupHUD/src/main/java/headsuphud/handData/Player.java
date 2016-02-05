/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

/**
 *
 * @author Juuso
 */
public class Player {
    private String playername;
    private Playerstats playerstats;

    

    public Player(String playername) {      
        this.playername = playername;
        this.playerstats = new Playerstats();

    }

    public String getName() {
        return playername;
    }

    public Playerstats getPlayerstats() {
        return playerstats;
    }
    
    

    public String stats() {
        return "";
    
    }

    
    
}
