package com.github.robstoecklein.measurements.quantities;

import com.github.robstoecklein.measurements.units.Unit;
import com.github.robstoecklein.measurements.util.Numbr;
import java.util.Objects;
import lombok.Data;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
@Data
public abstract class Quantity {

    protected final Number value;
    protected final Unit units;

    protected Quantity(Number value, Unit units) {
        this.value = roundToStdPrecision(value);
        this.units = Objects.requireNonNull(units);
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

    //    public Quantity roundToPrecision(final int numSignificantDigits) {
    //        final Double newValue = roundToPrecision(value, numSignificantDigits);
    //        return newInstance(newValue, units);
    //    }

    //    public Quantity roundToNumDecimalPlaces(final int numDecimalPlaces) {
    //        final Double newValue = roundToNumDecimalPlaces(value, numDecimalPlaces);
    //        return newInstance(newValue, units);
    //    }
}
