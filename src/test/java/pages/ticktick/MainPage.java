package pages.ticktick;

import control.*;
import org.openqa.selenium.By;

public class MainPage {
    public Label inboxPopUpLabel = new Label(By.xpath("//h1[text()=\"Inbox\"]"));
    public Label inboxTitleLabel = new Label(By.xpath("//h5[text()='Inbox']"));
    public Button habitsButton = new Button(By.xpath("//*[@href=\"#q/all/habit\"]"));
    public Button addListButton = new Button(By.xpath("//*[@class=\"add-icon w-[18px] h-[18px] flex-none opacity-0 group-hover:opacity-100 group-focus-visible:opacity-100 focus-visible:opacity-100 focus:opacity-100\"]"));
    public TextBox titleList = new TextBox(By.id("edit-project-name"));
    public Button saveButton = new Button(By.xpath("//button[text()=\"Save\"]"));
    public Button userButton = new Button(By.id("tl-bar-user"));
    public Button signOutButton = new Button(By.xpath("//*[text()=\"Sign Out\"]"));
    public Button settingsButton = new Button(By.xpath("//*[text()=\"Settings\"]"));

    public Button createProjectButton(String projectTitle){
        return new Button(By.xpath("//*[text()='"+projectTitle+"']/.."));
    }
    public Label projectTitleLabel(String projectTitle){
        return new Label(By.xpath("//h5[text()='"+projectTitle+"']"));
    }

}
