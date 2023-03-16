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
        protected Inches() {
            super("inches", "in", MathConstants.INCHES_PER_METER);
        }
    }

    public static class Feet extends LengthUnits {
        protected Feet() {
            super("feet", "ft", MathConstants.FEET_PER_METER);
        }
    }

    public static class Yards extends LengthUnits {
        protected Yards() {
            super("yards", "yd", MathConstants.YARDS_PER_METER);
        }
    }

    public static class Miles extends LengthUnits {
        protected Miles() {
            super("miles", "mi", MathConstants.MILES_PER_METER);
        }
    }

    public static class NauticalMiles extends LengthUnits {
        protected NauticalMiles() {
            super("nautical miles", "nmi", MathConstants.NAUTICAL_MILES_PER_METER);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class Nanometers extends LengthUnits {
        protected Nanometers() {
            super("nanometers", "nm", MathConstants.NUM_NANOS);
        }
    }

    public static class Micrometers extends LengthUnits {
        protected Micrometers() {
            super("micrometers", "µm", MathConstants.NUM_MICROS);
        }
    }

    public static class Millimeters extends LengthUnits {
        protected Millimeters() {
            super("millimeters", "mm", MathConstants.NUM_MILLIS);
        }
    }

    public static class Centimeters extends LengthUnits {
        protected Centimeters() {
            super("centimeters", "cm", MathConstants.NUM_CENTIS);
        }
    }

    public static class Decimeters extends LengthUnits {
        protected Decimeters() {
            super("decimeters", "dm", MathConstants.NUM_DECIS);
        }
    }

    public static class Meters extends LengthUnits {
        protected Meters() {
            super("meters", "m", MathConstants.NUM_STD);
        }
    }

    public static class Kilometers extends LengthUnits {
        protected Kilometers() {
            super("kilometers", "km", MathConstants.NUM_KILOS);
        }
    }
}
