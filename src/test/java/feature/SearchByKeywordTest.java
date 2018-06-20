package feature;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import model.Productos;
import steps.BuscarSteps;


@RunWith(SerenityRunner.class)
public class SearchByKeywordTest {

	Productos producto;

  @Steps
  BuscarSteps buscar;

  @Test
  public void buscarArticulosPorPalabraEspecifica() {

    //Dado
    buscar.abrirPaginaBusqueda();

    
	//Cuando
    buscar.realizarBusquedaPorPalabraEspecifica(producto.getNombre());

    //Entonces
    buscar.verResultadosBusqueda();
  }
}
