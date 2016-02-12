/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headsuphud.handdata;

/**
 *
 * @author Juuso
 */
public enum Street {

    Preflop(0), Flop(1), Turn(2), River(3);

    private final int streetValue;

    Street(int value) {
        this.streetValue = value;
    }

    public int getStreetValue() {
        return this.streetValue;
    }
}
