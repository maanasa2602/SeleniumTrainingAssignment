
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven_Selenium {

    public static void main(String[] args) {
        String ChromeDriverPath = "C:\\software\\selenium\\chromedriver_win32\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.facebook.com/");
    }
}