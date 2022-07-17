import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }
    @Step("Проверка вводимых данных")
    public boolean checkNameToEmboss() {
        if (name != null) {
            return name.matches("(?=^.{3,19}$)^[а-яА-ЯёЁ]+[\\s][а-яА-ЯёЁ]+$");
        } else {
            return false;
        }
    }
}