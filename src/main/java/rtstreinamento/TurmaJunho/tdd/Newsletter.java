package rtstreinamento.TurmaJunho.tdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public final class Newsletter {
	public WebDriver driver;

	public String getConteudoDaPagina() {
		String conteudoDaPagina = driver.getPageSource();
		return conteudoDaPagina;
	}

	public Newsletter() {
		System.setProperty("phatomjs.binary.path",
				"c:\\web-drivers\\phatomjs.exe");

		System.setProperty("webdriver.chrome.driver",
				"c:\\web-drivers\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver = new PhantomJSDriver();
		// driver = new HtmlUnitDriver(true);
		driver.manage().window().maximize();
		driver.get("http://tghcastro.lojaintegrada.com.br/");
	}

	public void clicarBotaoEnviar() {
		WebElement botaoDeEnvio = this.driver
				.findElement(By
						.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[3]/div/div/div/div/div[1]/button"));
		botaoDeEnvio.click();
	}

	public void preencherEmail(String email) {
		WebElement campoEmail = this.driver
				.findElement(By
						.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[3]/div/div/div/div/div[1]/input"));
		campoEmail.sendKeys(email);
	}

	public String getMensagemRetorno() {
		WebElement spanMensagemRetorno = driver
				.findElement(By
						.xpath("//*[@id=\"corpo\"]/div/div[1]/div[1]/div[3]/div/div/div/div/div[2]/span"));
		return spanMensagemRetorno.getText();
	}

	public void fecharBrowser() {
		driver.quit();

	}
}
