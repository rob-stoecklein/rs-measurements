package com.github.rs.units.quantities.frequency;

import com.github.rs.units.util.MathConstants;
import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public abstract class FrequencyUnits extends Units {

    public FrequencyUnits(String name, String abbr, Number scale) {
        super(MEASURE_FREQUENCY, name, abbr, scale, 0.0);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static class Microhertz extends FrequencyUnits {
        protected Microhertz() {
            super("microhertz", "µHz", MathConstants.NUM_MICROS);
        }
    }

    public static class Millihertz extends FrequencyUnits {
        protected Millihertz() {
            super("millihertz", "mHz", MathConstants.NUM_MILLIS);
        }
    }

    public static class Hertz extends FrequencyUnits {
        protected Hertz() {
            super("hertz", "Hz", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class Kilohertz extends FrequencyUnits {
        protected Kilohertz() {
            super("kilohertz", "KHz", MathConstants.NUM_KILOS);
        }
    }

    public static class Megahertz extends FrequencyUnits {
        protected Megahertz() {
            super("megahertz", "MHz", MathConstants.NUM_MEGAS);
        }
    }

    public static class Gigahertz extends FrequencyUnits {
        protected Gigahertz() {
            super("gigahertz", "GHz", MathConstants.NUM_GIGAS);
        }
    }

    public static class Terahertz extends FrequencyUnits {
        protected Terahertz() {
            super("terahertz", "THz", MathConstants.NUM_TERAS);
        }
    }

    public static class Petahertz extends FrequencyUnits {
        protected Petahertz() {
            super("petahertz", "PHz", MathConstants.NUM_PETAS);
        }
    }

    public static class Exahertz extends FrequencyUnits {
        protected Exahertz() {
            super("exahertz", "EHz", MathConstants.NUM_EXAS);
        }
    }
}
