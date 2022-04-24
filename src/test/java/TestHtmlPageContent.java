import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHtmlPageContent {
    private static final String PATH = "file:///C:/Users/X/IdeaProjects/Calculator/src/main/resources/index.html";

    @Test
    public void ImageAlternativeTextTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open index page
        driver.get(PATH);
        String value = driver.findElement(By.id("img")).getAttribute("alt");
        System.out.println(value);
        if (!value.equals("oops, you found it")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void NameContainsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open index page
        driver.get(PATH);
      String value = driver.findElement(By.id("myname")).getText();
        System.out.println(value);
        if (!value.contains("Ilya")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void ButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open index page
        driver.get(PATH);
        driver.findElement(By.id("button")).click();
        Alert alert = driver.switchTo().alert();
        String value = alert.getText();
        System.out.println(value);
        if (!value.contains("Спасибо file script")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void WelcomeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open index page
        driver.get(PATH);
        String value = driver.findElement(By.name("hello")).getText();
        System.out.println(value);
        if (!value.equals("Welcome")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void SelectTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open index page
        driver.get(PATH);
        if (!driver.findElement(By.name("select")).isDisplayed()){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void LinkRedirectTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open index page
        driver.get(PATH);
        driver.findElement(By.id("link")).click();


        String value = driver.getCurrentUrl();
        System.out.println(value);
        if (!value.equals("https://github.com/Tsukashini/Calculator/")){
            Assert.fail();
        }
        driver.quit();
    }
}
