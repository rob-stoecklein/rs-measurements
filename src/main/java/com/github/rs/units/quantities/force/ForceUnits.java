package com.github.rs.units.quantities.force;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class ForceUnits extends Units {

    public ForceUnits(String name, String abbr, Number scale) {
        super(MEASURE_FORCE, name, abbr, scale, 0.0);
    }

    public static class GramForce extends ForceUnits {
        protected GramForce() {
            super("gram-force", "g-f", 0);
        }
    }

    public static class OunceForce extends ForceUnits {
        protected OunceForce() {
            super("ounce-force", "o-f", 0);
        }
    }

    public static class PoundForce extends ForceUnits {
        protected PoundForce() {
            super("pound-force", "lb-f", 0);
        }
    }

    public static class KilogramForce extends ForceUnits {
        protected KilogramForce() {
            super("kilogram-force", "Kg-f", 0);
        }
    }

    public static class KipForce extends ForceUnits {
        protected KipForce() {
            super("kip-force", "k-f", 0);
        }
    }

    public static class MetrictonForce extends ForceUnits {
        protected MetrictonForce() {
            super("metric ton-force", "MT-f", 0);
        }
    }

    public static class Dyne extends ForceUnits {
        protected Dyne() {
            super("dyne", "dy", 0);
        }
    }

    public static class Newtons extends ForceUnits {
        protected Newtons() {
            super("newton", "N", 0);
        }
    }

    public static class KiloNewtons extends ForceUnits {
        protected KiloNewtons() {
            super("kilo-newton", "KN", 0);
        }
    }

}
