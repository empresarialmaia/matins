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
		metodo.aguardarElementoVisivel(this.textoLogado);	
		metodo.printTela(historia, nomeArquivo);
		
	}
	
	public void evidenciaUsuarioIncorreto(String historia, String nomeArquivo) {
		metodo.printTela(historia, nomeArquivo);
	}
	
	public void evidenciaSenhaIncorreta(String historia, String nomeArquivo) {
		metodo.printTela(historia, nomeArquivo);
}

	public void validacaoTexto(String texto) {
		switch (texto) {
		case "Eduardo_Rocha ( Eduardo Rocha )":
			metodo.aguardarElementoVisivel(textoLogado);
			metodo.validarTexto(textoLogado, texto);			
			break;
			
		case "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.":
			metodo.aguardarElementoVisivel(textoLoginIncorreto);
			metodo.validarTexto(textoLoginIncorreto, texto);			
			break;	

		default:
			throw new IllegalArgumentException("Mensagem não reconhecida: " +texto);
		}
		
	}
	
	
	}
