package pages.ticktick;

import control.Button;
import control.OptionFromList;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsPage {
    public Button profileSettingsButton = new Button(By.xpath("//*[@href=\"#settings/profile\"]"));
    public Button changePasswordButton = new Button(By.xpath("//*[text()=\"Change Password\"]"));
    public TextBox currentPassword = new TextBox(By.xpath("//*[@placeholder=\"Current Password\"]"));
    public TextBox newPassword = new TextBox(By.xpath("//*[@placeholder=\"New password\"]"));
    public Button saveButton = new Button(By.xpath("//*[text()=\"Save\"]"));
    public Button doneButton = new Button(By.xpath("//button[text()=\"Done\"]"));
    public Button languageListButton = new Button(By.xpath("//*[contains(text(),\"English\")]"));
    public OptionFromList italianoOption = new OptionFromList(By.xpath("//*[contains(text(),\"Italiano\")]"));
    public Button themeButton = new Button(By.xpath("//*[text()=\"Theme\"]"));
    public Button darkOption = new Button(By.xpath("//*[@data-id=\"night\"]/div"));





}
