package com.company;

public class XmlData extends AbstractData implements Storable<String> {
    private Type type = Type.XML;
    private String xmlData;

    public XmlData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return String.valueOf(xmlData);
    }

    @Override
    public String read() {
        return xmlData;
    }

    @Override
    public void write(String data) {
        this.xmlData = data;

    }

    @Override
    public Type getType() {
        return type;
    }
}
