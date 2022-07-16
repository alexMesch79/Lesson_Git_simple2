import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @Test
    @DisplayName("Тест сайта Аптеки")
    public void testAptekaApril(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://aptekiplus.ru/");
        Assertions.assertTrue( 150 ==  150);

        }
}
