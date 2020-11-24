
package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.codeborne.selenide.Selenide;

import pages.Chapter1Page;
import pages.HomePage;


public class AutomatedTesterTests extends TestBase{
	
	HomePage HomeObject=new HomePage();
	Chapter1Page Chapter1Object= new Chapter1Page();
	
	By chapter1= By.xpath("//a[@href='/chapter1']");
	By text_to_verify= By.id("divontheleft");	

	
	@BeforeClass(alwaysRun=true)
	public void SetUp() throws Exception {
		initialization();
	}
		
	@Test(priority=1)
	public void VerifyHomepage() throws Exception {
		String title= Selenide.title();
		SoftAssert assert1= new SoftAssert();
		assert1.assertEquals("Selenium: Beginners Guide", title);
	}

	@Test(priority=2)
	public void ClickChapter1() throws Exception {
		HomeObject.ClickChapter1();		
	}
	
	@Test(priority=3)
	public void VerifyText() throws Exception {
		logger.info("******** Verifying text *********");
		$(text_to_verify).shouldHave(text("Assert that this text is on the page"));				
	}
	
	@Test(priority=4)
	public void NavigateToHome() throws Exception {
		Chapter1Object.NavigateToHome();			
		$(chapter1).shouldHave(text("Chapter1"));		
	}

}
