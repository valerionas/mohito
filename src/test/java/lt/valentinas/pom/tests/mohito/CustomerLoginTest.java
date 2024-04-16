package lt.valentinas.pom.tests.mohito;

import lt.valentinas.pom.pages.mohito.CustomerAccountEditPage;
import lt.valentinas.pom.pages.mohito.CustomerLoginPage;
import lt.valentinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomerLoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        CustomerLoginPage.open("https://www.mohito.com/lt/lt/customer/account/login/");
        CustomerLoginPage.clickAcceptCookies();
    }

    @DataProvider(name = "dataProviderTestLogin")
    public Object[][] dataProviderForTestLogin() {
        return new Object[][]{
                {"valiuspus@gmail.com", "slaptazodis123", "valiuspus@gmail.com"}
        };
    }

    @Test(dataProvider = "dataProviderTestLogin")
    public void testLogin_ProvidedCorrectInput(String email, String password, String expectedResult) {
        CustomerLoginPage.login(email, password);

        CustomerAccountEditPage.waitFieldCustomerEmail();
        String actualResult = CustomerAccountEditPage.getValueCustomerEmailField();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }
}
