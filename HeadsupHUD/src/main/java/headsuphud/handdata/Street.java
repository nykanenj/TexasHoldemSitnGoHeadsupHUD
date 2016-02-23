/*
 * Enum kuvaa streettejä.
 */
package headsuphud.handdata;

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
