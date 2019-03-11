package script;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String args[]) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/anita/Downloads/DemoPage.html");
            Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.findElement(By.id("male"));
        driver.findElement(By.name("rd"));
        //driver.findElement(By.id("FName")).sendKeys("Anita");
        driver.findElement(By.id("FName")).sendKeys("Anita");
        System.out.println(driver.findElement(By.name("rd")));
        System.out.println(driver.findElement(By.id("FName")).getAttribute("value"));
//driver.close();
    }
}
