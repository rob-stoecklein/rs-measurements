package com.github.robstoecklein.units;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Unit {

    //@formatter:off
    public static final String MEASURE_LENGTH      = "length";
    public static final String MEASURE_PRESSURE    = "pressure";
    public static final String MEASURE_TEMPERATURE = "temperature";
    public static final String MEASURE_TIME        = "time";
    public static final String MEASURE_VOLUME      = "volume";
    public static final String MEASURE_WEIGHT      = "weight";
    //@formatter:on

    @EqualsAndHashCode.Include
    private final String measure;
    @EqualsAndHashCode.Include
    private final String name;
    private final String plural;
    private final String abbr;
    private final double scale;
    private final double offset;
    private final int exponent;
    private final boolean isStandard;

    public Unit(String messure, String name, String plural, String abbr, double scale, double offset, int exponent, boolean isStandard) {
        //@formatter:off
        this.measure    = messure;
        this.name       = name;
        this.plural     = plural;
        this.abbr       = abbr;
        this.scale      = scale;
        this.offset     = offset;
        this.exponent   = exponent;
        this.isStandard = isStandard;
        //@formatter:on
    }

    /**
     * Converts from this unit to the standard unit.
     *
     * @param value the value in the current unit to convert to standard unit
     * @return value in standard kOS units
     */
    public Double toStandard(Double value) {
        return (value != null) ? (value - offset) / scale : null;
    }

    /**
     * Converts from the standard unit to this unit.
     *
     * @param value the value in standard units to convert to this unit
     * @return value in {@code this} unit
     */
    public Double fromStandard(Double value) {
        return (value != null) ? (value * scale) + offset : null;
    }

    /**
     * Converts the specified value from this unit to the specified unit. The
     * units must measure the same type of property (temperature, mass, volume, etc.).
     *
     * @param value the value in this unit
     * @param unit  the target unit to convert to
     */
    public Double convert(Double value, Unit unit) {
        if (!unit.measure.equals(measure)) {
            throw new IllegalArgumentException("Incompatible measure conversion");
        }

        // Convert the given value to standard units:
        Double stdVal = toStandard(value);

        // Convert the standard value to target units:
        return unit.fromStandard(stdVal);
    }
}
