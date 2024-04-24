package GuiPages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AccountCreatedPage {
    SHAFT.GUI.WebDriver driver;

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(" -> new")
    public static By AccountCreatedLocator() {
        return By.xpath("//b[contains(.,'Account Created')]");
    }

    public AccountCreatedPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
}
