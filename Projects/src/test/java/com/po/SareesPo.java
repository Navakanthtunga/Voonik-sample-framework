package com.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SareesPo {
	public  WebDriver driver=null;
public SareesPo(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
// To identify Indian wear
@FindBy(id="menu_item_0")
private WebElement eleIndWr;
public WebElement getEleIndWr(){
	return eleIndWr;
}
// To   identify sarees
@FindBy(xpath="//a[text()='Sarees']")
private WebElement eleSarees;
public WebElement getEleSarees(){
	return eleSarees;
}
// To identify the product
@FindBy(xpath="//div[@ id='5385816']/../preceding-sibling::div/div/following-sibling::a")
private WebElement eleClickPro;
public WebElement getEleClickPro(){
	return eleIndWr;
}
// To identify Product details
@FindBy(id="5385816")
private WebElement eleProDetails;
public WebElement getEleProDetails(){
	return eleProDetails;
}
// To identify on free size
@FindBy(xpath="//div[@ id='5385816']//label[@ id='sizes']")
private WebElement eleSize;
public WebElement getEleSize(){
	return eleSize;
}
//To identify Add Bag
@FindBy(xpath="//div[@ id='5385816']//a[@ id='buy_btn']")
private WebElement eleAddBag;
public WebElement getEleAddBag(){
	return eleAddBag;
}
// To identify Confirmation popup
@FindBy(id="toastbar-header")
private WebElement eleConfPopup;
public WebElement getEleConfPopup(){
	return eleConfPopup;
}
// To identify a product in the page 
@FindBy(id="footer_web")
private WebElement eleProdinPag;
public WebElement getEleProdinPag(){
	return eleProdinPag;
}
public void moveToByJs(WebElement element){
	JavascriptExecutor js = (JavascriptExecutor) driver;
    String strJavaScript = "var element = arguments[0];"
            + "var mouseEventObj = document.createEvent('MouseEvents');"
            + "mouseEventObj.initEvent( 'mouseover', true, true );"
            + "element.dispatchEvent(mouseEventObj);";
    
     js.executeScript(strJavaScript, element); 
}
public void ClickByJs(WebElement element){
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);

}
public void pageScrollDown(){
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scroll(0, 1500);");
}
public void pageScrollUp(){
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scroll(0, -250);");	
}
public void pageScrollForEle(WebElement element){
	Actions action=new Actions(driver);
	action.moveToElement(element);
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);",element);*/
}
}
