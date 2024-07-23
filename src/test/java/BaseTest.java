import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    public static void generalSetup() {
        Configuration.browser = "chrome";
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @BeforeEach
    public void browserSetup() {
        Configuration.baseUrl = "https://demo.prestashop.com";
        open("/");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
