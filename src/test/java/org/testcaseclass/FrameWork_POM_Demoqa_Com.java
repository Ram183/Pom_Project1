package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Demoqa;

public class FrameWork_POM_Demoqa_Com extends Base_Class {

	public static void main(String[] args) throws Exception {

		chromeBrowser("https://demoqa.com/automation-practice-form");

		maximize();

		implictWait();

		Object_Class_Demoqa ob = new Object_Class_Demoqa();

		sendKeys(ob.getFirstName(), excelCode(5, 0));

		sendKeys(ob.getLastName(), excelCode(5, 1));

		sendKeys(ob.getEmail(), excelCode(5, 2));

		clickButton(ob.getGender());

		sendKeys(ob.getMobileNumber(), excelCode(5, 3));

		javaScriptValue(ob.getSubjects(), excelCode(5, 4));

		System.out.println(getAttribute(ob.getSubjects()));

		clickButton(ob.getHobbies());

		sendKeys(ob.getCurrentAddress(), excelCode(5, 5));

		javaScriptValue(ob.getState(), excelCode(5, 6));

		System.out.println(getAttribute(ob.getState()));

		javaScriptClick(ob.getSubmit());

	}
}