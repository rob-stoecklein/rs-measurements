package com.github.rs.units.quantities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-17
 */
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Units {

    //@formatter:off
    public static final String MEASURE_ANGLE            = "angle";
    public static final String MEASURE_AREA             = "area";
    public static final String MEASURE_CURRENT          = "electrical-current";
    public static final String MEASURE_DIGITAL          = "digital";
    public static final String MEASURE_ENERGY           = "energy";
    public static final String MEASURE_FORCE            = "force";
    public static final String MEASURE_FREQUENCY        = "frequency";
    public static final String MEASURE_FUEL_CONSUMPTION = "fuel-consumption";
    public static final String MEASURE_LENGTH           = "length";
    public static final String MEASURE_MASS             = "mass";
    public static final String MEASURE_POWER            = "power";
    public static final String MEASURE_PRESSURE         = "pressure";
    public static final String MEASURE_RESISTANCE       = "resistance";
    public static final String MEASURE_SPEED            = "speed";
    public static final String MEASURE_TEMPERATURE      = "temperature";
    public static final String MEASURE_TIME             = "time";
    public static final String MEASURE_VOLTAGE          = "voltage";
    public static final String MEASURE_VOLUME           = "volume";
    //@formatter:on

    @EqualsAndHashCode.Include
    private final String measure;
    @EqualsAndHashCode.Include
    private final String name;
    private final String abbr;
    private final Number scale;
    private final Number offset;
    private final boolean isStandard;

    public Units(String messure, String name, String abbr, Number scale, Number offset) {
        //@formatter:off
        this.measure = messure;
        this.name    = name;
        this.abbr    = abbr;
        this.scale   = scale;
        this.offset  = offset;
        //@formatter:on
        //noinspection FloatingPointEquality
        this.isStandard = (scale.doubleValue() == 1.0) && (offset.doubleValue() == 0.0);
    }

    /**
     * Converts from this unit to the standard unit.
     *
     * @param value the value in the current unit to convert to standard unit
     * @return value in standard kOS units
     */
    public Number toStandard(Number value) {
        return (value != null) ? (value.doubleValue() - offset.doubleValue()) / scale.doubleValue() : null;
    }

    /**
     * Converts from the standard unit to this unit.
     *
     * @param value the value in standard units to convert to this unit
     * @return value in {@code this} unit
     */
    public Number fromStandard(Number value) {
        return (value != null) ? (value.doubleValue() * scale.doubleValue()) + offset.doubleValue() : null;
    }

    /**
     * Converts the specified value from this unit to the specified unit. The
     * units must measure the same type of property (temperature, mass, volume, etc.).
     *
     * @param value the value in this unit
     * @param units the target unit to convert to
     */
    public Number convert(Number value, Units units) {
        if (!units.measure.equals(measure)) {
            throw new IllegalArgumentException("Incompatible measure conversion");
        }

        // Convert the given value to standard units:
        Number stdVal = toStandard(value);

        // Convert the standard value to target units:
        return units.fromStandard(stdVal);
    }
}
