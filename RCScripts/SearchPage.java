package test.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class SearchPage extends FluentWebDriverPage {
    public SearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void peopleCompaniesLinkClick(){
        findElement(By.xpath(" //div[@id='mainSearchItems']/ul/li[1]/label/span")).click();
    }

    public void peopleClick(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[1]/label/strong/span")).click();
    }

    public void companiesClick(){
        findElement(By.xpath("//div[@id='secondSearchItems']/ul/li[2]/label/strong/span")).click();
    }

    public void dealSponsorClick(){
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li[3]/label/span")).click();
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
        findElement(By.xpath("//div[@id='mainSearchItems']/ul/li[4]/label/span")).click();
    }

    public void clickAdviserLink(){
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

}
