package org.testcaseclass;

import org.baseclassforexcel.Base_Class;
import org.objectclass.Object_Class_Adactin_Hotel;
import org.objectclass.Object_Class_Adactin_Hotel1;
import org.objectclass.Object_Class_Adactin_Hotel2;
import org.objectclass.Object_Class_Adactin_Hotel3;

public class FrameWork_POM_Adactin_Hotel extends Base_Class {

	public static void main(String[] args) throws Exception {

		chromeBrowser("http://adactinhotelapp.com/");

		maximize();

		implictWait();

		Object_Class_Adactin_Hotel ob = new Object_Class_Adactin_Hotel();

		sendKeys(ob.getUserName(), excelCode(10, 0));

		sendKeys(ob.getPassword(), excelCode(10, 1));

		clickButton(ob.getLogin());

		Object_Class_Adactin_Hotel1 ob1 = new Object_Class_Adactin_Hotel1();

		getAttribute(ob1.getWelcomeNotes());

		selectOptions(ob1.getLocation(), excelCode(10, 2));

		selectOptions(ob1.getHotels(), excelCode(10, 3));

		selectOptions(ob1.getRoomType(), excelCode(10, 4));

		selectOptions(ob1.getNumberOfRooms(), excelCode(10, 5));

		selectOptions(ob1.getAdultsPerRoom(), excelCode(10, 6));

		selectOptions(ob1.getChildrenPerRoom(), excelCode(10, 7));

		clickButton(ob1.getSearchButton());

		Object_Class_Adactin_Hotel2 ob2 = new Object_Class_Adactin_Hotel2();

		clickButton(ob2.getRadioButton());

		clickButton(ob2.getContinueButton());

		Object_Class_Adactin_Hotel3 ob3 = new Object_Class_Adactin_Hotel3();

		sendKeys(ob3.getFirstName(), excelCode(10, 8));

		sendKeys(ob3.getLastName(), excelCode(10, 9));

		sendKeys(ob3.getAddress(), excelCode(10, 10));

		sendKeys(ob3.getCreditCardNo(), excelCode(10, 11));

		selectOptions(ob3.getCreditCardType(), excelCode(10, 12));

		selectOptions(ob3.getSelectMonth(), excelCode(10, 13));

		selectOptions(ob3.getSelectYear(), excelCode(10, 14));

		sendKeys(ob3.getcVV(), excelCode(10, 15));

		clickButton(ob3.getBookNow());

		explicitWait("//input[@id='order_no']");

		excelWrite2(10, 16, getAttribute(ob3.getOrderNo()));

		System.out.println(getAttribute(ob3.getOrderNo()));

	}

}
