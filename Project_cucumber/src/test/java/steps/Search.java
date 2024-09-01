package steps;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
JavascriptExecutor js;


@Given("Open browser, Enter the bookswagon {string}")
public void open_browser_enter_the_bookswagon(String URL) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
}


@Given("enter the {string}")
public void enter_the(String BookName) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("[class=\"inputbar\"]")).sendKeys(BookName);
    
}

@Given("click on the search button")
public void click_on_the_search_button() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.cssSelector("[class=\"sprite search-btn\"]")).click();
}

@Given("Refine By the price")
public void refine_by_the_price() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("[href=\"javascript:GetSearchCriteria('books','PR:2');\"]")).click();
}

@Given("Refine By the source")
public void refine_by_the_source() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
	driver.findElement(By.partialLinkText("Indian")).click();
    
}

@Given("Refine By the binding")
public void refine_by_the_binding() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
	driver.findElement(By.cssSelector("[href=\"javascript:GetSearchCriteria('books','Binding:1');\"]")).click();
    }

@When("click on the searched book")
public void click_on_the_searched_book() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("[src='https://www.bookswagon.com/productimages/mainimages/466/9788173711466.jpg']")).click();
    
}

@When("Click on the Add to cart button")
public void click_on_the_add_to_cart_button() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.cssSelector("[id=\"btnAddtocart\"]")).click();
}

@When("Search the {string} click on search button")
public void search_the_click_on_search_button(String secondBookName) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("[class=\"inputbar\"]")).sendKeys(secondBookName);
	driver.findElement(By.cssSelector("[class=\"sprite search-btn\"]")).click();
    
}

@When("Refine the scond book by the price")
public void refine_the_scond_book_by_the_price() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.partialLinkText("Rs.100 - Rs.500")).click();
}

@When("Refine the scond book by the source")
public void refine_the_scond_book_by_the_source() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
   driver.findElement(By.partialLinkText("Indian")).click();
}

@When("click on the second searched book")
public void click_on_the_second_searched_book() throws InterruptedException {
	Thread.sleep(4000);
   driver.findElement(By.cssSelector("[src='https://www.bookswagon.com/productimages/mainimages/691/9780143455691.jpg']")).click();
}

@When("click on Add to cart")
public void click_on_add_to_cart() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.cssSelector("[id=\"btnAddtocart\"]")).click();
}

@Then("Assert customer review")
public void assert_customer_review() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    String ActualText = driver.findElement(By.xpath("//div[@class=\"col-sm-12\"]/h2")).getText();
    String ExpectedText = "Customer Reviews" ;
    Assert.assertEquals(ExpectedText, ActualText);
}

@Then("again give invalid input")
public void again_give_invalid_input() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("[class=\"inputbar\"]")).sendKeys(".");
	driver.findElement(By.cssSelector("[class=\"sprite search-btn\"]")).click();
}

@Then("take a screenshot")
public void take_a_screenshot() throws IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	//using getscreenshotAs() to take screenshot

	File image = ts.getScreenshotAs(OutputType.FILE);
	
	File img = new File("C:\\Users\\Shubham Shrivastava\\Pictures\\Screenshots\\BG_001.png");
	
	FileUtils.copyFile(image, img); 
   
}

@Then("close the browser")
public void close_the_browser() {
	driver.quit();
}

}

}
