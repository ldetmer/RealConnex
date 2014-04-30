package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.Support.ReadData;

import java.util.List;

public class AdvisorSearchPage extends FluentWebDriverPage {
    ReadData ReadData = new ReadData();
    public AdvisorSearchPage(WebDriverProvider driverProvider){
        super(driverProvider);

    }

    public String verifyStrategy(String strVerifyStrategy){
            /*String strVerifyStrategy = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyStrategy");*/
        String strActualData = findElement(By.xpath("//div[@id='searchFilters']/div/span[3]/strong")).getText();
        return strActualData;
    }

    public void clickAppraisalCompany(int RowIndex){
        try{
            String strAppraisalCompany = ReadData.readDataExcel("RealEstateDetails", RowIndex, "AppraisalComp");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAppraisalCompany+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickServiceUser(int RowIndex){
        try{
            String strServiceUser = ReadData.readDataExcel("RealEstateDetails", RowIndex, "VerifyProject");
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strServiceUser+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickCoreActivity(){
        //wait until core activity dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectCoreActivity(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_76")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void otherCompany(int RowIndex, String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            if(strName.equals(strOtherUser))
            {
                System.out.println("Other user is displayed:"+strName);
            }
            else
            {
                System.out.println("Other user is not displayed");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void otherService(int RowIndex, String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            String strName = findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span")).getText();
            if(strName.equals(strOtherUser))
            {
                System.out.println("Other user is displayed:"+strName);
            }
            else
            {
                System.out.println("Other user is not displayed");
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void verifyCompany(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public void verifyService(int RowIndex,String strColumnName){
        try {
            String strOtherUser = ReadData.readDataExcel("ValidationDetails", RowIndex, strColumnName);
            findElement(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strOtherUser+"')]")).isDisplayed();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //wait until page gets loaded
        WaitUtil.simpleSleep(500);
    }

    public boolean companyNameOfAllSearchOption(int RowIndex){
        boolean status = false ;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strAdvisor = ReadData.readDataExcel("ValidationDetails", RowIndex, "RealEstateAdvisor");
                String strCompanyName = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strAdvisor.contains(strCompanyName))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean serviceNameOfAllSearchOption(int RowIndex){
        boolean status = false ;
        try{
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(5000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=1;i<=linksCount;i++){
                String strServiceName = ReadData.readDataExcel("ValidationDetails", RowIndex, "RealEstateAdvisor");
                String strService = findElement(By.xpath("//tbody[@id='searchResults']/tr["+i+"]/td/a/strong/span")).getText();
                if(strServiceName.contains(strService))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void selectOptions(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_74")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCoreField(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_76")).click();
        findElement(By.id("AssetstrategyId_checkbox_74")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickEnvironmental(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        //findElement(By.id("AssetstrategyId_checkbox_76")).click();
        findElement(By.id("AssetstrategyId_checkbox_74")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOwner(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_74")).click();
        findElement(By.id("AssetstrategyId_checkbox_78")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickFacilities(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_78")).click();
        findElement(By.id("AssetstrategyId_checkbox_80")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickGovernment(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_80")).click();
        findElement(By.id("AssetstrategyId_checkbox_82")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPublic(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_82")).click();
        findElement(By.id("AssetstrategyId_checkbox_83")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearGovernment(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_82")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickEnergy(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_89")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResearch(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_89")).click();
        findElement(By.id("AssetstrategyId_checkbox_102")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickValuations(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_102")).click();
        findElement(By.id("AssetstrategyId_checkbox_75")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickClient(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_75")).click();
        findElement(By.id("AssetstrategyId_checkbox_77")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickTenant(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_77")).click();
        findElement(By.id("AssetstrategyId_checkbox_79")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickValueRecovery(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_79")).click();
        findElement(By.id("AssetstrategyId_checkbox_81")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickProperty(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_81")).click();
        findElement(By.id("AssetstrategyId_checkbox_84")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRezones(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_84")).click();
        findElement(By.id("AssetstrategyId_checkbox_85")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCorporate(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_84")).click();
        findElement(By.id("AssetstrategyId_checkbox_86")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPlatform(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_84")).click();
        findElement(By.id("AssetstrategyId_checkbox_87")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickOther(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_84")).click();
        findElement(By.id("AssetstrategyId_checkbox_88")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearProperty(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_84")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickServicing(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_91")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCoreOther(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_91")).click();
        findElement(By.id("AssetstrategyId_checkbox_103")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearCore(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssetstrategyId_checkbox_103")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Core Activities:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAssetExperience(){
        //wait until asset options field appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectAssetExperience(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectTwoOptions(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAssetField(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_1")).click();
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMulti(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHotel(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_3")).click();
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSports(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_5")).click();
        findElement(By.id("AssettypeId_checkbox_11")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickHealth(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_11")).click();
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickStorage(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_13")).click();
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickAssetOther(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_15")).click();
        findElement(By.id("AssettypeId_checkbox_17")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRetail(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_17")).click();
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickIndustrial(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_2")).click();
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResidential(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_4")).click();
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSingle(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickRetirement(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickStudent(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResidentialOther(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickResidentialMulti(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.id("AssettypeId_checkbox_18")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearResidential(){
        //wait until asset field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickMixed(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickCommercial(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_12")).click();
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickSolar(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_14")).click();
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearAsset(){
        //wait until deal stage field appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("AssettypeId_checkbox_16")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Asset Experience:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickDealStage(){
        //wait until deal stage dropdown appears
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectDealStage(){
        //wait until deal stage appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void twoOptions(){
        //wait until deal stage appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDealField(){
        //wait until deal stage appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_1")).click();
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickConcept(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPermitted(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_3")).click();
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickReady(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_5")).click();
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickLOI(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_7")).click();
        findElement(By.id("DealstageId_checkbox_9")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickUnderContract(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_9")).click();
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPlans(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_2")).click();
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickUnderConstruction(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_4")).click();
        findElement(By.id("DealstageId_checkbox_6")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickPursuit(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_6")).click();
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickInDD(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_8")).click();
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clearDealStage(){
        //wait until profile appears
        WaitUtil.simpleSleep(500);
        findElement(By.id("DealstageId_checkbox_10")).click();
        findElement(By.xpath("//div[@id='searchFilters']/div[@class='box']/div/label[contains(text(),'Deal Stage:')]/following-sibling::div/div/div[@class='field']/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterLocation(int RowIndex){
        try{
            String strLocation = ReadData.readDataExcel("ValidationDetails", RowIndex, "AdvisorLocation");
            findElement(By.id("LocationInputSearch")).clear();
            findElement(By.id("LocationInputSearch")).sendKeys(strLocation);
            //findElement(By.xpath("//a[contains(text(),'Newark, Delaware, United States')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickLocation(int RowIndex){
        try{
            //wait until location is found
            WaitUtil.simpleSleep(100);
            String strLocation = ReadData.readDataExcel("ValidationDetails", RowIndex, "AdvisorFullLocation");
            findElement(By.xpath("//a[contains(text(),'"+strLocation+"')]")).click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean verifyLocation(int RowIndex){
        boolean status = false;
        try {
            List<WebElement> links;
            //wait until page gets loaded
            WaitUtil.simpleSleep(1000);
            links =  findElements(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span"));
            int linksCount = links.size();
            linksCount = linksCount/2;
            for(int i=0;i<=linksCount;i++){
                int j=i+2;
                String strLocation = ReadData.readDataExcel("DealSponsorDeveloperFund", RowIndex, "FundLocation");
                String strName = findElement(By.xpath("//tbody/tr/td["+j+"]")).getText();
                if(strName.contains(strLocation))
                {
                    status = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public void enterProjectSize(int RowIndex){
        //wait until identify the project size field
        WaitUtil.simpleSleep(100);
        try{
            String strFromProject = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromProject");
            String strToProject = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToProject");
            findElement(By.id("ProjectFromProjectSize")).sendKeys(strFromProject);
            findElement(By.id("ProjectToProjectSize")).sendKeys(strToProject);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

  /*  public void clearProject(){
        //wait until identify the project size field
        WaitUtil.simpleSleep(500);
        findElement(By.id("ProjectFromProjectSize")).click();
        findElement(By.id("ProjectFromProjectSize")).clear();
        findElement(By.id("ProjectFromProjectSize")).click();
        findElement(By.id("ProjectToProjectSize")).clear();
    }*/
}








































    /*public void clickProfile(){
        findElement(By.id("ui-accordion-1-header-0")).click();
    }

    public void numOfOffice(int RowIndex){
        try{
            String strFromOffice = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromOffice");
            String strToOffice = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToOffice");
            findElement(By.id("ProjectFromOffices")).sendKeys(strFromOffice);
            findElement(By.id("ProjectToOffices")).sendKeys(strToOffice);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void numOfProfessional(int RowIndex){
        try{
            String strFromEmployee = ReadData.readDataExcel("RealEstateDetails", RowIndex, "FromEmployee");
            String strToEmployee = ReadData.readDataExcel("RealEstateDetails", RowIndex, "ToEmployee");
            findElement(By.id("ProjectFromNumberOfEmployees")).sendKeys(strFromEmployee);
            findElement(By.id("ProjectToNumberOfEmployees")).sendKeys(strToEmployee);
        } catch (Exception e) {
            System.out.println(e);
        }
        executeScript("scrollTo(250,0)");
    } */







