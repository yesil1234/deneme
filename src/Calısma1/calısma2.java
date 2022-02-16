package Calısma1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calısma2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Selenium/Choreme-Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        WebElement tamam = driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']"));
        tamam.click();
        Thread.sleep(500);
        WebElement name = driver.findElement(By.cssSelector("input[name='firstname']"));
        name.sendKeys("Celil");
    }
}
