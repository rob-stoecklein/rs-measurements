package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Celsius;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Fahrenheit;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Kelvin;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public class Temperature extends Quantity {

    //@formatter:off
    private static final Celsius    celsius    = new Celsius();
    private static final Fahrenheit fahrenheit = new Fahrenheit();
    private static final Kelvin     kelvin     = new Kelvin();
    //@formatter:on

    public Temperature(Number val, TemperatureUnits units) {
        super(val, units);
    }

    //@formatter:off
    public static Temperature inCelsius   (Number val) { return new Temperature(val, celsius);    }
    public static Temperature inFahrenheit(Number val) { return new Temperature(val, fahrenheit); }
    public static Temperature inKelvin    (Number val) { return new Temperature(val, kelvin);     }
    //@formatter:on

    //@formatter:off
    public Temperature toCelsius()    { return convert(value, celsius);    }
    public Temperature toFahrenheit() { return convert(value, fahrenheit); }
    public Temperature toKelvin()     { return convert(value, kelvin);     }
    //@formatter:on

    private Temperature convert(Number val, TemperatureUnits newUnits) {
        return new Temperature(units.convert(val, newUnits), newUnits);
    }
}
