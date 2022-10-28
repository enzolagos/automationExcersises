package pages.ticktick;

import control.*;
import org.openqa.selenium.By;

public class MainPage {
    //LABELS
    public Label inboxPopUpLabel = new Label(By.xpath("//h1[text()=\"Inbox\"]"));
    public Label inboxTitleLabel = new Label(By.xpath("//h5[text()='Inbox']"));
    public Label noListsLabel = new Label(By.xpath("//*[text()=\"Use lists to categorize and manage your tasks and notes\"]"));
    public Label italianLabel = new Label(By.xpath("//*[text()=\"Cestino\"]"));
    public Button todayButton = new Button(By.xpath("//*[text()=\"Today\"]/.."));

    //BUTTONS
    public Button skipPopUpAfterRegister = new Button(By.xpath("//*[text()=\"Skip\"]"));
    public Button habitsButton = new Button(By.xpath("//*[@href=\"#q/all/habit\"]"));
    public Button addListButton = new Button(By.xpath("//*[@class=\"add-icon w-[18px] h-[18px] flex-none opacity-0 group-hover:opacity-100 group-focus-visible:opacity-100 focus-visible:opacity-100 focus:opacity-100\"]"));
    public TextBox titleList = new TextBox(By.id("edit-project-name"));
    public Button saveButton = new Button(By.xpath("//button[text()=\"Save\"]"));
    public Button userButton = new Button(By.id("tl-bar-user"));
    public Button signOutButton = new Button(By.xpath("//*[text()=\"Sign Out\"]"));
    public Button settingsButton = new Button(By.xpath("//*[text()=\"Settings\"]"));
    public Button deleteListButton = new Button(By.xpath("//*[text()=\"Delete\"]"));
    public Button syncButton = new Button(By.xpath("//*[text()=\"Sync\"]"));

    //body
    public Control bodyControl = new Control(By.xpath("//body"));

    public Button getListButton(String projectTitle){
        return new Button(By.xpath("//*[text()='"+projectTitle+"']/.."));
    }
    public Button listOptionsButton(String projectTitle){
        return new Button(By.xpath("//*[@id=\"project-ul\"]//*[text()='"+projectTitle+"']//following-sibling::*//div"));
    }
    public Label projectTitleLabel(String projectTitle){
        return new Label(By.xpath("//h5[text()='"+projectTitle+"']"));
    }

}
