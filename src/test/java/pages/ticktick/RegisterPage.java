package pages.ticktick;

import control.*;
import org.openqa.selenium.By;

public class RegisterPage {
    public TextBox nameTextBox = new TextBox(By.id("name"));
    public TextBox emailTextBox = new TextBox(By.xpath("//*[@autocomplete=\"username\"]"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
    public Button registerButton = new Button(By.xpath("//*[@class=\"button__3eXSs \"]"));

    public void registerUser(String user, String password){
        nameTextBox.setText("Test");
        emailTextBox.setText(user);
        passwordTextBox.setText(password);
        registerButton.click();
    }

}
