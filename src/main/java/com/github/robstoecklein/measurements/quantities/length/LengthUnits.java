package com.github.robstoecklein.measurements.quantities.length;

import com.github.robstoecklein.measurements.units.MathConstants;
import com.github.robstoecklein.measurements.units.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class LengthUnits extends Units {

    public LengthUnits(String name, String abbr, double scale) {
        super(MEASURE_LENGTH, name, abbr, scale, 0.0);
    }

    //------ US --------------------------------------------------------------------------------------------------------

    public static class Inches extends LengthUnits {
        public Inches() {
            super("inches", "in", MathConstants.INCHES_PER_METER);
        }
    }

    public static class Feet extends LengthUnits {
        public Feet() {
            super("feet", "ft", MathConstants.FEET_PER_METER);
        }
    }

    public static class Yards extends LengthUnits {
        public Yards() {
            super("yards", "yd", MathConstants.YARDS_PER_METER);
        }
    }

    public static class Miles extends LengthUnits {
        public Miles() {
            super("miles", "mi", MathConstants.MILES_PER_METER);
        }
    }

    public static class NauticalMiles extends LengthUnits {
        public NauticalMiles() {
            super("nautical miles", "nmi", MathConstants.NAUTICAL_MILES_PER_METER);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class Nanometers extends LengthUnits {
        public Nanometers() {
            super("nanometers", "nm", MathConstants.NUM_NANOS);
        }
    }

    public static class Micrometers extends LengthUnits {
        public Micrometers() {
            super("micrometers", "µm", MathConstants.NUM_MICROS);
        }
    }

    public static class Millimeters extends LengthUnits {
        public Millimeters() {
            super("millimeters", "mm", MathConstants.NUM_MILLIS);
        }
    }

    public static class Centimeters extends LengthUnits {
        public Centimeters() {
            super("centimeters", "cm", MathConstants.NUM_CENTIS);
        }
    }

    public static class Decimeters extends LengthUnits {
        public Decimeters() {
            super("decimeters", "dm", MathConstants.NUM_DECIS);
        }
    }

    public static class Meters extends LengthUnits {
        public Meters() {
            super("meters", "m", MathConstants.NUM_STD);
        }
    }

    public static class Kilometers extends LengthUnits {
        public Kilometers() {
            super("kilometers", "km", MathConstants.NUM_KILOS);
        }
    }
}
