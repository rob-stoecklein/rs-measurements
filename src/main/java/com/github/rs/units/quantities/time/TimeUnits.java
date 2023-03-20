package com.github.rs.units.quantities.time;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class TimeUnits extends Units {

    public TimeUnits(String name, String abbr, Number scale) {
        super(MEASURE_TIME, name, abbr, scale, 0.0);
    }

    //------------------------------------------------------------------------------------------------------------------

    public static class FemtoSeconds extends TimeUnits {
        protected FemtoSeconds() {
            super("femtosecond", "fsec", 0);
        }
    }

    public static class PicoSeconds extends TimeUnits {
        protected PicoSeconds() {
            super("picosecond", "psec", 0);
        }
    }

    public static class NanoSeconds extends TimeUnits {
        protected NanoSeconds() {
            super("nanosecond", "nsec", 0);
        }
    }

    public static class MicroSeconds extends TimeUnits {
        protected MicroSeconds() {
            super("microsecond", "µsec", 0);
        }
    }

    public static class MilliSeconds extends TimeUnits {
        protected MilliSeconds() {
            super("millisecond", "msec", 0);
        }
    }

    public static class Seconds extends TimeUnits {
        protected Seconds() {
            super("second", "sec", 0);
        }
    }

    public static class Minutes extends TimeUnits {
        protected Minutes() {
            super("minute", "min", 0);
        }
    }

    public static class Hours extends TimeUnits {
        protected Hours() {
            super("hour", "hr", 0);
        }
    }

    public static class Days extends TimeUnits {
        protected Days() {
            super("day", "da", 0);
        }
    }

    public static class Weeks extends TimeUnits {
        protected Weeks() {
            super("week", "wk", 0);
        }
    }

    public static class Fortnights extends TimeUnits {
        protected Fortnights() {
            super("fortnight", "fn", 0);
        }
    }

    public static class Months extends TimeUnits {
        protected Months() {
            super("month", "mon", 0);
        }
    }

    public static class Years extends TimeUnits {
        protected Years() {
            super("year", "yr", 0);
        }
    }

    public static class Decades extends TimeUnits {
        protected Decades() {
            super("decade", "dec", 0);
        }
    }

    public static class Century extends TimeUnits {
        protected Century() {
            super("century", "cen", 0);
        }
    }
}
