package steps;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class InserirContaSteps{
  private WebDriver driver;
  public ClasseBaseDeConexao conexao = new ClasseBaseDeConexao();

  @Dado("que estou acessando a aplicacao")
  public void queEstouAcessandoAAplicacao() throws IOException {
  driver = conexao.pegarDriver();
  conexao.setUp();
  }
  @Quando("informo o usuario {string}")
  public void informoOUsuario(String usuario) {
    driver.findElement(By.id("email")).sendKeys(usuario);
  }
  @Quando("a senha {string}")
  public void aSenha(String senha) {
    driver.findElement(By.id("senha")).sendKeys(senha);
  }
  @Quando("seleciono entrar")
  public void selecionoEntrar() {
      
  }
  @Entao("visualizo a pagina inicial")
  public void visualizoAPaginaInicial() {
      
  }
  @Quando("seleciono Contas")
  public void selecionoContas() {
      
  }
  @Quando("seleciono Adicionar")
  public void selecionoAdicionar() {
    
  }
  @Quando("informo a conta {string}")
  public void informoAConta(String string) {
      
  }
  @Quando("seleciono Salvar")
  public void selecionoSalvar() {
    
  }
  @Entao("a conta e inserida com sucesso")
  public void aContaEInseridaComSucesso() {
    conexao.encerraDriver();    
  }
    
}
