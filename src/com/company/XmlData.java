package com.company;

//        4. Создать классы NumericData, BinaryData, XmlData.
//        • Отнаследовать классы от AbstractData
//        • Для всех классов создать константное значение с типом (из enum-а Type)
//        • Для всех классов добавить поля data (но для каждого с разным типом)
//        • XmlData – строка с xml
//        • BinaryData – массив байтов
//        • NumericData – абстрактный числовой тип (Number)
//        • Реализовать интерфейс Storable<класс>
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
