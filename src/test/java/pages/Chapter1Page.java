package pages;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;
import tests.TestBase;

public class Chapter1Page extends TestBase{

	By home_page= By.xpath("//a[text()= 'Home Page']");
	
	public void NavigateToHome() {
		logger.info("******** Navigating back to home *********");
		$(home_page).click();
	}
}
