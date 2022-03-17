package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {

        String name = "Наруто Удзумаки";
        Account account = new Account(name);

        account.checkNameToEmboss();
    }
}
