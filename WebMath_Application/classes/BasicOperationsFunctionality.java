package com.WebMath_Application.classes;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicOperationsFunctionality extends LaunchingAndMakingConnection {
	Properties p = loadProperty();
	
	@BeforeMethod
	public void loginToApplication() {
		try {
			 driverInitialize();
			 loadProperty();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=1)
	public void addingTwoNumbers() {
		try {
			//Getting inputs from properties file
			String basci_operations_add = p.getProperty("basci_operations_add");
			String basci_operations_add_element_type1 = p.getProperty("basci_operations_add_element_type1");
			String basci_operations_add_element_type2 = p.getProperty("basci_operations_add_element_type2");
			String basci_operations_add_number1 = p.getProperty("basci_operations_add_number1");
			String basci_operations_add_number2 = p.getProperty("basci_operations_add_number2");
			String basci_operations_add_actual_result_locator = p.getProperty("basci_operations_add_actual_result_locator");
			
			//Calculating Add Operation
			calculatingBasicOperations(basci_operations_add,basci_operations_add_element_type1,basci_operations_add_element_type2,basci_operations_add_number1,basci_operations_add_number2);
			//Calculating Actual Result
			WebElement result = driver.findElement(By.xpath(basci_operations_add_actual_result_locator));
			System.out.println(result.getText());
		    String actual_result = result.getText();
			//Calculating Expected Result
			int expected_result = Integer.parseInt(basci_operations_add_number1) + Integer.parseInt(basci_operations_add_number2);
			//Comparing Actual result with Expected Result
			Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void multiplyingTwoNumbers() {
		try {
			//Getting inputs from properties file
			String basci_operations_multiply = p.getProperty("basci_operations_multiply");
			String basci_operations_multiply_element_type1 = p.getProperty("basci_operations_multiply_element_type1");
			String basci_operations_multiply_element_type2 = p.getProperty("basci_operations_multiply_element_type2");
			String basci_operations_multiply_number1 = p.getProperty("basci_operations_multiply_number1");
			String basci_operations_multiply_number2 = p.getProperty("basci_operations_multiply_number2");
			String basci_operations_multiply_actual_result_locator = p.getProperty("basci_operations_multiply_actual_result_locator");
			
			//Calculating Multiply Operation
			calculatingBasicOperations(basci_operations_multiply,basci_operations_multiply_element_type1,basci_operations_multiply_element_type2,basci_operations_multiply_number1,basci_operations_multiply_number2);
			//Switching Frame and Finding actual_result
			driver.switchTo().frame(1);
			//Calculating Actual Result
			WebElement result = driver.findElement(By.xpath(basci_operations_multiply_actual_result_locator));
			int actual_result = Integer.parseInt(result.getText());
			//Calculating Expected Result
			int expected_result = Integer.parseInt(basci_operations_multiply_number1) * Integer.parseInt(basci_operations_multiply_number2);
			//Comparing Actual result with Expected Result
			Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=3)
	public void divisionOfTwoNumbers() {
		int actual_result=0;
		try {
			//Getting inputs from properties file
			String basci_operations_divide = p.getProperty("basci_operations_divide");
			String basci_operations_divide_element_type1 = p.getProperty("basci_operations_divide_element_type1");
			String basci_operations_divide_element_type2 = p.getProperty("basci_operations_divide_element_type2");
			String basci_operations_divide_number1 = p.getProperty("basci_operations_divide_number1");
			String basci_operations_divide_number2 = p.getProperty("basci_operations_divide_number2");
			String basci_operations_divide_actual_result_locator = p.getProperty("basci_operations_divide_actual_result_locator");
			String basci_operations_divide_value = p.getProperty("basci_operations_divide_value");
			
			//Calculating Divide Operation
			calculatingBasicOperations(basci_operations_divide,basci_operations_divide_element_type1,basci_operations_divide_element_type2,basci_operations_divide_number1,basci_operations_divide_number2);
			//Switching Frame and Finding actual_result
			driver.switchTo().frame(1);
			//Calculating Actual Result
			WebElement result = driver.findElement(By.xpath(basci_operations_divide_actual_result_locator));
			String[] words = result.getText().split(" ");
			for (String word : words) {
			   if(word.startsWith(basci_operations_divide_value)) {
				   String[] splitString = word.split("\\.");
				   actual_result = Integer.parseInt(splitString[0]);
				   break;
			   }
			}
			//Calculating Expected Result
			int expected_result = Integer.parseInt(basci_operations_divide_number1)/Integer.parseInt(basci_operations_divide_number2);
			//Comparing Actual result with Expected Result
			Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=4)
	public void subtractingTwoNumbers() {
		try {
			//Getting inputs from properties file
			String basci_operations_subtract = p.getProperty("basci_operations_subtract");
			String basci_operations_subtract_element_type1 = p.getProperty("basci_operations_subtract_element_type1");
			String basci_operations_subtract_element_type2 = p.getProperty("basci_operations_subtract_element_type2");
			String basci_operations_subtract_number1 = p.getProperty("basci_operations_subtract_number1");
			String basci_operations_subtract_number2 = p.getProperty("basci_operations_subtract_number2");
			String basci_operations_subtract_actual_result_locator = p.getProperty("basci_operations_subtract_actual_result_locator");
			
			
			//Calculating Subtract Operation
			calculatingBasicOperations(basci_operations_subtract,basci_operations_subtract_element_type1,basci_operations_subtract_element_type2,basci_operations_subtract_number1,basci_operations_subtract_number2);
			//Calculating Actual Result
			WebElement result = driver.findElement(By.xpath(basci_operations_subtract_actual_result_locator));
			System.out.println(result.getText());
		    String actual_result = result.getText();
			//Calculating Expected Result
			int expected_result = Integer.parseInt(basci_operations_subtract_number1) - Integer.parseInt(basci_operations_subtract_number2);
			//Comparing Actual result with Expected Result
			Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterMethod
	public void closingApplication() {
		driver.close();
	}
	
	public void clickOnKto8Math() {
		//Getting inputs from properties file
		String kto8math_locator = p.getProperty("kto8math_locator");
		//ClickOn K-8 Math Tab
		driver.findElement(By.xpath(kto8math_locator)).click();
	}
	
	public void calculatingBasicOperations(String operation_type, String element_type1,String element_type2, String number1, String number2) {
		//Getting inputs from properties file
		String operation_type_locator = p.getProperty("operation_type_locator");
		String number1_locator = p.getProperty("number1_locator");
		String number2_locator = p.getProperty("number2_locator");
		String submit_button_locator = p.getProperty("submit_button_locator");
		
		operation_type_locator = operation_type_locator.replace("operation_type", operation_type);
		number1_locator = number1_locator.replace("element_type1", element_type1);
		number2_locator = number2_locator.replace("element_type2", element_type2);
		
		clickOnKto8Math();
		//ClickOn Operation Type
		driver.findElement(By.xpath(operation_type_locator)).click();
		//Enter Number1
		driver.findElement(By.xpath(number1_locator)).sendKeys(String.valueOf(number1));
		//Enter Number2
		driver.findElement(By.xpath(number2_locator)).sendKeys(String.valueOf(number2));
		//ClickOn Submit button
		driver.findElement(By.xpath(submit_button_locator)).click();
	}

}
