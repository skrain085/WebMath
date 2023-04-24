package com.WebMath_Application.classes;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchingAndMakingConnection {
	
	public static WebDriver driver;
	Properties p = loadProperty();
	public Properties loadProperty(){
		try {
			//Making Connection with input.properties file
			FileInputStream fis = new FileInputStream("C:\\Users\\sasir\\OneDrive\\Desktop\\Sasi\\Workspace\\WebMath_Application\\src\\test\\java\\com\\WebMath_Application\\utils\\input.properties");
			Properties p = new Properties();
			p.load(fis);
			return p;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public void driverInitialize() {
		try {
			//Opening Firefox Browser and maximize it
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Getting input from properties file
			String urlLink = p.getProperty("urlLink");
			//Launch the Application using URL
			driver.get(urlLink);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public void selectOperationFromQuickDropDown(String operation_type) {
		try {
		String topic_list_locator = p.getProperty("topic_list_locator");
		List <WebElement> topic_list = driver.findElements(By.xpath(topic_list_locator));
		for(WebElement topic : topic_list) {
			if(topic.getText().equalsIgnoreCase(operation_type)) {
				topic.click();
				break;
			}
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickOnQuickDropdown() {
		String quick_dropdown_locator = p.getProperty("quick_dropdown_locator");
		//ClickOn "Quick! I need help with:" Dropdown
		driver.findElement(By.xpath(quick_dropdown_locator)).click();
	}

}
