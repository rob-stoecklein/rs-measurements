package com.github.rs.units.quantities.volume;

import com.github.rs.units.quantities.Quantity;
import com.github.rs.units.quantities.volume.VolumeUnits.Cups;
import com.github.rs.units.quantities.volume.VolumeUnits.FluidOunces;
import com.github.rs.units.quantities.volume.VolumeUnits.Gallons;
import com.github.rs.units.quantities.volume.VolumeUnits.Liters;
import com.github.rs.units.quantities.volume.VolumeUnits.Milliliters;
import com.github.rs.units.quantities.volume.VolumeUnits.Pints;
import com.github.rs.units.quantities.volume.VolumeUnits.Quarts;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Volume extends Quantity<Volume, VolumeUnits> {

    //@formatter:off
    // US
    public static final FluidOunces FLUID_OUNCES = new FluidOunces();
    public static final Cups        CUPS         = new Cups();
    public static final Pints       PINTS        = new Pints();
    public static final Quarts      QUARTS       = new Quarts();
    public static final Gallons     GALLONS      = new Gallons();
    // SI
    public static final Milliliters MILLILITERS  = new Milliliters();
    public static final Liters      LITERS       = new Liters();
    //@formatter:on

    //@formatter:off
    // US
    public static Volume inFluidOunces(Number value) { return new Volume().value(value).units(FLUID_OUNCES); }
    public static Volume inCups       (Number value) { return new Volume().value(value).units(CUPS);         }
    public static Volume inPints      (Number value) { return new Volume().value(value).units(PINTS);        }
    public static Volume inQuarts     (Number value) { return new Volume().value(value).units(QUARTS);       }
    public static Volume inGallons    (Number value) { return new Volume().value(value).units(GALLONS);      }
    // SI
    public static Volume inMilliliters(Number value) { return new Volume().value(value).units(MILLILITERS);  }
    public static Volume inLiters     (Number value) { return new Volume().value(value).units(LITERS);       }
    //@formatter:on

    //@formatter:off
    // US
    public Volume toFluidOunces() { return convert(value, FLUID_OUNCES); }
    public Volume toCups()        { return convert(value, CUPS);         }
    public Volume toPints()       { return convert(value, PINTS);        }
    public Volume toQuarts()      { return convert(value, QUARTS);       }
    public Volume toGallons()     { return convert(value, GALLONS);      }
    // SI
    public Volume toMilliLiters() { return convert(value, MILLILITERS);  }
    public Volume toLiters()      { return convert(value, LITERS);       }
    //@formatter:on

    private Volume convert(Number number, VolumeUnits newUnits) {
        return convert(new Volume(), number, newUnits);
    }
}
