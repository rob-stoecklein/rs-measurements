package com.github.rs.units.quantities.pressure;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class PressureUnits extends Units {

    public PressureUnits(String name, String abbr, Number scale) {
        super(MEASURE_PRESSURE, name, abbr, scale, 0.0);
    }

    //------ US --------------------------------------------------------------------------------------------------------

    public static class PSI extends PressureUnits {
        protected PSI() {
            super("pounds-per-square-inch", "psi", 0);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class Millibars extends PressureUnits {
        protected Millibars() {
            super("millibars", "mb", 0);
        }
    }

    public static class Centibars extends PressureUnits {
        protected Centibars() {
            super("Centibars", "cb", 0);
        }
    }

    public static class Decibars extends PressureUnits {
        protected Decibars() {
            super("decibars", "db", 0);
        }
    }

    public static class Bars extends PressureUnits {
        protected Bars() {
            super("bars", "b", 0);
        }
    }

    public static class Kilobars extends PressureUnits {
        protected Kilobars() {
            super("kilobars", "Kb", 0);
        }
    }

    public static class Megabars extends PressureUnits {
        protected Megabars() {
            super("megabars", "Mb", 0);
        }
    }

    public static class Gigabars extends PressureUnits {
        protected Gigabars() {
            super("gigabars", "Gb", 0);
        }
    }
}
