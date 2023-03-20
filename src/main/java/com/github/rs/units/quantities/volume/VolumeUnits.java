package com.github.rs.units.quantities.volume;

import com.github.rs.units.util.MathConstants;
import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-17
 */
public class VolumeUnits extends Units {

    public VolumeUnits(String name, String abbr, Number scale) {
        super(MEASURE_VOLUME, name, abbr, scale, 0.0);
    }

    //------ US --------------------------------------------------------------------------------------------------------

    public static class FluidOunces extends VolumeUnits {
        protected FluidOunces() {
            super("fluid ounce", "fl oz", MathConstants.OUNCES_PER_LITER);
        }
    }

    public static class Cups extends VolumeUnits {
        protected Cups() {
            super("cup", "c", MathConstants.CUPS_PER_LITER);
        }
    }

    public static class Pints extends VolumeUnits {
        protected Pints() {
            super("pint", "p", MathConstants.PINTS_PER_LITER);
        }
    }

    public static class Quarts extends VolumeUnits {
        protected Quarts() {
            super("quart", "q", MathConstants.QUARTS_PER_LITER);
        }
    }

    public static class Gallons extends VolumeUnits {
        protected Gallons() {
            super("gallon", "g", MathConstants.GALLONS_PER_LITER);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class Milliliters extends VolumeUnits {
        protected Milliliters() {
            super("milliliter", "ml", MathConstants.MILLILITERS_PER_LITER);
        }
    }

    public static class Liters extends VolumeUnits {
        protected Liters() {
            super("liter", "l", MathConstants.NUM_STD);  // STANDARD
        }
    }
}
