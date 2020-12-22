package com.company;

public class StringData extends AbstractData {
    private Type type;
    private String data;

    public <T extends AbstractData> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.convertToString();

    }

    @Override
    public String toString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                "} ";
    }

    @Override
    String convertToString() {
        return String.valueOf(data);
    }
}
