package com.github.robstoecklein.measurements.quantities;

import com.github.robstoecklein.measurements.units.Unit;
import com.github.robstoecklein.measurements.util.Numbr;
import java.util.Objects;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
@Data
@SuperBuilder(toBuilder = true)
public abstract class Quantity {

    //--- Value and Units ---
    protected final Number value;
    protected final Unit units;

    //--- How the value and units are displayed ---
    private Integer numDecimalPlaces;
    private Integer numSignificantDigits;
    private boolean includeUnits;

    protected Quantity() {
        this(null, null);
    }

    protected Quantity(Number value, Unit units) {
        this.value = roundToStdPrecision(value);
        this.units = Objects.requireNonNull(units);
    }

    //--- special getters ---

    public Number getValue() {
        return roundToStdPrecision(value);
    }

    //--- hasValue() methods ---

    public boolean hasValue() {
        return (value != null);
    }

    public boolean isNull() {
        return (value == null);
    }

    //--- getXyz() methods ---

    public Integer getInteger() {
        return hasValue() ? Math.round(value.floatValue()) : null;
    }

    public Long getLong() {
        return hasValue() ? Math.round(value.doubleValue()) : null;
    }

    public Float getFloat() {
        return hasValue() ? value.floatValue() : null;
    }

    public Double getDouble() {
        return hasValue() ? value.doubleValue() : null;
    }

    //--- xyzValue() methods ---

    public int intValue() {
        return Objects.requireNonNull(getInteger());
    }

    public long longValue() {
        return Objects.requireNonNull(getLong());
    }

    public float floatValue() {
        return Objects.requireNonNull(getFloat());
    }

    public double doubleValue() {
        return Objects.requireNonNull(getDouble());
    }

    //--- roundTo() methods ---

    public static Double roundToStdPrecision(Number val) {
        return (val != null) ? Numbr.roundToStdPrecision(val.doubleValue()) : null;
    }

    //--- "units" methods ---

    public String getAbbr() {
        return units.getAbbr();
    }

    //--- toString() methods ---

    @Override
    public String toString() {
        String str = null;
        if (hasValue()) {
            final double val = roundToStdPrecision(value);
            if (numDecimalPlaces != null) {
                final double newValue = Numbr.roundToNumDecimalPlaces(val, numDecimalPlaces);
                str = String.format("%s", newValue);
            } else if (numSignificantDigits != null) {
                final double newValue = Numbr.roundToPrecision(val, numSignificantDigits);
                str = String.format("%s", newValue);
            } else {
                str = String.format("%s", val);
            }
        }
        if ((str != null) && includeUnits) {
            str = String.format("%s %s", str, getAbbr());
        }
        return str;
    }

    public String toString(String format) {
        return (value != null) ? String.format(format, value) : "";
    }
}
