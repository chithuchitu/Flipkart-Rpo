package com.PageObjectManagers;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pageobjects.CreateAccount;
import com.pageobjects.Login;

public class PageObjectManager extends BaseClass {
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		
		
	}
	private CreateAccount  CreateAccount;
	
	public CreateAccount getCreateAccount() {
		 if (CreateAccount==null) {
			 CreateAccount = new CreateAccount(driver);
					}
		
		return CreateAccount;
	}

	private Login login;
	public Login getEnterLogin() {
		if (login== null) {
			
			
			login = new Login(driver);
		}
		return login;
	}
	

}
