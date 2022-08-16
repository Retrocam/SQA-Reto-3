package co.com.falabella.www.userInterface;


import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {
    public final Target TXT_BARRA = Target.the("Barra de busqueda")
            .locatedBy("//input[@id]");
    public final Target BTN_BUSCAR = Target.the("Boton de buscar Barra de busqueda")
            .locatedBy("//button[@class='SearchBar-module_searchBtnIcon__6KVum']");
    public final Target BTN_BANNER = Target.the("Banner de categoría")
            .locatedBy("(//a[@href='https://www.falabella.com.co/falabella-co/collection/devolucion-de-intereses-hp'])[1]");
}
