# rs-measurements (v0.0.1)

Have you ever run across code like this?

``` java
 double speed = 32.17;
```

Is the given speed in miles-per-hour? kilometers-per-hour? cm-per-second? Or what?

Having worked on numerous engineering projects, I've seen this type of coding way too often, and it's led to wasted time and goofy bugs because the code receiving the speed must somehow _know_ what the units are.

One way to fix this is to write:

``` java
 double speedInMph = 32.17;
```

Ah, that's better. But what if I'm writing code for a user interface and we need to display speed in km/hr?

No problem. Just figure out how many kilometers are in a mile and then multiple (or is it divide?) by that number to get your desired units:

``` java
 double speedInMph = 32.17;
 double speedInKph = speedInMph * NUM_MILES_PER_KILOMETER; 
```

Okay, that works.

Now what about other units of speed?

What about other quantities, like temperatures, or volumes, or pressures, or..?

Sheesh. This seems like a lot of boilerplate code that should already exist in some off-the-shelf library.

Couldn't we simply write something like:

``` java
 Speed speed = Speed.inMph(32.17);
```

And when we wanted to convert to another unit we'd just write:

``` java
 double speed2 = speed.toKmPerHr().getDouble();
```

Or even:

``` java
 String str = speed.toKmPerHr().numDecimalPlaces(2).toString();
```

This Java library solves these issues, and more:

* Measurement quantities are now an inseparable pair of **magnitude** and **units**.
* It is trivial to **convert** from one unit to another, like "feet to meters" or "liters to gallons".
* Values can be `null` with no ill side effects.
* Values can be retrieved as `int`, `long`, `float`, and `double` non-null values. 
* Values can be retrieved as `Integer`, `Long`, `Float`, and `Double` nullable values.
* Values can be formatted to strings:
  * by specifying number of decimal digits
  * by specifying number of significant digits (i.e., "precision")
  * by displaying the units (or not)
  * by allowing for user-defined custom formats

In other words, this library of classes are used in creating, transmitting, and outputing measurement quantities easier and more reliably.

Here's some unit tests that demonstrate some of this library's capabilities:

```java
class UT_Length {
    @Test
    void verify_assortment() {
        Length length = Length.inMeters(12.3);

        // Convert to different units:
        assertThat(length.toInches().getValue(), equalTo(484.251968503937));
        assertThat(length.toFeet().getValue(), equalTo(40.3543307086614));
        assertThat(length.toMillimeters().getValue(), equalTo(12300.0));

        // Retrieve integer result:
        assertThat(length.toInches().intValue(), equalTo(484));
        assertThat(length.toInches().getInteger(), equalTo(484));

        // Retrieve long result:
        assertThat(length.toInches().longValue(), equalTo(484L));
        assertThat(length.toInches().getLong(), equalTo(484L));

        // Retrieve float result:
        assertThat(length.toInches().floatValue(), equalTo(484.25198F));
        assertThat(length.toInches().getFloat(), equalTo(484.25198F));

        // Retrieve double result:
        assertThat(length.toInches().doubleValue(), equalTo(484.251968503937));
        assertThat(length.toInches().getDouble(), equalTo(484.251968503937));

        // Retrieve string result:
        assertThat(length.toFeet().numDecimalPlaces(3).toString(), equalTo("40.354"));
        assertThat(length.toFeet().numSignificantDigits(6).toString(), equalTo("40.3543"));
        assertThat(length.toFeet().numDecimalPlaces(1).includeUnits(true).toString(), equalTo("40.4 ft"));

        // Nulls are handled:
        assertThat(Length.inMeters(null).toInches().getValue(), equalTo(null));
        assertThat(Length.inMeters(null).toFeet().numSignificantDigits(2).toString(), equalTo(""));

        // Custom formatting:
        assertThat(length.toFeet().toString("%e feet"), equalTo("4.035433e+01 feet"));
    }
}
```

The size of the JAR file is 43K.
