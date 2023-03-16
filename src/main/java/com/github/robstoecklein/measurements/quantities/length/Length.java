package com.github.robstoecklein.measurements.quantities.length;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Centimeters;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Decimeters;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Feet;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Inches;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Kilometers;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Meters;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Micrometers;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Miles;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Millimeters;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Nanometers;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.NauticalMiles;
import com.github.robstoecklein.measurements.quantities.length.LengthUnits.Yards;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
public class Length extends Quantity {

    //@formatter:off
    // US
    private static final Inches        INCHES         = new Inches();
    private static final Feet          FEET           = new Feet();
    private static final Yards         YARDS          = new Yards();
    private static final Miles         MILES          = new Miles();
    private static final NauticalMiles NAUTICAL_MILES = new NauticalMiles();
    // SI
    private static final Nanometers    NANOMETERS     = new Nanometers();
    private static final Micrometers   MICROMETERS    = new Micrometers();
    private static final Millimeters   MILLIMETERS    = new Millimeters();
    private static final Centimeters   CENTIMETERS    = new Centimeters();
    private static final Decimeters    DECIMETERS     = new Decimeters();
    private static final Meters        METERS         = new Meters();
    private static final Kilometers    KILOMETERS     = new Kilometers();
    //@formatter:on

    public Length(Number value, LengthUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Length inInches       (Number val) { return new Length(val, INCHES);        }
    public static Length inFeet         (Number val) { return new Length(val, FEET);          }
    public static Length inYards        (Number val) { return new Length(val, YARDS);         }
    public static Length inMiles        (Number val) { return new Length(val, MILES);         }
    public static Length inNauticalMiles(Number val) { return new Length(val, NAUTICAL_MILES); }

    public static Length inNanometers   (Number val) { return new Length(val, NANOMETERS);  }
    public static Length inMicrometers  (Number val) { return new Length(val, MICROMETERS); }
    public static Length inMillimeters  (Number val) { return new Length(val, MILLIMETERS); }
    public static Length inCentimeters  (Number val) { return new Length(val, CENTIMETERS); }
    public static Length inDecimeters   (Number val) { return new Length(val, DECIMETERS);  }
    public static Length inMeters       (Number val) { return new Length(val, METERS);      }
    public static Length inKilometers   (Number val) { return new Length(val, KILOMETERS);  }
    //@formatter:on

    //@formatter:off
    public Length toInches()        { return convert(value, INCHES); }
    public Length toFeet()          { return convert(value, FEET);   }
    public Length toYards()         { return convert(value, YARDS);  }
    public Length toMiles()         { return convert(value, MILES);  }
    public Length toNauticalMiles() { return convert(value, MILES);  }

    public Length toNanometers()    { return convert(value, NANOMETERS);  }
    public Length toMicrometers()   { return convert(value, MICROMETERS); }
    public Length toMillimeters()   { return convert(value, MILLIMETERS); }
    public Length toCentimeters()   { return convert(value, CENTIMETERS); }
    public Length toDecimeters()    { return convert(value, DECIMETERS);  }
    public Length toMeters()        { return convert(value, METERS);      }
    public Length toKilometers()    { return convert(value, KILOMETERS);  }
    //@formatter:on

    private Length convert(Number val, LengthUnits newUnits) {
        return new Length(units.convert(val, newUnits), newUnits);
    }
}
