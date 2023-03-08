package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Celsius;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Fahrenheit;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Kelvin;

public class Temperature extends Quantity {

    //@formatter:off
    public static final Celsius    celsius    = new Celsius();
    public static final Fahrenheit fahrenheit = new Fahrenheit();
    public static final Kelvin     kelvin     = new Kelvin();
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
    public Temperature toCelsius()    { return new Temperature(units.convert(value, celsius),    celsius);    }
    public Temperature toFahrenheit() { return new Temperature(units.convert(value, fahrenheit), fahrenheit); }
    public Temperature toKelvin()     { return new Temperature(units.convert(value, kelvin),     kelvin);    }
    //@formatter:on
}
