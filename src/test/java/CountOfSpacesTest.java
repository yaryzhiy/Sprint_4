import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Account;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CountOfSpacesTest {

    private final String name;
    private final int expected;

    public CountOfSpacesTest(String name, int expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Наруто", 0},
                {"Наруто Удзумаки", 1},
                {" Наруто Удзумаки ", 3}
        };
    }

    @Test
    public void countOfSpacesTests() {

        Account account = new Account(name);
        int actual = account.countOfSpaces();

        assertEquals(expected, actual);
    }
}
