package com.company;

public class NumericData extends AbstractData implements Storable<Number> {
    private Type type = Type.NUM;
    private Number numericData;

    public NumericData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return String.valueOf(numericData);
    }

    @Override
    public Number read() {
        return numericData;
    }

    @Override
    public void write(Number data) {
        this.numericData = data;

    }

    @Override
    public Type getType() {
        return type;
    }
}


