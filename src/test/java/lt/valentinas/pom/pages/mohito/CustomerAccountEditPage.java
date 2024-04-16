package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class CustomerAccountEditPage {
    public static String getValueCustomerEmailField() {
        return Common.getValueOfAttributeOfElement(Locators.MohitoShop.CustomerAccountEdit.fieldCustomerEmail, "value");
    }

    public static void waitFieldCustomerEmail() {
        Common.waitElementLoaded(Locators.MohitoShop.CustomerAccountEdit.fieldCustomerEmail, 8);
    }

    public static void clickDeleteAccountLink() {
        Common.waitElementLoaded(Locators.MohitoShop.CustomerAccountEdit.linkDeleteAccount, 10);
        Common.clickOnElement(Locators.MohitoShop.CustomerAccountEdit.linkDeleteAccount);
    }
}
