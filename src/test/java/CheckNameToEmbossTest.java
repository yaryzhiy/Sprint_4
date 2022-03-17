import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Account;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckNameToEmbossTest {

    private final String name;
    private final boolean expected;

    public CheckNameToEmbossTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][] {
                {"", false},   //пустая строка
                {"НУ", false},   //2 символа (значение около границы)
                {"Н У", true},   //ГЗ - 3 символа
                {"На У", true},   //4 символа (значение около границы)
                {"Наруто Удзумаки", true},   //15 символов, количество пробелов - 1, отсутствуют пробелы в начале и в конце
                {"Наруто Удзумакевич", true},   //18 символов (значение около границы)
                {"НарутоУ Удзумакевич", true},  //ГЗ - 19 символов
                {"НарутоУд Удзумакевич", false},   //20 символов (значение около границы)
                {"Наруто", false},   //количество пробелов - 0
                {"Наруто Уд зумаки", false},   //количество пробелов - 2
                {" Наруто", false},   //пробел в начале строки
                {"Наруто ", false},   //пробел в конце строки
                {null, false}
        });
    }

    @Test
    public void checkNameToEmbossTests() {

        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();

        assertEquals(expected, actual);
    }
}
