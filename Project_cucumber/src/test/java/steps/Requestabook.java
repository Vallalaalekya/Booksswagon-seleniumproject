package steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Requestabook {
	WebDriver  driver;
	JavascriptExecutor js;
	@Given("user open the browser and navigate to {string}")
	public void user_open_the_browser_and_navigate_to(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("user clicks on the Requestbook icon")
	public void user_clicks_on_the_requestbook_icon() {
		driver.findElement(By.linkText("Request a Book")).click();
	}

	@When("user fills the details in the requried filedsin the form")
	public void user_fills_the_details_in_the_requried_filedsin_the_form() {
		driver.findElement(By.cssSelector("[name=\"ctl00$phBody$RequestBook$txtISBN\"]")).sendKeys("9780241252086");
		driver.findElement(By.cssSelector("[name=\"ctl00$phBody$RequestBook$txtAuthor\"]")).sendKeys("Fyodor Dostoyevsky");
		driver.findElement(By.cssSelector("[name=\"ctl00$phBody$RequestBook$txtEmailReq\"]")).sendKeys("vallalaalekya@gmail.com");

		//driver.findElement(By.cssSelector("[value=\"Verify Email\"]")).click();
		//driver.findElement(By.cssSelector("[class=\"form-group otpVerify mt-5 mb-4\"]")).sendKeys("264719");
		//driver.findElement(By.cssSelector("[value=\"Validate OTP\"]")).click();
		driver.findElement(By.cssSelector("[name=\"ctl00$phBody$RequestBook$txtTitle\"]")).sendKeys("whitenights");
		
		driver.findElement(By.cssSelector("[name=\"ctl00$phBody$RequestBook$txtQty\"]")).sendKeys("1");
		driver.findElement(By.cssSelector("[name=\"ctl00$phBody$RequestBook$txtPhone\"]")).sendKeys("8106201995");
		driver.findElement(By.cssSelector("[value=\"Submit\"]")).click();
	}

	@When("user takes a screenshot")
	public void user_takes_a_screenshot() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getscreenshotAs() to take screenshot

		File image = ts.getScreenshotAs(OutputType.FILE);
		
		File img = new File("/Users/hiteshpkumar/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/Project_cucumber/target/Screenshots/screenshots");
		
		FileUtils.copyFile(image, img); 
	   
	}

	@When("user closes the browser")
	public void user_closes_the_browser() {
			driver.close();
	}



}
