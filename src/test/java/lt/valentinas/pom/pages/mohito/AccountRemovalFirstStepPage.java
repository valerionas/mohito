package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class AccountRemovalFirstStepPage {
    public static void clickButtonDeleteAccountNow() {
        Common.waitElementLoaded(Locators.MohitoShop.AccountRemovalFirstStep.buttonRemoveAccountNow, 10);
        Common.clickOnElement(Locators.MohitoShop.AccountRemovalFirstStep.buttonRemoveAccountNow);
    }
}
