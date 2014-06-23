package rtstreinamento.TurmaJunho.steps;

import static org.junit.Assert.assertTrue;
import rtstreinamento.TurmaJunho.tdd.PesquisarProduto;
import rtstreinamento.TurmaJunho.tdd.ResultadoPesquisaProduto;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaProdutoSteps {

	PesquisarProduto pesquisar;
	private ResultadoPesquisaProduto resultado;
	private String nomeDoFilme;

	@After
	public void depoisDoTeste() {
		resultado.fecharBrowser();
	}

	public PesquisaProdutoSteps() {
		pesquisar = new PesquisarProduto();
	}

	@Dado("^eu esteja na página para pesquisa de produto$")
	public void eu_esteja_na_página_para_pesquisa_de_produto() throws Throwable {

	}

	@Dado("^que o filme \"([^\"]*)\" esteja cadastrado$")
	public void que_o_filme_esteja_cadastrado(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
	}

	@Quando("^pesquiso o filme \"([^\"]*)\"$")
	public void pesquiso_o_filme(String nomeDoFilme) throws Throwable {
		this.nomeDoFilme = nomeDoFilme;
		pesquisar.digitarONomeDoFilmeNaBusca(nomeDoFilme);
		resultado = pesquisar.clicarBotaoPesquisar();
	}

	@Então("^visualizo o filme pesquisado$")
	public void visualizo_o_filme_pesquisado() throws Throwable {
		assertTrue(pesquisar.resultadoEncontrado());
		assertTrue(resultado.filmeEncontrado(nomeDoFilme));
	}

	@Então("^visualizo dois filmes no resultado da pesquisa$")
	public void visualizo_dois_filmes_no_resultado_da_pesquisa()
			throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Dado("^que o filme \"([^\"]*)\" esteja cadastrado como indisponivel$")
	public void que_o_filme_esteja_cadastrado_como_indisponivel(String arg1)
			throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Então("^visualizo o filme como indisponivel no resultado da pesquisa$")
	public void visualizo_o_filme_como_indisponivel_no_resultado_da_pesquisa()
			throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Dado("^que o filme \"([^\"]*)\" nao esteja cadastrado$")
	public void que_o_filme_nao_esteja_cadastrado(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Então("^visualizo a mensagem Produto não cadastrado$")
	public void visualizo_a_mensagem_Produto_não_cadastrado() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Dado("^que existam filmes cadastrados$")
	public void que_existam_filmes_cadastrados() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Quando("^pesquiso sem informar um filme$")
	public void pesquiso_sem_informar_um_filme() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Então("^visualizo todos os filmes cadastrados$")
	public void visualizo_todos_os_filmes_cadastrados() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

}
