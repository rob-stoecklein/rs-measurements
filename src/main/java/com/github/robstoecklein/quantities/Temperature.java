package com.github.robstoecklein.quantities;

import com.github.robstoecklein.units.TemperatureUnits;
import com.github.robstoecklein.units.TemperatureUnits.Celsius;
import com.github.robstoecklein.units.TemperatureUnits.Fahrenheit;
import com.github.robstoecklein.units.TemperatureUnits.Kelvin;

public class Temperature extends Quantity {

    //@formatter:off
    public static final Celsius    celsius    = new Celsius();
    public static final Fahrenheit fahrenheit = new Fahrenheit();
    public static final Kelvin     kelvin     = new Kelvin();
    //@formatter:on

    public Temperature(Double val, TemperatureUnits units) {
        super(val, units);
    }

    //@formatter:off
    public static Temperature inCelsius   (Double val) { return new Temperature(val, celsius);    }
    public static Temperature inFahrenheit(Double val) { return new Temperature(val, fahrenheit); }
    public static Temperature inKelvin    (Double val) { return new Temperature(val, kelvin);     }
    //@formatter:on

    //@formatter:off
    public Temperature toCelsius()    { return new Temperature(units.convert(value, celsius),    celsius);    }
    public Temperature toFahrenheit() { return new Temperature(units.convert(value, fahrenheit), fahrenheit); }
    public Temperature toKelvin()     { return new Temperature(units.convert(value, kelvin),     kelvin);    }
    //@formatter:on
}
