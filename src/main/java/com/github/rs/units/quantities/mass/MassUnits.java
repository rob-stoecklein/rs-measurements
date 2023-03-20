package com.github.rs.units.quantities.mass;

import com.github.rs.units.units.MathConstants;
import com.github.rs.units.units.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-17
 */
public class MassUnits extends Units {

    public MassUnits(String name, String abbr, double scale) {
        super(MEASURE_MASS, name, abbr, scale, 0.0);
    }

    //------ US --------------------------------------------------------------------------------------------------------

    public static class Ounces extends MassUnits {
        protected Ounces() {
            super("ounce", "oz", MathConstants.OUNCES_PER_KILOGRAM);
        }
    }

    public static class Pounds extends MassUnits {
        protected Pounds() {
            super("pound", "lb", MathConstants.POUNDS_PER_KILOGRAM);
        }
    }

    public static class Tons extends MassUnits {
        protected Tons() {
            super("ton", "t", MathConstants.TONS_PER_KILOGRAM);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class Milligrams extends MassUnits {
        protected Milligrams() {
            super("milligrams", "g", MathConstants.NUM_MICROS);
        }
    }

    public static class Grams extends MassUnits {
        protected Grams() {
            super("grams", "g", MathConstants.NUM_MILLIS);
        }
    }

    public static class Kilograms extends MassUnits {
        protected Kilograms() {
            super("kilograms", "kg", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class MetricTons extends MassUnits {
        protected MetricTons() {
            super("metric ton", "t", MathConstants.NUM_KILOS);
        }
    }
}
