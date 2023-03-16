package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Celsius;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Fahrenheit;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Kelvin;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
public class Temperature extends Quantity {

    //@formatter:off
    public static final Celsius    CELSIUS    = new Celsius();
    public static final Fahrenheit FAHRENHEIT = new Fahrenheit();
    public static final Kelvin     KELVIN     = new Kelvin();
    //@formatter:on

    public Temperature(Number value, TemperatureUnits units) {
        super(value, units);
    }

    //@formatter:off
    public static Temperature inCelsius   (Number val) { return new Temperature(val, CELSIUS);    }
    public static Temperature inFahrenheit(Number val) { return new Temperature(val, FAHRENHEIT); }
    public static Temperature inKelvin    (Number val) { return new Temperature(val, KELVIN);     }
    //@formatter:on

    //@formatter:off
    public Temperature toCelsius()    { return convert(value, CELSIUS);    }
    public Temperature toFahrenheit() { return convert(value, FAHRENHEIT); }
    public Temperature toKelvin()     { return convert(value, KELVIN);     }
    //@formatter:on

    private Temperature convert(Number val, TemperatureUnits newUnits) {
        return new Temperature(units.convert(val, newUnits), newUnits)
                .numDecimalPlaces(this.getNumDecimalPlaces())
                .numSignificantDigits(this.getNumSignificantDigits())
                .includeUnits(this.isIncludeUnits());
    }

    //--- Setters ---

    public Temperature numDecimalPlaces(Integer numDecimalPlaces) {
        setNumDecimalPlaces(numDecimalPlaces);
        return this;
    }

    public Temperature numSignificantDigits(Integer numSignificantDigits) {
        setNumSignificantDigits(numSignificantDigits);
        return this;
    }

    public Temperature includeUnits(boolean includeUnits) {
        setIncludeUnits(includeUnits);
        return this;
    }
}
