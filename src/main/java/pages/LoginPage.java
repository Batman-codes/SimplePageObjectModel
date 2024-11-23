package pages;

import base.PageObjectPool;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage enterUsername(String uname) {
		// Use getDriver() to access the WebDriver instance
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;
	}

	public LoginPage enterPassword(String Pass) {
		getDriver().findElement(By.id("password")).sendKeys(Pass);
		return this;
	}

	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();

		//Getting the object for WelComePage class from pageObjectPool
		return PageObjectPool.getPage("WelcomePage", WelcomePage.class);

		//return new WelcomePage();
	}
}
