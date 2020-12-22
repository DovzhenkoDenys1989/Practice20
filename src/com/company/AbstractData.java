package com.company;

public abstract class AbstractData {
    private long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    abstract String convertToString();

}
//1. Создать абстрактный класс AbstractData
//        • Добавить в него поле: long id;
//        • Создать конструктор с параметром
//        • Создать геттер для ID
//        • Никаких абстрактных методов пока не нужно.
//        2. Создать интерфейс Storable
//        • В интерфейс добавить обобщения <S>, где S – внутренний тип для поля data;
//        • Описать методы:
//        S read();
//        void write(S data);
//        Type getType();
//        3. Jeneric в конструкторе.
//        • Создать класс StringData наследующий AbstractData
//        • В классе создать 2 поля:
//        Type type; // создать enum c типами (XML,BIN,NUM)
//        String data; // данные файла в виде строки
//        • Создать конструктор с полями long id, Type type, T data
//        • Указать Generic для конструктора <T extends AbstractData & Storable>
//• В конструкторе выполнить присвоение полей, а для поля сохранить строковое
//        представление пришедшего объекта (toString();)
//        4. Создать классы NumericData, BinaryData, XmlData.
//        • Отнаследовать классы от AbstractData
//        • Для всех классов создать константное значение с типом (из enum-а Type)
//        • Для всех классов добавить поля data (но для каждого с разным типом)
//        • XmlData – строка с xml
//        • BinaryData – массив байтов
//        • NumericData – абстрактный числовой тип (Number)
//        • Реализовать интерфейс Storable<класс>
//5. Создать класс DocumentProcessorUtil
//        • Создать статическое поле ID_COUNTER, для реализации счетчика id
//        • Создать приватный конструктор.
//        • Создать метод StringData convert(T data);
//        Generic: <T extends AbstractData & Storable>
//• В методе необходимо создать и вернуть экземпляр класса StringData.
//        • В качестве id передать инкрементное значение счетчика
//        • В качестве значения типа – вызвать метод getType();
//        • В качестве значения данных - data
//        • Создать статический метод <T> void build(Storable storeObj, T data);
//        • Внутри метода «записать» входящие данные в объект storeObj (метод write() )
//        6. Создать класс Main
//        • Создать psvm
//        • Создать экземпляры классов XmlData, BinaryData, NumericData ()
//        • В качестве id передать инкрементное значение счетчика ID_COUNTER
//        • Подготовить данные для объектов:
//        XmlData – “ <?xml version="1.0"?><Tests>qwerty</Tests>”
//        BinaryData – получить массив байт из тестовой строки «Данные в байтах»
//        NumericData – любое число например Double d = 123.456789;
//        • С помощью метода DocumentProcessorUtil.build() объединить данные с
//        обьектом.
//        • С помощью метода DocumentProcessorUtil. convert(); преобразовать
//        первоначальные объекты в StringData
//        • Вывести данные из всех полученных StringData на экран.
//        7. Добавить абстрактный метод в класс AbstractData - abstract String convertToString();
//        8. Реализовать этот метод во всех дочерних классах. Метод должен правильно
//        преобразовать хранящееся данные в строковый вид.
//        9. В конструкторе класса StringData изменить присвоение данных. Вызывать новый
//        метод convertToString(). Примечание из Generic можно убрать Storable