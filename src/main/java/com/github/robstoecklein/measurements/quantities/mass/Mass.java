package com.github.robstoecklein.measurements.quantities.mass;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.Grams;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.Kilograms;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.MetricTons;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.Milligrams;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.Ounces;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.Pounds;
import com.github.robstoecklein.measurements.quantities.mass.MassUnits.Tons;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mass extends Quantity<Mass, MassUnits> {

    //@formatter:off
    // US
    public static final Ounces     OUNCES      = new Ounces();
    public static final Pounds     POUNDS      = new Pounds();
    public static final Tons       TONS        = new Tons();
    public static final Milligrams MILLIGRAMS  = new Milligrams();
    public static final Grams      GRAMS       = new Grams();
    public static final Kilograms  KILOGRAMS   = new Kilograms();
    public static final MetricTons METRIC_TONS = new MetricTons();
    // SI
    //@formatter:on

    //@formatter:off
    // US
    public static Mass inOunces    (Number value) { return new Mass().value(value).units(OUNCES);      }
    public static Mass inPounds    (Number value) { return new Mass().value(value).units(POUNDS);      }
    public static Mass inTons      (Number value) { return new Mass().value(value).units(TONS);        }
    // SI
    public static Mass inMilligrams(Number value) { return new Mass().value(value).units(MILLIGRAMS);  }
    public static Mass inGrams     (Number value) { return new Mass().value(value).units(GRAMS);       }
    public static Mass inKilograms (Number value) { return new Mass().value(value).units(KILOGRAMS);   }
    public static Mass inMetricTons(Number value) { return new Mass().value(value).units(METRIC_TONS); }
    //@formatter:on

    //@formatter:off
    // US
    public Mass toOunces()     { return convert(value, OUNCES);      }
    public Mass toPounds()     { return convert(value, POUNDS);      }
    public Mass toTons()       { return convert(value, TONS);        }
    // SI
    public Mass toMilligrams() { return convert(value, MILLIGRAMS);  }
    public Mass toGrams()      { return convert(value, GRAMS);       }
    public Mass toKilograms()  { return convert(value, KILOGRAMS);   }
    public Mass toMetricTons() { return convert(value, METRIC_TONS); }
    //@formatter:on

    private Mass convert(Number number, MassUnits newUnits) {
        return convert(new Mass(), number, newUnits);
    }
}
