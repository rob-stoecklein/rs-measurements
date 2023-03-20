package com.github.rs.units.quantities.current;

import com.github.rs.units.quantities.Units;
import com.github.rs.units.util.MathConstants;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class CurrentUnits extends Units {

    public CurrentUnits(String name, String abbr, Number scale) {
        super(MEASURE_CURRENT, name, abbr, scale, 0.0);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static class Microamps extends CurrentUnits {
        protected Microamps() {
            super("microamp", "µA", MathConstants.NUM_MICROS);
        }
    }

    public static class Milliamps extends CurrentUnits {
        protected Milliamps() {
            super("milliamp", "mA", MathConstants.NUM_MILLIS);
        }
    }

    public static class Amps extends CurrentUnits {
        protected Amps() {
            super("ampere", "A", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class Kiloamps extends CurrentUnits {
        protected Kiloamps() {
            super("kiloamp", "KA", MathConstants.NUM_KILOS);
        }
    }

    public static class Megaamps extends CurrentUnits {
        protected Megaamps() {
            super("megaamp", "MA", MathConstants.NUM_MEGAS);
        }
    }

    public static class Gigaamps extends CurrentUnits {
        protected Gigaamps() {
            super("gigaamp", "GA", MathConstants.NUM_GIGAS);
        }
    }

    public static class Teraamps extends CurrentUnits {
        protected Teraamps() {
            super("teraamp", "TA", MathConstants.NUM_TERAS);
        }
    }

    public static class Petaamps extends CurrentUnits {
        protected Petaamps() {
            super("petaamp", "PA", MathConstants.NUM_PETAS);
        }
    }

    public static class Exaamps extends CurrentUnits {
        protected Exaamps() {
            super("exaamp", "EA", MathConstants.NUM_EXAS);
        }
    }
}
