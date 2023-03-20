package com.github.robstoecklein.measurements.quantities.frequency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Frequency {

    @Test
    void verify_conversion_constants() {
        final Frequency frequency = Frequency.inHertz(1.0);
        //@formatter:off
        assertThat(frequency.toMicrohertz() .getValue(), equalTo(1.0e+06));
        assertThat(frequency.toMilliohertz().getValue(), equalTo(1.0e+03));
        assertThat(frequency.toHertz()      .getValue(), equalTo(1.0e+00));
        assertThat(frequency.toKilohertz()  .getValue(), equalTo(1.0e-03));
        assertThat(frequency.toMegahertz()  .getValue(), equalTo(1.0e-06));
        assertThat(frequency.toGigahertz()  .getValue(), equalTo(1.0e-09));
        assertThat(frequency.toTerahertz()  .getValue(), equalTo(1.0e-12));
        assertThat(frequency.toPetahertz()  .getValue(), equalTo(1.0e-15));
        assertThat(frequency.toExahertz()   .getValue(), equalTo(1.0e-18));
        //@formatter:on
    }
}
