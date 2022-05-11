package com.test_Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Maven_Project.BaseClass;
import Cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\AKBAR\\eclipse-workspace\\Maven_Project2\\src\\test\\java\\com\\feature\\feature", 
glue = "C:\\Users\\AKBAR\\eclipse-workspace\\Maven_Project2\\src\\test\\java\\stepdefinition\\stepdefinition.java")
public class Test_runner {
	
	public static WebDriver driver;
	
	public static void setup() {
		driver = BaseClass.browserLaunch("Chrome");
	}
	
	
	}
	
	
	


