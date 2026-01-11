public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(final int actualMinutes) {
        return this.expectedMinutesInOven() - actualMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(final int layers) {
        return layers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(final int layers, final int actualMinutes) {
        return ((2*layers) + actualMinutes);
    }
}
