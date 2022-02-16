package Calısma1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTalepFormu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Selenium/Choreme-Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dia.com.tr/demo-talep-formu/");
        driver.manage().window().maximize();


        WebElement ticariÜnvan= driver.findElement(By.cssSelector("input[class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']"));
        ticariÜnvan.sendKeys("Kemah Alabalık");

        WebElement adSoyad= driver.findElement(By.cssSelector("input[name='your-name']"));
        adSoyad.sendKeys("Celil Sevim");

        WebElement formAmacı= driver.findElement(By.cssSelector("select[name='form-doldurma-amacim']>:nth-child(3)"));
        formAmacı.click();
    }
}
