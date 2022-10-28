package cleanTest.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.ticktick.*;
import singletonSession.Session;

public class TestBaseTickTick {
    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();
    public RegisterPage registerPage = new RegisterPage();
    public MainPage mainPage = new MainPage();
    public HabitPage habitPage = new HabitPage();
    public SettingsPage settingsPage = new SettingsPage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://ticktick.com/");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
