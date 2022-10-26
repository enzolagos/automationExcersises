package pages.sauce;

import control.*;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox userNameTextBox = new TextBox(By.id("user-name"));
    public TextBox passwordTextbox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.id("login-button"));
}
