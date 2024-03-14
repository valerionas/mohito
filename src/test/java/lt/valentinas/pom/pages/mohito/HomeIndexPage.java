package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class HomeIndexPage {

    public static void clickProfileButton() {
        Common.waitElementLoaded(Locators.MohitoShop.HomeIndex.divOfProfile, 10);
        Common.clickOnElement(Locators.MohitoShop.HomeIndex.divOfProfile);
    }
}
