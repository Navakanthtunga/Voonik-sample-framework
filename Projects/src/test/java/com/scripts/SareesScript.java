package com.scripts;

import org.testng.annotations.Test;

import com.base.BaseLib;
import com.po.SareesPo;

public class SareesScript extends BaseLib{
	
	@Test
	
	public void chooseSaree(){
		try {
		BaseLib.readUrl();
		SareesPo sp=new SareesPo(driver);
		// To click on Indian Wear
		sp.moveToByJs(sp.getEleIndWr());
		sp.ClickByJs(sp.getEleSarees());
		sp.moveToByJs(sp.getEleProDetails());
		sp.ClickByJs(sp.getEleSize());
		sp.ClickByJs(sp.getEleAddBag());
	
			Thread.sleep(3000);
		sp.getEleConfPopup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
