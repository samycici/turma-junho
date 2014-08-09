package rtstreinamento.TurmaJunho.tdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisarProduto {
	WebDriver driver;
	private ResultadoPesquisaProduto resultadoPesquisaProduto;
	private String nomeDoFilme;
	
	public PesquisarProduto() {
		System.setProperty("webdriver.chrome.driver",
				"/usr/bin/google-chrome");
		driver = new ChromeDriver();
		driver.get("http://tghcastro.lojaintegrada.com.br/");
	}
	
	public void digitarONomeDoFilmeNaBusca(String nomeDoFilme){
		this.nomeDoFilme = nomeDoFilme;
		WebElement campoDeBusca = driver.findElement(By.id("auto-complete"));
		campoDeBusca.sendKeys(nomeDoFilme);
	}
	
	public ResultadoPesquisaProduto clicarBotaoPesquisar(){
		WebElement botaoPesquisar = driver.findElement(By.xpath("//*[@id=\"form-buscar\"]/button"));
		botaoPesquisar.click();
		
		resultadoPesquisaProduto = new ResultadoPesquisaProduto(driver);
		return resultadoPesquisaProduto;
	}

	public boolean resultadoEncontrado() {
		return resultadoPesquisaProduto.filmeEncontrado(nomeDoFilme);
	}
	
	
	
}
