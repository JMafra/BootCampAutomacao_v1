package actions;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccountPage;
import utils.DriverContext;

public class CreateAccountAction extends CreateAccountPage {
	
	protected WebDriverWait wait;
	
	public CreateAccountAction() {
		
		wait = new WebDriverWait(DriverContext.getDriver(), 30);		
		
	}	
	
	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
	}	
	
	public void preencherEmail(String email) {	
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
    }
	
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btCreateAccount)).click();
	}
	

	public void clicarTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(radioTitle)).click();
	}
	
	public void preencherFirstName(String firstName) {	
		wait.until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(firstName);
    }
	
	public void preencherLastName(String lastName) {	
		wait.until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(lastName);
    }
	
	public void preencherPassword(String password) {	
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
    }	
	
	public void selecionarDay(String day) {	
		Select cbDay  = new Select(cbDays);
		cbDay.selectByValue(day);
    }
	
	public void selecionarMonth(String month) {	
		Select cbMonth  = new Select(cbMonths);
		cbMonth.selectByValue(month);
    }	
	
	public void selecionarYear(String year) {	
		Select cbYear  = new Select(cbYears);
		cbYear.selectByValue(year);
    }		
	
}
