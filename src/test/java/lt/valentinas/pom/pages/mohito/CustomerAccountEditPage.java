package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class CustomerAccountEditPage {
    public static String getValueCustomerEmailField() {
        return Common.getValueOfAttributeOfElement(Locators.MohitoShop.CustomerAccountEdit.fieldCustomerEmail, "value");
    }

    public static void loadFieldCustomerEmail() {
        Common.waitElementLoaded(Locators.MohitoShop.CustomerAccountEdit.fieldCustomerEmail, 8);
    }

    public static void navigateDeleteAccountStep1() {
        Common.navigateUrl("https://www.mohito.com/lt/lt/account-management/accountRemoval/firststep/");
    }

    public static void clickDeleteAccountLink() {
        Common.waitElementLoaded(Locators.MohitoShop.CustomerAccountEdit.linkDeleteAccount, 10);
        Common.clickOnElement(Locators.MohitoShop.CustomerAccountEdit.linkDeleteAccount);
    }
}
