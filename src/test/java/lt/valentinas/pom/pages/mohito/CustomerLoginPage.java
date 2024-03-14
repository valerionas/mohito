package lt.valentinas.pom.pages.mohito;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class CustomerLoginPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickAcceptCookies() {
        boolean isElementVisible = Common.waitElementVisible(Locators.MohitoShop.CustomerLogin.buttonOfCookiesOK, 8);
        if (isElementVisible) {
            Common.clickOnElement(Locators.MohitoShop.CustomerLogin.buttonOfCookiesOK);
        }
    }

    public static void inputDataEmailInRegistration(String email) {
        Common.sendKeysToElement(Locators.MohitoShop.CustomerLogin.fieldOfEmailInRegistration, email);
    }

    public static void clickButtonRegisterSelect() {
        Common.clickOnElement(Locators.MohitoShop.CustomerLogin.buttonRegisterSelect);
    }

    public static void inputDataName(String name) {
        Common.sendKeysToElement(Locators.MohitoShop.CustomerLogin.fieldOfNameInRegistration, name);
    }

    public static void inputDataSurname(String surname) {
        Common.sendKeysToElement(Locators.MohitoShop.CustomerLogin.fieldOfSurnameInRegistration, surname);
    }

    public static void inputDataPasswordInRegitration(String password) {
        Common.sendKeysToElement(Locators.MohitoShop.CustomerLogin.fieldOfPasswordInRegistration, password);
    }

    public static void clickButtonCreateAccountSubmit() {
        Common.clickOnElement(Locators.MohitoShop.CustomerLogin.buttonCreateAccountSubmit);
    }

    public static void inputDataEmailLogin(String email) {
        Common.waitElementLoaded(Locators.MohitoShop.CustomerLogin.fieldOfEmailLogin, 10);
        Common.sendKeysToElement(Locators.MohitoShop.CustomerLogin.fieldOfEmailLogin, email);
    }

    public static void inputDataPasswordLogin(String password) {
        Common.sendKeysToElement(Locators.MohitoShop.CustomerLogin.fieldOfPasswordLogin, password);
    }

    public static void clickButtonLogin() {
        Common.clickOnElement(Locators.MohitoShop.CustomerLogin.buttonLoginSubmit);
    }

    public static void refreshPage() {
        Common.refreshPage();
    }

    public static void login(String email, String password) {
        CustomerLoginPage.refreshPage();
        CustomerLoginPage.inputDataEmailLogin(email);
        CustomerLoginPage.inputDataPasswordLogin(password);
        CustomerLoginPage.clickButtonLogin();

        HomeIndexPage.clickProfileButton();
    }
}
