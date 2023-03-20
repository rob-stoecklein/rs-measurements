package com.github.rs.units.quantities.digitalstorage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class UT_DigitalStorage {

    @Test
    void verify_conversion_constants() {
        //@formatter:off
        assertThat(DigitalStorageUnits.BYTES_PER_YOTTABYTE, equalTo(1.0e24));
        assertThat(DigitalStorageUnits.BYTES_PER_YOBIBYTE,  equalTo(1.2089258196146292e24));
        //@formatter:on
    }
}
