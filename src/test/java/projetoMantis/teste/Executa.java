package projetoMantis.teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projetoMantis.navegadores.Navegadores;
import projetoMantis.page.LoginPage;

public class Executa {

	LoginPage page = new LoginPage();

	@BeforeEach
	public void iniciarTeste() {
		Navegadores.abrirNavegador("Edge");
	}

	@AfterEach
	public void encerrarTeste() {
		Navegadores.fecharNavegador();

	}

	@Test
	public void loginComSucessoTeste() {
		page.login("Eduardo_Rocha", "Mantis@2024");
		page.evidenciaLoginComSucesso();

	}

	@Test
	public void loginUsuarioInvalidoTeste() {
		page.login("Teste_Teste", "Mantis@2024");		
		page.evidenciaUsuarioIncorreto();
	}

	@Test
	public void loginSenhaInvalidaTeste() {
		page.login("Eduardo_Rocha", "Teste@2024");
		page.evidenciaSenhaIncorreta();

	}
	
	
		
	
}
