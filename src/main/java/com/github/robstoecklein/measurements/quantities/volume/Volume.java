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
 * @version 2023-03-08
 */
public class Volume extends Quantity {

    //@formatter:off
    // US
    private static final FluidOunces fluidOunces = new FluidOunces();
    private static final Cups        cups        = new Cups();
    private static final Pints       pints       = new Pints();
    private static final Quarts      quarts      = new Quarts();
    private static final Gallons     gallons     = new Gallons();
    // SI
    private static final Milliliters milliliters = new Milliliters();
    private static final Liters      liters      = new Liters();
    //@formatter:on

    public Volume(Number value, VolumeUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Volume inFluidOunces(Number val) { return new Volume(val, fluidOunces); }
    public static Volume inCups       (Number val) { return new Volume(val, cups);        }
    public static Volume inPints      (Number val) { return new Volume(val, pints);       }
    public static Volume inQuarts     (Number val) { return new Volume(val, quarts);      }
    public static Volume inGallons    (Number val) { return new Volume(val, gallons);     }

    public static Volume inMilliLiters(Number val) { return new Volume(val, milliliters); }
    public static Volume inLiters     (Number val) { return new Volume(val, liters);      }
    //@formatter:on

    //@formatter:off
    public Volume toFluidOunces() { return convert(value, fluidOunces); }
    public Volume toCups()        { return convert(value, cups);        }
    public Volume toPints()       { return convert(value, pints);       }
    public Volume toQuarts()      { return convert(value, quarts);      }
    public Volume toGallons()     { return convert(value, gallons);     }

    public Volume toMilliLiters() { return convert(value, milliliters); }
    public Volume toLiters()      { return convert(value, liters);      }
    //@formatter:on

    private Volume convert(Number val, VolumeUnits newUnits) {
        return new Volume(units.convert(val, newUnits), newUnits);
    }
}
