package com.github.robstoecklein.units;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * https://en.wikipedia.org/wiki/List_of_metric_units
 * https://en.wikipedia.org/wiki/Unified_Code_for_Units_of_Measure
 * https://en.wikipedia.org/wiki/United_States_customary_units
 * https://en.wikipedia.org/wiki/International_System_of_Units
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MathConstants {

    // EXPONENT
    public static final double NUM_MILLIS = 1.0e+03;
    public static final double NUM_MICROS = 1.0e+06;

    // LENGTH
    //@formatter:off
    public static final double INCHES_PER_FOOT  = 12.0;
    public static final double INCHES_PER_YARD  = 36.0;
    public static final double INCHES_PER_METER = 1 / 0.0254;
    public static final double INCHES_PER_MILE  = 63360.0;

    public static final double FEET_PER_INCH    = 1 / INCHES_PER_FOOT;
    public static final double FEET_PER_YARD    = 3.0;
    public static final double FEET_PER_METER   = INCHES_PER_METER * FEET_PER_INCH;
    public static final double FEET_PER_MILE    = 5280.0;

    public static final double METERS_PER_INCH  = 1 / INCHES_PER_METER;
    public static final double METERS_PER_FOOT  = 1 / FEET_PER_METER;
    public static final double METERS_PER_YARD  = METERS_PER_FOOT * FEET_PER_YARD;
    public static final double METERS_PER_MILE  = METERS_PER_FOOT * FEET_PER_MILE;

    public static final double YARDS_PER_INCH   = 1 / INCHES_PER_YARD;
    public static final double YARDS_PER_FOOT   = 1 / FEET_PER_YARD;
    public static final double YARDS_PER_METER  = 1 / METERS_PER_YARD;
    public static final double YARDS_PER_MILE   = FEET_PER_MILE / FEET_PER_YARD;

    public static final double MILES_PER_INCH   = 1 / INCHES_PER_MILE;
    public static final double MILES_PER_FOOT   = 1 / FEET_PER_MILE;
    public static final double MILES_PER_YARD   = 1 / YARDS_PER_MILE;
    public static final double MILES_PER_METER  = 1 / METERS_PER_MILE;
    //@formatter:on

    // VOLUME
    //@formatter:off
    public static final double OUNCES_PER_CUP        =   8.0;
    public static final double OUNCES_PER_PINT       =  16.0;
    public static final double OUNCES_PER_QUART      =  32.0;
    public static final double OUNCES_PER_GALLON     = 128.0;
    public static final double OUNCES_PER_LITER      =  33.81402;
    public static final double OUNCES_PER_MILLILITER = OUNCES_PER_LITER * NUM_MILLIS;

    public static final double PINTS_PER_LITER       = OUNCES_PER_LITER / OUNCES_PER_PINT;
    public static final double CUPS_PER_LITER        = OUNCES_PER_LITER / OUNCES_PER_CUP;
    public static final double QUARTS_PER_LITER      = OUNCES_PER_LITER / OUNCES_PER_QUART;
    public static final double GALLONS_PER_LITER     = OUNCES_PER_LITER / OUNCES_PER_GALLON;

    public static final double MILLILITERS_PER_OUNCE = 1 / OUNCES_PER_MILLILITER;
    public static final double MILLILITERS_PER_LITER = NUM_MILLIS;

    public static final double TABLESPOONS_US_PER_CUPS_US_CUST = 16.0;
    public static final double TEASPOONS_US_PER_TABLESPOON_US  =  3.0;

    public static final double LITERS_PER_OUNCE_US      =  0.0295735295625;
    public static final double LITERS_PER_TABLESPOON_US =  67.62804;
    public static final double LITERS_PER_TEASPOON_US   = 202.8841;
    //@formatter:on
}
