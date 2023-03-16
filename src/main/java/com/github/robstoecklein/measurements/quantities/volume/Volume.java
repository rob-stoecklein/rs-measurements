package com.github.robstoecklein.measurements.quantities.volume;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Cups;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.FluidOunces;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Gallons;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Liters;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Milliliters;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Pints;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Quarts;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
public class Volume extends Quantity {

    //@formatter:off
    // US
    private static final FluidOunces FLUID_OUNCES = new FluidOunces();
    private static final Cups        CUPS         = new Cups();
    private static final Pints       PINTS        = new Pints();
    private static final Quarts      QUARTS       = new Quarts();
    private static final Gallons     GALLONS      = new Gallons();
    // SI
    private static final Milliliters MILLILITERS  = new Milliliters();
    private static final Liters      LITERS       = new Liters();
    //@formatter:on

    public Volume(Number value, VolumeUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Volume inFluidOunces(Number val) { return new Volume(val, FLUID_OUNCES); }
    public static Volume inCups       (Number val) { return new Volume(val, CUPS);        }
    public static Volume inPints      (Number val) { return new Volume(val, PINTS);       }
    public static Volume inQuarts     (Number val) { return new Volume(val, QUARTS);      }
    public static Volume inGallons    (Number val) { return new Volume(val, GALLONS);     }

    public static Volume inMilliLiters(Number val) { return new Volume(val, MILLILITERS); }
    public static Volume inLiters     (Number val) { return new Volume(val, LITERS);      }
    //@formatter:on

    //@formatter:off
    public Volume toFluidOunces() { return convert(value, FLUID_OUNCES); }
    public Volume toCups()        { return convert(value, CUPS);        }
    public Volume toPints()       { return convert(value, PINTS);       }
    public Volume toQuarts()      { return convert(value, QUARTS);      }
    public Volume toGallons()     { return convert(value, GALLONS);     }

    public Volume toMilliLiters() { return convert(value, MILLILITERS); }
    public Volume toLiters()      { return convert(value, LITERS);      }
    //@formatter:on

    private Volume convert(Number val, VolumeUnits newUnits) {
        return new Volume(units.convert(val, newUnits), newUnits);
    }
}
