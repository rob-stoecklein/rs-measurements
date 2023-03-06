package com.github.robstoecklein.quantities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Temperature {

    @Test
    void verify_inFahrenheit_method() {
        //@formatter:off
        assertThat(Temperature.inFahrenheit( 32.0).toCelsius()   .getValue(), equalTo(  0.0));
        assertThat(Temperature.inFahrenheit( 72.5).toCelsius()   .getValue(), equalTo( 22.5));
        assertThat(Temperature.inFahrenheit(212.0).toCelsius()   .getValue(), equalTo(100.0));
        assertThat(Temperature.inFahrenheit( 99.9).toFahrenheit().getValue(), equalTo( 99.9));
        //@formatter:on
    }

    @Test
    void verify_inCelsius_method() {
        //@formatter:off
        assertThat(Temperature.inCelsius(  0.0).toFahrenheit().getValue(), equalTo( 32.0));
        assertThat(Temperature.inCelsius( 22.5).toFahrenheit().getValue(), equalTo( 72.5));
        assertThat(Temperature.inCelsius(100.0).toFahrenheit().getValue(), equalTo(212.0));
        assertThat(Temperature.inCelsius( 99.9).toCelsius()   .getValue(), equalTo( 99.9));
        //@formatter:on
    }
}
