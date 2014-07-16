package test.pages;

import org.jbehave.core.model.ExamplesTable;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;
import test.steps.VerificationStatements;

import java.io.IOException;
import java.util.Map;


public class LoginRealConnexPage extends FluentWebDriverPage {
    public static String gStrReason = "";
    ReadData ReadData = new ReadData();
    public LoginRealConnexPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void launchRealConnexPage() throws IOException {
        // Runtime.getRuntime().exec("D:\\SampleScenarios\\src\\AutoIt\\authenticationPopUp.exe");
        getDriverProvider().get().manage().deleteAllCookies();
        get("http://realconnex.project-release.info/");
        manage().window().maximize();
    }

    public void enterEmailId(int RowIndex) throws Exception {
        String strEmailId = ReadData.readDataExcel("LoginRealConnex", RowIndex, "EmailId");
        findElement(By.id("UserLoginPopupEmail")).click();
        findElement(By.id("UserLoginPopupEmail")).sendKeys(strEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserLoginPopupEmail"), strEmailId);
    }

    public void enterPassword(int RowIndex){
        try{
            String strPassword = ReadData.readDataExcel("LoginRealConnex", RowIndex, "Password");
            findElement(By.id("UserLoginPopupPassword")).click();
            findElement(By.id("UserLoginPopupPassword")).sendKeys(strPassword);
            VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.id("UserLoginPopupPassword"), strPassword);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void clickLogIn(){
        findElement(By.cssSelector("input.login")).click();
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }

    public void enterLoginDetails(ExamplesTable LoginDetailsTable){
        String strEmailId = "", strPassword = "";
        String strArr[] =new String[LoginDetailsTable.getRowCount()];
        int i= 0;
        for (Map<String,String> row : LoginDetailsTable.getRows()) {
            strArr[i] = row.get("Value");
            i++;
        }
        strEmailId = strArr[0];
        strPassword = strArr[1];
        findElement(By.id("UserLoginPopupEmail")).clear();
        findElement(By.id("UserLoginPopupEmail")).sendKeys(strEmailId);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.id("UserLoginPopupEmail"),strEmailId);
        findElement(By.id("UserLoginPopupPassword")).clear();
        findElement(By.id("UserLoginPopupPassword")).sendKeys(strPassword);
        VerificationStatements.VerifyInputValue(getDriverProvider().get(),By.id("UserLoginPopupPassword"),strPassword);
    }

    public void enterEmailIdOfUsers(int intRowIndex) throws Exception {
        String lStrEmail = ReadData.readDataExcel("LoginRealConnex", intRowIndex,"EmailId");
        findElement(By.id("UserLoginPopupEmail")).clear();
        findElement(By.id("UserLoginPopupEmail")).sendKeys(lStrEmail);
    }

    public void enterPasswordOfUser(int intRowIndex) throws Exception {
        String lStrPasswordOfUser = ReadData.readDataExcel("LoginRealConnex", intRowIndex,"Password");
        findElement(By.id("UserLoginPopupPassword")).clear();
        findElement(By.id("UserLoginPopupPassword")).sendKeys(lStrPasswordOfUser);
    }




}
