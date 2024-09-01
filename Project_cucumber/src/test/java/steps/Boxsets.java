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
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Boxsets {
	WebDriver  driver;
	JavascriptExecutor js;

@Given("Open browser, Enter the bookswagon {string}")
public void open_browser_enter_the_bookswagon(String URL) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
}

@When("user clicks on the Boxsets category")
public void user_clicks_on_the_boxsets_category() {
	driver.findElement(By.cssSelector("[id=\"ctl00_lipreorder\"]")).click();
}

@When("user selects a specific boxset book")
public void user_selects_a_specific_boxset_book() {
	 driver.findElement(By.cssSelector("[alt=\"The Hobbit & The Lord of the Rings Boxed Set\"]")).click();
}

@When("user clicks on Addto cart")
public void user_clicks_on_addto_cart() {
	 driver.findElement(By.cssSelector("[onclick=\"AddToCartOnProduct();\"]")).click();
}

@When("user click on Addtowishlist")
public void user_click_on_addtowishlist() {
	driver.findElement(By.cssSelector("")).click();
}

@When("user click on See more details")
public void user_click_on_see_more_details() {
    driver.findElement(By.cssSelector("[class=\"seedetailall\"]")).click();
}

@When("user clicks on Read more")
public void user_clicks_on_read_more() {
	driver.findElement(By.cssSelector("[class=\"readmoredesc\"]")).click();
}

@When("user then assert the customerreview")
public void user_then_assert_the_customerreview() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    String ActualText = driver.findElement(By.xpath("//div[@class=\"col-sm-12\"]/h2")).getText();
    String ExpectedText = "Customer Reviews" ;
    Assert.assertEquals(ExpectedText, ActualText);
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