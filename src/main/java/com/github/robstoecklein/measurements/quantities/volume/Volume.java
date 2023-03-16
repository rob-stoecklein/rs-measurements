package com.github.robstoecklein.measurements.quantities.volume;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Cups;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.FluidOunces;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Gallons;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Liters;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Milliliters;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Pints;
import com.github.robstoecklein.measurements.quantities.volume.VolumeUnits.Quarts;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Volume extends Quantity {

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
    public static Volume inFluidOunces(Number number) { return new Volume().value(number).units(FLUID_OUNCES); }
    public static Volume inCups       (Number number) { return new Volume().value(number).units(CUPS);        }
    public static Volume inPints      (Number number) { return new Volume().value(number).units(PINTS);       }
    public static Volume inQuarts     (Number number) { return new Volume().value(number).units(QUARTS);      }
    public static Volume inGallons    (Number number) { return new Volume().value(number).units(GALLONS);     }

    public static Volume inMilliliters(Number number) { return new Volume().value(number).units(MILLILITERS); }
    public static Volume inLiters     (Number number) { return new Volume().value(number).units(LITERS);      }
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

    private Volume convert(Number number, VolumeUnits newUnits) {
        return new Volume()
                .value(units.convert(number, newUnits))
                .units(newUnits)
                .numDecimalPlaces(getNumDecimalPlaces())
                .numSignificantDigits(getNumSignificantDigits())
                .includeUnits(isIncludeUnits());
    }

    //--- Setters ---

    public Volume value(Number number) {
        setValue(number);
        return this;
    }

    public Volume units(VolumeUnits volumeUnits) {
        setUnits(volumeUnits);
        return this;
    }

    public Volume numDecimalPlaces(Integer numDecimalPlaces) {
        setNumDecimalPlaces(numDecimalPlaces);
        return this;
    }

    public Volume numSignificantDigits(Integer numSignificantDigits) {
        setNumSignificantDigits(numSignificantDigits);
        return this;
    }

    public Volume includeUnits(boolean includeUnits) {
        setIncludeUnits(includeUnits);
        return this;
    }
}
