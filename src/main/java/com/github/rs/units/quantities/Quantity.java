package com.github.rs.units.quantities;

import com.github.rs.units.util.Numbr;
import java.math.BigDecimal;
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
@SuppressWarnings({"ParameterHidesMemberVariable", "unchecked"})
public abstract class Quantity<T extends Quantity, U extends Units> {

    //--- Default values ---
    @Getter @Setter
    private static Integer defaultNumDecimalPlaces;
    @Getter @Setter
    private static Integer defaultNumSignificantDigits;
    @Getter @Setter
    private static boolean defaultIncludeUnits;

    //--- Value and Units ---
    @Setter
    @EqualsAndHashCode.Include
    protected Number value;
    @Setter
    @EqualsAndHashCode.Include
    protected Units units;

    //--- How the value is displayed ---
    @Setter
    private Integer numDecimalPlaces = defaultNumDecimalPlaces;
    @Setter
    private Integer numSignificantDigits = defaultNumSignificantDigits;
    @Setter
    private boolean includeUnits = defaultIncludeUnits;

    //--- hasValue() methods ---

    public boolean hasValue() {
        return (value != null);
    }

    public boolean isNull() {
        return (value == null);
    }

    //--- Getters ---

    public Number getValue() {
        return roundToStdPrecision(value);
    }

    //--- Setters ---

    public T value(Number value) {
        this.value = value;
        return (T)this;
    }

    public T units(Units units) {
        this.units = units;
        return (T)this;
    }

    public T numDecimalPlaces(Integer numDecimalPlaces) {
        this.numDecimalPlaces = numDecimalPlaces;
        return (T)this;
    }

    public T numSignificantDigits(Integer numSignificantDigits) {
        this.numSignificantDigits = numSignificantDigits;
        return (T)this;
    }

    public T includeUnits(boolean includeUnits) {
        this.includeUnits = includeUnits;
        return (T)this;
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

    public BigDecimal getBigDecimal() {
        return hasValue() ? BigDecimal.valueOf(getValue().doubleValue()) : null;
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

    public static Number roundToStdPrecision(Number value) {
        return (value != null) ? Numbr.roundToStdPrecision(value.doubleValue()) : null;
    }

    public static Number roundToNumDecimalPlaces(Number value, Integer numDecimalPlaces) {
        Double result = null;
        if ((value != null) && (numDecimalPlaces != null)) {
            result = Numbr.roundToNumDecimalPlaces(value.doubleValue(), numDecimalPlaces);
        }
        return result;
    }

    public static Number roundToPrecision(Number value, Integer numSignificantDigits) {
        Double result = null;
        if ((value != null) && (numSignificantDigits != null)) {
            result = Numbr.roundToPrecision(value.doubleValue(), numSignificantDigits);
        }
        return result;
    }

    //--- Conversion method ---

    protected T convert(T quantity, Number number, U newUnits) {
        return (T)quantity
                .value(units.convert(number, newUnits))
                .units(newUnits)
                .numDecimalPlaces(numDecimalPlaces)
                .numSignificantDigits(numSignificantDigits)
                .includeUnits(includeUnits);
    }

    //--- toString() methods ---

    @Override
    public String toString() {
        Number number = null;
        number = roundToNumDecimalPlaces(value, numDecimalPlaces);
        if (number == null) {
            number = roundToPrecision(value, numSignificantDigits);
            if (number == null) {
                number = roundToStdPrecision(value);
            }
        }
        String result = "";
        if (number != null) {
            result = String.format("%s", number);
        }
        if ((result != null) && includeUnits) {
            result = String.format("%s %s", result, units.getAbbr());
        }
        return result;
    }

    public String toString(String format) {
        return (value != null) ? String.format(format, value) : "";
    }
}
