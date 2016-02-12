/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handData;

import static headsuphud.handData.Action.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juuso
 */
public class ActionStatsOnStreet {

    private final Street street;
    private List<Action> actions;
    private int count;

    public ActionStatsOnStreet(Street street) {
        this.street = street;
        actions = new ArrayList<>();
    }

    public void addAction(Action action) {
        if (action == Fold || action == Check || action == Raise) {  //PROBLEM: We should count calls when someone donk bets us! 
            count++;
        }

        actions.add(action);
    }
    
    public List<Action> getActions() {
        return actions;
    }

    public double Stats(Action action) {
        if (count == 0) {
            return -1;
        }
        
        int occurrences = 0;
        for (Action actioninstance : actions) {
            if (actioninstance == action) {
                occurrences++;
            }
        }
        return occurrences / count;
        //System.out.println(actions.stream().filter(a -> a == action ).count());
        //return actions.stream().filter(a -> a == action).count() / count;
    }

}
