import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Validation_Selenium{
    public static void main(String[] args) throws InterruptedException {
        String ChromeDriverPath = "C:\\software\\selenium\\chromedriver_win32\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
//        String locator_h1 = "(//h1)[2]";
        String locator_searchinput = "//input[@aria-label='Email address or phone number']";
        String locator_searchbutton = "//input[@type='password']";


        WebElement element_searchinput = driver.findElement(By.xpath(locator_searchinput));
       WebElement element_searchbutton = driver.findElement(By.xpath(locator_searchbutton));
        WebElement element_searchbutton1= driver.findElement(By.partialLinkText("Log in"));

        element_searchinput.sendKeys("8688055719");
        element_searchbutton.sendKeys("Selenium@1234");
       element_searchbutton1.click();
        Thread.sleep(3000);
       // WebElement element_h1 = driver.findElement(By.xpath(locator_h1));
        //String actual_h1message = element_h1.getText();
        //System.out.println(actual_h1message);
//        String locator_table_computernames = "//table//tbody/tr/td[1]/a";
//        List<WebElement> list = driver.findElements(By.xpath(locator_table_computernames));
////List<WebElement> element1=driver.findElements(By.xpath(locator_table_computernames));
//        System.out.println(list.size());
//        for (WebElement e : list) {
//            System.out.println(e.getText());
//        }

    }
}