package lt.valentinas.pom.tests.mohito;

import lt.valentinas.pom.pages.mohito.CustomerAccountEditPage;
import lt.valentinas.pom.pages.mohito.CustomerLoginPage;
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
                {"valiuspus@gmail.com", "Valentinas", "Pusvaskis", "slaptazodis123","valiuspus@gmail.com"}
        };
    }

    @Test(dataProvider = "dataProviderTestSignUp")
    public void testSignUp(String email, String name, String surname, String password, String expectedResult) {
        CustomerLoginPage.clickButtonRegisterSelect();
        CustomerLoginPage.inputDataEmail(email);
        CustomerLoginPage.inputDataName(name);
        CustomerLoginPage.inputDataSurname(surname);
        CustomerLoginPage.inputDataPassword(password);
        CustomerLoginPage.clickButtonCreateAccountSubmit();

        CustomerAccountEditPage.loadFieldCustomerEmail();

        String actualResult = CustomerAccountEditPage.getValueCustomerEmailField();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }
}
