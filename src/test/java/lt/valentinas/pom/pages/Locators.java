package lt.valentinas.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class mohitoShop{
        public static class customerLogin{
            public static By buttonOfCookiesOK = By.xpath("//button[@id='cookiebotDialogOkButton']");
            public static By buttonRegisterSelect = By.xpath("//button[@data-selen='register-select']");
            public static By fieldOfEmailInRegistration = By.xpath("//input[@id='email_id']");
            public static By fieldOfNameInRegistration = By.xpath("//input[@id='firstname_id']");
            public static By fieldOfSurnameInRegistration = By.xpath("//input[@id='lastname_id']");
            public static By fieldOfPasswordInRegistration = By.xpath("//input[@id='password_id']");
            public static By buttonCreateAccountSubmit = By.xpath("//button[@data-selen='create-account-submit']");
        }

        public static class customerAccountEdit{
            public static By fieldCustomerEmail = By.xpath("//input[@id='customer-email']");
        }
    }
}
