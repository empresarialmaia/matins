package projetoMantis.page;

import projetoMantis.elementos.Elementos;
import projetoMantis.metodos.Metodos;

public class LoginPage extends Elementos{
	
	
	Metodos metodo = new Metodos();
	

	public void login(String usuario, String Senha) {
		metodo.escrever(this.usuario, usuario);
		metodo.clicar(this.btnEntrar);
		metodo.escrever(this.senha, Senha);
		metodo.clicar(this.btnEntrar);
	}
	

	public void evidenciaLoginComSucesso(String historia, String nomeArquivo) { 
		metodo.aguardarElementoVisivel(this.validacaoTextoLogado);	
		metodo.printTela(historia, nomeArquivo);
		
	}
	
	public void evidenciaUsuarioIncorreto(String historia, String nomeArquivo) {
		metodo.printTela(historia, nomeArquivo);
	}
	
	public void evidenciaSenhaIncorreta(String historia, String nomeArquivo) {
		metodo.printTela(historia, nomeArquivo);
}

	public void validacaoUsuarioIncorreto(String texto) {
		metodo.validarTexto(textoLoginIncorreto, texto);
	}
	
	
	}
