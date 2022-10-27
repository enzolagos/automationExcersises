package pages.owasp;

import control.Button;
import control.Control;
import control.OptionFromList;
import control.TextBox;
import org.openqa.selenium.By;

public class RegisterPage {
    public TextBox emailTextBox = new TextBox(By.id("emailControl"));
    public TextBox passwordTextBox = new TextBox(By.id("passwordControl"));
    public TextBox repeatPasswordTextBox = new TextBox(By.id("repeatPasswordControl"));
    public Control questionCombobox = new Control(By.id("mat-select-2"));
    public TextBox answerTextBox = new TextBox(By.id("securityAnswerControl"));
    public OptionFromList firstAnswerOption = new OptionFromList(By.id("mat-option-3"));
    public Button registerButton = new Button(By.id("registerButton"));

    public void registerUser(String userMail, String password){
        emailTextBox.setText(userMail);
        passwordTextBox.setText(password);
        repeatPasswordTextBox.setText(password);
        questionCombobox.click();
        questionCombobox.waitUntilChangeState("aria-expanded","true");
        firstAnswerOption.click();
        answerTextBox.setText(password);
        registerButton.click();
    }

}
