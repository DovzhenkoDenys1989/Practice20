package com.company;

//        4. Создать классы NumericData, BinaryData, XmlData.
//        • Отнаследовать классы от AbstractData
//        • Для всех классов создать константное значение с типом (из enum-а Type)
//        • Для всех классов добавить поля data (но для каждого с разным типом)
//        • XmlData – строка с xml
//        • BinaryData – массив байтов
//        • NumericData – абстрактный числовой тип (Number)
//        • Реализовать интерфейс Storable<класс>

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

