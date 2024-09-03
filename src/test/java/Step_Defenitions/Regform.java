package Step_Defenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Regform {
	
	WebDriver Driver;

	@Given("Open a registration form")
	public void open_a_registration_form() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 Driver = new ChromeDriver();
		Driver.navigate().to("https://stqatools.com/demo/Register.php");  
	}

	@When("Enter the valid name in the registration form by the user")
	public void enter_the_valid_name_in_the_registration_form_by_the_user() {
		WebElement Name = Driver.findElement(By.id("name"));
		Name.sendKeys("Reshma");
	
	}

	@When("Enter the valid address in the registration form by the user")
	public void enter_the_valid_address_in_the_registration_form_by_the_user() {
		WebElement Address = Driver.findElement(By.id("address"));
		Address.sendKeys("SijiNivas");  
	}

	@When("Select the Gender as female")
	public void select_the_gender_as_female() {
		WebElement Gender = Driver.findElement(By.id("female"));
		Gender.click();  
	}

	@When("Select Hobbies as travelling and music")
	public void select_hobbies_as_travelling_and_music() {
		WebElement Hobbies = Driver.findElement(By.xpath("//*[@id=\"traveling\"]"));
		WebElement Hobbiess = Driver.findElement(By.xpath("//*[@id=\"music\"]"));
		Hobbies.click();
		Hobbiess.click();
		
	}
	@When("Select country as Australia")
	public void select_country_as_australia() {
		Select Country = new Select(Driver.findElement(By.id("country")));
		//Country.selectByIndex(4);
		//Country.selectByValue("Australia");
		Country.selectByVisibleText("Australia");   
	}

	@When("Select city as Melbourne")
	public void select_city_as_melbourne() {
		Select City = new Select(Driver.findElement(By.id("city")));
		//City.selectByIndex(7);
		//City.selectByValue("Melbourne");
		City.selectByVisibleText("Melbourne");   
	}

	@When("Select the correct date of birth")
	public void select_the_correct_date_of_birth() {
		WebElement DOB = Driver.findElement(By.id("dob"));
		DOB.sendKeys("05-30-1994");  
	}

	@When("Click the submit button")
	public void click_the_submit_button() {
		WebElement Submit = Driver.findElement(By.cssSelector("#registration-form > button"));
		Submit.click();   
	}

	@Then("Close the current window")
	public void close_the_current_window() {
		Driver.close();    
	}



}
