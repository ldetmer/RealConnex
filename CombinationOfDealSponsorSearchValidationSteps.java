package test.steps;

import com.google.inject.Inject;
import test.pages.CombinationOfDealSponsorValidationPage;
import test.pages.PageFactory;

public class CombinationOfDealSponsorSearchValidationSteps {
    private final CombinationOfDealSponsorValidationPage combinationOfDealSponsorValidationPage;

    @Inject
    public CombinationOfDealSponsorSearchValidationSteps(PageFactory thePageFactory) {
        combinationOfDealSponsorValidationPage = thePageFactory.newCombinationOfDealSponsorValidationPage();
    }

}
