package com.github.rs.units.quantities.angle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_Angle {

    @Test
    void verify_conversion_constants() {
        final Angle degrees = Angle.inDegrees(1.0);
        //@formatter:off
        assertThat(degrees.toDegrees()        .getValue(), equalTo(1.00));
        assertThat(degrees.toArcMinutes()     .getValue(), equalTo(60.00));
        assertThat(degrees.toArcSeconds()     .getValue(), equalTo(3.6e+03));
        assertThat(degrees.toMilliarcSeconds().getValue(), equalTo(3.6e+06));
        assertThat(degrees.toMicroarcSeconds().getValue(), equalTo(3.6e+09));
        assertThat(degrees.toRadians()        .getValue(), equalTo(0.0174532925199433));
        assertThat(degrees.toMilliradians()   .getValue(), equalTo(17.4532925199433));
        assertThat(degrees.toMicroradians()   .getValue(), equalTo(17453.2925199433));
        assertThat(degrees.toGradians()       .getValue(), equalTo(1.11111111111111));
        assertThat(degrees.toRevloutions()    .getValue(), equalTo(0.00277777777777778));
        //@formatter:on
    }
}
