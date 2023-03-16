package com.github.robstoecklein.measurements.quantities.volume;

import com.github.robstoecklein.measurements.units.MathConstants;
import com.github.robstoecklein.measurements.units.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public class VolumeUnits extends Units {

    public VolumeUnits(String name, String abbr, double scale) {
        super(MEASURE_VOLUME, name, abbr, scale, 0.0);
    }

    public static class Liters extends VolumeUnits {
        public Liters() {
            super("liter", "l", 1.0);
        }
    }

    public static class Milliliters extends VolumeUnits {
        public Milliliters() {
            super("milliliter", "ml", MathConstants.MILLILITERS_PER_LITER);
        }
    }

    public static class FluidOunces extends VolumeUnits {
        public FluidOunces() {
            super("fluid ounce", "fl oz", MathConstants.OUNCES_PER_LITER);
        }
    }

    public static class Cups extends VolumeUnits {
        public Cups() {
            super("cup", "c", MathConstants.CUPS_PER_LITER);
        }
    }

    public static class Pints extends VolumeUnits {
        public Pints() {
            super("pint", "p", MathConstants.PINTS_PER_LITER);
        }
    }

    public static class Quarts extends VolumeUnits {
        public Quarts() {
            super("quart", "q", MathConstants.QUARTS_PER_LITER);
        }
    }

    public static class Gallons extends VolumeUnits {
        public Gallons() {
            super("gallon", "g", MathConstants.GALLONS_PER_LITER);
        }
    }
}
