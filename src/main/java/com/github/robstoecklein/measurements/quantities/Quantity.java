package com.github.robstoecklein.measurements.quantities;

import com.github.robstoecklein.measurements.units.Unit;
import com.github.robstoecklein.measurements.util.Numbr;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Quantity {

    //--- Value and Units ---
    @Setter
    @EqualsAndHashCode.Include
    protected Number value;
    @Setter
    @EqualsAndHashCode.Include
    protected Unit units;

    //--- How the value is displayed ---
    @Setter
    private Integer numDecimalPlaces;
    @Setter
    private Integer numSignificantDigits;
    @Setter
    private boolean includeUnits;

    //--- hasValue() methods ---

    public boolean hasValue() {
        return (value != null);
    }

    public boolean isNull() {
        return (value == null);
    }

    //--- Getter methods ---

    public Number getValue() {
        return roundToStdPrecision(value);
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
        return hasValue() ? getValue().doubleValue() : null;
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

    public static Double roundToStdPrecision(Number value) {
        return (value != null) ? Numbr.roundToStdPrecision(value.doubleValue()) : null;
    }

    public static Double roundToNumDecimalPlaces(Number value, Integer numDecimalPlaces) {
        Double result = null;
        if ((value != null) && (numDecimalPlaces != null)) {
            result = Numbr.roundToNumDecimalPlaces(value.doubleValue(), numDecimalPlaces);
        }
        return result;
    }

    public static Double roundToPrecision(Number value, Integer numSignificantDigits) {
        Double result = null;
        if ((value != null) && (numSignificantDigits != null)) {
            result = Numbr.roundToPrecision(value.doubleValue(), numSignificantDigits);
        }
        return result;
    }

    //--- Convenience "units" methods ---

    public String getAbbr() {
        return units.getAbbr();
    }

    //--- toString() methods ---

    @Override
    public String toString() {

        Double dValue = null;
        dValue = roundToNumDecimalPlaces(value, numDecimalPlaces);
        if (dValue == null) {
            dValue = roundToPrecision(value, numSignificantDigits);
            if (dValue == null) {
                dValue = roundToStdPrecision(value);
            }
        }

        String result = null;
        if (dValue != null) {
            result = String.format("%s", dValue);
        }
        if ((result != null) && includeUnits) {
            result = String.format("%s %s", result, getAbbr());
        }
        return result;
    }

    public String toString(String format) {
        return (value != null) ? String.format(format, value) : "";
    }
}
