package test.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import test.Support.ReadData;

public class CompaniesOfDealSponsorValidationPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();

    public CompaniesOfDealSponsorValidationPage(WebDriverProvider driverProvider){
        super(driverProvider);
    }

    public void selectProject(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSecondOption(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearProjectField(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(100);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMultiFamily(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHotel(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSports(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.id("AssettypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHealthCare(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_11")).click();
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickStorage(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOther(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.id("AssettypeId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRetail(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_17")).click();
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickIndustrial(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResidential(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSingle(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRetirement(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickStudent(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOtherHousing(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResidentialMultiFamily(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearResidential(){
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMixedUse(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCommercial(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSolar(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearProject(){
        //wait until project dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Project Type:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectRisk(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSecondRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCorePlus(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_1")).click();
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickValueAdd(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_2")).click();
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDevelopment(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_3")).click();
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOpportunistic(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_4")).click();
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOtherRiskProfile(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_5")).click();
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRisk(){
        //wait until strategy field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RiskprofileId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/label[contains(text(),'Risk Profile:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectInvestment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSecondInvestment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearInvestment(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_7")).click();
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickEB5(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCrowdFunded(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_8")).click();
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSingleInvestor(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_9")).click();
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickFamilyOffice(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_10")).click();
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickInstitution(){
        //wait until Investor dropdown appears appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("InvestortypeId_checkbox_11")).click();
        findElement(By.id("InvestortypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Investment Method:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
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
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectSecondRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRoute(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickIntermediary(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_1")).click();
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickBrokers(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_2")).click();
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPlacementAgents(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_3")).click();
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearRouteToDeveloper(){
        //wait until Route to development field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("RouteId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-2']/div/label[contains(text(),'Route To Developer:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSyndicateType(){
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
        findElement(By.id("syndications_")).click();
    }
}
