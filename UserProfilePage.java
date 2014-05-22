package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;


public class UserProfilePage extends FluentWebDriverPage {
    public UserProfilePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void findNowImg(){
        //manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        findElement(By.xpath("//nav[@id='nav']/a/em/img")).isDisplayed();
    }

    public void clickFindNow(){
        findElement(By.xpath("//nav[@id='nav']/a/em/img")).click();
    }
}
