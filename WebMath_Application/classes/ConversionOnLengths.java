package com.WebMath_Application.classes;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConversionOnLengths extends LaunchingAndMakingConnection{
	private static final DecimalFormat df = new DecimalFormat("0.00");

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
	public void convertingKilometersToMeters() {
		//Getting inputs from properties file
		String lengths_kilometers = p.getProperty("lengths_kilometers");
		String lengths_meters = p.getProperty("lengths_meters");
		int number_to_convert_from_km_to_m = Integer.parseInt(p.getProperty("number_to_convert_from_km_to_m"));
		double conversion_value_km_to_m = Double.parseDouble(p.getProperty("conversion_value_km_to_m"));
		String comparison_value_km_to_m = p.getProperty("comparison_value_km_to_m");
		
		//Converting Lengths
        convertingLengths(lengths_kilometers,lengths_meters,number_to_convert_from_km_to_m);
        comparingActualAndExpectedResults(number_to_convert_from_km_to_m,conversion_value_km_to_m,comparison_value_km_to_m);
	}
	
	@Test(priority=2)
	public void convertingCentimetersToMillimeters() {
		//Getting inputs from properties file
		String lengths_centimeters = p.getProperty("lengths_centimeters");
		String lengths_millimeters = p.getProperty("lengths_millimeters");
		int number_to_convert_from_cm_to_mm = Integer.parseInt(p.getProperty("number_to_convert_from_cm_to_mm"));
		double conversion_value_cm_to_mm = Double.parseDouble(p.getProperty("conversion_value_cm_to_mm"));
		String comparison_value_cm_to_mm = p.getProperty("comparison_value_cm_to_mm");
		
		//Converting Lengths
        convertingLengths(lengths_centimeters,lengths_millimeters,number_to_convert_from_cm_to_mm);
        comparingActualAndExpectedResults(number_to_convert_from_cm_to_mm,conversion_value_cm_to_mm,comparison_value_cm_to_mm);
	}
	
	
	 @Test(priority=3) 
	 public void convertingFeetToInches() {
		//Getting inputs from properties file
	    String lengths_feet = p.getProperty("lengths_feet");
	    String lengths_inches = p.getProperty("lengths_inches");
	    int number_to_convert_from_feet_to_inches = Integer.parseInt(p.getProperty("number_to_convert_from_feet_to_inches"));
	    double conversion_value_feet_to_inches = Double.parseDouble(p.getProperty("conversion_value_feet_to_inches"));
	    String comparison_value_feet_to_inches = p.getProperty("comparison_value_feet_to_inches");	
	
	    //Converting Lengths
	    convertingLengths(lengths_feet,lengths_inches,number_to_convert_from_feet_to_inches); 
	    comparingActualAndExpectedResults(number_to_convert_from_feet_to_inches,conversion_value_feet_to_inches,comparison_value_feet_to_inches);
	 }
	 
	
	@Test(priority=4)
	public void convertingMetersToCentimeters() {
		//Getting inputs from properties file
	    String lengths_meters = p.getProperty("lengths_meters");
	    String lengths_centimeters = p.getProperty("lengths_centimeters");
	    int number_to_convert_from_m_to_cm = Integer.parseInt(p.getProperty("number_to_convert_from_m_to_cm"));
	    double conversion_value_m_to_cm = Double.parseDouble(p.getProperty("conversion_value_m_to_cm"));
	    String comparison_value_m_to_cm = p.getProperty("comparison_value_m_to_cm");
	    
	    //Converting Lengths
        convertingLengths(lengths_meters,lengths_centimeters,number_to_convert_from_m_to_cm);
        comparingActualAndExpectedResults(number_to_convert_from_m_to_cm,conversion_value_m_to_cm,comparison_value_m_to_cm);
	}
	
	@Test(priority=5)
	public void convertingCentimetersToMeters() {
		//Getting inputs from properties file
	    String lengths_centimeters = p.getProperty("lengths_centimeters");
	    String lengths_meters = p.getProperty("lengths_meters");
	    int number_to_convert_from_cm_to_m = Integer.parseInt(p.getProperty("number_to_convert_from_cm_to_m"));
	    double conversion_value_cm_to_m = Double.parseDouble(p.getProperty("conversion_value_cm_to_m"));
	    String comparison_value_cm_to_m = p.getProperty("comparison_value_cm_to_m");
	    
	    //Converting Lengths
        convertingLengths(lengths_centimeters,lengths_meters,number_to_convert_from_cm_to_m);
        comparingActualAndExpectedResults(number_to_convert_from_cm_to_m,conversion_value_cm_to_m,comparison_value_cm_to_m);
	}
	
	@Test(priority=6)
	public void convertingMetersToKilometers() {
		//Getting inputs from properties file
	    String lengths_meters = p.getProperty("lengths_meters");
	    String lengths_kilometers = p.getProperty("lengths_kilometers");
	    int number_to_convert_from_m_to_km = Integer.parseInt(p.getProperty("number_to_convert_from_m_to_km"));
	    double conversion_value_m_to_km = Double.parseDouble(p.getProperty("conversion_value_m_to_km"));
	    String comparison_value_m_to_km = p.getProperty("comparison_value_m_to_km");
	    
	    //Converting Lengths
        convertingLengths(lengths_meters,lengths_kilometers,number_to_convert_from_m_to_km);
        comparingActualAndExpectedResults(number_to_convert_from_m_to_km,conversion_value_m_to_km,comparison_value_m_to_km);
	}
	
	@Test(priority=7)
	public void convertingMillimetersToCentimeters() {
		//Getting inputs from properties file
	    String lengths_millimeters = p.getProperty("lengths_millimeters");
	    String lengths_centimeters = p.getProperty("lengths_centimeters");
	    int number_to_convert_from_mm_to_cm = Integer.parseInt(p.getProperty("number_to_convert_from_mm_to_cm"));
	    double conversion_value_mm_to_cm = Double.parseDouble(p.getProperty("conversion_value_mm_to_cm"));
	    String comparison_value_mm_to_cm = p.getProperty("comparison_value_mm_to_cm");
	    
	    //Converting Lengths
        convertingLengths(lengths_millimeters,lengths_centimeters,number_to_convert_from_mm_to_cm);
        comparingActualAndExpectedResults(number_to_convert_from_mm_to_cm,conversion_value_mm_to_cm,comparison_value_mm_to_cm);
	}
	
	@Test(priority=8)
	public void convertingInchesToFeet() {
		//Getting inputs from properties file
	    String lengths_inches = p.getProperty("lengths_inches");
	    String lengths_feet = p.getProperty("lengths_feet");
	    int number_to_convert_from_inches_to_feet = Integer.parseInt(p.getProperty("number_to_convert_from_inches_to_feet"));
	    double conversion_value_inches_to_feet = Double.parseDouble(p.getProperty("conversion_value_inches_to_feet"));
	    String comparison_value_inches_to_feet = p.getProperty("comparison_value_inches_to_feet");
	    
	    //Converting Lengths
        convertingLengths(lengths_inches,lengths_feet,number_to_convert_from_inches_to_feet);
        comparingActualAndExpectedResults(number_to_convert_from_inches_to_feet,conversion_value_inches_to_feet,comparison_value_inches_to_feet);
	}
	
	@Test(priority=9)
	public void convertingMilesToFeet() {
		//Getting inputs from properties file
	    String lengths_miles = p.getProperty("lengths_miles");
	    String lengths_feet = p.getProperty("lengths_feet");
	    int number_to_convert_from_miles_to_feet = Integer.parseInt(p.getProperty("number_to_convert_from_miles_to_feet"));
	    double conversion_value_miles_to_feet = Double.parseDouble(p.getProperty("conversion_value_miles_to_feet"));
	    String comparison_value_miles_to_feet = p.getProperty("comparison_value_miles_to_feet");
	    
	    //Converting Lengths
        convertingLengths(lengths_miles,lengths_feet,number_to_convert_from_miles_to_feet);
        comparingActualAndExpectedResults(number_to_convert_from_miles_to_feet,conversion_value_miles_to_feet,comparison_value_miles_to_feet);
	}
	
	@Test(priority=10)
	public void convertingMilesToInches() {
		//Getting inputs from properties file
		String lengths_miles = p.getProperty("lengths_miles");
	    String lengths_inches = p.getProperty("lengths_inches");
	    int number_to_convert_from_miles_to_inches = Integer.parseInt(p.getProperty("number_to_convert_from_miles_to_inches"));
	    double conversion_value_miles_to_inches = Double.parseDouble(p.getProperty("conversion_value_miles_to_inches"));
	    String comparison_value_miles_to_inches = p.getProperty("comparison_value_miles_to_inches");
	    
	    //Converting Lengths
        convertingLengths(lengths_miles,lengths_inches,number_to_convert_from_miles_to_inches);
        comparingActualAndExpectedResults(number_to_convert_from_miles_to_inches,conversion_value_miles_to_inches,comparison_value_miles_to_inches);
	}
	
	@Test(priority=11)
	public void convertingCentimetersToCentimeters() {
		//Getting inputs from properties file
		String lengths_centimeters = p.getProperty("lengths_centimeters");
		int number_to_convert_from_cm_to_cm = Integer.parseInt(p.getProperty("number_to_convert_from_cm_to_cm"));
	
		//Converting Lengths		
        convertingLengths(lengths_centimeters,lengths_centimeters,number_to_convert_from_cm_to_cm);
        comparingwithErrorMessage();
	}
	
	@Test(priority=12)
	public void convertingKilometersToKilometers() {
		//Getting inputs from properties file
		String lengths_kilometers = p.getProperty("lengths_kilometers");
		int number_to_convert_from_km_to_km = Integer.parseInt(p.getProperty("number_to_convert_from_km_to_km"));
				
		//Converting Lengths		
        convertingLengths(lengths_kilometers,lengths_kilometers,number_to_convert_from_km_to_km);
        comparingwithErrorMessage();
	}
	
	@Test(priority=13)
	public void convertingMetersToMeters() {
		//Getting inputs from properties file
		String lengths_meters = p.getProperty("lengths_meters");
		int number_to_convert_from_m_to_m = Integer.parseInt(p.getProperty("number_to_convert_from_m_to_m"));
				
		//Converting Lengths		
        convertingLengths(lengths_meters,lengths_meters,number_to_convert_from_m_to_m);
        comparingwithErrorMessage();
	}
	
	@Test(priority=14)
	public void convertingMillimetersToMillimeters() {
		//Getting inputs from properties file
		String lengths_millimeters = p.getProperty("lengths_millimeters");
		int number_to_convert_from_mm_to_mm = Integer.parseInt(p.getProperty("number_to_convert_from_mm_to_mm"));
				
		//Converting Lengths		
        convertingLengths(lengths_millimeters,lengths_millimeters,number_to_convert_from_mm_to_mm);
        comparingwithErrorMessage();
	}
	
	@Test(priority=15)
	public void convertingMilesToMiles() {
		//Getting inputs from properties file
		String lengths_miles = p.getProperty("lengths_miles");
		int number_to_convert_from_miles_to_miles = Integer.parseInt(p.getProperty("number_to_convert_from_miles_to_miles"));		
		
		//Converting Lengths
        convertingLengths(lengths_miles,lengths_miles,number_to_convert_from_miles_to_miles);
        comparingwithErrorMessage();
	}
	
	@Test(priority=16)
	public void convertingFeetToFeet() {
		//Getting inputs from properties file
		String lengths_feet = p.getProperty("lengths_feet");
		int number_to_convert_from_feet_to_feet = Integer.parseInt(p.getProperty("number_to_convert_from_feet_to_feet"));
		
		//Converting Lengths		
        convertingLengths(lengths_feet,lengths_feet,number_to_convert_from_feet_to_feet);
        comparingwithErrorMessage();
	}
	
	@Test(priority=17)
	public void convertingInchesToInches() {
		//Getting inputs from properties file
		String lengths_inches = p.getProperty("lengths_inches");
		int number_to_convert_from_inches_to_inches = Integer.parseInt(p.getProperty("number_to_convert_from_inches_to_inches"));
			
		//Converting Lengths
        convertingLengths(lengths_inches,lengths_inches,number_to_convert_from_inches_to_inches);
        comparingwithErrorMessage();
	}
	
	@Test(priority=18)
	public void convertingMillimetersToMeters() {
		//Getting inputs from properties file
		String lengths_millimeters = p.getProperty("lengths_millimeters");
		String lengths_meters = p.getProperty("lengths_meters");
		int number_to_convert_from_mm_to_m = Integer.parseInt(p.getProperty("number_to_convert_from_mm_to_m"));
				
		//Converting Lengths		
        convertingLengths(lengths_millimeters,lengths_meters,number_to_convert_from_mm_to_m);
        comparingActualAndExpectedResults(50,0.001,"0.05");
	}
	
	@AfterMethod
	public void closingApplication() {
		driver.close();
	}

	public void convertingLengths(String unit_type1,String unit_type2,int number) {
		try {
			//Getting inputs from properties file
			String generalmath_locator = p.getProperty("generalmath_locator");
			String conversion_lengths_select_dropdown = p.getProperty("conversion_lengths_select_dropdown");
			String conversion_lengths_element_type1 = p.getProperty("conversion_lengths_element_type1");
			String conversion_lengths_element_type2 = p.getProperty("conversion_lengths_element_type2");
			
        	//ClickOn General Math
        	driver.findElement(By.xpath(generalmath_locator)).click();
        	Thread.sleep(2000);
        	clickOnQuickDropdown();
        	Thread.sleep(2000);
        	selectOperationFromQuickDropDown(conversion_lengths_select_dropdown);
        	Thread.sleep(2000);
        	enteringNumberForConversion(number);
        	Thread.sleep(2000);
        	selectUnitFromDropdown(conversion_lengths_element_type1,unit_type1);
        	Thread.sleep(2000);
        	selectUnitFromDropdown(conversion_lengths_element_type2,unit_type2);
        	Thread.sleep(2000);
        	clickOnSubmitButton();
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

	public void comparingActualAndExpectedResults(int number,double conversion_value,String comparison_value) {
	    String actual_result=null;
	    //Getting inputs from properties file
		String conversion_lengths_actual_result_locator = p.getProperty("conversion_lengths_actual_result_locator");
		
		//Switching Frame and Finding actual_result
		driver.switchTo().frame(1);
		WebElement result = driver.findElement(By.xpath(conversion_lengths_actual_result_locator));
		String[] words = result.getText().split(" ");
		for (String word : words) {
		   if(word.startsWith(comparison_value)) {
			   actual_result =  df.format(Double.parseDouble(word));
			   break;
		   }
		}
		//Calculating Expected Result
		String expected_result = df.format(number*conversion_value);
		//Comparing Actual result with Expected Result
		Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
	}
	
	public void comparingwithErrorMessage() {
		//Getting inputs from properties file
		String conversion_lengths_error_message_locator = p.getProperty("conversion_lengths_error_message_locator");
		String actual_result = null;
		String expected_result = "Webmath";
		try {	
		//Switching To Frame	
		driver.switchTo().frame(1);
		WebElement result = driver.findElement(By.xpath(conversion_lengths_error_message_locator));
		if(result.getText().substring(0, 7)!= null) {
			actual_result = result.getText().substring(0, 7);
		}
		Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickOnSubmitButton() {
		//Getting inputs from properties file
		String conversion_lengths_submit_button_locator = p.getProperty("conversion_lengths_submit_button_locator");
		//ClickOn Convert Button
		driver.findElement(By.xpath(conversion_lengths_submit_button_locator)).click();
	}

	public void selectUnitFromDropdown(String element_type, String unit_value) {
		//Getting inputs from properties file
		String conversion_lengths_units_dropdown_locator = p.getProperty("conversion_lengths_units_dropdown_locator");
		conversion_lengths_units_dropdown_locator = conversion_lengths_units_dropdown_locator.replace("element_type",element_type);
		//Selecting unit Dropdowns
		List <WebElement> unit_list = driver.findElements(By.xpath(conversion_lengths_units_dropdown_locator));
		for(WebElement unit : unit_list) {
			if(unit.getText().equalsIgnoreCase(unit_value)) {
				unit.click();
				break;
			}
		}
	}

	public void enteringNumberForConversion(int number) {
		//Getting inputs from properties file
		String conversion_lengths_text_field_locator = p.getProperty("conversion_lengths_text_field_locator");
		//Enter the Number which we need to convert
		driver.findElement(By.xpath(conversion_lengths_text_field_locator)).sendKeys(String.valueOf(number));
	}
	
}
