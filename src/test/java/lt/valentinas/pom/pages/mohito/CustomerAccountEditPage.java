package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;
import org.openqa.selenium.By;


public class CustomerAccountEditPage {
    public static String getValueCustomerEmailField() {
        return Common.getValueOfAttributeOfElement(Locators.mohitoShop.customerAccountEdit.fieldCustomerEmail, "value");
    }

    public static void loadFieldCustomerEmail() {
        Common.waitElementLoaded(Locators.mohitoShop.customerAccountEdit.fieldCustomerEmail, 8);
    }
}
