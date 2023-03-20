package com.github.rs.units.quantities.speed;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class SpeedUnits extends Units {

    public SpeedUnits(String name, String abbr, Number scale) {
        super(MEASURE_SPEED, name, abbr, scale, 0.0);
    }

    //------ US --------------------------------------------------------------------------------------------------------

    public static class MilesPerHour extends SpeedUnits {
        protected MilesPerHour() {
            super("miles-per-hour", "mph", 0);
        }
    }

    public static class FeetPerSecond extends SpeedUnits {
        protected FeetPerSecond() {
            super("feet-per-second", "fps", 0);
        }
    }

    public static class Knots extends SpeedUnits {
        protected Knots() {
            super("knots", "kn", 0);
        }
    }

    //------ SI --------------------------------------------------------------------------------------------------------

    public static class KilometersPerHour extends SpeedUnits {
        protected KilometersPerHour() {
            super("kilometers-per-hour", "kph", 0);
        }
    }

    public static class MetersPerSecond extends SpeedUnits {
        protected MetersPerSecond() {
            super("meters-per-second", "mps", 0);
        }
    }

    public static class Mach extends SpeedUnits {
        protected Mach() {
            super("mach", "mach", 0);
        }
    }
}
