package projetoMantis.teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projetoMantis.metodos.Metodos;
import projetoMantis.page.LoginPage;

public class LoginTest {

	LoginPage page = new LoginPage();

	@BeforeEach
	public void iniciarTeste() {
		Metodos.antesDoTest("Chrome");
	}

	@AfterEach
	public void encerrarTeste() {
		Metodos.depoisDoTest();

	}

	@Test
	public void loginComSucessoTeste() {
		page.login("Eduardo_Rocha", "Mantis@2024");
		page.validacaoTexto("Eduardo_Rocha ( Eduardo Rocha )");
		page.evidenciaLoginComSucesso(
				"positivo", 
				"loginComSucesso");

	}

	@Test
	public void loginUsuarioInvalidoTeste() {
		page.login("Errado_Errado", "Mantis@2024");
        page.validacaoTexto(
        "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.");
		page.evidenciaUsuarioIncorreto(
				"negativo", 
				"loginUsuarioInvalido");
	}

	@Test
	public void loginSenhaInvalidaTeste() {
		page.login("Eduardo_Rocha", "Errado@2024");
		page.validacaoTexto(
		"Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.");
		page.evidenciaSenhaIncorreta(
				"negativo", 
				"loginSenhaInvalida");

	}
	
	
		
	
}
