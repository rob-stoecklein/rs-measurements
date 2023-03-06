package com.github.robstoecklein.quantities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Length {

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

    @Test
    void verify_next() {
        //assertThat(Length.inMeters(135.79, Exponent.MILLIS).toMeters().doubleValue(), equalTo(0.13579));
        //assertThat(Length.inMeters(0.13579).toMeters(Exponent.MILLIS).doubleValue(), equalTo(135.79));

        //assertThat(Length.inMilliMeters(135.79).toMeters().doubleValue(), equalTo(0.13579));
        //assertThat(Length.inMeters(0.13579).toMilliMeters().doubleValue(), equalTo(135.79));
    }
}
