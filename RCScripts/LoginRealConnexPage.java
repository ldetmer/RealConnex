package test.pages;

import org.jbehave.core.model.ExamplesTable;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import test.Support.ReadData;
import test.Support.ReasonsInResultSheet;
import test.steps.VerificationStatements;

import java.io.IOException;
import java.util.Map;


public class LoginRealConnexPage extends FluentWebDriverPage {
    public static String gStrReason = "";
    public static String gStrFieldName = "";
    ReadData ReadData = new ReadData();
    public LoginRealConnexPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void launchRealConnexPage() throws IOException {
        // Runtime.getRuntime().exec("D:\\SampleScenarios\\src\\AutoIt\\authenticationPopUp.exe");
        getDriverProvider().get().manage().deleteAllCookies();
        get("http://realconnex.project-release.info/");
        manage().window().maximize();
        //wait until page load
        WaitUtil.simpleSleep(5000);
    }

    public void enterEmailId(int RowIndex) throws Exception {
        String strEmailId = ReadData.readDataExcel("LoginRealConnex", RowIndex, "EmailId");
        gStrFieldName = findElement(By.id("UserLoginPopupEmail")).getAttribute("placeholder");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserLoginPopupEmail"), strEmailId, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterPassword(int RowIndex) throws Exception {
        String strPassword = ReadData.readDataExcel("LoginRealConnex", RowIndex, "Password");
        gStrFieldName = findElement(By.id("UserLoginPopupPassword")).getAttribute("placeholder");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserLoginPopupPassword"), strPassword, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void clickLogIn(){
        try{
            gStrFieldName = findElement(By.cssSelector("input.login")).getAttribute("value");
            findElement(By.cssSelector("input.login")).click();
        } catch(WebDriverException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrFieldName+"\nReason of Error:"+"Element is not clickable at that point\n";
        }
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
        gStrFieldName = findElement(By.id("UserLoginPopupEmail")).getAttribute("placeholder");
        String lStrEmail = ReadData.readDataExcel("LoginRealConnex", intRowIndex,"EmailId");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserLoginPopupEmail"), lStrEmail, gStrFieldName, LoginRealConnexPage.gStrReason);
    }

    public void enterPasswordOfUser(int intRowIndex) throws Exception {
        String lStrPasswordOfUser = ReadData.readDataExcel("LoginRealConnex", intRowIndex,"Password");
        gStrFieldName = findElement(By.id("UserLoginPopupPassword")).getAttribute("placeholder");
        ReasonsInResultSheet.enterDataToTextField(getDriverProvider().get(), By.id("UserLoginPopupPassword"), lStrPasswordOfUser, gStrFieldName, LoginRealConnexPage.gStrReason);
    }




}
