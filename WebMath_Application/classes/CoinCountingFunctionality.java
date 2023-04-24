package com.WebMath_Application.classes;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CoinCountingFunctionality extends LaunchingAndMakingConnection{
	Properties p = loadProperty();
	double actual_result = 0.0;
	double expected_result = 0.0;
	double expected_result_quarters = 0.0;
	double expected_result_dime = 0.0;
	double expected_result_nickels = 0.0;
	double expected_result_pennies = 0.0;
	
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
	public void countingCoinsByQuarters() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,coin_count_null,coin_count_null,coin_count_null);
	}

	
	@Test(priority=2)
	public void countingCoinsByDimes() {
		//Getting inputs from properties file
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,dimes_count,coin_count_null,coin_count_null);
	}
	
	@Test(priority=3)
	public void countingCoinsByNickels() {
		//Getting inputs from properties file
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,coin_count_null,nickels_count,coin_count_null);
	}
	
	@Test(priority=4)
	public void countingCoinsByPennies() {
		//Getting inputs from properties file
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,coin_count_null,coin_count_null,pennies_count);
	}
	
	@Test(priority=5)
	public void enteringQuartersDimesNickelsAndPenniesWithZero() {
		//Getting inputs from properties file
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,coin_count_null,coin_count_null,coin_count_null);
		
	}
	
	@Test(priority=6)
	public void enteringQuartersDimesNickelsAndPennies() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		//Counting Coins
		countingCoins(quarters_count,dimes_count,nickels_count,pennies_count);
	}

	
	@Test(priority=7)
	public void enteringQuartersAndDimes() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,dimes_count,coin_count_null,coin_count_null);
	}
	
	@Test(priority=8)
	public void enteringQuartersAndNickels() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,coin_count_null,nickels_count,coin_count_null);
	}
	
	@Test(priority=9)
	public void enteringQuartersAndPennies() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,coin_count_null,coin_count_null,pennies_count);
	}
	
	@Test(priority=10)
	public void enteringDimesAndNickels() {
		//Getting inputs from properties file
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,dimes_count,nickels_count,coin_count_null);
	}
	
	@Test(priority=11)
	public void enteringDimesAndPennies() {
		//Getting inputs from properties file
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,dimes_count,coin_count_null,pennies_count);
	}
	
	@Test(priority=12)
	public void enteringNickelsAndPennies() {
		//Getting inputs from properties file
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,coin_count_null,nickels_count,pennies_count);
	}
	
	@Test(priority=13)
	public void enteringQuartersDimesAndNickels() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,dimes_count,nickels_count,coin_count_null);
	}
	
	@Test(priority=14)
	public void enteringQuartersNickelsAndPennies() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,coin_count_null,nickels_count,pennies_count);
	}
	
	
	@Test(priority=15)
	public void enteringQuartersDimesAndPennies() {
		//Getting inputs from properties file
		int quarters_count = Integer.parseInt(p.getProperty("quarters_count"));
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(quarters_count,dimes_count,coin_count_null,pennies_count);
	}
	
	@Test(priority=16)
	public void enteringDimesNickelsAndPennies() {
		//Getting inputs from properties file
		int dimes_count = Integer.parseInt(p.getProperty("dimes_count"));
		int nickels_count = Integer.parseInt(p.getProperty("nickels_count"));
		int pennies_count = Integer.parseInt(p.getProperty("pennies_count"));
		int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
		//Counting Coins
		countingCoins(coin_count_null,dimes_count,nickels_count,pennies_count);
	}
	
	@Test(priority=17)
	public void clickOnQuartersTextField() {
		//Getting inputs from properties file
	    String coins_counting_select_dropdown = p.getProperty("coins_counting_select_dropdown");
	    String coins_counting_quarters_locator = p.getProperty("coins_counting_quarters_locator");
	    //ClickOn Quarters text field
		try {
		clickOnKto8Math();
		Thread.sleep(2000);
		clickOnQuickDropdown();
		Thread.sleep(2000);
		selectOperationFromQuickDropDown(coins_counting_select_dropdown);
		Thread.sleep(2000);
		driver.findElement(By.xpath(coins_counting_quarters_locator)).click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=18)
	public void enteringMinValueOnQuartersTextField() {
		//Getting inputs from properties file
	    int coins_counting_quarters_min_value = Integer.parseInt(p.getProperty("coins_counting_quarters_min_value"));
	    //Entering value on Quarters Text field
		enteringValueOnQuartersTextField(coins_counting_quarters_min_value);
	}
	
	@Test(priority=19)
	public void enteringMinPlusOneValueOnQuartersTextField() {
		//Getting inputs from properties file
	    int coins_counting_quarters_minplusone_value = Integer.parseInt(p.getProperty("coins_counting_quarters_minplusone_value"));
	    //Entering value on Quarters Text field
		enteringValueOnQuartersTextField(coins_counting_quarters_minplusone_value);
	}
	
	@Test(priority=20)
	public void enteringMinMinusOneValueOnQuartersTextField() {
		//Getting inputs from properties file
	    int coins_counting_quarters_minminusone_value = Integer.parseInt(p.getProperty("coins_counting_quarters_minminusone_value"));
	    int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
	    //Entering value on Quarters Text field
		countingCoins(coins_counting_quarters_minminusone_value,coin_count_null,coin_count_null,coin_count_null);
	}
	
	@Test(priority=21)
	public void enteringMaxValueOnQuartersTextField() {
		//Getting inputs from properties file
	    int coins_counting_quarters_max_value = Integer.parseInt(p.getProperty("coins_counting_quarters_max_value"));
	    //Entering value on Quarters Text field
		enteringValueOnQuartersTextField(coins_counting_quarters_max_value);
	}
	
	@Test(priority=22)
	public void enteringMaxMinusOneValueOnQuartersTextField() {
		//Getting inputs from properties file
	    int coins_counting_quarters_maxminusone_value = Integer.parseInt(p.getProperty("coins_counting_quarters_maxminusone_value"));
	    //Entering value on Quarters Text field
		enteringValueOnQuartersTextField(coins_counting_quarters_maxminusone_value);
	}
	
	@Test(priority=23)
	public void enteringMaxPlusOneValueOnQuartersTextField() {
		//Getting inputs from properties file
	    int coins_counting_quarters_maxplusone_value = Integer.parseInt(p.getProperty("coins_counting_quarters_maxplusone_value"));
	    int coin_count_null = Integer.parseInt(p.getProperty("coin_count_null"));
	    //Entering value on Quarters Text field
		countingCoins(coins_counting_quarters_maxplusone_value,coin_count_null,coin_count_null,coin_count_null);
	}
	
	@AfterMethod
	public void closingApplication() {
		driver.close();
	}

	public void enteringValueOnQuartersTextField(int value) {
		//Getting inputs from properties file
	    String coins_counting_select_dropdown = p.getProperty("coins_counting_select_dropdown");
	    String coins_counting_quarters_locator = p.getProperty("coins_counting_quarters_locator");
	    //ClickOn Quarters text field and entering value
		try {
		clickOnKto8Math();
		Thread.sleep(2000);
		clickOnQuickDropdown();
		Thread.sleep(2000);
		selectOperationFromQuickDropDown(coins_counting_select_dropdown);
		Thread.sleep(2000);
		driver.findElement(By.xpath(coins_counting_quarters_locator)).sendKeys(String.valueOf(value));
		Thread.sleep(2000);
		clickOnCountItButton();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void countingCoins(int quarters,int dimes,int nickels,int pennies) {
		//Getting inputs from properties file
	    String coins_counting_select_dropdown = p.getProperty("coins_counting_select_dropdown");
	    String coins_counting_quarters_element_type = p.getProperty("coins_counting_quarters_element_type");
	    String coins_counting_dime_element_type = p.getProperty("coins_counting_dime_element_type");
	    String coins_counting_nickels_element_type = p.getProperty("coins_counting_nickels_element_type");
	    String coins_counting_pennies_element_type = p.getProperty("coins_counting_pennies_element_type");
	    Double quarters_value = Double.parseDouble(p.getProperty("quarters_value"));
	    Double dimes_value = Double.parseDouble(p.getProperty("dimes_value"));
	    Double nickels_value = Double.parseDouble(p.getProperty("nickels_value"));
	    Double pennies_value = Double.parseDouble(p.getProperty("pennies_value"));
	    //Counting Coins
		try {
		clickOnKto8Math();
		Thread.sleep(2000);
		clickOnQuickDropdown();
		Thread.sleep(2000);
		selectOperationFromQuickDropDown(coins_counting_select_dropdown);
		Thread.sleep(2000);
		enterCoinCount(quarters, coins_counting_quarters_element_type);
		Thread.sleep(2000);
	    enterCoinCount(dimes, coins_counting_dime_element_type);
		Thread.sleep(2000);
		enterCoinCount(nickels, coins_counting_nickels_element_type);
		Thread.sleep(2000);
		enterCoinCount(pennies, coins_counting_pennies_element_type);
		Thread.sleep(2000);
		clickOnCountItButton();
		Thread.sleep(2000);
		actual_result = findingActualResult();
		expected_result_quarters = calculatingExpectedResult(quarters_value,quarters);
		expected_result_dime = calculatingExpectedResult(dimes_value,dimes);
		expected_result_nickels = calculatingExpectedResult(nickels_value,nickels);
		expected_result_pennies = calculatingExpectedResult(pennies_value,pennies);
		expected_result = calculatingExpectedResultForAllCoins(expected_result_quarters, expected_result_dime,
				expected_result_nickels, expected_result_pennies);
		comparingActualResultAndExpectedResult(actual_result, expected_result);
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	}
	

	public double calculatingExpectedResultForAllCoins(double expected_result_quarters, double expected_result_dime,
			double expected_result_nickels, double expected_result_pennies) {
		//Calculating expected Result
		double expected_result = expected_result_quarters+expected_result_dime+expected_result_nickels+expected_result_pennies;
		return expected_result;
	}
	
	public void comparingActualResultAndExpectedResult(double actual_result, double expected_result) {
		//Comparing Actual result with Expected Result
		Assert.assertEquals(actual_result,expected_result,"Failed - Expected:{"+ expected_result +"} Actual" + actual_result);
	}

	public double calculatingExpectedResult(double coin_value, int no_of_coins) {
		//Counting Quarters coins for Expected Result
		double expected_result = Math.abs(no_of_coins*coin_value);
		return expected_result;
	}

	public double findingActualResult() {
		//Getting inputs from properties file
	    String coins_counting_actualresult_locator = p.getProperty("coins_counting_actualresult_locator");
		//Switching Frame and Finding actual_result
		driver.switchTo().frame(1);
		WebElement result = driver.findElement(By.xpath(coins_counting_actualresult_locator));
		double actual_result = Double.parseDouble(result.getText().substring(7));
		return actual_result;
	}

	public void clickOnCountItButton() {
		//Getting inputs from properties file
	    String coins_counting_help_locator = p.getProperty("coins_counting_help_locator");
		//Enter "Help me count it!" button
		driver.findElement(By.xpath(coins_counting_help_locator)).click();
	}

	public void enterCoinCount(int coin_type, String element_type) {
		//Getting inputs from properties file
	    String coins_counting_textfield_locator = p.getProperty("coins_counting_textfield_locator");
		coins_counting_textfield_locator = coins_counting_textfield_locator.replace("element_type", element_type);
		driver.findElement(By.xpath(coins_counting_textfield_locator)).sendKeys(String.valueOf(coin_type));
	}

	public void clickOnKto8Math() {
		//Getting inputs from properties file
	    String kto8math_locator = p.getProperty("kto8math_locator");
		//ClickOn K-8 Math Tab
		driver.findElement(By.xpath(kto8math_locator)).click();
	}
	
	
}
