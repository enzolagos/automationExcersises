package pages.owasp;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class HomePage {
    public Button dissmissPopUp = new Button(By.xpath("//*[@aria-label=\"Close Welcome Banner\"]"));
    public Button dissmissCookies = new Button(By.xpath("//*[@aria-label=\"dismiss cookie message\"]"));
    public Button forcePageReload = new Button(By.xpath("//*[text()=\"Force page reload\"]"));
    public Button accountButton = new Button(By.id("navbarAccount"));
    public Button loginButton = new Button(By.id("navbarLoginButton"));
    public Button shoppingCartButton = new Button(By.xpath("//*[@aria-label = 'Show the shopping cart']"));
    public Button logoutButton = new Button(By.id("navbarLogoutButton"));

    public void deletePopUps(){
        dissmissPopUp.click();
        dissmissCookies.click();
        forcePageReload.click();
    }

}
