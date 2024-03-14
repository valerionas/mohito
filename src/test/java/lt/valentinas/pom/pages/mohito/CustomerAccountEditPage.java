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
}
