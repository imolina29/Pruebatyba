package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.HomePage;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Acceder implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.BUTTON_LOGIN, WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds(),
                Click.on(HomePage.BUTTON_LOGIN));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(WaitUntil.the(HomePage.BUTTON_CREARUSUARIO, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.BUTTON_CREARUSUARIO));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Acceder tiendaVirtual() {
        return instrumented(Acceder.class);
    }

}
