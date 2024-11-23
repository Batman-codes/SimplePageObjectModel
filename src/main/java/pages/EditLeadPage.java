package pages;

import base.BasePage;
import base.PageObjectPool;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import org.openqa.selenium.devtools.v85.page.Page;

public class EditLeadPage extends ProjectSpecificMethod implements BasePage {

	public EditLeadPage updateCompanyName(String UdateCName) {

		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(UdateCName);
		return this;
	}

	public ViewLeadPage clickUpdate() {
		getDriver().findElement(By.name("submitButton")).click();
		return PageObjectPool.getPage("ViewLeadPage", ViewLeadPage.class);
		//return new ViewLeadPage();
	}

}
