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
 * @version 2023-03-08
 */
public class Length extends Quantity {

    //@formatter:off
    // US
    private static final Inches        inches        = new Inches();
    private static final Feet          feet          = new Feet();
    private static final Yards         yards         = new Yards();
    private static final Miles         miles         = new Miles();
    private static final NauticalMiles nauticalMiles = new NauticalMiles();
    // SI
    private static final Nanometers    nanometers    = new Nanometers();
    private static final Micrometers   micrometers   = new Micrometers();
    private static final Millimeters   millimeters   = new Millimeters();
    private static final Centimeters   centimeters   = new Centimeters();
    private static final Decimeters    decimeters    = new Decimeters();
    private static final Meters        meters        = new Meters();
    private static final Kilometers    kilometers    = new Kilometers();
    //@formatter:on

    public Length(Number value, LengthUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Length inInches       (Number val) { return new Length(val, inches);        }
    public static Length inFeet         (Number val) { return new Length(val, feet);          }
    public static Length inYards        (Number val) { return new Length(val, yards);         }
    public static Length inMiles        (Number val) { return new Length(val, miles);         }
    public static Length inNauticalMiles(Number val) { return new Length(val, nauticalMiles); }

    public static Length inNanometers   (Number val) { return new Length(val, nanometers);  }
    public static Length inMicrometers  (Number val) { return new Length(val, micrometers); }
    public static Length inMillimeters  (Number val) { return new Length(val, millimeters); }
    public static Length inCentimeters  (Number val) { return new Length(val, centimeters); }
    public static Length inDecimeters   (Number val) { return new Length(val, decimeters);  }
    public static Length inMeters       (Number val) { return new Length(val, meters);      }
    public static Length inKilometers   (Number val) { return new Length(val, kilometers);  }
    //@formatter:on

    //@formatter:off
    public Length toInches()        { return convert(value, inches); }
    public Length toFeet()          { return convert(value, feet);   }
    public Length toYards()         { return convert(value, yards);  }
    public Length toMiles()         { return convert(value, miles);  }
    public Length toNauticalMiles() { return convert(value, miles);  }

    public Length toNanometers()    { return convert(value, nanometers);  }
    public Length toMicrometers()   { return convert(value, micrometers); }
    public Length toMillimeters()   { return convert(value, millimeters); }
    public Length toCentimeters()   { return convert(value, centimeters); }
    public Length toDecimeters()    { return convert(value, decimeters);  }
    public Length toMeters()        { return convert(value, meters);      }
    public Length toKilometers()    { return convert(value, kilometers);  }
    //@formatter:on

    private Length convert(Number val, LengthUnits newUnits) {
        return new Length(units.convert(val, newUnits), newUnits);
    }
}
