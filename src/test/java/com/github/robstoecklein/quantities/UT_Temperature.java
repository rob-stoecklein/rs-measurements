package com.github.robstoecklein.quantities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Temperature {

    @Test
    void verify_inFahrenheit_method() {
        //@formatter:off
        assertThat(Temperature.inFahrenheit( null).toCelsius()   .getValue(), equalTo(  null));
        assertThat(Temperature.inFahrenheit( 32.0).toCelsius()   .getValue(), equalTo(  0.00));
        assertThat(Temperature.inFahrenheit( 32.0).toKelvin()    .getValue(), equalTo(273.15));
        assertThat(Temperature.inFahrenheit(212.0).toCelsius()   .getValue(), equalTo(100.00));
        assertThat(Temperature.inFahrenheit(212.0).toKelvin()    .getValue(), equalTo(373.15));
        assertThat(Temperature.inFahrenheit( 99.9).toFahrenheit().getValue(), equalTo( 99.90));
        //@formatter:on
    }

    @Test
    void verify_inCelsius_method() {
        //@formatter:off
        assertThat(Temperature.inCelsius( null).toFahrenheit().getValue(), equalTo(  null));
        assertThat(Temperature.inCelsius(  0.0).toFahrenheit().getValue(), equalTo( 32.00));
        assertThat(Temperature.inCelsius(  0.0).toKelvin()    .getValue(), equalTo(273.15));
        assertThat(Temperature.inCelsius(100.0).toFahrenheit().getValue(), equalTo(212.00));
        assertThat(Temperature.inCelsius(100.0).toKelvin()    .getValue(), equalTo(373.15));
        assertThat(Temperature.inCelsius( 99.9).toCelsius()   .getValue(), equalTo( 99.90));
        //@formatter:on
    }

    @Test
    void verify_inKelvin_method() {
        //@formatter:off
        assertThat(Temperature.inKelvin( null).toCelsius()   .getValue(), equalTo(   null));
        assertThat(Temperature.inKelvin(  0.0).toCelsius()   .getValue(), equalTo(-273.15));
        assertThat(Temperature.inKelvin(  0.0).toFahrenheit().getValue(), equalTo(-459.67));
        assertThat(Temperature.inKelvin(678.9).toCelsius()   .getValue(), equalTo( 405.75));
        assertThat(Temperature.inKelvin(678.9).toFahrenheit().getValue(), equalTo( 762.35));
        assertThat(Temperature.inKelvin( 99.9).toKelvin()    .getValue(), equalTo(  99.90));
        //@formatter:on
    }
}
