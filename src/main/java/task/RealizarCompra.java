package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.Articulo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCompra implements Task {
    String compra;
    public static RealizarCompra articulo(String compra) {
        return instrumented(RealizarCompra.class, compra);
    }

    public RealizarCompra(String compra) {
        this.compra = compra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.BAR_SEARCH));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.ARTICULO));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.BUTTON_ADDCART));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.BUTTON_CART));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.BUTTON_CHECKOUT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.BUTTON_NEXT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Articulo.RDNUTTON_PAY));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.theValue("Paul30").into(Articulo.INPUT_USERPAY),
                Enter.theValue("Paul2022").into(Articulo.INPUT_PWDPAY),
                Click.on(Articulo.BUTTON_PAY)
        );
    }
}
