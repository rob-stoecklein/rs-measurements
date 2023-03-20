package com.github.rs.units.quantities.length;

import com.github.rs.units.quantities.Quantity;
import com.github.rs.units.quantities.length.LengthUnits.Centimeters;
import com.github.rs.units.quantities.length.LengthUnits.Decimeters;
import com.github.rs.units.quantities.length.LengthUnits.Feet;
import com.github.rs.units.quantities.length.LengthUnits.Inches;
import com.github.rs.units.quantities.length.LengthUnits.Kilometers;
import com.github.rs.units.quantities.length.LengthUnits.Meters;
import com.github.rs.units.quantities.length.LengthUnits.Micrometers;
import com.github.rs.units.quantities.length.LengthUnits.Miles;
import com.github.rs.units.quantities.length.LengthUnits.Millimeters;
import com.github.rs.units.quantities.length.LengthUnits.Nanometers;
import com.github.rs.units.quantities.length.LengthUnits.NauticalMiles;
import com.github.rs.units.quantities.length.LengthUnits.Yards;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-17
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Length extends Quantity<Length, LengthUnits> {

    //@formatter:off
    // US
    public static final Inches        INCHES         = new Inches();
    public static final Feet          FEET           = new Feet();
    public static final Yards         YARDS          = new Yards();
    public static final Miles         MILES          = new Miles();
    public static final NauticalMiles NAUTICAL_MILES = new NauticalMiles();
    // SI
    public static final Nanometers    NANOMETERS     = new Nanometers();
    public static final Micrometers   MICROMETERS    = new Micrometers();
    public static final Millimeters   MILLIMETERS    = new Millimeters();
    public static final Centimeters   CENTIMETERS    = new Centimeters();
    public static final Decimeters    DECIMETERS     = new Decimeters();
    public static final Meters        METERS         = new Meters();
    public static final Kilometers    KILOMETERS     = new Kilometers();
    //@formatter:on

    //@formatter:off
    // US
    public static Length inInches       (Number value) { return new Length().value(value).units(INCHES);         }
    public static Length inFeet         (Number value) { return new Length().value(value).units(FEET);           }
    public static Length inYards        (Number value) { return new Length().value(value).units(YARDS);          }
    public static Length inMiles        (Number value) { return new Length().value(value).units(MILES);          }
    public static Length inNauticalMiles(Number value) { return new Length().value(value).units(NAUTICAL_MILES); }
    // SI
    public static Length inNanometers   (Number value) { return new Length().value(value).units(NANOMETERS);     }
    public static Length inMicrometers  (Number value) { return new Length().value(value).units(MICROMETERS);    }
    public static Length inMillimeters  (Number value) { return new Length().value(value).units(MILLIMETERS);    }
    public static Length inCentimeters  (Number value) { return new Length().value(value).units(CENTIMETERS);    }
    public static Length inDecimeters   (Number value) { return new Length().value(value).units(DECIMETERS);     }
    public static Length inMeters       (Number value) { return new Length().value(value).units(METERS);         }
    public static Length inKilometers   (Number value) { return new Length().value(value).units(KILOMETERS);     }
    //@formatter:on

    //@formatter:off
    // US
    public Length toInches()        { return convert(value, INCHES);         }
    public Length toFeet()          { return convert(value, FEET);           }
    public Length toYards()         { return convert(value, YARDS);          }
    public Length toMiles()         { return convert(value, MILES);          }
    public Length toNauticalMiles() { return convert(value, NAUTICAL_MILES); }
    // SI
    public Length toNanometers()    { return convert(value, NANOMETERS);     }
    public Length toMicrometers()   { return convert(value, MICROMETERS);    }
    public Length toMillimeters()   { return convert(value, MILLIMETERS);    }
    public Length toCentimeters()   { return convert(value, CENTIMETERS);    }
    public Length toDecimeters()    { return convert(value, DECIMETERS);     }
    public Length toMeters()        { return convert(value, METERS);         }
    public Length toKilometers()    { return convert(value, KILOMETERS);     }
    //@formatter:on

    protected Length convert(Number number, LengthUnits newUnits) {
        return convert(new Length(), number, newUnits);
    }
}
