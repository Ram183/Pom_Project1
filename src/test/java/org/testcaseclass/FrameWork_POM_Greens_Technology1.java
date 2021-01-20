package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Greens_Technology1;

public class FrameWork_POM_Greens_Technology1 extends Base_Class {

	public static void main(String[] args) {

		chromeBrowser("http://www.greenstechnologys.com/");

		maximize();

		implictWait();

		Object_Class_Greens_Technology1 ob = new Object_Class_Greens_Technology1();

		clickButton(ob.getCertificate());

		clickButton(ob.getCourseContent());

		getText(ob.getTitle());

	}

}
