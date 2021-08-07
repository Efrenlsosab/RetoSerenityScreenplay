package co.com.sofkau.web.task;

import co.com.sofkau.web.ui.AutomationPracticeAuthentication;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Authentication implements Task {
    private String correo;

    public Authentication(String correo) {
        this.correo = correo;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(correo).into(AutomationPracticeAuthentication.EMAIL_INPUT));
        Click.on(AutomationPracticeAuthentication.CREATE_BUTTON);

    }

    public static Authentication withCredential(String correo){
        return Tasks.instrumented(Authentication.class,correo);
    }
}
