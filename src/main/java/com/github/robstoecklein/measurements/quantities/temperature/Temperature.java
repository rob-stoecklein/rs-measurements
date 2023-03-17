package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Celsius;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Fahrenheit;
import com.github.robstoecklein.measurements.quantities.temperature.TemperatureUnits.Kelvin;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Temperature extends Quantity<Temperature, TemperatureUnits> {

    //@formatter:off
    public static final Celsius    CELSIUS    = new Celsius();
    public static final Fahrenheit FAHRENHEIT = new Fahrenheit();
    public static final Kelvin     KELVIN     = new Kelvin();
    //@formatter:on

    //@formatter:off
    public static Temperature inCelsius   (Number value) { return new Temperature().value(value).units(CELSIUS);    }
    public static Temperature inFahrenheit(Number value) { return new Temperature().value(value).units(FAHRENHEIT); }
    public static Temperature inKelvin    (Number value) { return new Temperature().value(value).units(KELVIN);     }
    //@formatter:on

    //@formatter:off
    public Temperature toCelsius()    { return convert(value, CELSIUS);    }
    public Temperature toFahrenheit() { return convert(value, FAHRENHEIT); }
    public Temperature toKelvin()     { return convert(value, KELVIN);     }
    //@formatter:on

    private Temperature convert(Number number, TemperatureUnits newUnits) {
        return convert(new Temperature(), number, newUnits);
    }
}
