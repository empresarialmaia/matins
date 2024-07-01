package projetoMantis.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import projetoMantis.driver.Driver;

public class Metodos extends Driver {
	
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
	
	public void aguardar(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
	
	
