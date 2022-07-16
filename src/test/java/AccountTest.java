import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@Epic("Проверки на ввод данных")
@RunWith(Parameterized.class)
public class AccountTest {


    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Санталов Саша", true},
                {"С А", true},
                {"Санталов Александрр", true},
                {"СА А", true},
                {"Санталов Александр", true},
                {"СА", false},
                {"Санталов Александррр", false},
                {" Санталов Саша", false},
                {"Санталов Саша ", false},
                {"Санталов  Саша", false},
                {"СанталовСаша", false},
                {null, false},
                {"   ", false}
        };
    }

    @Test
    @Story("Параметризованный тест на ввод имени и фамилии")
    public void checkingCorrectEnteredNameTest() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals("Данные введены неверно", actual, expected);
    }


}
