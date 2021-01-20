package org.objectclass;

import javax.xml.xpath.XPath;

import org.baseclassforexcel.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Greens_Technology2 extends Base_Class {

	
	public Object_Class_Greens_Technology2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courses;
	
	
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement javaTraining;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement	coureJavaTraining;
	
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement scrollDown;
	
	@FindBy(xpath="//p[contains(text(),'I was looking')]")
	private WebElement printValue;

	public WebElement getCourses() {
		return courses;
	}

	public void setCourses(WebElement courses) {
		this.courses = courses;
	}

	public WebElement getJavaTraining() {
		return javaTraining;
	}

	public void setJavaTraining(WebElement javaTraining) {
		this.javaTraining = javaTraining;
	}

	public WebElement getCoureJavaTraining() {
		return coureJavaTraining;
	}

	public void setCoureJavaTraining(WebElement coureJavaTraining) {
		this.coureJavaTraining = coureJavaTraining;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public void setScrollDown(WebElement scrollDown) {
		this.scrollDown = scrollDown;
	}

	public WebElement getPrintValue() {
		return printValue;
	}

	public void setPrintValue(WebElement printValue) {
		this.printValue = printValue;
	}
	
	
	
	
}
