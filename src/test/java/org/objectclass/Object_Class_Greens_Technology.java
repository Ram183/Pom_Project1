package org.objectclass;

import org.baseclassforexcel.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Greens_Technology extends Base_Class {

	public Object_Class_Greens_Technology() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div[@class='trainer-info'])[6]")
	private WebElement scollDown;

	@FindBy(xpath = "//a[text()='COURSES']")
	private WebElement scrollUp;

	public WebElement getScollDown() {
		return scollDown;
	}

	public WebElement getScrollUp() {
		return scrollUp;
	}

}
