package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class CustomerLoginPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickAcceptCookies() {
        boolean isElementVisible = Common.waitElementVisible(Locators.mohitoShop.customerLogin.buttonOfCookiesOK,8);
        if (isElementVisible) {
            Common.clickOnElement(Locators.mohitoShop.customerLogin.buttonOfCookiesOK);
        }
    }

    public static void inputDataEmail(String email) {
        Common.sendKeysToElement(Locators.mohitoShop.customerLogin.fieldOfEmailInRegistration, email);
    }

    public static void clickButtonRegisterSelect() {
        Common.clickOnElement(Locators.mohitoShop.customerLogin.buttonRegisterSelect);
    }

    public static void inputDataName(String name) {
        Common.sendKeysToElement(Locators.mohitoShop.customerLogin.fieldOfNameInRegistration, name);
    }

    public static void inputDataSurname(String surname) {
        Common.sendKeysToElement(Locators.mohitoShop.customerLogin.fieldOfSurnameInRegistration, surname);
    }

    public static void inputDataPassword(String password) {
        Common.sendKeysToElement(Locators.mohitoShop.customerLogin.fieldOfPasswordInRegistration, password);
    }

    public static void clickButtonCreateAccountSubmit() {
        Common.clickOnElement(Locators.mohitoShop.customerLogin.buttonCreateAccountSubmit);
    }
}
