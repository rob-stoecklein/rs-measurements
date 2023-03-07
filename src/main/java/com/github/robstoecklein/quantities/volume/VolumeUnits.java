package com.github.robstoecklein.quantities.volume;

import com.github.robstoecklein.units.MathConstants;
import com.github.robstoecklein.units.Unit;

public class VolumeUnits extends Unit {

    public VolumeUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(MEASURE_VOLUME, name, plural, abbr, scale, offset, 0, isStandard);
    }

    public static class Liters extends VolumeUnits {
        public Liters() {
            super("liter", "liters", "l", 1.0, 0.0, true);
        }
    }

    public static class MilliLiters extends VolumeUnits {
        public MilliLiters() {
            super("milliliter", "milliliters", "ml", MathConstants.MILLILITERS_PER_LITER, 0.0, false);
        }
    }

    public static class FluidOunces extends VolumeUnits {
        public FluidOunces() {
            super("fluid ounce", "fluid ounces", "fl oz", MathConstants.OUNCES_PER_LITER, 0.0, false);
        }
    }

    public static class Cups extends VolumeUnits {
        public Cups() {
            super("cup", "cups", "c", MathConstants.CUPS_PER_LITER, 0.0, false);
        }
    }

    public static class Pints extends VolumeUnits {
        public Pints() {
            super("pint", "pints", "p", MathConstants.PINTS_PER_LITER, 0.0, false);
        }
    }

    public static class Quarts extends VolumeUnits {
        public Quarts() {
            super("quart", "quarts", "q", MathConstants.QUARTS_PER_LITER, 0.0, false);
        }
    }

    public static class Gallons extends VolumeUnits {
        public Gallons() {
            super("gallon", "gallons", "g", MathConstants.GALLONS_PER_LITER, 0.0, false);
        }
    }
}
