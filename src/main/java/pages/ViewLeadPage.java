package pages;

import base.BasePage;
import base.PageObjectPool;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod implements BasePage {

	public ViewLeadPage verifyLead() {
		String firstName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();

		if (firstName.contains(firstName)) {
			System.out.println("Verified");

		} else {

			System.out.println("Not verified");
		}
		return this;
	}

	public ViewLeadPage verifyCompanyName() {
		String firstName = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();

		if (firstName.contains("Qeagle")) {
			System.out.println("Verified");

		} else {

			System.out.println("Not Verified");
		}
		return this;
	}

	public EditLeadPage clickEditButton() {
		getDriver().findElement(By.linkText("Edit")).click();
		return PageObjectPool.getPage("EditLeadPage", EditLeadPage.class);
		//return new EditLeadPage();
	}

	public DuplicatePage clickDuplicateButton() {

		getDriver().findElement(By.linkText("Duplicate Lead")).click();
		return PageObjectPool.getPage("DuplicatePage", DuplicatePage.class);
		//return new DuplicatePage();
	}

	public LeadsPage clickDeleteButton() {

		getDriver().findElement(By.linkText("Delete")).click();
		return PageObjectPool.getPage("LeadsPage", LeadsPage.class);
		//return new LeadsPage();
	}

}
