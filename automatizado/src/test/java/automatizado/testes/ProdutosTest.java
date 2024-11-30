package automatizado.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.pageObject.ProdutosPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutosTest extends BaseTest{

	private static ProdutosPO produtosPage;
	
	@BeforeClass
	public static void prepararTestes() {
		driver.get("file:///C:\\Users\\36129382023.1n\\Downloads\\aula_prog2_20241122\\automatizado\\sistema\\produtos.html");
		produtosPage = new ProdutosPO(driver);
	}
	
	
	
	
	@Test
	public void TC006_naoDeveAdicionarProdutoComTodosOsCamposVazios() {
		
		produtosPage.btnCriar.click();
		produtosPage.btnCriar.click();
		produtosPage.btnSalvar.click();
		
		
		String mensagem = produtosPage.obterMensagemErro();
		
		produtosPage.btnSair.click();
		produtosPage.btnSair.click();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
		
	}
	
	@Test
	public void TC007_deveAdicionarProdutoComTodosOsCamposPreenchidosCorretamente() {
		produtosPage.btnCriar.click();
		//produtosPage.btnCriar.click();
		
		produtosPage.inputCodigo.sendKeys("155");
		produtosPage.inputNome.sendKeys("Camisa");
		produtosPage.inputQuantidade.sendKeys("10");
		produtosPage.inputValor.sendKeys("50");
		produtosPage.inputData.sendKeys("30/11/2024");
		
		produtosPage.btnSalvar.click();
		produtosPage.btnSair.click();
		
		String codTabela = produtosPage.primeiroCodTabela.getText();
		
		assertTrue(codTabela.contains("155"));		
	}
	
	@Test
	public void TC008_deveEditarProdutoDaTabela() {
	
		String display = produtosPage.modal.getCssValue("display");
		
		assertEquals(display, "block");	
		
	}


}
