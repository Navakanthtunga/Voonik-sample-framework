package com.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseLib;
import com.po.SareesPo;

public class ScrollPage extends BaseLib{
@Test
public void VerifyScroll(){
	try {
		BaseLib.readUrl();
		SareesPo sp=new SareesPo(driver);
		// To click on Indian Wear
		sp.moveToByJs(sp.getEleIndWr());
		sp.ClickByJs(sp.getEleSarees());
		Thread.sleep(3000);
		sp.pageScrollDown();
		
		Thread.sleep(2000);
		sp.pageScrollDown();
	/*	sp.pageScrollDown();
		Thread.sleep(2000);*/
		sp.pageScrollUp();
		
		//sp.getEleProdinPag().click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
