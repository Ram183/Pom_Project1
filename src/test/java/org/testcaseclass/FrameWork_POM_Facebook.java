package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class;

public class FrameWork_POM_Facebook extends Base_Class {

	public static void main(String[] args) throws Exception {

		chromeBrowser("https://www.facebook.com/");

		maximize();

		implictWait();
		
		Object_Class ob = new Object_Class();

		sendKeys(ob.getUserName(), excelCode(1, 0));
		
		sendKeys(ob.getPassword(), excelCode(1, 1));
		
		clickButton(ob.getLogin());
		
		Thread.sleep(3000);
		
		getText(ob.getLoginMessage());
		
	}

}
