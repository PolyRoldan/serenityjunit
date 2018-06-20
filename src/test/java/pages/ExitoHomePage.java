package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.exito.com")
public class ExitoHomePage extends PageObject {
	
	@FindBy(id = "tbxSearch")
	WebElementFacade txtBuscarProducto;
	
	

}
