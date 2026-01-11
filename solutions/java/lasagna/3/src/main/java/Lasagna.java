public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(final int actualMinutes) {
        return this.expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(final int layers) {
        return layers*2;
    }

    public int totalTimeInMinutes(final int layers, final int actualMinutes) {
        return (this.preparationTimeInMinutes(layers) + actualMinutes);
    }
}
