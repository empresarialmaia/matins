package projetoMantis.page;

import projetoMantis.elementos.Elementos;
import projetoMantis.metodos.Metodos;

public class LoginPage {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	public void login(String usuario, String Senha) {
		metodos.escrever(elemento.usuario, usuario);
		metodos.clicar(elemento.btnUsuarioEntrar);
		metodos.escrever(elemento.senha, Senha);
		metodos.clicar(elemento.btnSenhaEntrar);

	}

	public void evidenciaLoginComSucesso() {
		metodos.aguardar(4000);
		metodos.printTela("positivo", "loginComSucesso");
	}
	public void evidenciaUsuarioIncorreto() {
		metodos.printTela("negativo", "loginUsuarioInvalido");
	}
	public void evidenciaSenhaIncorreta() {
		metodos.printTela("negativo", "loginSenhaInvalida");
}
	}
