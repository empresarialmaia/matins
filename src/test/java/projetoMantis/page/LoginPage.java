package projetoMantis.page;

import projetoMantis.elementos.Elementos;
import projetoMantis.metodos.Metodos;

public class LoginPage {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	public void login(String usuario, String Senha) {
		metodos.escrever(elemento.usuario, usuario);
		metodos.clicar(elemento.btnEntrar);
		metodos.escrever(elemento.senha, Senha);
		metodos.clicar(elemento.btnEntrar);

	}
	

	public void evidenciaLoginComSucesso() {
		metodos.aguardar(4000);
		metodos.printTela("positivo", "loginComSucesso");
		metodos.validarTitle("Minha Visão - MantisBT");
		metodos.validarUrl("https://mantis-prova.base2.com.br/my_view_page.php");
	}
	public void evidenciaUsuarioIncorreto() {
		metodos.printTela("negativo", "loginUsuarioInvalido");
	}
	public void evidenciaSenhaIncorreta() {
		metodos.printTela("negativo", "loginSenhaInvalida");
}
	}
