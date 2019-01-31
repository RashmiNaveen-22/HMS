package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Users/Naveenro/Desktop/frame.html");
WebElement ele = driver.findElement(By.id("a1"));
ele.sendKeys("abc");

driver.switchTo().frame(0);
WebElement ele1 = driver.findElement(By.id("a2"));
ele1.sendKeys("xyz");

driver.switchTo().defaultContent();
ele.sendKeys("_def");

driver.switchTo().frame(0);


driver.switchTo().frame(0);
driver.findElement(By.id("a3")).sendKeys("ijk");

driver.switchTo().parentFrame();
ele1.sendKeys("_uvw");
}
}
