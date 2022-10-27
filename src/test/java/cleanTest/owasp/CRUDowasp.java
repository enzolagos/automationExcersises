package cleanTest.owasp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class CRUDowasp extends TestBaseOWASP{
    @Test
    public void verifyUserCanRegisterLoginLogout() throws InterruptedException {
        //Seteo datos
        String userMail = ""+new Date().getTime()+"@gmail.com";
        String password = ""+new Date().getTime();
        String loginURL = "https://juice-shop.herokuapp.com/#/login";
        String registerUrl = "https://juice-shop.herokuapp.com/#/register";

        homePage.deletePopUps();
        //Register
        homePage.accountButton.click();
        homePage.loginButton.click();
        Session.getInstance().waitURLToChange(loginURL);
        loginPage.newAccountButton.click();
        Session.getInstance().waitURLToChange(registerUrl);
        registerPage.registerUser(userMail,password);
        Assertions.assertTrue(loginPage.registrationSuccessfully.isControlDisplayed(), "Error no se registro el usuario");

        //Login
        loginPage.emailLoginTextBox.setText(userMail);
        loginPage.passwordLoginTextBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(homePage.shoppingCartButton.isControlDisplayed(), "Error el usuario no se logueo");

        //Logout
        homePage.accountButton.click();
        homePage.logoutButton.click();
        Assertions.assertFalse(homePage.shoppingCartButton.isControlDisplayed(), "Error el usuario no se deslogueo");

    }
}
