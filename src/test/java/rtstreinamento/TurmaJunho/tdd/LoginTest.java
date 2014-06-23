package rtstreinamento.TurmaJunho.tdd;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
	Login login;
	String EMAIL_VALIDO = "joao@gmail.com";
	
	@Before
	public void antesDoTeste() {
		login = new Login();
	}
	
	@After
	public void depoisDoTeste() {
		
	}
	
	@Test
	public void efetuarLoginComSucesso() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO, "12345678");

		Assert.assertTrue(resultadoAtual);
	}

	@Test
	public void naoEfetuarLoginComEmailInexistente() {
		boolean resultadoAtual = login
				.autenticar("maria@gmail.com", "12345678");

		Assert.assertFalse(resultadoAtual);
	}

	@Test
	public void naoEfetuarLoginComSenhaIncorreta() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO, "32365679");

		Assert.assertFalse(resultadoAtual);
	}

	@Test
	public void naoEfetuarLoginComEmailVazio() {
		boolean resultadoAtual = login.autenticar(null, "12345678");

		Assert.assertFalse(resultadoAtual);
	}

	@Test
	public void naoEfetuarLoginComSenhaComTamanhoMenor() {
		boolean resultadoAtual = login.autenticar(EMAIL_VALIDO,"1234567");
		
		Assert.assertFalse(resultadoAtual);

	}

}
