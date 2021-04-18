package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.CreateAccountAction;
import utils.Constants;
import utils.DriverContext;

public class TestAutomationPractice {

	static WebDriver driver;
	static WebDriverWait wait;
	static CreateAccountAction account;	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver  = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);	
		account  = new CreateAccountAction();		
	}

	@Test
	public void testCriarContaUsuario() throws Exception {		
		account.clicarSignIn();	
		account.preencherEmail("bootcamp03@gmail.com");
		account.clicarCreateAccount();
		account.clicarTitle();
		account.preencherFirstName("Juliana");;
		account.preencherLastName("Mafra");
		account.preencherPassword("12345");	
	    account.selecionarDay("5");		
	    account.selecionarMonth("12");			
		account.selecionarYear("1987");	
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		//driver.close();
	}
	

}
