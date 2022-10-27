package pages.owasp;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public Button newAccountButton = new Button(By.xpath("//*[text()=\"Not yet a customer?\"]"));
    public Label registrationSuccessfully = new Label(By.xpath("//*[contains(text(),\"Registration completed successfully\")]"));
    public TextBox emailLoginTextBox = new TextBox(By.id("email"));
    public TextBox passwordLoginTextBox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.id("loginButton"));

}
