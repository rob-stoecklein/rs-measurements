package com.github.robstoecklein.units;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public abstract class Unit {

    private final String name;
    private final double scale;
    private final double offset;
    private final int exponent;

    public Unit(String name, double scale, double offset) {
        this.name = name;
        this.scale = scale;
        this.offset = offset;
        this.exponent = 0;
    }

    /**
     * Converts from this unit to standard kOS units.
     *
     * @param val the value in the current unit to convert to standard unit
     * @return value in standard kOS units
     */
    public double toStandard(double val) {
        return (val - offset) / scale;
    }

    /**
     * Converts from standard kOS units to this unit.
     *
     * @param value the value in standard units to convert to this unit
     * @return value in {@code this} unit
     */
    public double fromStandard(double value) {
        return (value * scale) + offset;
    }

    /**
     * Converts the specified value from this unit to the specified unit. The
     * units must measure the same type of property (temperature, mass, volume, etc.).
     *
     * @param value the value in this unit
     * @param unit  the target unit to convert to
     */
    public double convert(double value, Unit unit) {
        //if (!unit.measure.equals(measure)) {
        //    throw new IllegalArgumentException("Incompatible measure conversion");
        //}

        // convert the value to standard units
        double stdVal = toStandard(value);

        // convert the value to target units
        return unit.fromStandard(stdVal);
    }
}
