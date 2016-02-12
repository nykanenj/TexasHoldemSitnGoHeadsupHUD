/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

import static headsuphud.handData.Street.*;

/**
 *
 * @author Juuso
 */
public class Positionstats {
    private ActionStatsOnStreet[] allstreetsstats;

    public Positionstats() {
        allstreetsstats = new ActionStatsOnStreet[4];
        
        int index = 0;
        for (Street street : Street.values()) {
            allstreetsstats[index] = new ActionStatsOnStreet(street);
            index++;
        }
    }
    
    public ActionStatsOnStreet getStatsFrom(Street street) {
        return allstreetsstats[street.getStreetValue()];
    }


            
    
}
