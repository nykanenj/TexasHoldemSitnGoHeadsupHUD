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
public class Playerstats {
    private Positionstats smallblindstats;
    private Positionstats bigblindstats;
    

    public Playerstats() {
        smallblindstats = new Positionstats();
        bigblindstats = new Positionstats();
    }

    public Positionstats getSmallblindstats() {
        return smallblindstats;
    }

    public Positionstats getBigblindstats() {
        return bigblindstats;
    }
    
    public Positionstats getStats(Position position) {
        if (position == Position.SmallBlind) {
            return getSmallblindstats();
        } else {
            return getBigblindstats();
        }
        
    }
    
    
    
    
    
}
