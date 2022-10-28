package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class SettingsTest extends TestBaseTickTick{
    @Test
    public void verifyUserCanChangePassword(){
        String user = "pruebapassword@gmail.com";
        String password = "pruebapassword";
        homePage.signInButton.click();
        Session.getInstance().waitURLToChange("https://ticktick.com/signin");
        loginPage.login(user,password);
        Assertions.assertTrue(mainPage.inboxTitleLabel.isControlDisplayed(), "Error el usuario no se pudo loguear");

        mainPage.userButton.click();
        mainPage.settingsButton.click();
        Session.getInstance().waitURLToChange("https://ticktick.com/webapp/#settings");


    }
}
