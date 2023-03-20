package com.github.rs.units.quantities.voltage;

import com.github.rs.units.quantities.Units;
import com.github.rs.units.util.MathConstants;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class VoltageUnits extends Units {

    public VoltageUnits(String name, String abbr, Number scale) {
        super(MEASURE_VOLTAGE, name, abbr, scale, 0.0);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static class Microvolts extends VoltageUnits {
        protected Microvolts() {
            super("microvolt", "µV", MathConstants.NUM_MICROS);
        }
    }

    public static class Millivolts extends VoltageUnits {
        protected Millivolts() {
            super("millivolt", "mV", MathConstants.NUM_MILLIS);
        }
    }

    public static class Volts extends VoltageUnits {
        protected Volts() {
            super("volt", "V", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class Kilovolts extends VoltageUnits {
        protected Kilovolts() {
            super("kilovolt", "KV", MathConstants.NUM_KILOS);
        }
    }

    public static class Megavolts extends VoltageUnits {
        protected Megavolts() {
            super("megavolt", "MV", MathConstants.NUM_MEGAS);
        }
    }

    public static class Gigavolts extends VoltageUnits {
        protected Gigavolts() {
            super("gigavolt", "GV", MathConstants.NUM_GIGAS);
        }
    }

    public static class Teravolts extends VoltageUnits {
        protected Teravolts() {
            super("teravolt", "TV", MathConstants.NUM_TERAS);
        }
    }

    public static class Petavolts extends VoltageUnits {
        protected Petavolts() {
            super("petavolt", "PV", MathConstants.NUM_PETAS);
        }
    }

    public static class Exavolts extends VoltageUnits {
        protected Exavolts() {
            super("exavolt", "EV", MathConstants.NUM_EXAS);
        }
    }
}
