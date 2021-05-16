import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CloseQuit {
    @Test
    public void demoClose(){
        System.setProperty("webdriver.chrome.driver","/Users/divyapolaki/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.close();// Closes the current browser window which is having focus. Here the browser window in focus is https://www.naukri.com/
    }
    @Test
    public void demoQuit(){
        System.setProperty("webdriver.chrome.driver","/Users/divyapolaki/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.quit();// Closes all the browser windows( all the pop-ups, tabs etc). Here the main naukri window and it's 3 pop-ups
        // are also been closed as we used quit here.
    }
}
