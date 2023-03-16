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
public class Temperature extends Quantity {

    //@formatter:off
    public static final Celsius    CELSIUS    = new Celsius();
    public static final Fahrenheit FAHRENHEIT = new Fahrenheit();
    public static final Kelvin     KELVIN     = new Kelvin();
    //@formatter:on

    //@formatter:off
    public static Temperature inCelsius   (Number number) { return new Temperature().value(number).units(CELSIUS);    }
    public static Temperature inFahrenheit(Number number) { return new Temperature().value(number).units(FAHRENHEIT); }
    public static Temperature inKelvin    (Number number) { return new Temperature().value(number).units(KELVIN);     }
    //@formatter:on

    //@formatter:off
    public Temperature toCelsius()    { return convert(value, CELSIUS);    }
    public Temperature toFahrenheit() { return convert(value, FAHRENHEIT); }
    public Temperature toKelvin()     { return convert(value, KELVIN);     }
    //@formatter:on

    private Temperature convert(Number number, TemperatureUnits newUnits) {
        return new Temperature()
                .value(units.convert(number, newUnits))
                .units(newUnits)
                .numDecimalPlaces(getNumDecimalPlaces())
                .numSignificantDigits(getNumSignificantDigits())
                .includeUnits(isIncludeUnits());
    }

    //--- Setters ---

    public Temperature value(Number number) {
        setValue(number);
        return this;
    }

    public Temperature units(TemperatureUnits temperatureUnits) {
        setUnits(temperatureUnits);
        return this;
    }

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
