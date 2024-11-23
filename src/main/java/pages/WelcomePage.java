package pages;

import base.BasePage;
import base.PageObjectPool;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod implements BasePage {

	public WelcomePage verifyTitle() {
		System.out.println(getDriver().getTitle());
		return this;
	}

	public HomePage clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return PageObjectPool.getPage("HomePage", HomePage.class);
		//return new HomePage();
	}

}
