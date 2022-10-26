package cleanTest.sauce;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.sauce.CartPage;
import pages.sauce.HomePage;
import pages.sauce.LoginPage;
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
