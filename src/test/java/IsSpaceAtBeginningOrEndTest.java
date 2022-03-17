import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Account;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsSpaceAtBeginningOrEndTest {

    private final String name;
    private final boolean expected;

    public IsSpaceAtBeginningOrEndTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {" Наруто Удзумаки", true},
                {"Наруто Удзумаки ", true},
                {" Наруто Удзумаки ", true},
                {"Наруто Удзумаки", false},
                {"Наруто", false}
        };
    }

    @Test
    public void isSpaceAtBeginningOrEndTests() {

        Account account = new Account(name);
        boolean actual = account.isSpaceAtBeginningOrEnd();

        assertEquals(expected, actual);
    }
}
