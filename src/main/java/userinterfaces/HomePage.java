package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class HomePage extends PageObject {
  public static final Target BUTTON_LOGIN = Target.the("Click en boton login").locatedBy("//*[@id='menuUser']");
  public static final Target BUTTON_CREARUSUARIO = Target.the("Crear nuevo usuario").locatedBy("//a[normalize-space()='CREATE NEW ACCOUNT']");
  public static final Target TXT_NEWUSER = Target.the("Usuario registrado exitosamente").locatedBy("//*[@id=\"menuUserLink\"]/span");
  public static final Target INPUT_USER = Target.the("Usuario").locatedBy("//input[@name='username']");
  public static final Target INPUT_PASSWD = Target.the("Contrasena").locatedBy("//input[@name='password']");
  public static final Target BUTTON_SIGN = Target.the("Boton entrar").locatedBy("//button[@id='sign_in_btnundefined']");
  }
