package projetoMantis.page;

import projetoMantis.elementos.Elementos;
import projetoMantis.metodos.Metodos;

public class LoginPage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void login(String usuario, String Senha) {
		metodo.escrever(elemento.usuario, usuario);
		metodo.clicar(elemento.btnEntrar);
		metodo.escrever(elemento.senha, Senha);
		metodo.clicar(elemento.btnEntrar);
	}
	

	public void evidenciaLoginComSucesso() {
		metodo.aguardarElementoVisivel(elemento.validacaoTextoLogado, 5);	
		metodo.printTela("positivo", "loginComSucesso");
		metodo.validarTitle("Minha Visão - MantisBT");
		metodo.validarUrl("https://mantis-prova.base2.com.br/my_view_page.php");
	}
	
	public void evidenciaUsuarioIncorreto() {
		metodo.printTela("negativo", "loginUsuarioInvalido");
	}
	
	public void evidenciaSenhaIncorreta() {
		metodo.printTela("negativo", "loginSenhaInvalida");
}
	}
