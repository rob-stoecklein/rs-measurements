package com.github.robstoecklein.quantities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Length {

    @Test
    void verify_inInches_method() {
        //@formatter:off
        assertThat(Length.inInches(1357.9).toInches().getValue(), equalTo(1357.8999999999999));
        assertThat(Length.inInches(1357.9).toFeet()  .getValue(), equalTo( 113.15833333333333));
        assertThat(Length.inInches(1357.9).toYards() .getValue(), equalTo(  37.719444444444434));
        assertThat(Length.inInches(1357.9).toMeters().getValue(), equalTo(  34.49066));
        assertThat(Length.inInches(1357.9).toMiles() .getValue(), equalTo(   0.021431502525252524));
        assertThat(Length.inInches(  12.0).toFeet()  .getValue(), equalTo(   1.0));
        //@formatter:on
    }

    @Test
    void verify_inFeet_method() {
        //@formatter:off
        assertThat(Length.inFeet(135.79).toInches().getValue(), equalTo(1629.4799999999998));
        assertThat(Length.inFeet(135.79).toFeet()  .getValue(), equalTo( 135.79));
        assertThat(Length.inFeet(135.79).toYards() .getValue(), equalTo(  45.26333333333332));
        assertThat(Length.inFeet(135.79).toMeters().getValue(), equalTo(  41.388791999999995));
        assertThat(Length.inFeet(135.79).toMiles() .getValue(), equalTo(   0.025717803030303025));
        assertThat(Length.inFeet(  3.00).toYards() .getValue(), equalTo(   0.9999999999999998));
        //@formatter:on
    }

}
