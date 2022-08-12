package co.com.falabella.www.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DriverScreenplay {
    private String url;

    public DriverScreenplay(String url) {
        this.url = url;
    }

    public static WebDriver driver;
    public static WebDriver chromeDrive(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--incognito");
        options.addArguments("--disable-site-isolation-trials");
        driver = new ChromeDriver(options);
        driver.get(url);
        return driver;

    }
}

