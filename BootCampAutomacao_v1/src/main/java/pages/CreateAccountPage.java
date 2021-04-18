package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class CreateAccountPage {

	public CreateAccountPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	protected WebElement linkSignIn;

	@FindBy(how = How.ID, using = "email_create")
	protected WebElement txtEmail;

	@FindBy(how = How.ID, using = "SubmitCreate")
	protected WebElement btCreateAccount;

	@FindBy(how = How.ID, using = "id_gender2")
	protected WebElement radioTitle;

	@FindBy(how = How.ID, using = "customer_firstname")
	protected WebElement txtFirstName;

	@FindBy(how = How.ID, using = "customer_lastname")
	protected WebElement txtLastName;

	@FindBy(how = How.ID, using = "passwd")
	protected WebElement txtPassword;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"days\"]")
	protected WebElement cbDays;

	@FindBy(how = How.ID, using = "months")
	protected WebElement cbMonths;

	@FindBy(how = How.ID, using = "years")
	protected WebElement cbYears;

	@FindBy(how = How.ID, using = "newsletter")
	protected WebElement ckNewsletter;

	@FindBy(how = How.ID, using = "optin")
	protected WebElement ckPartners;	

}
