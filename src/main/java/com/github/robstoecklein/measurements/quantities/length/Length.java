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
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Length extends Quantity {

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
    public static Length inInches       (Number number) { return new Length().value(number).units(INCHES);         }
    public static Length inFeet         (Number number) { return new Length().value(number).units(FEET);           }
    public static Length inYards        (Number number) { return new Length().value(number).units(YARDS);          }
    public static Length inMiles        (Number number) { return new Length().value(number).units(MILES);          }
    public static Length inNauticalMiles(Number number) { return new Length().value(number).units(NAUTICAL_MILES); }

    public static Length inNanometers   (Number number) { return new Length().value(number).units(NANOMETERS);  }
    public static Length inMicrometers  (Number number) { return new Length().value(number).units(MICROMETERS); }
    public static Length inMillimeters  (Number number) { return new Length().value(number).units(MILLIMETERS); }
    public static Length inCentimeters  (Number number) { return new Length().value(number).units(CENTIMETERS); }
    public static Length inDecimeters   (Number number) { return new Length().value(number).units(DECIMETERS);  }
    public static Length inMeters       (Number number) { return new Length().value(number).units(METERS);      }
    public static Length inKilometers   (Number number) { return new Length().value(number).units(KILOMETERS);  }
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

    private Length convert(Number number, LengthUnits newUnits) {
        return new Length()
                .value(units.convert(number, newUnits))
                .units(newUnits)
                .numDecimalPlaces(getNumDecimalPlaces())
                .numSignificantDigits(getNumSignificantDigits())
                .includeUnits(isIncludeUnits());
    }

    //--- Setters ---

    public Length value(Number number) {
        setValue(number);
        return this;
    }

    public Length units(LengthUnits lengthUnits) {
        setUnits(lengthUnits);
        return this;
    }

    public Length numDecimalPlaces(Integer numDecimalPlaces) {
        setNumDecimalPlaces(numDecimalPlaces);
        return this;
    }

    public Length numSignificantDigits(Integer numSignificantDigits) {
        setNumSignificantDigits(numSignificantDigits);
        return this;
    }

    public Length includeUnits(boolean includeUnits) {
        setIncludeUnits(includeUnits);
        return this;
    }
}
