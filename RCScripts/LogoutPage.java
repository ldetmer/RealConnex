package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class LogoutPage extends FluentWebDriverPage {
    String gStrFieldName = "";
    public LogoutPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void logOutPage(){

        try {
            executeScript("scrollTo(250,0)");
            //wait until search field gets loaded
            WaitUtil.simpleSleep(500);
            findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/a")).click();
            //wait until search field gets loaded
            WaitUtil.simpleSleep(500);
            findElement(By.xpath("//header[@id='header']/div[@class='user']/a/img")).click();
            findElement(By.linkText("Logout")).click();
            //close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void clickLogout(){
        try{
             //wait until page loads
            WaitUtil.simpleSleep(10000);
            WebElement myLink = findElement(By.xpath("//header[@id='header']/div[@class='user']/a/span/strong"));
            Actions action = new Actions(getDriverProvider().get());
            //action.moveToElement(myLink).click(myLink).build().perform();
            action.moveToElement(myLink).clickAndHold(myLink).build().perform();
            //findElement(By.xpath("//header[@id='header']/div[@class='user']/a/span/strong")).click();
            //findElement(By.xpath("//header[@id='header']/div[@class='user']/a/span/strong")).sendKeys(Keys.ENTER);
             //wait until page loads
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//a[contains(text(),'Logout')]")).sendKeys(Keys.ENTER);
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Logout link cannot be clicked\n";
        }
    }
}
