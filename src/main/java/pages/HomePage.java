package pages;

import base.BasePage;
import base.PageObjectPool;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod implements BasePage {

	public LeadsPage clickLeadsTab() {
		getDriver() .findElement(By.linkText("Leads")).click();
		return PageObjectPool.getPage("LeadsPage", LeadsPage.class);
		//return new LeadsPage();
	}
	
	
	
	
}
