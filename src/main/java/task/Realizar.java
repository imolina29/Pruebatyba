package task;

import models.Datos;
import models.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DatosUsuario;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;


public class Realizar implements Task {

    public static Realizar login(List<Login> login) { return instrumented(Realizar.class, login);
    }
    private List<Login> login;
    public Realizar(List<Login> login){
        this.login = login;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_LOGIN),
                WaitUntil.the(INPUT_USER,
                        WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds(),
                Enter.theValue(login.get(0).getUsername()).into(INPUT_USER),
                Enter.theValue(login.get(0).getPassword()).into(INPUT_PASSWD),
                Click.on(BUTTON_SIGN));
    }
}
