# rs-measurements

Have you ever run across code like this?

``` java
 double speed = 32.17;
```

Is the speed in miles-per-hour? kilometers-per-hour? cm-per-second? or..?

Having worked on numerous engineering projects, I've seen this type of coding way too much, and it's led to wasted time and goofy bugs, because the code receiving the speed must somehow _know_ what the units are.

One way to fix this is to write:

``` java
 double speedInMph = 32.17;
```

Ah, that's better. But what if I'm writing code for a user interface and we need to display speed in km/hr?

No problem you say. Just figure out how many kilometers are in a mile and then multiple (or is it divide) by that number to get your desired units.

``` java
 double speedInMph = 32.17;
 double speedInKph = speedInMph * NUM_MILES_PER_KILOMETER; 
```

Okay, that works. Now what about other units of speed? How about temperatures? Or volumes? Or pressures?

Sheesh. This seems like a lot of boilerplate code that should already exist in some off-the-shelf library.

Couldn't we simply write something like:

``` java
 Speed speed = Speed.inMph(32.17);
```

And when we wanted to convert to another unit we simply write:

``` java
 double speed2 = speed.toKmPerHr().getDouble();
```

Or even:

``` java
 String str = speed.toKmPerHr().numDecimalPlaces(2).toString();
```

This Java library solves these issues, and more:

* Measurement quantities contain not only their magnitude (values), but also their units, so that now these form an inseparable pair.
* It is trivial to convert from one unit to another, like "feet to meters" or "liters to gallons".
* Values can be `null` with no ill side effects.
* Values can be retrieved as `int`, `long`, `float`, and `double` non-nullable values. 
* Values can be retrieved as `Integer`, `Long`, `Float`, and `Double` nullable values.
* Values can be formatted to strings:
  * by specifying number of decimal digits
  * by specifying number of significant digits (i.e., "precision")
  * by displaying the units, or not
  * by allowing for user-defined custom format

In other words, this library of classes are used in creating, transmitting, and outputing measurement quantities easier and more reliably.

---

For example:

``` java
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

``` java
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
