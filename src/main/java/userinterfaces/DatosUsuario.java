package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DatosUsuario {
    public static final Target TXT_FIRSTNAME = Target.the("Nombre Usuario").locatedBy("//input[@name='first_nameRegisterPage']");
    public static final Target TXT_LASTNAME = Target.the("Apellido usuario").locatedBy("//input[@name='last_nameRegisterPage']");
    public static final Target TXT_PHONE = Target.the("Numero de telefono").locatedBy("//input[@name='phone_numberRegisterPage']");
    public static final Target TXT_USER = Target.the("Usuario").locatedBy("//input[@name='usernameRegisterPage']");
    public static final Target TXT_EMAIL = Target.the("Email usuario").locatedBy("//input[@name='emailRegisterPage']");
    public static final Target TXT_PASSWORD = Target.the("Contrasena usuario").locatedBy("//input[@name='passwordRegisterPage']");
    public static final Target TXT_CONFIRMPASS = Target.the("Confirmar Contrasena").locatedBy("//input[@name='confirm_passwordRegisterPage']");
    public static final Target TXT_COUNTRY = Target.the("Pais usuario").locatedBy("//select[@name='countryListboxRegisterPage']");
    public static final Target TXT_CITY  = Target.the("Ciudad Usuario").locatedBy("//input[@name='cityRegisterPage']");
    public static final Target TXT_ADDRESS = Target.the("Direccion usuario").locatedBy("//input[@name='addressRegisterPage']");
    public static final Target TXT_STATE = Target.the("Estado").locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
    public static final Target TXT_POSTALCODE = Target.the("Codigo postal").locatedBy("//input[@name='postal_codeRegisterPage']");
    public static final Target CHK_TERMS = Target.the("Check terminos y condiciones").locatedBy("//input[@name='i_agree']");
    public static final Target BTN_REGISTER = Target.the("Boton registro").locatedBy("//button[@id='register_btnundefined']");
}
