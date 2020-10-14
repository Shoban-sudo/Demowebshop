package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Pomwebelements contains the webelements of the testcases to be executed using POM with Page Factory class
 * @author Shobanbabu MR
 *
 */
public class Pomwebelements {

	@FindBy(xpath="//a[contains(@href,'/login')]")
	public static WebElement loginLink;

	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	public static WebElement welcomeTextValidation;

	@FindBy(xpath="//input[contains(@id,'Email')]")
	public static WebElement loginEmailAddress;

	@FindBy(xpath="//input[contains(@id,'Password')]")
	public static WebElement loginPassword;

	@FindBy(xpath="//input[contains(@class,'button-1 login-button')]")
	public static WebElement loginButton;

	@FindBy(xpath="//a[contains(text(),'atest@gmail.com')]")
	public static WebElement userAccountIdValidation;

	@FindBy(xpath="//span[contains(@class,'cart-label')] [contains(text(),'Shopping cart')]")
	public static WebElement shoppingCart;

	@FindBy(xpath="//div[contains(text(),'Your Shopping Cart is empty!')]")
	public static WebElement clearTheCart;

	@FindBy(xpath="(//a[contains(@href,'books')]  [contains(text(),'Books')])[3]")
	public static WebElement books;

	@FindBy(xpath="//a[contains(@title,'Show details for Computing and Internet')]/child::img")
	public static WebElement bookSelection;

	@FindBy(xpath="//span[contains(@class,'price-value-13')]")
	public static WebElement getPriceDetails;

	@FindBy(xpath="//input[contains(@id,'addtocart_13_EnteredQuantity')]")
	public static WebElement quantity;

	@FindBy(xpath="//input[contains(@id,'add-to-cart-button-13')]")
	public static WebElement addToCartButton;

	@FindBy(xpath="//p[contains(@class,'content')] [contains(text(),'The product has been added to your ')] ")
	public static WebElement productResponseTextValidation;

	@FindBy(xpath="(//table[contains(@class,'cart-total')]/child::tbody/tr/td/span/span)[1]")
	public static WebElement subTotalValidation;

	@FindBy(xpath="//input[contains(@id,'termsofservice')]")
	public static WebElement termsAndConditionCheckBox;

	@FindBy(xpath="//button[contains(@id,'checkout')]")
	public static WebElement checkOutButton;

	@FindBy(xpath="//select[contains(@id,'billing-address-select')]")
	public static WebElement billingAddressDropDown;

	@FindBy(xpath="//select[contains(@id,'BillingNewAddress_CountryId')]")
	public static WebElement billingAddressCountryDropDown;

	@FindBy(xpath="//input[contains(@id,'BillingNewAddress_City')]")
	public static WebElement billingAddressCityName;

	@FindBy(xpath="//input[contains(@id,'BillingNewAddress_Address1')]")
	public static WebElement billingAddressAddress1;

	@FindBy(xpath="//input[contains(@id,'BillingNewAddress_ZipPostalCode')]")
	public static WebElement billingAddressZipcode;

	@FindBy(xpath="//input[contains(@id,'BillingNewAddress_PhoneNumber')]")
	public static WebElement billingAddressPhoneNumber;

	@FindBy(xpath="//div[contains(@id,'billing-buttons-container')]/child::input")
	public static WebElement ContinueButton;

	@FindBy(xpath="//select[contains(@id,'shipping-address-select')]")
	public static WebElement shippingAddressDropDown;

	@FindBy(xpath="//input[contains(@id,'PickUpInStore')]")
	public static WebElement shippingAddressInstorePickupCheckbox;

	@FindBy(xpath="//div[contains(@id,'shipping-buttons-container')]/child::input")
	public static WebElement shippingAddressContinueButton;	

	@FindBy(xpath="//input[contains(@id,'shippingoption_1')]")
	public static WebElement shippingMethodNextDayAir;	

	@FindBy(xpath="//div[contains(@id,'shipping-method-buttons-container')]/child::input")
	public static WebElement shippingMethodContinueButton;

	@FindBy(xpath="//input[contains(@id,'paymentmethod_0')]")
	public static WebElement paymentMethodCashOnDelivery;

	@FindBy(xpath="//div[contains(@id,'payment-method-buttons-container')]/child::input")
	public static WebElement paymentMethodContinueButton;

	@FindBy(xpath="//p[contains(text(),'You will pay by COD')]")
	public static WebElement paymentInformationMessageValidation;

	@FindBy(xpath="//div[contains(@id,'payment-info-buttons-container')]/child::input")
	public static WebElement paymentInformationContinueButton;

	@FindBy(xpath="//div[contains(@id,'confirm-order-buttons-container')]/child::input")
	public static WebElement confirmButton;

	@FindBy(xpath="//div[contains(@class,'title')]  //strong[contains(text(),'Your order has been successfully processed!')]")
	public static WebElement orderResponseValidation;

	@FindBy(css="ul.details > li")
	public static WebElement printOrderNumber;

	@FindBy(xpath="//div[contains(@class,'buttons')]/child::input")
	public static WebElement placedOrderContinueButton;

	@FindBy(xpath="//a[contains(@href,'logout')]")
	public static WebElement logout;

}
