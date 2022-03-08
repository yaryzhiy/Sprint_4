package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() < 3 || name.length() > 19) {
            return false;
        } else {
            if (countOfSpaces(name) != 1) {
                return false;
            } else {
                return !isSpaceAtBeginningOrEnd(name);
            }
        }
    }

    public int countOfSpaces(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isWhitespace(name.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean isSpaceAtBeginningOrEnd(String name) {
        return Character.isWhitespace(name.charAt(0)) || Character.isWhitespace(name.charAt(name.length() - 1));
    }
}
