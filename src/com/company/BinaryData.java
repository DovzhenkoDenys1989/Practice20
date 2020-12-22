package com.company;

import java.util.Arrays;

public class BinaryData extends AbstractData implements Storable<Byte[]> {
    private Type type = Type.BIN;
    private Byte[] binaryData;

    public BinaryData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return Arrays.toString(binaryData);
    }

    @Override
    public Byte[] read() {
        return binaryData;
    }

    @Override
    public void write(Byte[] data) {
        this.binaryData = data;

    }

    @Override
    public Type getType() {
        return type;
    }
}

