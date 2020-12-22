package com.company;


public class Main {
    public static void main(String[] args) {
        XmlData xmlData = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER++);

        String xmlData_new = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        byte[] binary = "Данные в байтах".getBytes();
        Byte[] bytes = new Byte[binary.length];
        int a = 0;
        for (Byte b : binary) {
            bytes[a++] = b;
        }
        System.out.println(bytes.length);
        Double d = 123.456789;

        DocumentProcessorUtil.build(xmlData, xmlData_new);
        DocumentProcessorUtil.build(binaryData, bytes);
        DocumentProcessorUtil.build(numericData, d);

        System.out.println(DocumentProcessorUtil.convert(xmlData));
        System.out.println(DocumentProcessorUtil.convert(binaryData));
        System.out.println(DocumentProcessorUtil.convert(numericData));
    }
}
