package com.github.rs.units.quantities.angle;

import com.github.rs.units.quantities.Quantity;
import com.github.rs.units.quantities.angle.AngleUnits.ArcMinutes;
import com.github.rs.units.quantities.angle.AngleUnits.ArcSeconds;
import com.github.rs.units.quantities.angle.AngleUnits.Degrees;
import com.github.rs.units.quantities.angle.AngleUnits.Gradians;
import com.github.rs.units.quantities.angle.AngleUnits.MicroarcSeconds;
import com.github.rs.units.quantities.angle.AngleUnits.Microradians;
import com.github.rs.units.quantities.angle.AngleUnits.MilliarcSeconds;
import com.github.rs.units.quantities.angle.AngleUnits.Milliradians;
import com.github.rs.units.quantities.angle.AngleUnits.Radians;
import com.github.rs.units.quantities.angle.AngleUnits.Revolutions;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Angle extends Quantity<Angle, AngleUnits> {

    //@formatter:off
    // Degrees
    public static final Degrees         DEGREES          = new Degrees();
    public static final ArcMinutes      ARC_MINUTES      = new ArcMinutes();
    public static final ArcSeconds      ARC_SECONDS      = new ArcSeconds();
    public static final MilliarcSeconds MILLIARC_SECONDS = new MilliarcSeconds();
    public static final MicroarcSeconds MICROARC_SECONDS = new MicroarcSeconds();
    // Radians
    public static final Radians         RADIANS          = new Radians();
    public static final Milliradians    MILLIRADIANS     = new Milliradians();
    public static final Microradians    MICRORADIANS     = new Microradians();
    // Gradians & Revolutions
    public static final Gradians        GRADIANS         = new Gradians();
    public static final Revolutions     REVOLUTIONS      = new Revolutions();
    //@formatter:on

    //@formatter:off
    public static Angle inDegrees        (Number value) { return new Angle().value(value).units(DEGREES);          }
    public static Angle inArcMinutes     (Number value) { return new Angle().value(value).units(ARC_MINUTES);      }
    public static Angle inArcSeconds     (Number value) { return new Angle().value(value).units(ARC_SECONDS);      }
    public static Angle inMilliarcSeconds(Number value) { return new Angle().value(value).units(MILLIARC_SECONDS); }
    public static Angle inMicroarcSeconds(Number value) { return new Angle().value(value).units(MICROARC_SECONDS); }
    public static Angle inRadians        (Number value) { return new Angle().value(value).units(RADIANS);          }
    public static Angle inMilliradians   (Number value) { return new Angle().value(value).units(MILLIRADIANS);     }
    public static Angle inMicroradians   (Number value) { return new Angle().value(value).units(MICRORADIANS);     }
    public static Angle inGradians       (Number value) { return new Angle().value(value).units(GRADIANS);         }
    public static Angle inRevolutions    (Number value) { return new Angle().value(value).units(REVOLUTIONS);      }
    //@formatter:on

    //@formatter:off
    public Angle toDegrees()         { return convert(value, DEGREES);          }
    public Angle toArcMinutes()      { return convert(value, ARC_MINUTES);      }
    public Angle toArcSeconds()      { return convert(value, ARC_SECONDS);      }
    public Angle toMilliarcSeconds() { return convert(value, MILLIARC_SECONDS); }
    public Angle toMicroarcSeconds() { return convert(value, MICROARC_SECONDS); }
    public Angle toRadians()         { return convert(value, RADIANS);          }
    public Angle toMilliradians()    { return convert(value, MILLIRADIANS);     }
    public Angle toMicroradians()    { return convert(value, MICRORADIANS);     }
    public Angle toGradians()        { return convert(value, GRADIANS);         }
    public Angle toRevloutions()     { return convert(value, REVOLUTIONS);      }
    //@formatter:on

    private Angle convert(Number number, AngleUnits newUnits) {
        return convert(new Angle(), number, newUnits);
    }
}
