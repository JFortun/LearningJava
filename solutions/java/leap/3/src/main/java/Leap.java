class Leap {

    boolean isLeapYear(int year) {
        final var divisibleBy4 = this.isDivisibleBy4(year);
        final var divisibleBy100 = this.isDivisibleBy100(year);
        final var divisibleBy400 = this.isDivisibleBy400(year);
        return divisibleBy4 ? this.specialCase(divisibleBy100, divisibleBy400) : false;
    }

    boolean isDivisibleBy4(final int year) {
        return (year % 4) == 0;
    }

    boolean isDivisibleBy100(final int year) {
        return (year % 100) == 0;
    }

    boolean isDivisibleBy400(final int year) {
        return (year % 400) == 0;
    }

    boolean specialCase(final boolean divisibleBy100, final boolean divisibleBy400) {
        return divisibleBy100 ? divisibleBy400 : true;
    }

}
