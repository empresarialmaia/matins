package projetoMantis.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import projetoMantis.driver.Driver;

public class Navegadores extends Driver {

	public static void abrirNavegador(String tipo) {
		if (tipo.equalsIgnoreCase(("Chrome"))) {
			driver = new ChromeDriver();
		} else if (tipo.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (tipo.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.get("http://mantis-prova.base2.com.br/");

	}

	public static void fecharNavegador( ) {	
        driver.quit();
    }
		

}
