package test.pages;

import org.jbehave.core.model.ExamplesTable;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * User: Moulya
 * Date: 3/24/14
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserAsDealSponsorPage extends FluentWebDriverPage {
        String strEmailId = "",strFirstName = "",strLastName = "",strPassword = "",strConfirmPwd = "";
    public UserAsDealSponsorPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void realConnexPage() throws IOException {
        Runtime.getRuntime().exec("D:\\SampleScenarios\\src\\AutoIt\\authenticationPopUp.exe");
        get("http://realconnex.project-release.info/");
        manage().window().maximize();
    }

    public void connexHomePage(ExamplesTable enterDetails){
        String[] arr = new String[enterDetails.getRowCount()];
        int i= 0;
        for (Map<String,String> row : enterDetails.getRows()) {
            arr[i] = row.get("value");
            i++;
        }
        strEmailId = arr[0];
        strFirstName = arr[1];
        strLastName = arr[2];
        strPassword = arr[3];
        strConfirmPwd = arr[4];
        findElement(By.linkText("JOIN NOW")).click();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserEmail'][1]]]]]]]//input[@id='UserEmail']")).click();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserEmail'][1]]]]]]]//input[@id='UserEmail']")).clear();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserEmail'][1]]]]]]]//input[@id='UserEmail']")).sendKeys(strEmailId);
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserFirstName'][1]]]]]]]//input[@id='UserFirstName']")).clear();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserFirstName'][1]]]]]]]//input[@id='UserFirstName']")).sendKeys(strFirstName);
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[div[input[@id='UserLastName'][1]]]]]]]]//input[@id='UserLastName']")).clear();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[div[input[@id='UserLastName'][1]]]]]]]]//input[@id='UserLastName']")).sendKeys(strLastName);
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserPassword'][1]]]]]]]//input[@id='UserPassword']")).clear();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[input[@id='UserPassword'][1]]]]]]]//input[@id='UserPassword']")).sendKeys(strPassword);
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[div[input[@id='UserConfirmPass'][1]]]]]]]]//input[@id='UserConfirmPass']")).clear();
        findElement(By.xpath("//div[6][div[div[div[2]/form[fieldset[div[div[input[@id='UserConfirmPass'][1]]]]]]]]//input[@id='UserConfirmPass']")).sendKeys(strConfirmPwd);
       // findElement(By.xpath(""))
        }
}
