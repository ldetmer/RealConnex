package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

import java.io.IOException;


public class ResultHandlingPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public ResultHandlingPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }



}
