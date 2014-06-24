package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 6/23/14
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchResultsPage extends FluentWebDriverPage {
    public SearchResultsPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyUserName(String lStrUserName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorUserName(String lStrUserName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrUserName+"')]")).click();
    }

    public void verifyCompanyName(String lStrCompanyName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorCompanyName(String lStrCompanyName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrCompanyName+"')]")).click();
    }

    public void verifyProjectName(String lStrProjectName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectName+"')]"),getDriverProvider().get()));
    }

    public void verifyFundName(String lStrFundName){
        Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]"),getDriverProvider().get()));
    }

    public void clickDealSponsorProjectName(String lStrProjectName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrProjectName+"')]")).click();
    }

    public void clickDealSponsorFundName(String lStrFundName){
        findElement(By.xpath("//tbody[@id='searchResults']/tr/td[@class='col-1']/a/strong[contains(text(),'"+lStrFundName+"')]")).click();
    }
}
