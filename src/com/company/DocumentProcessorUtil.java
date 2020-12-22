package com.company;

public class DocumentProcessorUtil {
    public static long ID_COUNTER;

    private DocumentProcessorUtil() {
    }

    static <T extends AbstractData & Storable> StringData convert(T data) {
        return new StringData(ID_COUNTER++, data.getType(), data);

    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
