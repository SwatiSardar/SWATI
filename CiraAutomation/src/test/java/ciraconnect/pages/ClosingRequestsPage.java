package ciraconnect.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ciraconnect.utilities.LoggerManager;

public class ClosingRequestsPage {

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public ClosingRequestsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Closing Requests Page Objects ======== ");


	}

	String closingRequestsURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/closing-requests";


	//xpath for FulfillCompactOn
	@FindBy(xpath = "(//div[@class='dx-button-content'])[54]")
	WebElement fulfillButton;
	
	String pageLoader= "(//div[@class=\"dx-loadpanel-message\"])[2]";

	@FindBy(xpath = "(//div[@class='dx-switch-on'])[3]")
	WebElement compactOn;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeButton;


	@FindBy(xpath = "(//div[@class='dx-switch-off'])[3]")
	WebElement compactOff;

	@FindBy(xpath = "//div[@class='cc-wizard-horizontal-content dx-template-wrapper dx-item-content dx-box-item-content']")
	WebElement wizard;

	//xapth for Action Transfer To Collection

	@FindBy(xpath = "(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[3]")
	WebElement actionButton;

	@FindBy(xpath = " (//div[@ng-reflect-klass='menu-text'])[2]")
	WebElement transferTo;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[9]")
	WebElement collection;
    
	//xapth for Action Transfer To Processing
	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[11]")
	WebElement processing;
	
	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[12]")
	WebElement transition;
	
	//xpath for AssignProperty
	
	@FindBy(xpath = " (//div[@ng-reflect-klass='menu-text'])[4]")
	WebElement assignProperty;
	
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[22]")
	WebElement dropdown;
	
	
	@FindBy(xpath="//div[@class='community-cell-template dx-template-wrapper']//span[text()='1100 Trinity Mills Condos']")
	WebElement dropdownValue;
	
	
	@FindBy(xpath="(//div[@class='dx-field-item-content dx-field-item-content-location-right']//div[@class='dx-texteditor-input-container']//input[@autocomplete='off' and @class='dx-texteditor-input'])[12]")
	public WebElement SearchText;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-search'])[2]")
	WebElement SearchButton;
	
	@FindBy(xpath = "(//div[@class='dx-checkbox-container'])[2]")
	WebElement checkBox;
	
	@FindBy(xpath = "//i[@class='dx-icon fas fa-save']")
	WebElement saveButton;
	
	@FindBy(xpath="(//div[@class='dx-item dx-menu-item']//i[@class='fas fa-key'])[3]")
	public WebElement cancelRequest;
	
	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
	public WebElement cancelReason;
	
	
	//xpath for search tab
	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[2]")
	public WebElement searchTab;
	
	//xpath for open request Type filter
	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[1]")
	public WebElement openRequest;
	
	@FindBy(xpath="(//input[@autocomplete='off' and @role='textbox'])[2]")
	public WebElement propertyAddress;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[6]")
	public WebElement toDate;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[2]")
	public WebElement fromDate;
	
	@FindBy(xpath="//a[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text dx-calendar-caption-button']")
	public WebElement currentYear;
	
	@FindBy(xpath="//i[@class='dx-icon dx-icon-chevronleft']")
	public WebElement lastYear;
	
	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-contoured-date']")
	public WebElement month;
	
	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-contoured-date']")
	public WebElement date;
	
	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-search']")
	public WebElement searchButton;
	
	@FindBy(xpath="(//i[@class='dx-icon dx-icon-runner'])[1]")
	public WebElement actionCheck;
	
	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-text-content-alignment-right'])[1]")
	public WebElement rush;
	
	@FindBy(xpath="(//div//span[@class='dx-header-filter dx-header-filter-empty'])[9]")
	public WebElement requestType;
	
	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[6]")
	public WebElement community;
	
	@FindBy(xpath="(//div[@class='dx-column-indicators'])[10]")
	public WebElement Questionnaire;
	
	@FindBy(xpath="(//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text'])[1]")
	public WebElement QuestionnaireOk;
	
	@FindBy(xpath="(//i[@class='cc-1-5x fas fa-envelope'])[1]")
	public WebElement emailLabel;
	
	//xpath for search Icon
	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon cc-icon fas fa-search']")
	public WebElement searchIcon;
	
	@FindBy(xpath="//input[@autocomplete='off' and @aria-label='Search in the data grid']")
	public WebElement searchField;
	
	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[7]")
	public WebElement propertyReasonLabel;
	
	@FindBy(xpath="(//div[@class='dx-template-wrapper'])[2]")
	public WebElement communityvalue;
	
	//xpath for fullscreen option

		@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
		WebElement fullScreenIcon;

		@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
		WebElement normalScreenIcon;

		@FindBy(xpath="//*[@id='dx-col-1656']")
		WebElement communityColumn;

		@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
		WebElement resetLayout;

		@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
		WebElement closeColChooser;
		
		

		@FindBy(xpath = "//i[@class='dx-icon dx-icon-columnchooser fa-stack-2x']")
		WebElement columnChooser;

		@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
		WebElement columnChooserClose;

		
	public void ClosingRequestspageLanding() {
		driver.navigate().to(closingRequestsURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("======== Navigating Closing Requests Management Page ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, closingRequestsURL);
	}

	public void verifyFulfillCompactOn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		wait.until(ExpectedConditions.elementToBeClickable(fulfillButton));

		fulfillButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		if(compactOn.isDisplayed())
		{
			System.out.println("Compact Mode is ON ");
		}
		else
		{
			System.out.println("Compact Mode is OFF");
		}

		closeButton.click();

	}


	public void verifyFulfillCompactOff()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		wait.until(ExpectedConditions.elementToBeClickable(fulfillButton));

		fulfillButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		compactOff.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));


		if(wizard.isDisplayed())
		{
			System.out.println("Compact Mode is OFF ");
		}
		else
		{
			System.out.println("Compact Mode is ON");
		}

		closeButton.click();

	}

	public void verifyActionTransfertoCollections()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));


		actionButton.click();
		System.out.println("Action Button Clicked For Collections");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		Actions action = new Actions(driver);
		action.moveToElement(transferTo).build().perform();
		System.out.println("Mouse Hover On Transfer to ");
		
		action.moveToElement(collection).click().perform();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		System.out.println(" Clicked on Collections");

	}

	public void verifyActionTransfertoProcessing()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));


		actionButton.click();
		System.out.println("Action Button Clicked For Processing");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		Actions action = new Actions(driver);
		action.moveToElement(transferTo).build().perform();
		System.out.println("Mouse Hover On Transfer to ");
		
		action.moveToElement(processing).click().perform();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		System.out.println(" Clicked on Processing");

	}

	public void verifyActionTransfertoTransition()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));


		actionButton.click();
		System.out.println("Action Button Clicked For Transition");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		Actions action = new Actions(driver);
		action.moveToElement(transferTo).build().perform();
		System.out.println("Mouse Hover On Transfer to ");
		
		action.moveToElement(transition).click().perform();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		System.out.println(" Clicked on Transition");

	}

	public void verifyActionAssignProerty()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));


		actionButton.click();
		System.out.println("Action Button Clicked For Assign Property");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		assignProperty.click();
		System.out.println(" Clicked Assign Property");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		dropdown.click();
		System.out.println(" Clicked For DropDown");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		dropdownValue.click();
		System.out.println(" Selected DropDown value");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		js.executeScript("arguments[0].click();", SearchText);		
	  
	    
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		SearchText.sendKeys("1100");
		System.out.println("Value Entered For Community Search");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		SearchButton.click();
		System.out.println("Clicked Search Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		checkBox.click();
		System.out.println("Clicked Check Box");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		saveButton.click();
		System.out.println("Clicked SaveButton");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		
	}
	
	
   public void ActionCancleRequest() 
   {
		
		String label="Cancel Reason:";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		js.executeScript("arguments[0].click();", actionButton);
		System.out.println("Action Button Clicked For Collections");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		js.executeScript("arguments[0].click();", cancelRequest);
		if(label.equals("Cancel Reason:"))
		{
			System.out.println("Cancel Request Pop Up id display");
		}
		else {
			System.out.println("Cancel Request Pop Up failed to load");
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", cancelReason);
	}
	
	public void SwitchingTabs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		js.executeScript("arguments[0].click();", searchTab);
		System.out.println("Switch to Search Tab");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", openRequest);
		System.out.println("Switch to Open Request Tab");
		
	}
   
	

	public void SearchTab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", searchTab);
		System.out.println("Switch to Search Tab");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", propertyAddress);
		propertyAddress.sendKeys("1100");
		
		js.executeScript("arguments[0].click();", toDate);
		toDate.clear();
		DateFormat formatdate= new SimpleDateFormat("MM/dd/yyyy");
		Date systemDate = new Date();
		String dateofsystem = formatdate.format(systemDate);
		toDate.sendKeys(dateofsystem);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", fromDate);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", currentYear);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", lastYear);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", lastYear);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", month);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", date);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", searchButton);
		
		if(actionCheck.isEnabled()) {
			System.out.println("Search Button is Working");
		}
		else {
			System.out.println("Search Button is not Working");
		}
		
	}
	
      public void RequestTypeFilter() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
  		js.executeScript("arguments[0].click();", openRequest);
  		System.out.println("Switch to Open Request Tab");
  		
  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
  		js.executeScript("arguments[0].click();", rush);
  		
  		js.executeScript("arguments[0].scrollIntoView(true);", community);
  		
  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
  		js.executeScript("arguments[0].click();", requestType);
  		
  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
  		js.executeScript("arguments[0].click();", Questionnaire);
  		
  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
  		js.executeScript("arguments[0].click();", QuestionnaireOk);
  		
  		if(emailLabel.isDisplayed()) {
  			System.out.println("Request Type Page is load");
  		}
  		else {
  			System.out.println("Request Type Page is failed to load");
  		}
  		
  		
      }
	
	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		js.executeScript("arguments[0].click();", fullScreenIcon);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	
		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		if(normalScreenIcon.isDisplayed())
		{
			System.out.println("FullScreen Menu button clicked");
		}
		else
		{
			System.out.println("FullScreen Menu button not clicked");
		}
		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		js.executeScript("arguments[0].click();", normalScreenIcon);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
	
		if(fullScreenIcon.isDisplayed())
		{
			System.out.println("NormalScreen Menu button clicked");
		}
		else
		{
			System.out.println("NormalScreen Menu button not clicked");
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));
		
	}
	
	
	public void searchbutton()
	{
		
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		 
	      searchIcon.click();
	  	  System.out.println("Search icon is clicked");
	  	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  
	  	  searchField.click();
		  System.out.println("Search Text Box is clicked");
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		 
		  searchField.sendKeys("1100");
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		 
		  searchField.click();
		  js.executeScript("arguments[0].scrollIntoView(true);", propertyReasonLabel);
		 
		  if(communityvalue.isDisplayed()) 
		  {
			  System.out.println("Community value is display");
		  }
		  else {
			  System.out.println("Community value is not display");
		  }
		  
		}
	      	
}
