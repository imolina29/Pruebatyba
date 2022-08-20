package task;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DatosUsuario;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearRegistro implements Task {
    private List<Datos> datos;
    public CrearRegistro(List<Datos> datos){
        this.datos = datos;}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(datos.get(0).getUsername()).into(DatosUsuario.TXT_USER),
                Enter.theValue(datos.get(0).getEmail()).into(DatosUsuario.TXT_EMAIL),
                Enter.theValue(datos.get(0).getPassword()).into(DatosUsuario.TXT_PASSWORD),
                Enter.theValue(datos.get(0).getConfirmPwd()).into(DatosUsuario.TXT_CONFIRMPASS),
                Enter.theValue(datos.get(0).getFirstName()).into(DatosUsuario.TXT_FIRSTNAME),
                Enter.theValue(datos.get(0).getLastName()).into(DatosUsuario.TXT_LASTNAME),
                Enter.theValue(datos.get(0).getPhone()).into(DatosUsuario.TXT_PHONE),
                SelectFromOptions.byVisibleText(datos.get(0).getCountry()).from(DatosUsuario.TXT_COUNTRY),
                Enter.theValue(datos.get(0).getCity()).into(DatosUsuario.TXT_CITY),
                Enter.theValue(datos.get(0).getAddress()).into(DatosUsuario.TXT_ADDRESS),
                Enter.theValue(datos.get(0).getState()).into(DatosUsuario.TXT_STATE),
                Enter.theValue(datos.get(0).getPostalCode()).into(DatosUsuario.TXT_POSTALCODE));

        actor.attemptsTo(WaitUntil.the(DatosUsuario.CHK_TERMS,
                WebElementStateMatchers.isPresent()).forNoMoreThan(3).seconds(),
                Click.on(DatosUsuario.CHK_TERMS),
                Click.on(DatosUsuario.BTN_REGISTER));
        actor.remember("NuevoUsuario", datos.get(0).getUsername());
    }

    public static CrearRegistro nuevoUsuario(List<Datos> datos){
        return instrumented(CrearRegistro.class, datos);
    }
}
