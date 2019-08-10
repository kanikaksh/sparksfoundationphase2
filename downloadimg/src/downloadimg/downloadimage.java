package downloadimg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class downloadimage {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	 driver= new ChromeDriver();

//Launch the Application Under Test (AUT)
driver.get("https://www.google.co.in/search?q=google+images&client=opera&hs=zTr&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjEqIGY1PjjAhUMUI8KHYbEBGAQ_AUIESgB&biw=1240&bih=578#imgrc=1-Mg1JaPon7CxM:");
driver.manage().window().maximize();

// Right click the button to launch right click menu options
Actions action = new Actions(driver);

WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
action.contextClick(link).perform();
// Click on Edit link on the displayed menu options
WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-Save image as..."));
element.click();
// Accept the alert displayed
//driver.switchTo().alert().accept();
// Closing the driver instance
//driver.quit();

}
}