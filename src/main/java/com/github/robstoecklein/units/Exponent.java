package com.github.robstoecklein.units;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum Exponent {
    //@formatter:off
    TERAS   ("tera",  "t",  12, 1.0e+12),  // trillions
    GIGS    ("giga",  "g",   9, 1.0e+09),  // billions
    MEGS    ("mega",  "m",   6, 1.0e+06),  // millions
    KILOS   ("kilo",  "k",   3, 1.0e+03),  // thousands
    HECTOS  ("hecto", "h",   2, 1.0e+02),  // hundreds
    DEKAS   ("deka",  "da",  1, 1.0e+01),  // tens
    STANDARD("",      "",    0, 1.0e+00),  // one
    DECIS   ("deci",  "d",  -1, 1.0e-01),  // tenths
    CENTIS  ("centi", "c",  -2, 1.0e-02),  // hundredths
    MILLIS  ("milli", "m",  -3, 1.0e-03),  // thousandths
    MICROS  ("micro", "u",  -6, 1.0e-06),  // millionths
    NANOS   ("nano",  "n",  -9, 1.0e-09),  // billionths
    PICOS   ("pico",  "p", -12, 1.0e-12);  // trillionths
    //@formatter:on

    private final String prefix;
    private final String abbr;
    private final int exponent;
    private final double conversionFactorToStandard;
}
