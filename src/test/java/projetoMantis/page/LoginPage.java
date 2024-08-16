package projetoMantis.page;

import org.openqa.selenium.By;

import projetoMantis.metodos.Metodos;

public class LoginPage {

	 By usuario = By.id("username");
     By senha = By.id("password");
     By btnEntrar = By.xpath("//input[@type='submit']");
     By validacaoTextoLogado = By.xpath("//a[text()='Eduardo_Rocha ( Eduardo Rocha ) ']");

	
	Metodos metodo = new Metodos();
	

	public void login(String usuario, String Senha) {
		metodo.escrever(this.usuario, usuario);
		metodo.clicar(this.btnEntrar);
		metodo.escrever(this.senha, Senha);
		metodo.clicar(this.btnEntrar);
	}
	

	public void evidenciaLoginComSucesso(String historia, String nomeArquivo, String title, String url ) {
		metodo.aguardarElementoVisivel(this.validacaoTextoLogado);	
		metodo.printTela(historia, nomeArquivo);
		metodo.validarTitle(title);
		metodo.validarUrl(url);
	}
	
	public void evidenciaUsuarioIncorreto(String historia, String nomeArquivo) {
		metodo.printTela(historia, nomeArquivo);
	}
	
	public void evidenciaSenhaIncorreta(String historia, String nomeArquivo) {
		metodo.printTela(historia, nomeArquivo);
}
	}
