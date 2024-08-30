package projetoMantis.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By usuario = By.id("username");
    public By senha = By.id("password");
    
    public By btnEntrar = By.xpath("//input[@type='submit']");
    public By validacaoTextoLogado = By.xpath("//a[text()='Eduardo_Rocha ( Eduardo Rocha ) ']");
    public By textoLoginIncorreto = By.xpath("//div[@class='alert alert-danger']");

	

}
