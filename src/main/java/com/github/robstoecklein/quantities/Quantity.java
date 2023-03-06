package com.github.robstoecklein.quantities;

import com.github.robstoecklein.units.Unit;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Quantity {

    protected final Double value;
    protected final Unit units;

    public boolean hasValue() {
        return (value != null);
    }

    public boolean isNull() {
        return (value == null);
    }
}
