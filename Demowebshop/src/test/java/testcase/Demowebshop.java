package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import commonfunctions.Baseclass;
import pom.Pomwebelements;


/**
 * Demowebshop contains method with TestNG framework for the execution of testcase for the given psedocode 
 * This method extends Parent class properties named as Baseclass
 * @author Shobanbabu MR
 * 
 */
public class Demowebshop extends Baseclass {

	/**
	 * This method is the actual testcase execution for the purchase of particular book which contains @Test and data driven by parameterization
	 * @throws InterruptedException
	 */	
	@Test
	@Parameters({"username","password"})
	public void bookPurchasing(String username,String password) throws InterruptedException
	{
		PageFactory.initElements(driver, Pomwebelements.class);
		Pomwebelements.loginLink.click();

		WebElement welcomeText = Pomwebelements.welcomeTextValidation;
		String textValidation = welcomeText.getText();
		System.out.println("The text is:" +textValidation);
		Assert.assertEquals(textValidation, "Welcome, Please Sign In!");
		Pomwebelements.loginEmailAddress.sendKeys(username);
		Pomwebelements.loginPassword.sendKeys(password);
		Pomwebelements.loginButton.click();
		WebElement userIdText = Pomwebelements.userAccountIdValidation;
		String TextValidation = userIdText.getText();
		System.out.println(TextValidation);
		Assert.assertEquals(TextValidation, "atest@gmail.com");
		Pomwebelements.books.click();

		try {
			Pomwebelements.bookSelection.click();
		}
		catch (Exception e)
		{
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();",Pomwebelements.bookSelection);
		}


		WebElement priceText = Pomwebelements.getPriceDetails;
		String priceTextValidation=priceText.getText();
		System.out.println(priceTextValidation);
		Assert.assertEquals(priceTextValidation, "10.00");
		Pomwebelements.quantity.clear();
		Pomwebelements.quantity.sendKeys("2");

		Pomwebelements.addToCartButton.click();
		String productResponseText = Pomwebelements.productResponseTextValidation.getText();
		System.out.println(productResponseText);
		Assert.assertEquals(productResponseText,"The product has been added to your shopping cart");

		Pomwebelements.shoppingCart.click();
		System.out.println(Pomwebelements.subTotalValidation.getText());

		WebElement checkBox= Pomwebelements.termsAndConditionCheckBox;
		checkBox.click();
		boolean checkBoxStatus=checkBox.isSelected();
		System.out.println(checkBoxStatus);
		Assert.assertEquals(checkBoxStatus, true);
		Pomwebelements.checkOutButton.click();

		WebElement billingAddress = Pomwebelements.billingAddressDropDown;

		Select select=new Select(billingAddress);
		select.selectByVisibleText("New Address");

		WebElement countrySelection= Pomwebelements.billingAddressCountryDropDown;
		Select countrySelect=new Select(countrySelection);
		countrySelect.selectByVisibleText("India");
		Pomwebelements.billingAddressCityName.sendKeys("Chennai");
		Pomwebelements.billingAddressAddress1.sendKeys("Vandalur");
		Pomwebelements.billingAddressZipcode.sendKeys("600048");
		Pomwebelements.billingAddressPhoneNumber.sendKeys("7708685759");
		Pomwebelements.ContinueButton.click();

		WebElement shippingAddress = Pomwebelements.shippingAddressDropDown;
		Select selection=new Select(shippingAddress);
		selection.selectByVisibleText("Shoban Babu, Vandalur, Chennai 600048, India");
		Pomwebelements.shippingAddressContinueButton.click();	

		Pomwebelements.shippingMethodNextDayAir.click();
		boolean radioButtonSelection = Pomwebelements.shippingMethodNextDayAir.isSelected();
		System.out.println(radioButtonSelection);
		Assert.assertEquals(radioButtonSelection, true);
		Pomwebelements.shippingMethodContinueButton.click();

		Pomwebelements.paymentMethodCashOnDelivery.click();
		boolean radioButtonPaymentCod = Pomwebelements.paymentMethodCashOnDelivery.isSelected();
		System.out.println(radioButtonPaymentCod);
		Assert.assertEquals(radioButtonPaymentCod, true);
		Pomwebelements.paymentMethodContinueButton.click();

		String paymentInfoResponseValidation=Pomwebelements.paymentInformationMessageValidation.getText();
		System.out.println(paymentInfoResponseValidation);
		Assert.assertEquals(paymentInfoResponseValidation, "You will pay by COD");
		Pomwebelements.paymentInformationContinueButton.click();

		Pomwebelements.confirmButton.click();
		String orderResponseMessge=Pomwebelements.orderResponseValidation.getText();
		System.out.println(orderResponseMessge);
		Assert.assertEquals(orderResponseMessge, "Your order has been successfully processed!");
		String orderNumber=Pomwebelements.printOrderNumber.getText();
		System.out.println(orderNumber);

		Pomwebelements.placedOrderContinueButton.click();
		Pomwebelements.logout.click();

	}

}
