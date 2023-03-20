package com.github.rs.units.quantities.power;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class PowerUnits extends Units {

    public PowerUnits(String name, String abbr, Number scale) {
        super(MEASURE_POWER, name, abbr, scale, 0.0);
    }

    //------ US --------------------------------------------------------------------------------------------------------

    public static class Horsepower extends PowerUnits {
        protected Horsepower() {
            super("horsepower", "hp", 0);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class Watts extends PowerUnits {
        protected Watts() {
            super("watt", "W", 0);
        }
    }

    public static class Kilowatts extends PowerUnits {
        protected Kilowatts() {
            super("kilowatt", "KW", 0);
        }
    }

    public static class Megawatts extends PowerUnits {
        protected Megawatts() {
            super("megawatt", "MW", 0);
        }
    }

    public static class Gigawatts extends PowerUnits {
        protected Gigawatts() {
            super("gigawatt", "GW", 0);
        }
    }

    public static class Terawatts extends PowerUnits {
        protected Terawatts() {
            super("terawatt", "TW", 0);
        }
    }

    public static class Petawatts extends PowerUnits {
        protected Petawatts() {
            super("petawatt", "PW", 0);
        }
    }

    public static class Exawatts extends PowerUnits {
        protected Exawatts() {
            super("exawatt", "EW", 0);
        }
    }
}
