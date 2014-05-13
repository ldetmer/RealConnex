package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import test.Support.ReadData;

public class SearchOnProjectSizePage extends FluentWebDriverPage {
    test.Support.ReadData ReadData = new ReadData();
    public SearchOnProjectSizePage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

}
