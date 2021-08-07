package co.com.sofkau.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationPracticeIndex extends PageObject {

    public static final Target SIGNIN_BUTTON = Target.the("SIGNIN_BUTTON").located(By.className("login"));
}
