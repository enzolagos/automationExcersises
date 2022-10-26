package cleanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import singletonSession.Session;

public class CRUDEjercicioUno extends TestBaseSwagLabs{

    @Test
    public void verifyUserCanAddLowestProductToCart() throws InterruptedException {
        //LOGIN
        String user = "standard_user";
        String password = "secret_sauce";
        loginPage.userNameTextBox.setText(user);
        loginPage.passwordTextbox.setText(password);
        loginPage.loginButton.click();
        Session.getInstance().waitURLToChange("https://www.saucedemo.com/inventory.html");
        Assertions.assertTrue(homePage.cartButton.isControlDisplayed(),"Error el login no se completo");

        //SORT ITEMS LOW TO HIGH
        homePage.sortButton.click();
        homePage.lowToHighOption.click();
        String nameLowestProductOnPage = "Sauce Labs Onesie";
        homePage.nameFirstElementLocated.waitTextToBe(nameLowestProductOnPage);
        Assertions.assertEquals(nameLowestProductOnPage, homePage.nameFirstElementLocated.getText(), "Error el primer item no es el mas barato");

        //ADD TO CART AND VERIFICATION
        homePage.addToCartFirstElementLocatedButton.click();
        homePage.cantItemsInTheCart.waitTextToBe("1");
        homePage.cartButton.click();
        Session.getInstance().waitURLToChange("https://www.saucedemo.com/cart.html");
        Assertions.assertEquals(nameLowestProductOnPage, cartPage.firstItemInTheCart.getText(), "Error el producto agregado no es el mas barato");
    }
}
