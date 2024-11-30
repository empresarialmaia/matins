package projetoMantis.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projetoMantis.driver.Driver;

public class Metodos extends Driver {	
	
		
	public static void antesDoTest(String navegador) {
	
		String url = "http://mantis-prova.base2.com.br/";
		
		switch (navegador) {
		case "Chrome":
			driver = new ChromeDriver();			
			break;
		case "Edge":	
			driver = new EdgeDriver();
			break;
		
		case "Firefox":	
			driver = new FirefoxDriver();
			break;			
			
		default:			
		throw new IllegalArgumentException("Navegador não reconhecido "+navegador);
		
		}
		
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static void depoisDoTest( ) {
		if(driver != null) {
		   driver.quit();
		}
        
    }
	
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public void validarTitle( String titleDesejado) {
		assertEquals(driver.getTitle(), titleDesejado);
		
		
	}
	
	public void validarUrl(String urlEsperada) {
		assertEquals(driver.getCurrentUrl(), urlEsperada);
		
	}
	
	public void printTela(String historia, String nomeDoArquivo) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./evidencias/" + historia + "/" + nomeDoArquivo + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		
	public void aguardarElementoVisivel(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
		
	}
	
	

}
	
	
