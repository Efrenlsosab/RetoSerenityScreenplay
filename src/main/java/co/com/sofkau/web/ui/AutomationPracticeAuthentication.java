package co.com.sofkau.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationPracticeAuthentication extends PageObject {
    public static final Target EMAIL_INPUT = Target.the("EMAIL_INPUT").located(By.xpath("//*[@id=\"email_create\"]"));
    public static final Target CREATE_BUTTON = Target.the("CREATE_BUTTON").located(By.xpath("//*[@id=\"SubmitCreate\"]"));

}
