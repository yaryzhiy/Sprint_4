package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {

        Account account1 = new Account("Наруто Удзумаки");
        Account account2 = new Account("Саске");

        account1.checkNameToEmboss();
        account2.checkNameToEmboss();
    }
}
