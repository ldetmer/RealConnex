package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;


public class LogoutPage extends FluentWebDriverPage {
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
         //wait until page loads
        WaitUtil.simpleSleep(10000);
        findElement(By.xpath("//header[@id='header']/div[@class='user']/a/span/strong")).click();
         //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }
}
