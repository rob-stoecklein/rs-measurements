package com.github.rs.units.units;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Metric prefixes.
 * https://en.wikipedia.org/wiki/Metric_prefix
 *
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
@Getter
@ToString
@AllArgsConstructor
public enum Exponent {
    //@formatter:off
    QUETTA("quetta", "Q",  30, 1.0e+30),
    RONNA ("ronna",  "R",  27, 1.0e+27),
    YOTTA ("yotta",  "Y",  24, 1.0e+24),
    ZETTA ("zetta",  "Z",  21, 1.0e+21),
    EXA   ("exa",    "E",  18, 1.0e+18),
    PETA  ("peta",   "P",  15, 1.0e+15),
    TERA  ("tera",   "T",  12, 1.0e+12),  // trillions
    GIGA  ("giga",   "G",   9, 1.0e+09),  // billions
    MEGA  ("mega",   "M",   6, 1.0e+06),  // millions
    KILO  ("kilo",   "k",   3, 1.0e+03),  // thousands
    HECTO ("hecto",  "h",   2, 1.0e+02),  // hundreds
    DECA  ("deka",   "da",  1, 1.0e+01),  // tens
    STD   ("",       "",    0, 1.0e+00),  // one
    DECI  ("deci",   "d",  -1, 1.0e-01),  // tenths
    CENTI ("centi",  "c",  -2, 1.0e-02),  // hundredths
    MILLI ("milli",  "m",  -3, 1.0e-03),  // thousandths
    MICRO ("micro",  "µ",  -6, 1.0e-06),  // millionths
    NANO  ("nano",   "n",  -9, 1.0e-09),  // billionths
    PICO  ("pico",   "p", -12, 1.0e-12),  // trillionths
    FEMTO ("femto",  "f", -15, 1.0e-15),
    ATTO  ("atto",   "a", -18, 1.0e-18),
    ZEPTO ("zepto",  "z", -21, 1.0e-21),
    YOCTO ("yocto",  "y", -24, 1.0e-24),
    RONTO ("ronto",  "r", -27, 1.0e-27),
    QUECTO("quecto", "q", -30, 1.0e-30);
    //@formatter:on

    private final String prefix;
    private final String abbr;
    private final int exponent;
    private final double conversionFactor;

    public double numberPerStd() {
        return 1 / conversionFactor;
    }
}
