package steps;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class ClasseBaseDeConexao extends GerenciadorDriver{	
	private static WebDriver driver;
    public WebDriver pegarDriver() {		
		driver = pegarDriver(TipoDriver.CHROME);		
		return driver;		
	}

	public void setUp() throws IOException{
		String index = GerenciadorDeArquivos.getProperties("url").getProperty("url");
		pegarDriver().get(index);
	}	
	public void encerraDriver() {		
		encerrarDriver();
	}		
	
}


