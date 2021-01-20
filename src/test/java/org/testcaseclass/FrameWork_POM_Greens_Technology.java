package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Greens_Technology;

public class FrameWork_POM_Greens_Technology extends Base_Class {

	public static void main(String[] args) throws InterruptedException {

		chromeBrowser("http://www.greenstechnologys.com/");

		maximize();

		implictWait();
		
		Object_Class_Greens_Technology ob = new Object_Class_Greens_Technology();

		scrollDown(ob.getScollDown());

		Thread.sleep(3000);

		scrollup(ob.getScrollUp());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
