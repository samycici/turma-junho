package rtstreinamento.TurmaJunho.steps;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.util.UUID;

import rtstreinamento.TurmaJunho.tdd.Newsletter;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class NewsletterSteps {

	Newsletter newsletter = new Newsletter();

	@After
	public void depoisDoTeste() {
		newsletter.fecharBrowser();
	}

	@Dado("^que eu esteja na página de newsletter$")
	public void que_eu_esteja_na_página_de_newsletter() throws Throwable {

		assertTrue(newsletter.getConteudoDaPagina().contains("Newsletter"));
	}

	@Dado("^o email \"([^\"]*)\" já esteja cadastrado$")
	public void o_email_já_esteja_cadastrado(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Quando("^tento cadastrar o email na newsletter$")
	public void tento_cadastrar_o_email_na_newsletter() throws Throwable {
		newsletter.preencherEmail(gerarEmail());
		newsletter.clicarBotaoEnviar();
	}

	@Quando("^tento cadastrar o email \"([^\"]*)\"$")
	public void tento_cadastrar_o_email(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Então("^visualizo a mensagem \"([^\"]*)\"$")
	public void visualizo_a_mensagem(String message) throws Throwable {
		Thread.sleep(1000);

		String mensagemRetorno = newsletter.getMensagemRetorno();

		assertNotNull(mensagemRetorno);
		assertEquals(message, mensagemRetorno);

	}

	private String gerarEmail() {
		String email = UUID.randomUUID().toString().replace("-", "")
				.substring(1, 10);
		return email + "@gmail.com";
	}
}
