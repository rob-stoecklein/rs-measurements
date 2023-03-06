package com.github.robstoecklein.units;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public abstract class Unit {

    private final String name;
    private final String plural;
    private final String abbr;
    private final double scale;
    private final double offset;
    private final int exponent;
    private final boolean isStandard;

    public Unit(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        this.name = name;
        this.plural = plural;
        this.abbr = abbr;
        this.scale = scale;
        this.offset = offset;
        this.exponent = 0;
        this.isStandard = isStandard;
    }

    /**
     * Converts from this unit to standard kOS units.
     *
     * @param value the value in the current unit to convert to standard unit
     * @return value in standard kOS units
     */
    public double toStandard(double value) {
        return (value - offset) / scale;
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
