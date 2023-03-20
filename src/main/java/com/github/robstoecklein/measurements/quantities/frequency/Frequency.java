package com.github.robstoecklein.measurements.quantities.frequency;

import com.github.robstoecklein.measurements.quantities.Quantity;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Exahertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Gigahertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Hertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Kilohertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Megahertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Microhertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Millihertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Petahertz;
import com.github.robstoecklein.measurements.quantities.frequency.FrequencyUnits.Terahertz;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Frequency extends Quantity<Frequency, FrequencyUnits> {

    //@formatter:off
    public static final Microhertz MICROHERTZ = new Microhertz();
    public static final Millihertz MILLIHERTZ = new Millihertz();
    public static final Hertz      HERTZ      = new Hertz();
    public static final Kilohertz  KILOHERTZ  = new Kilohertz();
    public static final Megahertz  MEGAHERTZ  = new Megahertz();
    public static final Gigahertz  GIGAHERTZ  = new Gigahertz();
    public static final Terahertz  TERAHERTZ  = new Terahertz();
    public static final Petahertz  PETAHERTZ  = new Petahertz();
    public static final Exahertz   EXAHERTZ   = new Exahertz();
    //@formatter:on

    //@formatter:off
    public static Frequency inMicrohertz (Number value) { return new Frequency().value(value).units(MICROHERTZ); }
    public static Frequency inMillihertz (Number value) { return new Frequency().value(value).units(MILLIHERTZ); }
    public static Frequency inHertz      (Number value) { return new Frequency().value(value).units(HERTZ);      }
    public static Frequency inKilohertz  (Number value) { return new Frequency().value(value).units(KILOHERTZ);  }
    public static Frequency inMegahertz  (Number value) { return new Frequency().value(value).units(MEGAHERTZ);  }
    public static Frequency inGighertz   (Number value) { return new Frequency().value(value).units(GIGAHERTZ);  }
    public static Frequency inTerahertz  (Number value) { return new Frequency().value(value).units(TERAHERTZ);  }
    public static Frequency inPetahertz  (Number value) { return new Frequency().value(value).units(PETAHERTZ);  }
    public static Frequency inExahertz   (Number value) { return new Frequency().value(value).units(EXAHERTZ);   }
    //@formatter:on

    //@formatter:off
    public Frequency toMicrohertz()  { return convert(value, MICROHERTZ); }
    public Frequency toMilliohertz() { return convert(value, MILLIHERTZ); }
    public Frequency toHertz()       { return convert(value, HERTZ);      }
    public Frequency toKilohertz()   { return convert(value, KILOHERTZ);  }
    public Frequency toMegahertz()   { return convert(value, MEGAHERTZ);  }
    public Frequency toGigahertz()   { return convert(value, GIGAHERTZ);  }
    public Frequency toTerahertz()   { return convert(value, TERAHERTZ);  }
    public Frequency toPetahertz()   { return convert(value, PETAHERTZ);  }
    public Frequency toExahertz()    { return convert(value, EXAHERTZ);   }
    //@formatter:on

    protected Frequency convert(Number number, FrequencyUnits newUnits) {
        return convert(new Frequency(), number, newUnits);
    }
}
