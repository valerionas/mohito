package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class AccountRemovalSecondStepPage {
    public static String readSpanEmail() {
        Common.waitElementLoaded(Locators.MohitoShop.AccountRemovalSecondStep.spanWithAccountEmail, 10);
        return Common.getTextFromElement(Locators.MohitoShop.AccountRemovalSecondStep.spanWithAccountEmail);
    }
}
