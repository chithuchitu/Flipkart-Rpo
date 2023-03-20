package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.PageObjectManagers.PageObjectManager;
import com.baseclass.BaseClass;
import com.pageobjects.CreateAccount;
import com.pageobjects.Login;
import com.property.ConfigurationHelper;
import com.runner.Runner;

import cucumber.api.java.en.*;
public class StepDefinition extends BaseClass {
	public static WebDriver driver = BaseClass.driver;
Login l= new Login(driver);
CreateAccount ca = new CreateAccount(driver);
	PageObjectManager pom = new PageObjectManager(driver);
	@Given("user give the Invalid Username and Invalid Password")
	public void user_give_the_invalid_username_and_invalid_password() throws IOException {
		ConfigurationHelper.getInstance().getUsername();
		ConfigurationHelper.getInstance().getPassword();
		//pom.getEnterLogin().getEmail().sendKeys("chithra@gmail.com");;
		//pom.getEnterLogin().getPassword().sendKeys("chithra@1324");
		implicitwait(20); 
	}
	@When("user Click The Login Button")
	public void user_click_the_login_button() {
		Click(pom.getEnterLogin().getLogin());
		System.out.println("Incorect Password!");

	}

	@Then("user Take Screenshot For Invalid Credential error Message")
	public void user_take_screenshot_for_invalid_credential_error_message() throws IOException {
		screenshot("Screenshotwrongpassword.png");
		System.out.println("Wrong Password Page Screenshot Taken");

	}

	@Then("user Go Back To The Home Page")
	public void user_go_back_to_the_home_page() {
		navigateBack();
	}

	@Then("user Clik The Create New Account Button and Fill The Details")
	public void user_clik_the_create_new_account_button_and_fill_the_details() {
		Click(pom.getCreateAccount().getCreateAccount());
		pom.getCreateAccount().getFirstName().sendKeys("chithra");
		pom.getCreateAccount().getLastName().sendKeys("pavai");
		pom.getCreateAccount().getRegeEmail().sendKeys("chithu@gmail.com");
		pom.getCreateAccount().getRegPassword().sendKeys("chithu");
		useDropDown(pom.getCreateAccount().getDay()).selectByIndex(8);
		useDropDown(pom.getCreateAccount().getMonth()).selectByIndex(2);
		useDropDown(pom.getCreateAccount().getYear()).selectByVisibleText("2022");
		clickRadioButton(pom.getCreateAccount().getRadioBtn());
		Click(pom.getCreateAccount().getSumbit());
		System.out.println("New account Created");
	}
	@Then("user Take Scrrenshot For The Registeration Page")
	public void user_take_scrrenshot_for_the_registeration_page() throws IOException {
         screenshot("register.png");
         System.out.println("screenshot Taken for account Page");
	}

}
