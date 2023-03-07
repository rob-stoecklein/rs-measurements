package com.github.robstoecklein.quantities.length;

import com.github.robstoecklein.quantities.Quantity;
import com.github.robstoecklein.quantities.length.LengthUnits.Feet;
import com.github.robstoecklein.quantities.length.LengthUnits.Inches;
import com.github.robstoecklein.quantities.length.LengthUnits.Meters;
import com.github.robstoecklein.quantities.length.LengthUnits.Miles;
import com.github.robstoecklein.quantities.length.LengthUnits.Yards;

public final class Length extends Quantity {

    //@formatter:off
    public static final Inches inches = new Inches();
    public static final Feet   feet   = new Feet();
    public static final Yards  yards  = new Yards();
    public static final Meters meters = new Meters();
    public static final Miles  miles  = new Miles();
    //@formatter:on

    private Length(Number value, LengthUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Length inInches(Number val) { return new Length(val, inches); }
    public static Length inFeet  (Number val) { return new Length(val, feet);   }
    public static Length inYards (Number val) { return new Length(val, yards);  }
    public static Length inMeters(Number val) { return new Length(val, meters); }
    public static Length inMiles (Number val) { return new Length(val, miles);  }
    //@formatter:on

    //@formatter:off
    public Length toInches() { return new Length(units.convert(value, inches), inches); }
    public Length toFeet()   { return new Length(units.convert(value, feet),   feet);   }
    public Length toYards()  { return new Length(units.convert(value, yards),  yards);  }
    public Length toMeters() { return new Length(units.convert(value, meters), meters); }
    public Length toMiles()  { return new Length(units.convert(value, miles),  miles);  }
    //@formatter:on
}
