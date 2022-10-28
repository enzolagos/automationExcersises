package pages.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox userMailTextbox = new TextBox(By.id("emailOrPhone"));
    public TextBox userPasswordTextbox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.xpath("//*[@class=\"button__3eXSs \"]"));

    public void login(String user, String password){
        userMailTextbox.setText(user);
        userPasswordTextbox.setText(password);
        loginButton.click();
    }
}
