package lt.valentinas.pom.tests.mohito;

import lt.valentinas.pom.pages.mohito.AccountRemovalPage;
import lt.valentinas.pom.pages.mohito.CustomerAccountEditPage;
import lt.valentinas.pom.pages.mohito.CustomerLoginPage;
import lt.valentinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountRemovalTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        CustomerLoginPage.open("https://www.mohito.com/lt/lt/customer/account/login/");
        CustomerLoginPage.clickAcceptCookies();
    }

    @DataProvider(name = "dataProviderTestDeleteAccount")
    public Object[][] dataProviderForTestDeleteAccount() {
        return new Object[][]{
                {"valiuspus@gmail.com", "slaptazodis123", "valiuspus@gmail.com"}
        };
    }

    @Test(dataProvider = "dataProviderTestDeleteAccount")
    public void testDeleteAccount(String email, String password, String expectedResult) {
        CustomerLoginPage.login(email, password);

//         Truputi negerai, nes netestuojama ar Link'as yra siame puslapyje
//        CustomerAccountEditPage.navigateDeleteAccountStep1();
        CustomerAccountEditPage.clickDeleteAccountLink();
        AccountRemovalPage.clickButtonDeleteAccountNow();

        String actualResult = AccountRemovalPage.readSpanEmail();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }
}
