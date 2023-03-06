package com.github.robstoecklein.quantities;

import com.github.robstoecklein.units.temperature.CelsiusUnits;
import com.github.robstoecklein.units.temperature.FahrenheitUnits;
import com.github.robstoecklein.units.temperature.TemperatureUnits;

public class Temperature extends Quantity {

    public Temperature(Double temperature, TemperatureUnits units) {
        super(temperature, units);
    }

    public static Temperature inFahrenheit(Double temperature) {
        return new Temperature(temperature, new FahrenheitUnits());
    }

    public static Temperature inCelsius(Double temperature) {
        return new Temperature(temperature, new CelsiusUnits());
    }

    public Temperature toFahrenheit() {
        FahrenheitUnits fahrenheitUnit = new FahrenheitUnits();
        return new Temperature(units.convert(value, fahrenheitUnit), fahrenheitUnit);
    }

    public Temperature toCelsius() {
        CelsiusUnits celsiusUnit = new CelsiusUnits();
        return new Temperature(units.convert(value, celsiusUnit), celsiusUnit);
    }
}
