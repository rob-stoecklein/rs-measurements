package com.github.robstoecklein.measurements.quantities.mass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Mass {

    @Test
    void verify_conversion_constants() {
        final Mass mass = Mass.inKilograms(1.0);
        //@formatter:off
        assertThat(mass.toOunces()    .getValue(), equalTo(35.2739619495804));
        assertThat(mass.toPounds()    .getValue(), equalTo( 2.20462262184878));
        assertThat(mass.toTons()      .getValue(), equalTo( 1.10231131092439e-03));
        assertThat(mass.toMilligrams().getValue(), equalTo( 1.0e+06));
        assertThat(mass.toGrams()     .getValue(), equalTo( 1.0e+03));
        assertThat(mass.toKilograms() .getValue(), equalTo( 1.0e+00));
        assertThat(mass.toMetricTons().getValue(), equalTo( 1.0e-03));
        //@formatter:on
    }
}
