package pages;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import tests.TestBase;

public class HomePage extends TestBase {

	By chapter1= By.xpath("//a[@href='/chapter1']");
	public void ClickChapter1() {		
		logger.info("******** Chapter one clicked *********");
		$(chapter1).click();
	}
	
}
