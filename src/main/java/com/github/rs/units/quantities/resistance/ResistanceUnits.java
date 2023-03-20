package com.github.rs.units.quantities.resistance;

import com.github.rs.units.quantities.Units;
import com.github.rs.units.util.MathConstants;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class ResistanceUnits extends Units {

    public ResistanceUnits(String name, String abbr, Number scale) {
        super(MEASURE_RESISTANCE, name, abbr, scale, 0.0);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static class Microohms extends ResistanceUnits {
        protected Microohms() {
            super("microohm", "µΩ", MathConstants.NUM_MICROS);
        }
    }

    public static class Milliohms extends ResistanceUnits {
        protected Milliohms() {
            super("milliohm", "mΩ", MathConstants.NUM_MILLIS);
        }
    }

    public static class Ohms extends ResistanceUnits {
        protected Ohms() {
            super("ohm", "Ω", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class Kiloohms extends ResistanceUnits {
        protected Kiloohms() {
            super("kiloohm", "KΩ", MathConstants.NUM_KILOS);
        }
    }

    public static class Megaohms extends ResistanceUnits {
        protected Megaohms() {
            super("megaohm", "MΩ", MathConstants.NUM_MEGAS);
        }
    }
}
