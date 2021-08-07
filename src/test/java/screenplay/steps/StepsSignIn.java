package screenplay.steps;

import co.com.sofkau.web.task.Authentication;
import co.com.sofkau.web.task.Index;
import co.com.sofkau.web.task.OpenTheBrowser;
import co.com.sofkau.web.ui.AutomationPracticeIndex;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepsSignIn {


    private Actor actor;
    private AutomationPracticeIndex automationPracticeIndex;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled("Usuario");
    }

    @Dado("^que un usuario entro a la pagina inicial de automation practice$")
    public void queUnUsuarioEntroALaPaginaInicialDeAutomationPractice() {
        actor.wasAbleTo(OpenTheBrowser.on(automationPracticeIndex));
        actor.attemptsTo(Index.clickSignIn());
    }

    @Cuando("^el usuario se quiere registrar$")
    public void elUsuarioSeQuiereRegistrar() {
actor.attemptsTo(Authentication.withCredential("asdasdjhasd@gmail.com"));
        System.out.println("eeeeeeeeeeeeee");
    }

    @Y("^diligencia todos los campos$")
    public void diligenciaTodosLosCampos() {
        System.out.println("ssssssssssssss");
    }

    @Entonces("^el usuario se registra satisfactoriamnete y entra a la zona de MY ACCOUNT$")
    public void elUsuarioSeRegistraSatisfactoriamneteYEntraALaZonaDeMYACCOUNT() {
        System.out.println("wwwwwwwwwwwwwwwwwwww");
    }
}
