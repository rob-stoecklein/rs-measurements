package com.github.robstoecklein.measurements.quantities.volume;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Cups;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.FluidOunces;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Gallons;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Liters;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.MilliLiters;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Pints;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Quarts;

public final class Volume extends Quantity {

    //@formatter:off
    public static final Liters      liters      = new Liters();
    public static final MilliLiters milliliters = new MilliLiters();
    public static final FluidOunces fluidOunces = new FluidOunces();
    public static final Cups        cups        = new Cups();
    public static final Pints       pints       = new Pints();
    public static final Quarts      quarts      = new Quarts();
    public static final Gallons     gallons     = new Gallons();
    //@formatter:on

    private Volume(Number value, VolumeUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Volume inLiters     (Number val) { return new Volume(val, liters);      }
    public static Volume inMilliLiters(Number val) { return new Volume(val, milliliters); }
    public static Volume inFluidOunces(Number val) { return new Volume(val, fluidOunces); }
    public static Volume inCups       (Number val) { return new Volume(val, cups);        }
    public static Volume inPints      (Number val) { return new Volume(val, pints);       }
    public static Volume inQuarts     (Number val) { return new Volume(val, quarts);      }
    public static Volume inGallons    (Number val) { return new Volume(val, gallons);     }
    //@formatter:on

    //@formatter:off
    public Volume toLiters()      { return new Volume(units.convert(value, liters),      liters);      }
    public Volume toMilliLiters() { return new Volume(units.convert(value, milliliters), milliliters); }
    public Volume toFluidOunces() { return new Volume(units.convert(value, fluidOunces), fluidOunces); }
    public Volume toCups()        { return new Volume(units.convert(value, cups),        cups);        }
    public Volume toPints()       { return new Volume(units.convert(value, pints),       pints);       }
    public Volume toQuarts()      { return new Volume(units.convert(value, quarts),      quarts);      }
    public Volume toGallons()     { return new Volume(units.convert(value, gallons),     gallons);     }
    //@formatter:on
}
