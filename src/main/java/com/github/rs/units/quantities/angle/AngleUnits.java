package com.github.rs.units.quantities.angle;

import com.github.rs.units.util.MathConstants;
import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class AngleUnits extends Units {

    public AngleUnits(String name, String abbr, double scale) {
        super(MEASURE_ANGLE, name, abbr, scale, 0.0);
    }

    //------ Degrees ---------------------------------------------------------------------------------------------------

    public static class Degrees extends AngleUnits {
        protected Degrees() {
            super("degrees", "deg", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class ArcMinutes extends AngleUnits {
        protected ArcMinutes() {
            super("arc minute", "a-min", MathConstants.ARC_MINUTES_PER_DEGREE);
        }
    }

    public static class ArcSeconds extends AngleUnits {
        protected ArcSeconds() {
            super("arc second", "a-sec", MathConstants.ARC_SECONDS_PER_DEGREE);
        }
    }

    public static class MilliarcSeconds extends AngleUnits {
        protected MilliarcSeconds() {
            super("milliarc second", "ma-sec", MathConstants.MILLI_ARC_SECONDS_PER_DEGREE);
        }
    }

    public static class MicroarcSeconds extends AngleUnits {
        protected MicroarcSeconds() {
            super("microarc second", "µa-sec", MathConstants.MICRO_ARC_SECONDS_PER_DEGREE);
        }
    }

    //------ Radians ---------------------------------------------------------------------------------------------------

    public static class Radians extends AngleUnits {
        protected Radians() {
            super("radians", "rad", MathConstants.RADIANS_PER_DEGREE);
        }
    }

    public static class Milliradians extends AngleUnits {
        protected Milliradians() {
            super("milliradians", "mrad", MathConstants.MILLI_RADIANS_PER_DEGREE);
        }
    }

    public static class Microradians extends AngleUnits {
        protected Microradians() {
            super("microradians", "mrad", MathConstants.MICRO_RADIANS_PER_DEGREE);
        }
    }

    //------ Gradians --------------------------------------------------------------------------------------------------

    public static class Gradians extends AngleUnits {
        protected Gradians() {
            super("gradians", "grad", MathConstants.GRADIANS_PER_DEGREE);
        }
    }

    //------ Revolutions -----------------------------------------------------------------------------------------------

    public static class Revolutions extends AngleUnits {
        protected Revolutions() {
            super("revolutions", "rev", MathConstants.REVOLUTIONS_PER_DEGREE);
        }
    }
}
