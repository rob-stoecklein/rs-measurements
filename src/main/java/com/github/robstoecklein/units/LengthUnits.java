package com.github.robstoecklein.units;

public abstract class LengthUnits extends Unit {

    public LengthUnits(String name, String plural, String abbr, double scale, boolean isStandard) {
        super(name, plural, abbr, scale, 0.0, 0, isStandard);
    }

    public static class Inches extends LengthUnits {
        public Inches() {
            super("inch", "inches", "in", MathConstants.INCHES_PER_METER, false);
        }
    }

    public static class Feet extends LengthUnits {
        public Feet() {
            super("foot", "feet", "ft", MathConstants.FEET_PER_METER, false);
        }
    }

    public static class Yards extends LengthUnits {
        public Yards() {
            super("yard", "yards", "yd", MathConstants.YARDS_PER_METER, false);
        }
    }

    public static class Meters extends LengthUnits {
        public Meters() {
            super("meter", "meters", "m", 1.0, true);
        }
    }

    public static class Miles extends LengthUnits {
        public Miles() {
            super("mile", "miles", "mi", MathConstants.MILES_PER_METER, false);
        }
    }
}
