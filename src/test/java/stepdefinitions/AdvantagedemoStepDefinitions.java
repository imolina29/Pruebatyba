package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.Datos;
import models.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import questions.Compra;
import questions.Usuario;
import task.Acceder;
import task.CrearRegistro;
import task.Realizar;
import task.RealizarCompra;
import userinterfaces.HomePage;

import java.util.List;

public class AdvantagedemoStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Paul");
    private HomePage homePage = new HomePage();

    @Dado("^que Paul accede a la web de Advantage$")
    public void que_Paul_accede_a_la_web_de_Advantage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @Cuando("^el introduce sus datos personales$")
    public void el_introduce_sus_datos_personales(List<Datos> datos) {
        actor.attemptsTo(Acceder.tiendaVirtual());
        actor.attemptsTo(CrearRegistro.nuevoUsuario(datos));
    }

    @Entonces("^el valida que se creo un nuevo resgistro$")
    public void el_valida_que_se_creo_un_nuevo_resgistro() {
        actor.should(GivenWhenThen.seeThat(Usuario.creado()));

    }

    @Cuando("^Paul realiza el login en la pagina con los datos$")
    public void paul_realiza_el_login_en_la_pagina_con_los_datos(List<Login> login) {
        actor.attemptsTo(Realizar.login(login));
    }

    @Cuando("^realiza la compra del producto (.*)$")
    public void realiza_la_compra_del_producto_BOSE_SOUNDLINK_BLUETOOTH_SPEAKER_III(String compra) {
        actor.attemptsTo(RealizarCompra.articulo(compra));

    }

    @Entonces("^Paul valida que haya comprado el producto$")
    public void paul_valida_que_haya_comprado_el_producto() {
        actor.should(GivenWhenThen.seeThat(Compra.hecha()));
    }
}
