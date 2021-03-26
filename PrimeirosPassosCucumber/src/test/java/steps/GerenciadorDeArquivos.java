package steps;
import java.io.*;
import java.util.Properties;

public class GerenciadorDeArquivos {
  private static final String DIR_PATH_PROPERTIES =
            System.getProperty("user.dir") + File.separator + "src" + File.separator
                    + "test" + File.separator + "resources" + File.separator;
    
    public static Properties getProperties(String fileName) throws IOException {
        InputStream inputStream = null;
        Properties prop = new Properties();
        try {
            File file = new File(DIR_PATH_PROPERTIES+fileName+".properties");
            inputStream = new FileInputStream(file);
            prop.load(inputStream);
            return prop;
        } catch (Exception e) {
            System.out.println("Passando exception " + e.getMessage());
        } finally {
            inputStream.close();
        }
        return prop;
    }
  
}
