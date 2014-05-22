package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class CompaniesOfDealSponsorValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();

    public CompaniesOfDealSponsorValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectOfficeAssetType(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSecondOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clearAssetField(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickMultiFamily(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickHotel(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickSports(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.id("AssettypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickHealthCare(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_11")).click();
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickStorage(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickOther(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.id("AssettypeId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickRetail(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_17")).click();
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickIndustrial(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickResidential(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickSingle(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickRetirement(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickStudent(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickOtherHousing(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickResidentialMultiFamily(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clearResidential(){
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickMixedUse(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickCommercial(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickSolar(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clearProject(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Asset Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void selectRisk(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void selectSecondRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clearRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickCorePlus(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickValueAdd(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickDevelopment(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickOpportunistic(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickOtherRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clearRisk(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void selectInvestment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void selectSecondInvestment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clearInvestment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickEB5(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickCrowdFunded(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickSingleInvestor(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickFamilyOffice(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickInstitution(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
    }

    public void clickAssetManager(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBrokerOrIntermediary(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickConsultant(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickConstruction(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickEndowment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickFundOfFunds(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickGovernmentAgency(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_19")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHedgeFund(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_20")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHighNet(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_21")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickIndividualInvestor(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_22")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickInsuranceCompany(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_23")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOtherInstitutionalInvestor(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_24")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOwnerOperator(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_25")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickNCREIF(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_26")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSeniorLender(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_27")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMezzanine(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_28")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickJuniorLender(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_29")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPrivateEquity(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_30")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPrivateREIT(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_31")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPublicREIT(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_32")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSovereign(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSpecial(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.id("InvestortypeId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInvestmentMethod(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSecondRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickIntermediary(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBrokers(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPlacementAgents(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRouteToSponsor(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSyndicateType(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }

    public void verifyAllOptions(int RowIndex){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try {
            String strAllCompanyName = ReadData.readDataExcel("CompaniesOfDealDeveloperFund", RowIndex, "DealSponsorAllSearch");
            //wait until page loads
            WaitUtil.simpleSleep(5000);
            //findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAllCompanyName+"')]"), getDriverProvider().get()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStrategy(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssetstrategyId_checkbox_33")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
    }

    public boolean companyNotDisplayed(int RowIndex, String strColumnName){
        boolean status = false;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
                //wait until page gets loaded
                WaitUtil.simpleSleep(1000);
                String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strName.equals(strOtherUser))
                {
                    status = true;
                    break;
                } else {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }


    public void companyIsDisplayed(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            //findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]"), getDriverProvider().get()));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void checkAsset(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_34")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Strategy:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }
}
