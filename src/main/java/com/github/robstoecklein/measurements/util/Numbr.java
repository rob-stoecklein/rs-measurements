package com.github.robstoecklein.measurements.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Numbr {

    public static final double DOUBLE_COMPARISON_DELTA = 1.0e-11;

    /**
     * Rounds the given value to the nearest multiple of precision.
     *
     * <pre>
     * Numbr.round(17387, 0) = 0
     * Numbr.round(17387, 1) = 17387
     * Numbr.round(17387, 2) = 17388
     * Numbr.round(17387, 10) = 17390
     * Numbr.round(17387, 100) = 17400
     * Numbr.round(17387, 500) = 17500
     * Numbr.round(17387, 1000) = 17000
     * Numbr.round(-1689, 10) = -1690
     * </pre>
     *
     * @since 1.0
     */
    public static long round(final long value, final long precision) {
        long val = value;
        if (precision >= 1) {
            final long signedPrecision = (val >= 0) ? precision : -precision;
            val += (signedPrecision / 2);
            val /= precision;
            val *= precision;
        } else {
            val = 0;
        }
        return val;
    }

    /**
     * Rounds the given value to the nearest multiple of precision.
     *
     * <pre>
     * Numbr.round(58.915, 0.0001) = 58.915
     * Numbr.round(58.915, 0.001 ) = 58.915
     * Numbr.round(58.915, 0.01 ) = 58.92
     * Numbr.round(58.915, 0.1 ) = 58.9
     * Numbr.round(58.915, 1.0 ) = 59.0
     * Numbr.round(58.915, 10.0 ) = 60.0
     * Numbr.round(58.915, 100.0 ) = 100.0
     * Numbr.round(58.915, 1000.0 ) = 0.0
     * Numbr.round(-58.915, 0.01 ) = -58.92
     * Numbr.round(-58.915, 1.0 ) = -59.0
     * </pre>
     *
     * @since 1.0
     */
    public static double round(final double value, final double precision) {
        final double signedTweak = (value >= 0.0) ? DOUBLE_COMPARISON_DELTA : -DOUBLE_COMPARISON_DELTA;
        return Math.round((value + signedTweak) / precision) * precision;
    }

    /**
     * Rounds the given value to given number of decimal places.
     *
     * <pre>
     * Numbr.round(58.915, -1) = 60.000
     * Numbr.round(58.915, 0) = 59.000
     * Numbr.round(58.915, 1) = 58.900
     * Numbr.round(58.915, 2) = 58.920
     * Numbr.round(58.915, 3) = 59.915
     * Numbr.round(58.915, 4) = 59.915
     * </pre>
     *
     * @param value            input number that gets rounded
     * @param numDecimalPlaces number of decimal places to round; a value between 0 and 10
     * @return rounded value
     */
    public static double roundToNumDecimalPlaces(final double value, final int numDecimalPlaces) {
        return BigDecimal.valueOf(value).setScale(numDecimalPlaces, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     *
     */
    public static double roundToPrecision(final double value, final int numSignificantDigits) {
        final MathContext mathContext = new MathContext(numSignificantDigits, RoundingMode.HALF_UP);
        final BigDecimal bigDecimal = new BigDecimal(value, mathContext);
        return bigDecimal.doubleValue();
    }

    /**
     * Rounds the given value to a precision of 15 digits.
     * Doubles provide 15.95 decimal digits of precision (some sites report 15-16 digits).
     * https://en.wikipedia.org/wiki/IEEE_754
     *
     * <pre>
     * final double d1 = Convert.toMicros(Convert.fromMicros(123.45678));
     * assertEquals(123.45678000000001, d1);
     * final double d2 = Numbr.roundToStdPrecision(d1);
     * assertEquals(123.45678, d2);
     * </pre>
     *
     * @since 5.1.6
     */
    @SuppressWarnings("MagicNumber")
    public static double roundToStdPrecision(final double value) {
        return roundToPrecision(value, 15);
    }
}
