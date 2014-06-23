package rtstreinamento.TurmaJunho.tdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoPesquisaProduto {

	WebDriver driver;

	public ResultadoPesquisaProduto(WebDriver driver) {
		this.driver = driver;
	}

	public boolean filmeEncontrado(String nomeDoFilme) {
		String tituloDoFilme = driver.findElement(
				By.xpath("//*[@id=\"listagemProdutos\"]/ul/li/ul/li/div/a"))
				.getAttribute("title");
		System.out.println(tituloDoFilme);
		if (tituloDoFilme
				.contains("Bluray - Senhor dos Anéis -  As Duas Torres"))
			return true;
		else
			return false;
	}

	public void fecharBrowser() {
		driver.quit();

	}
}
