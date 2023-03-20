package com.github.rs.units.quantities.digitalstorage;

import com.github.rs.units.quantities.Quantity;
import com.github.rs.units.quantities.digitalstorage.DigitalStorageUnits.Bytes;
import com.github.rs.units.quantities.digitalstorage.DigitalStorageUnits.Kilobytes;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DigitalStorage extends Quantity<DigitalStorage, DigitalStorageUnits> {

    //@formatter:off
    // Bytes
    public static final Bytes      BYTES      = new Bytes();
    public static final Kilobytes  KILOBYTES  = new Kilobytes();
    //@formatter:on

}
