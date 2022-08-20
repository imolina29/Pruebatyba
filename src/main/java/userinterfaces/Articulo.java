package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Articulo {

    public static final Target BAR_SEARCH = Target.the("Escribir en la barra").locatedBy("//div[@id='speakersImg']");
    public static final Target ARTICULO = Target.the("Articulo a comprar").locatedBy("//*[@id=\"20\"]");
    public static final Target BUTTON_ADDCART = Target.the("Agregar al carrito de compras").locatedBy("//button[@name='save_to_cart']");
    public static final Target BUTTON_CART = Target.the("Carrito de compras").locatedBy("//a[@id='shoppingCartLink']//*[name()='svg']");
    public static final Target BUTTON_CHECKOUT = Target.the("Boton para ir al pago").locatedBy("//button[@id='checkOutButton']");
    public static final Target BUTTON_NEXT = Target.the("Boton next").locatedBy("//button[@id='next_btn']");
    public static final Target RDNUTTON_PAY = Target.the("Metodo de pago").locatedBy("//input[@name='safepay']");
    public static final Target INPUT_USERPAY = Target.the("Usuario de pago").locatedBy("//input[@name='safepay_username']");
    public static final Target INPUT_PWDPAY = Target.the("contrasena pago").locatedBy("//input[@name='safepay_password']");
    public static final Target BUTTON_PAY = Target.the("Boton pagar").locatedBy("//button[@id='pay_now_btn_SAFEPAY']");
    public static final Target TXT_COMPRAEXITOSA = Target.the("Compra realizada").locatedBy("//*[text()='ORDER PAYMENT']");
}
