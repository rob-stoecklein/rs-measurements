# rs-measurements

Set of classes that make creating, transmitting, and outputing measurement quantities (values with units) easier.

For example:

```java
import com.github.robstoecklein.measurements.quantities.length.Length;
import com.github.robstoecklein.measurements.quantities.temperature.Temperature;

public class MyClass() {

    private Length distance;
    private Temperature temperature;

    public void gatherData() {
        distance = Length.inMeters(123.4);
        temperature = Temperature.inCelsius(76.5);
    }

    public void outputData() {
        Distance numFeet = distance.toFeet();
        log.info("distance = {} {}", numFeet.getInteger(), numFeet.getAbbr());
        log.info("temperature = {}", temperature.toFahrenheit().toString("%.2f"));
    }
}
```

You can also use this library for simple conversions:

```java
import com.github.robstoecklein.measurements.quantities.length.Length;

public class MyClass() {

    /**
     * Convert given distance (in inches) to millimeters.
     */
    public double someMethod(double distance) {
        return Length.inInches(distance).toMillimeters().getDouble();
    }
}
```
