package com.github.robstoecklein.measurements.quantities.length;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Length {

    @Test
    void verify_assortment() {
        Length length = Length.inMeters(12.3);

        // Convert to different units:
        assertThat(length.toInches().getValue(), equalTo(484.251968503937));
        assertThat(length.toFeet().getValue(), equalTo(40.3543307086614));
        assertThat(length.toMillimeters().getValue(), equalTo(12300.0));

        // Retrieve integer result:
        assertThat(length.toInches().intValue(), equalTo(484));
        assertThat(length.toInches().getInteger(), equalTo(484));

        // Retrieve long result:
        assertThat(length.toInches().longValue(), equalTo(484L));
        assertThat(length.toInches().getLong(), equalTo(484L));

        // Retrieve float result:
        assertThat(length.toInches().floatValue(), equalTo(484.25198F));
        assertThat(length.toInches().getFloat(), equalTo(484.25198F));

        // Retrieve double result:
        assertThat(length.toInches().doubleValue(), equalTo(484.251968503937));
        assertThat(length.toInches().getDouble(), equalTo(484.251968503937));

        // Retrieve string result:
        assertThat(length.toFeet().numDecimalPlaces(3).toString(), equalTo("40.354"));
        assertThat(length.toFeet().numSignificantDigits(6).toString(), equalTo("40.3543"));
        assertThat(length.toFeet().numDecimalPlaces(2).includeUnits(true).toString(), equalTo("40.35 ft"));
    }

    @Test
    void verify_conversion_constants() {
        final Length length = Length.inMeters(1.0);
        //@formatter:off
        assertThat(length.toInches()       .getValue(), equalTo(39.3700787401575));
        assertThat(length.toFeet()         .getValue(), equalTo( 3.28083989501312));
        assertThat(length.toYards()        .getValue(), equalTo( 1.09361329833771));
        assertThat(length.toMiles()        .getValue(), equalTo( 6.21371192237334E-4));
        assertThat(length.toNauticalMiles().getValue(), equalTo( 5.399568E-4));
        assertThat(length.toNanometers()   .getValue(), equalTo( 1.0e+09));
        assertThat(length.toMicrometers()  .getValue(), equalTo( 1.0e+06));
        assertThat(length.toMillimeters()  .getValue(), equalTo( 1.0e+03));
        assertThat(length.toCentimeters()  .getValue(), equalTo( 1.0e+02));
        assertThat(length.toDecimeters()   .getValue(), equalTo( 1.0e+01));
        assertThat(length.toMeters()       .getValue(), equalTo( 1.0e+00));
        assertThat(length.toKilometers()   .getValue(), equalTo( 1.0e-03));
        //@formatter:on
    }

    @Test
    void verify_inInches_method() {
        //@formatter:off
        assertThat(Length.inInches(  null).toInches().getValue(), equalTo(null));
        assertThat(Length.inInches(1357.9).toInches().getValue(), equalTo(1357.9));
        assertThat(Length.inInches(1357.9).toFeet()  .getValue(), equalTo( 113.158333333333));
        assertThat(Length.inInches(1357.9).toYards() .getValue(), equalTo(  37.7194444444444));
        assertThat(Length.inInches(1357.9).toMeters().getValue(), equalTo(  34.49066));
        assertThat(Length.inInches(1357.9).toMiles() .getValue(), equalTo(   0.0214315025252525));
        assertThat(Length.inInches(  12.0).toFeet()  .getValue(), equalTo(   1.0));
        //@formatter:on
    }

    @Test
    void verify_inFeet_method() {
        //@formatter:off
        assertThat(Length.inFeet(  null).toFeet()  .getValue(), equalTo(null));
        assertThat(Length.inFeet(135.79).toInches().getValue(), equalTo(1629.48));
        assertThat(Length.inFeet(135.79).toFeet()  .getValue(), equalTo( 135.79));
        assertThat(Length.inFeet(135.79).toYards() .getValue(), equalTo(  45.2633333333333));
        assertThat(Length.inFeet(135.79).toMeters().getValue(), equalTo(  41.388792));
        assertThat(Length.inFeet(135.79).toMiles() .getValue(), equalTo(   0.025717803030303));
        assertThat(Length.inFeet(  3.00).toYards() .getValue(), equalTo(   1.0));
        //@formatter:on
    }

    @Test
    void verify_inMeters_method() {
        //@formatter:off
        assertThat(Length.inMeters(  null).toMeters().getValue(), equalTo(null));
        assertThat(Length.inMeters(135.79).toInches().getValue(), equalTo(5346.06299212598));
        assertThat(Length.inMeters(135.79).toFeet()  .getValue(), equalTo( 445.505249343832));
        assertThat(Length.inMeters(135.79).toYards() .getValue(), equalTo( 148.501749781277));
        assertThat(Length.inMeters(135.79).toMeters().getValue(), equalTo( 135.79));
        assertThat(Length.inMeters(135.79).toMiles() .getValue(), equalTo(   0.0843759941939076));
        //@formatter:on
    }

    @Test
    void verify_getXyz_methods() {
        //@formatter:off
        assertThat(Length.inMeters(null)  .getInteger(), equalTo(null));
        assertThat(Length.inMeters(null)  .getLong(),    equalTo(null));
        assertThat(Length.inMeters(null)  .getFloat(),   equalTo(null));
        assertThat(Length.inMeters(null)  .getDouble(),  equalTo(null));
        assertThat(Length.inMeters(135.79).getInteger(), equalTo(136));
        assertThat(Length.inMeters(135.79).getLong(),    equalTo(136L));
        assertThat(Length.inMeters(135.79).getFloat(),   equalTo(135.79F));
        assertThat(Length.inMeters(135.79).getDouble(),  equalTo(135.79));
        //@formatter:on
    }

    @Test
    void verify_xyzValue_methods() {
        //@formatter:off
        assertThat(Length.inMeters(135.79).intValue(),    equalTo(136));
        assertThat(Length.inMeters(135.79).longValue(),   equalTo(136L));
        assertThat(Length.inMeters(135.79).floatValue(),  equalTo(135.79F));
        assertThat(Length.inMeters(135.79).doubleValue(), equalTo(135.79));
        //@formatter:on
    }
}
