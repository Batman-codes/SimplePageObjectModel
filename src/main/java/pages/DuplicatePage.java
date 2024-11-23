package pages;

import base.BasePage;
import base.PageObjectPool;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class DuplicatePage extends ProjectSpecificMethod implements BasePage {

	
	public ViewLeadPage clickCreateDuplicate() {

		getDriver().findElement(By.name("submitButton")).click();
		return PageObjectPool.getPage("ViewLeadpage", ViewLeadPage.class);
		//return new ViewLeadPage();
	}
	
	
}
