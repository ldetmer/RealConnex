package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.*;
import test.Support.ReadData;
import test.steps.VerificationStatements;

/**
 * Created with IntelliJ IDEA.
 * User: Bhavana
 * Date: 9/18/14
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class NewBusinessPage extends FluentWebDriverPage {

    String gStrMatchCountInProfile="",gStrMatchCountInSearchResult="",gStrLocationFieldName="";
    public static String gStrFieldName = "";

    public NewBusinessPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }


    public void verifyFindInSearch(int RowIndex){
        try{
            String strVerifyLookingFor= ReadData.readDataExcel("JVPartner and NewBusiness", RowIndex, "VerifyFindInSearch");
            Assert.assertEquals(strVerifyLookingFor, findElement(By.xpath("//div[@id='searchFilters']/div[1]/span[1]/strong")).getText());
        } catch (AssertionError A) {
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Verification of find in search failed";
        } catch (NullPointerException NE) {
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Not Able to Find the Excel Sheet";
        } catch (NoSuchElementException N){
            System.out.println(N);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Not able to see find in search page\n";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsNotDisplayedNameInNewBusinessSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorFundName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsNotDisplayedNameInNewBusinessSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsNotDisplayedNameInNewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectIsDisplayedNameInNewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strDealSponsorProjectName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result\n";
        }
    }


    public void verifyDealSponsorFundNameIsDisplayedNameInNewBusinessAdvisorSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyDealSponsorProjectNameIsDisplayedNameInNewBusinessAdvisorSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strDealSponsorProjectName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessLoanSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }
    }


    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessLoanSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedNameInNewBusinessMezzSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessMezzSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedNameInNewBusinessAdvisorSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessLoanSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedNameInNewBusinessLoanSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessMezzSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedNameInNewBusinessAdvisorSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderLoanName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedNameInNewBusinessMezzSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderLoanName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessLoanSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strLenderMezzName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedNameInNewBusinessLoanSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessMezzSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedNameInNewBusinessAdvisorSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedNameInNewBusinessMezzSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strLenderMezzName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorListingName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedNameInNewBusinessAdvisorSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedNameInNewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorListingName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strAdvisorServiceName+"')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInNewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInNewBusinessAdvisorSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInNewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'" + strAdvisorServiceName + "')]"), getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result\n";
        }
    }

    public void clickDSProjectNameOfNewBusinessLoanSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//section[@id='content']/div[2]/div[2]/ng-include/div/table/tbody/tr[4]/td[1]/a/span")).click();
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyFundNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"ROld Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyProjectNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CM Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }
    public void verifyProjectNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strDealSponsorProjectName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strDealSponsorProjectName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"RDavis Project Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessLoan(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"LBrian Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessAdvisor(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"MTen Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchingInNewBusinessMezz(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"BLee Fund Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Loan Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderLoanNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderLoanName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderLoanName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Loan Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessLoan(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"HJeff Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessAdvisor(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"CarTen Mezz Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyLenderMezzNameIsNotDisplayedInSearchResultToFilterSelected_ProjectSearchInNewBusinessMezz(String strLenderMezzName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strLenderMezzName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"JHall Mezz Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Listing Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorListingNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorListingName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorListingName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Listing Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessLoanSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"NSun Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsDisplayedInSearchResultToFilterSelected_NewBusinessAdvisorSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Kov Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void verifyAdvisorServiceNameIsNotDisplayedInSearchResultToFilterSelected_NewBusinessMezzSearch(String strAdvisorServiceName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strAdvisorServiceName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"KWin Service Is Not Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void selectLocationInNewBusinessLoanSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        try{
            gStrLocationFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("LocationInputSearch")).click();
            String lStrLocation1 = "Cuney, Texas, United States";
            String lStrLocation = "Cuney";
            findElement(By.id("LocationInputSearch")).sendKeys(lStrLocation);
            findElement(By.xpath("//a[contains(text(),'Cuney, Texas, United States')]")).click();
            VerificationStatements.VerifyInputValue(getDriverProvider().get(), By.cssSelector("LocationInputSearch"), lStrLocation1);
        }catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+gStrLocationFieldName+"\nReason of Error:"+"Element is not clicked\n";
        }
    }

    public void setLoanAmount_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
        for(int i=0;i<5;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(100);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
        for(int i=0;i<94;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            WaitUtil.simpleSleep(100);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void setLoanTerm_NewBusinessSearch(){
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
        for(int i=0;i<3;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
            WaitUtil.simpleSleep(100);
        }
        WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
        for(int i=0;i<96;i++){
            sliderRight.sendKeys(Keys.ARROW_DOWN);
            WaitUtil.simpleSleep(100);
        }
        //wait until page loads
        WaitUtil.simpleSleep(1000);
    }

    public void clearLoanAmount_NewBusinessSearch(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[1]")).getText();
            WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[1]"));
            for(int i=0;i<5;i++){
                sliderLeft.sendKeys(Keys.ARROW_LEFT);
                WaitUtil.simpleSleep(100);
            }
            WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[2]/div/div[2]/a[2]"));
            for(int i=6;i<100;i++){
                sliderRight.sendKeys(Keys.ARROW_RIGHT);
                WaitUtil.simpleSleep(100);
            }
            //wait until page loads
            WaitUtil.simpleSleep(1000);
        }catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Loan Amount field not found\n";
        }
    }

    public void clearLoanTerm_NewBusinessSearch(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/strong[2]")).getText();
            WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[1]"));
            for(int i=0;i<3;i++){
                sliderLeft.sendKeys(Keys.ARROW_LEFT);
                WaitUtil.simpleSleep(100);
            }
            WebElement sliderRight = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/div/div[2]/a[2]"));
            for(int i=4;i<100;i++){
                sliderRight.sendKeys(Keys.ARROW_RIGHT);
                WaitUtil.simpleSleep(100);
            }
            //wait until page loads
            WaitUtil.simpleSleep(1000);
        } catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Loan term field not found\n";
        }
    }

    public void verifyInvestorFundNameNotDisplayedInNewBusinessLoanSearch_LightHouseOff(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result\n";
        }
    }

    public void verifyInvestorFundNameIsNotDisplayedInNewBusinessLoanSearchWhereLightHouseOff(String strInvestorFundName){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            Assert.assertTrue(WaitUtil.isElementNotPresent(By.xpath("//tbody[@id='searchResults']/tr/td/a/strong/span[contains(text(),'"+strInvestorFundName+"')]"),getDriverProvider().get()));
        } catch (AssertionError A){
            System.out.println(A);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }  catch (NoSuchElementException NE){
            System.out.println(NE);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"\nReason of Error:"+"Haris Fund Is Displayed in the Search Result when Side Filters are performed\n";
        }
    }

    public void selectLoanUse_NewBusinessSearch(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element loan use\n";
        }
    }

    public void selectAssetProfile_NewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Profile')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element asset profile\n";
        }
    }

    public void selectSeniorOrPermanentOption(){
        try{
        //wait until page loads
        WaitUtil.simpleSleep(1000);
        gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
        findElement(By.id("LoanuseId_checkbox_1")).click();
        VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
        findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Senior or permanent check box is unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element senior or permanent check box\n";
        }
    }

    public void selectCoreInAssetProfileOfNewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(3000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.id("RiskprofileId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Profile')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Core check box in asset profile is unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element core in asset profile check box\n";
        }
    }

    public void clearCoreInAssetProfileOfNewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.id("RiskprofileId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RiskprofileId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Asset Profile')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Core check box in asset profile is not unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element core in asset profile check box\n";
        }
    }

    public void clearSeniorOrPermanentOption(){
        try{
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[1]/label")).getText();
            findElement(By.id("LoanuseId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("LoanuseId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Loan Use')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            //wait until page loads
            WaitUtil.simpleSleep(10000);
        } catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Senior or permanent check box is not unchecked\n";
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element senior or permanent check box\n";
        }
    }

    public void clickRouteToBrowser(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Borrower')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element route to browser\n";
        }
    }

    public void selectDirectOnlyOptionInRouteToBrowser(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.id("RouteId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Borrower')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element route to browser\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Direct only check box is not clicked\n";
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearDirectOnlyOptionInRouteToBrowser(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[4]/label")).getText();
            findElement(By.id("RouteId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("RouteId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Route To Borrower')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element route to browser\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Direct only check box is not un clicked\n";
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void selectCollateralDropDown_NewBusinessMezz(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element asset profile\n";
        }
    }

    public void selectTheAssetOptionInCollateralField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("CollateralId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element collateral\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The asset check box is not clicked\n";
        }
    }

    public void clearTheAssetOptionInCollateralField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("CollateralId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("CollateralId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Collateral')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element collateral\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The asset check box is not un clicked\n";
        }
    }

    public void selectIdealCustomerDropDown(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }
    }

    public void selectDealSponsorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_1"));
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The deal sponsor check box is not clicked\n";
        }
    }

    public void selectDeveloperInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_1")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_1"));
            WaitUtil.simpleSleep(6000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The developer check box is not clicked\n";
        }
    }

    public void clearDealSponsorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_1")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_1"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The deal sponsor check box is not un clicked\n";
        }
    }

    public void selectLenderInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_3")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_3"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The lender check box is not clicked\n";
        }
    }

    public void selectFamilyOfficeOptionInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_39")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_39"));
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The family office check box is not clicked\n";
        }
    }

    public void clearLenderInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_3")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_3"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The lender check box is not un clicked\n";
        }
    }

    public void selectInvestorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_2")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_2"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The investor check box is not clicked\n";
        }
    }

    public void selectAdvisorOptionInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_18")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_18"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The advisor check box is not clicked\n";
        }
    }

    public void clearInvestorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_2")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_2"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The investor check box is not un clicked\n";
        }
    }

    public void selectRealEstateAdvisorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_4")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_4"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The real estate advisor check box is not clicked\n";
        }
    }

    public void selectAdvisorOptionOfREAInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
            findElement(By.id("OwnerSubRoleId_checkbox_57")).click();
            VerificationStatements.VerifyClickSelectedStatus(getDriverProvider().get(),By.id("OwnerSubRoleId_checkbox_57"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='subRoleSelect2']/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The advisor of rea check box is not clicked\n";
        }
    }

    public void clearRealEstateAdvisorInIdealCustomerField(){
        try{
            //wait until page loads
            WaitUtil.simpleSleep(1000);
            gStrFieldName = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[3]/label")).getText();
            findElement(By.id("OwnerroleId_checkbox_4")).click();
            VerificationStatements.VerifyClickNotSelectedStatus(getDriverProvider().get(),By.id("OwnerroleId_checkbox_4"));
            WaitUtil.simpleSleep(5000);
            findElement(By.xpath("//div[@id='searchFilters']/div/div/label[contains(text(),'Ideal Customer')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        }  catch (NoSuchElementException N){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"Not able to find the element ideal customer\n";
        }  catch (ComparisonFailure CF){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +";"+"Affected Field:"+LoginRealConnexPage.gStrFieldName+"\nReason of Error:"+"The real estate advisor check box is not un clicked\n";
        }
    }

    public void clickRouteToSponsorOfDealSponsor_NewBusiness(){
        //wait until page load
        WaitUtil.simpleSleep(500);
        findElement(By.xpath("//div[@class='field clearfix']/label[contains(text(),'Route to Sponsor:')]/following-sibling::div/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
        //wait until page load
        WaitUtil.simpleSleep(1000);
    }

    public void clickNorthEast(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/div[@class='row']/div/div/div[@class='col-md-9']/label[contains(text(),'Northeast')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Regions:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void clickNewYorkState(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)getDriverProvider().get();
        jse.executeScript("window.scrollBy(0,500)", "");
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'New York')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Select States:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void enterAndSelectIraCity(){
        //wait until page load
        WaitUtil.simpleSleep(1000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/input")).sendKeys("Ira");
        WaitUtil.simpleSleep(5000);
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/div/div/div/div[@class='col-md-9']/label[contains(text(),'Ira (New York)')]")).click();
        findElement(By.xpath("//div[@id='ui-accordion-1-panel-0']/div/div/div/div/strong[contains(text(),'Cities:')]/parent::div/div/multi-selectbox/div/div/span[@class='arrow glyphicon glyphicon-chevron-down']")).click();
    }

    public void selectNoOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_UP);
        }
        //wait until page loads
        WaitUtil.simpleSleep(5000);
    }

    public void clearNoOfProfessionals(){
        //wait until page loads
        WaitUtil.simpleSleep(5000);
        WebElement sliderLeft = findElement(By.xpath("//div[@id='searchFilters']/div[2]/div[5]/div/div[2]/a[1]"));
        for(int i=0;i<10;i++){
            sliderLeft.sendKeys(Keys.ARROW_LEFT);
        }
        //wait until page loads
        WaitUtil.simpleSleep(10000);
    }

}
