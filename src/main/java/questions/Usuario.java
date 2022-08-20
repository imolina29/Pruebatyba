package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DatosUsuario;
import userinterfaces.HomePage;

public class Usuario implements Question <Boolean> {

    public static Usuario creado() {
        return new Usuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return HomePage.TXT_NEWUSER.resolveFor(actor).getText().equals(actor.recall("NuevoUsuario"));
    }
}
