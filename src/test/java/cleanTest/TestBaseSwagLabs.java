package cleanTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import singletonSession.Session;

public class TestBaseSwagLabs {
    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();
    public CartPage cartPage = new CartPage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://www.saucedemo.com/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
