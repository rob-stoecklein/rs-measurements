package com.github.rs.units.quantities.digitalstorage;

import com.github.rs.units.quantities.Units;
import com.github.rs.units.util.MathConstants;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class DigitalStorageUnits extends Units {

    //@formatter:off
    public static final double BITS_PER_NIBBLE     = 4;
    public static final double BITS_PER_BYTE       = 8;

    public static final double NIBBLES_PER_BYTE    = 2;

    public static final double BYTES_PER_BIT       = 1 / BITS_PER_BYTE;
    public static final double BYTES_PER_NIBBLE    = 1 / NIBBLES_PER_BYTE;

    public static final double BYTES_PER_KILOBYTE  = 1000;                                   // 1.0e+03;
    public static final double BYTES_PER_MEGABYTE  = StrictMath.pow(BYTES_PER_KILOBYTE, 2);  // 1.0e+06
    public static final double BYTES_PER_GIGABYTE  = StrictMath.pow(BYTES_PER_KILOBYTE, 3);  // 1.0e+09
    public static final double BYTES_PER_TERABYTE  = StrictMath.pow(BYTES_PER_KILOBYTE, 4);  // 1.0e+12
    public static final double BYTES_PER_PETABYTE  = StrictMath.pow(BYTES_PER_KILOBYTE, 5);  // 1.0e+15
    public static final double BYTES_PER_EXABYTE   = StrictMath.pow(BYTES_PER_KILOBYTE, 6);  // 1.0e+18
    public static final double BYTES_PER_ZETABYTE  = StrictMath.pow(BYTES_PER_KILOBYTE, 7);  // 1.0e+21
    public static final double BYTES_PER_YOTTABYTE = StrictMath.pow(BYTES_PER_KILOBYTE, 8);  // 1.0e+24

    public static final double BYTES_PER_KIBIBYTE  = 1024;                                   //                             1,024
    public static final double BYTES_PER_MEBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 2);  //                         1,048,576
    public static final double BYTES_PER_GIBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 3);  //                     1,073,741,824
    public static final double BYTES_PER_TEBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 4);  //                 1,099,511,627,776
    public static final double BYTES_PER_PEBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 5);  //             1,125,899,906,842,624
    public static final double BYTES_PER_EXBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 6);  //         1,152,921,504,606,846,976
    public static final double BYTES_PER_ZEBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 7);  //     1,180,591,620,717,411,303,424
    public static final double BYTES_PER_YOBIBYTE  = StrictMath.pow(BYTES_PER_KIBIBYTE, 8);  // 1,208,925,819,614,629,174,706,176

    public static final double KILOBYTES_PER_BYTE  = 1 / BYTES_PER_KILOBYTE;                 // 1.0e-03
    public static final double MEGABYTES_PER_BYTE  = 1 / BYTES_PER_MEGABYTE;                 // 1.0e-06
    public static final double GIGABYTES_PER_BYTE  = 1 / BYTES_PER_GIGABYTE;                 // 1.0e-09
    public static final double TERABYTES_PER_BYTE  = 1 / BYTES_PER_TERABYTE;                 // 1.0e-12
    public static final double PETABYTES_PER_BYTE  = 1 / BYTES_PER_PETABYTE;                 // 1.0e-15
    public static final double EXABYTES_PER_BYTE   = 1 / BYTES_PER_EXABYTE;                  // 1.0e-18
    public static final double ZETABYTES_PER_BYTE  = 1 / BYTES_PER_ZETABYTE;                 // 1.0e-21
    public static final double YOTTABYTES_PER_BYTE = 1 / BYTES_PER_YOTTABYTE;                // 1.0e-24
    ///public static final BigInteger ROBERTO  = new BigInteger("1208925819614629174706176");

    public static final double KIBIBYTES_PER_BYTE  = 1 / BYTES_PER_KIBIBYTE;                 // 9.765625e-4
    public static final double MEBIBYTES_PER_BYTE  = 1 / BYTES_PER_MEBIBYTE;
    public static final double GIBIBYTES_PER_BYTE  = 1 / BYTES_PER_GIBIBYTE;

    public static final double KILOBITS_PER_BYTE   = (KILOBYTES_PER_BYTE * BITS_PER_BYTE);
    public static final double MEGABITS_PER_BYTE   = (MEGABYTES_PER_BYTE * BITS_PER_BYTE);
    //@formatter:on

    //------------------------------------------------------------------------------------------------------------------

    public DigitalStorageUnits(String name, String abbr, Number scale) {
        super(MEASURE_DIGITAL_STORAGE, name, abbr, scale, 0.0);
    }

    //------ Bytes -----------------------------------------------------------------------------------------------------

    public static class Bytes extends DigitalStorageUnits {
        protected Bytes() {
            super("byte", "b", MathConstants.NUM_STD);  // STANDARD
        }
    }

    public static class Kilobytes extends DigitalStorageUnits {
        protected Kilobytes() {
            super("kilobyte", "KB", KILOBYTES_PER_BYTE);
        }
    }

    public static class Kibibytes extends DigitalStorageUnits {
        protected Kibibytes() {
            super("kibibyte", "KB", KIBIBYTES_PER_BYTE);
        }
    }

    public static class Megabytes extends DigitalStorageUnits {
        protected Megabytes() {
            super("megabyte", "MB", MEGABYTES_PER_BYTE);
        }
    }

    public static class Mebibytes extends DigitalStorageUnits {
        protected Mebibytes() {
            super("mebibyte", "MB", MEBIBYTES_PER_BYTE);
        }
    }

    //------ Bits ------------------------------------------------------------------------------------------------------

    public static class Kilobits extends DigitalStorageUnits {
        protected Kilobits() {
            super("kilobit", "Kb", KILOBYTES_PER_BYTE);
        }
    }

}
