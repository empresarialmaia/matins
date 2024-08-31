package projetoMantis.teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projetoMantis.metodos.Metodos;
import projetoMantis.page.LoginPage;

public class Executa {

	LoginPage page = new LoginPage();

	@BeforeEach
	public void iniciarTeste() {
		Metodos.abrirNavegador("Chrome");
	}

	@AfterEach
	public void encerrarTeste() {
		Metodos.fecharNavegador();

	}

	@Test
	public void loginComSucessoTeste() {
		page.login("Eduardo_Rocha", "Mantis@2024");
		page.evidenciaLoginComSucesso(
				"positivo", 
				"loginComSucesso");

	}

	@Test
	public void loginUsuarioInvalidoTeste() {
		page.login("Teste_Teste", "Mantis@2024");
        page.validacaoUsuarioIncorreto(
        "Sua conta pode estar desativada ou bloqueada ou o nome de");
		page.evidenciaUsuarioIncorreto(
				"negativo", 
				"loginUsuarioInvalido");
	}

	@Test
	public void loginSenhaInvalidaTeste() {
		page.login("Eduardo_Rocha", "Teste@2024");
		page.validacaoUsuarioIncorreto(
		"Sua conta pode estar desativada ou bloqueada ou o nome de");
		page.evidenciaSenhaIncorreta(
				"negativo", 
				"loginSenhaInvalida");

	}
	
	
		
	
}
