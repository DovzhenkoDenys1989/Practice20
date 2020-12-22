package com.company;

//        1. Создать абстрактный класс AbstractData
//        • Добавить в него поле: long id;
//        • Создать конструктор с параметром
//        • Создать геттер для ID
//        • Никаких абстрактных методов пока не нужно.
//        7. Добавить абстрактный метод в класс AbstractData - abstract String convertToString();
//        8. Реализовать этот метод во всех дочерних классах. Метод должен правильно
//        преобразовать хранящееся данные в строковый вид
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
