package com.github.robstoecklein.units;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MathConstants {

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
}
