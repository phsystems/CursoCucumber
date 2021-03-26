package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GerenciadorDriver {
  private static WebDriver driver;
	private static  WebDriver pegarGerenciadorDriver (TipoDriver navegador) {		
		switch (navegador) {
		
		case CHROME:			
			WebDriverManager.chromedriver().setup();
			ChromeOptions opcoesChrome = new ChromeOptions();
			opcoesChrome.addArguments("--start-maximized");
			driver = new ChromeDriver(opcoesChrome);
			break;             
		 default:
             break;				
		}		
		return driver;
	}	
	public static WebDriver pegarDriver(TipoDriver navegador) {
        if(driver == null){
            driver = pegarGerenciadorDriver(navegador);
        }
        return driver;
	}	
    public static void encerrarDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
  
}
