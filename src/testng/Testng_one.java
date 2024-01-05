package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_one {
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void browser() {

		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)

	public void signup() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@id=\"signin2\"]")).click();

		driver.findElement(By.xpath("//input[@id=\"sign-username\"]")).sendKeys("balubalra741@gmail.com");

		driver.findElement(By.xpath("//input[@id=\"sign-password\"]")).sendKeys("balu2227@");

		driver.findElement(By.xpath("//button[@onclick=\"register()\"]")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("(//*[text()=\"Close\"])[2]")).click();
	}

	@Test(priority = 2)
	public void login() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("login2")).click();

		driver.findElement(By.id("loginusername")).sendKeys("balubalra741@gmail.com");

		driver.findElement(By.id("loginpassword")).sendKeys("balu2227@");

		driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();

	}

	@Test(priority = 4)
	public void phone() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[text()=\"Phones\"]")).click();

		driver.findElement(By.linkText("Samsung galaxy s6")).click();

		driver.findElement(By.xpath("//*[text()=\"Add to cart\"]")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[text()=\"Home \"]")).click();

		driver.findElement(By.xpath("//*[text()=\"Nokia lumia 1520\"]")).click();

		driver.findElement(By.xpath("//*[text()=\"Add to cart\"]")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[text()=\"Home \"]")).click();

	}

	@Test(priority = 3)

	public void labtop() throws InterruptedException {

		driver.findElement(By.xpath("//*[text()=\"Laptops\"]")).click();

		driver.findElement(By.xpath("//*[text()=\"Sony vaio i5\"]")).click();

		driver.findElement(By.xpath("//*[text()=\"Add to cart\"]")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[text()=\"Home \"]")).click();

	}

	@Test(priority = 5)
	public void Monitors() throws InterruptedException {

		driver.findElement(By.linkText("Monitors")).click();

		driver.findElement(By.xpath("//*[text()=\"Apple monitor 24\"]")).click();

		driver.findElement(By.xpath("//*[text()=\"Add to cart\"]")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[text()=\"Home \"]")).click();

	}

	@Test(priority = 6)
	public void cart() {

		driver.findElement(By.xpath("//*[text()=\"Cart\"]")).click();

		driver.findElement(By.xpath("(//*[text()=\"Delete\"])[3]")).click();

		driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
	}

}
