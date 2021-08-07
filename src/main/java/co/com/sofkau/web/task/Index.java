package co.com.sofkau.web.task;

import co.com.sofkau.web.ui.AutomationPracticeIndex;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Index implements Task {

    public Index() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AutomationPracticeIndex.SIGNIN_BUTTON));
    }
    public static Index clickSignIn (){
        return Tasks.instrumented(Index.class);
    }

}
