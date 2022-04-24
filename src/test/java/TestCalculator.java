import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void ObeseTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("80");
        //Input height into 'or cms' field
        driver.findElement(By.name("ht")).sendKeys("80");
        //Click the 'Continue' button
        driver.findElement(By.name("cc")).click();
        String value = driver.findElement(By.className("content")).getAttribute("value");
        System.out.println(value);
        if (!value.equals("Your category is Obese")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void OverweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("90");
        //Input height into 'or cms' field
        driver.findElement(By.name("ht")).sendKeys("189");
        //Click the 'Continue' button
        driver.findElement(By.name("cc")).click();
        String value = driver.findElement(By.className("content")).getAttribute("value");
        System.out.println(value);
        if (!value.equals("Your category is Overweight")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void NormalTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("80");
        //Input height into 'or cms' field
        driver.findElement(By.name("ht")).sendKeys("200");
        //Click the 'Continue' button
        driver.findElement(By.name("cc")).click();
        String value = driver.findElement(By.className("content")).getAttribute("value");
        System.out.println(value);
        if (!value.equals("Your category is Normal")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void StarvationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("50");
        //Input height into 'or cms' field
        driver.findElement(By.name("ht")).sendKeys("200");
        //Click the 'Continue' button
        driver.findElement(By.name("cc")).click();
        String value = driver.findElement(By.className("content")).getAttribute("value");
        System.out.println(value);
        if (!value.equals("Your category is Starvation")){
            Assert.fail();
        }
        driver.quit();
    }

    @Test
    public void UnderweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open calculator page
        driver.get("https://healthunify.com/bmicalculator/");
        //Input weight
        driver.findElement(By.name("wg")).sendKeys("70");
        //Input height into 'or cms' field
        driver.findElement(By.name("ht")).sendKeys("200");
        //Click the 'Continue' button
        driver.findElement(By.name("cc")).click();
        String value = driver.findElement(By.className("content")).getAttribute("value");
        System.out.println(value);
        if (!value.equals("Your category is Underweight")){
            Assert.fail();
        }
        driver.quit();
    }
}
