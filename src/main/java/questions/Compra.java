package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.Articulo;

public class Compra implements Question <Boolean> {

    public static Compra hecha() { return new Compra();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Articulo.TXT_COMPRAEXITOSA.resolveFor(actor).isVisible();
    }
}
