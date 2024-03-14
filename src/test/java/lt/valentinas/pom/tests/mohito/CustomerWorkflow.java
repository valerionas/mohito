package lt.valentinas.pom.tests.mohito;

import lt.valentinas.pom.pages.mohito.*;
import lt.valentinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomerWorkflow extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        CustomerLoginPage.open("https://www.mohito.com/lt/lt/customer/account/login/");
        CustomerLoginPage.clickAcceptCookies();
    }

    @DataProvider(name = "dataProviderTestSignUp")
    public Object[][] dataProviderForTestSignup() {
        return new Object[][]{
                {"valiuspus@gmail.com", "Valentinas", "Pusvaskis", "slaptazodis123", "valiuspus@gmail.com"}
        };
    }

    @Test(dataProvider = "dataProviderTestSignUp", priority = 0)
    public void testSignUp(String email, String name, String surname, String password, String expectedResult) {
        CustomerLoginPage.clickButtonRegisterSelect();
        CustomerLoginPage.inputDataEmailInRegistration(email);
        CustomerLoginPage.inputDataName(name);
        CustomerLoginPage.inputDataSurname(surname);
        CustomerLoginPage.inputDataPasswordInRegitration(password);
        CustomerLoginPage.clickButtonCreateAccountSubmit();

        CustomerAccountEditPage.loadFieldCustomerEmail();
        String actualResult = CustomerAccountEditPage.getValueCustomerEmailField();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @DataProvider(name = "dataProviderTestLogin")
    public Object[][] dataProviderForTestLogin() {
        return new Object[][]{
                {"valiuspus@gmail.com", "slaptazodis123", "valiuspus@gmail.com"}
        };
    }

    @Test(dataProvider = "dataProviderTestLogin", priority = 1)
    public void testLogin(String email, String password, String expectedResult) {
        CustomerLoginPage.refreshPage();
        CustomerLoginPage.inputDataEmailLogin(email);
        CustomerLoginPage.inputDataPasswordLogin(password);
        CustomerLoginPage.clickButtonLogin();

        HomeIndexPage.clickProfileButton();

        CustomerAccountEditPage.loadFieldCustomerEmail();
        String actualResult = CustomerAccountEditPage.getValueCustomerEmailField();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @DataProvider(name = "dataProviderTestDeleteAccount")
    public Object[][] dataProviderForTestDeleteAccount() {
        return new Object[][]{
                {"valiuspus@gmail.com", "slaptazodis123", "valiuspus@gmail.com"}
        };
    }

    @Test(dataProvider = "dataProviderTestDeleteAccount", priority = 2)
    public void testDeleteAccount(String email, String password, String expectedResult) {
        CustomerLoginPage.login(email, password);

//         Truputi negerai, nes netestuojama ar Link'as yra siame puslapyje
//        CustomerAccountEditPage.navigateDeleteAccountStep1();
        CustomerAccountEditPage.clickDeleteAccountLink();
        AccountRemovalFirstStepPage.clickButtonDeleteAccountNow();

        String actualResult = AccountRemovalSecondStepPage.readSpanEmail();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }
}
