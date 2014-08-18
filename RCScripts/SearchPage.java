package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class SearchPage extends FluentWebDriverPage {
    public SearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void peopleCompaniesLinkClick(){
        try{
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'People, Companies & Associations')]")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click People Companies and Association link\n";
        }
    }

    public void peopleClick(){
        try{
            findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on People link\n";
        }
    }

    public void companiesClick(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Companies Link\n";
        }
    }

    public void dealSponsorClick(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Developers, Deal Sponsors')]")).click();
    }

    public void selectDealSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
    }

    public void clickGo(){
        try{
        findElement(By.linkText("GO")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on the Go link\n";
        }
    }

    public void selectDeveloper(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
    }

    public void selectFundSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickUsers(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickRealEstateLink(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Real Estate Advisors')]")).click();
    }

    public void clickAdvisorLink(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
    }

    public void clickAppraisalLink(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[3]/label/strong/span")).click();
    }

    public void clickBroker(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[3]/label/strong")).click();
    }

    public void clickResidential(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span")).click();
    }
    public void clickAcquisitions(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span")).click();
    }

    public void clickInvestmentBanker(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong")).click();
    }

    public void clickCapitalRaising(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[1]/label/strong/span")).click();
    }
    public void clickInvestments(){
        try{
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Investments')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Investments link\n";
        }
    }

    public void clickDirectIntoProject(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Direct Into Project')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Direct Into Project link\n";

        }
    }

    public void clickCore(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[1]/label/strong/span[contains(text(),'Core')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Core link\n";
        }
    }

    public void clickOpportunistic(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Opportunistic')]")).click();
    }

    public void clickFund(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Fund link\n";
        }
    }

    public void clickCoreOfFund(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Core link in Fund Search\n";

        }
    }

    public void clickMoney(){
        try{
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Money')]")).click();
        } catch (NoSuchElementException e){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Money link\n";
        }
    }

    public void clickEquity(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Equity')]")).click();
    }

    public void clickMezz(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Mezz')]")).click();
    }

    public void clickDirectIntoProjectLink(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Direct Into Project')]")).click();
    }

    public void clickFundLink(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label[@class='hold selected']/strong/span[contains(text(),'Fund')]")).click();
    }

    public void clickDebt(){
        try{
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Debt')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Debt link\n";
        }
    }

    public void clickLoans(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Loans')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Loans link\n";
        }
    }

    public void clickLandLoan(){
        try{
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Land Loan')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Land Loan link\n";
        }
    }

    public void clickIncomeOrCore(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Income / Core')]")).click();
    }

    public void clickPreferred(){
        try{
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Preferred')]")).click();
        } catch (NoSuchElementException n){
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Unable to click on Preferred link\n";

        }
    }

    public void clickFundOfMoney(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li[2]/label/strong/span[contains(text(),'Fund')]")).click();
    }
}
