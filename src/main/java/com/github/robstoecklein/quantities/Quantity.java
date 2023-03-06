package com.github.robstoecklein.quantities;

import com.github.robstoecklein.units.Unit;
import com.github.robstoecklein.util.Numbr;
import java.util.Objects;
import lombok.Data;

@Data
public abstract class Quantity {

    protected final Double value;
    protected final Unit units;

    protected Quantity(Double value, Unit units) {
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
        return hasValue() ? Math.round(value) : null;
    }

    public Float getFloat() {
        return hasValue() ? value.floatValue() : null;
    }

    public Double getDouble() {
        return hasValue() ? value : null;
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

    public static Double roundToStdPrecision(Double val) {
        return (val != null) ? Numbr.roundToStdPrecision(val) : null;
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
