package co.com.falabella.www.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class PDPUserInterface {
    public final Target TXT_TITULO = Target.the("Titulo del Producto")
            .locatedBy("//div[@class='jsx-1442607798 product-name fa--product-name false']");
    public final Target BTN_PRODUCTO = Target.the("Boton Producto aleatorio")
            .locatedBy("//a[@class='jsx-3128226947  layout_grid-view layout_view_4_GRID']");
    public final Target LBL_PRODUCTO = Target.the("Titulo Producto aleatorio")
            .locatedBy("//b[@class='jsx-1327784995 copy2 primary  jsx-3548557188 normal       pod-subTitle ']");
}
