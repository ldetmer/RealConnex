package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import test.Support.ReadData;

public class CombinationOfDealSponsorValidationPage extends FluentWebDriverPage {
    test.Support.ReadData ReadData = new ReadData();
    public CombinationOfDealSponsorValidationPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

}
