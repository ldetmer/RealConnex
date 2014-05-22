package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

import java.io.IOException;


public class LoginRealConnexPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public LoginRealConnexPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
    public void launchRealConnexPage() throws IOException {
        // Runtime.getRuntime().exec("D:\\SampleScenarios\\src\\AutoIt\\authenticationPopUp.exe");
        get("http://realconnex.project-release.info/");
        manage().window().maximize();
    }

    public void enterEmailId(int RowIndex){
        try {
            String strEmailId = ReadData.readDataExcel("LoginRealConnex", RowIndex, "EmailId");
            findElement(By.id("UserLoginPopupEmail")).click();
            findElement(By.id("UserLoginPopupEmail")).sendKeys(strEmailId);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterPassword(int RowIndex){
        try{
            String strPassword = ReadData.readDataExcel("LoginRealConnex", RowIndex, "Password");
            findElement(By.id("UserLoginPopupPassword")).click();
            findElement(By.id("UserLoginPopupPassword")).sendKeys(strPassword);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void clickLogIn(){
        findElement(By.cssSelector("input.login")).click();
    }
}
