package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutosPO extends BasePO{

	public ProdutosPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "btn-adicionar")
	public WebElement btnCriar;
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "data")
	public WebElement inputData;
	
	@FindBy(id = "btn-salvar")
	public WebElement btnSalvar;
	
	@FindBy(id = "btn-sair")
	public WebElement btnSair;
	
	@FindBy(id = "mensagem")
	public WebElement mensagemErro;
	
	@FindBy(tagName = "tbody")
	public WebElement tabela;
	
	@FindBy(css = "td")
	public WebElement primeiroCodTabela;
	
	@FindBy(tagName = "tr")
	public WebElement itemTabela;
	
	@FindBy(id = "cadastro-produto")
	public WebElement modal;
	
//	@FindBy(css = "tbody")
//	public WebElement primeiroCodTabela;
	
	public String obterMensagemErro() {
		return this.mensagemErro.getText();
	}
	
	public void reloadPage() {
		this.reloadPage();
	}
}
