package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;

public class SearchPage extends FluentWebDriverPage {
    public SearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void peopleCompaniesLinkClick(){
        try{
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'People, Companies & Associations')]")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not able to click the link\n";
        }
    }

    public void peopleClick(){
        try{
            findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
        } catch (NoSuchElementException e){
            System.out.println(e);
            LoginRealConnexPage.gStrReason = LoginRealConnexPage.gStrReason +"; "+"Not able to click the link\n";
        }
    }

    public void companiesClick(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
    }

    public void dealSponsorClick(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Developers, Deal Sponsors')]")).click();
    }

    public void selectDealSponsor(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
    }

    public void clickGo(){
        findElement(By.linkText("GO")).click();
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
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Investments')]")).click();
    }

    public void clickDirectIntoProject(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Direct Into Project')]")).click();
    }

    public void clickCore(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li[1]/label/strong/span[contains(text(),'Core')]")).click();
    }

    public void clickOpportunistic(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Opportunistic')]")).click();
    }

    public void clickFund(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong")).click();
    }

    public void clickCoreOfFund(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong")).click();
    }

    public void clickMoney(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li/label/span[contains(text(),'Money')]")).click();
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
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li/label/strong/span[contains(text(),'Debt')]")).click();
    }

    public void clickLoans(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Loans')]")).click();
    }

    public void clickLandLoan(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Land Loan')]")).click();
    }

    public void clickIncomeOrCore(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li/label/strong/span[contains(text(),'Income / Core')]")).click();
    }

    public void clickPreferred(){
        findElement(By.xpath("//div[@id='thirdSearchItems']/ul/li/label/strong/span[contains(text(),'Preferred')]")).click();
    }

    public void clickFundOfMoney(){
        findElement(By.xpath("//div[@id='fourthSearchItems']/ul/li[2]/label/strong/span[contains(text(),'Fund')]")).click();
    }
}
