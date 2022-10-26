package pages.todoist;

import control.*;
import org.openqa.selenium.By;

public class MainProject {
    public Label projectForTesting = new Label(By.xpath("//*[@class=\"FnFY2YlPR10DcnOkjvMMmA==\" and text()=\"Test Project\"]"));

    //controles post apretar crear task
    public Button addItemButton = new Button(By.xpath("//*[@class=\"plus_add_button\"]"));
    public TextBox itemNameTextbox = new TextBox(By.xpath("//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"]"));
    public Button dueDateButton = new Button(By.xpath("//*[@class = \"item_due_selector icon_pill\"]"));
    public Button todayDueDateButton = new Button(By.xpath("//*[@data-track=\"scheduler|date_shortcut_today\"]"));
    public Button priorityItemButton = new Button(By.xpath("//*[@class=\"item_action item_actions_priority\"]"));
    public OptionFromList priorityOneOption = new OptionFromList(By.xpath("//*[@class=\"priority_picker_item_name\" and text()=\"Priority 1\"]"));
    public OptionFromList priorityTwoOption = new OptionFromList(By.xpath("//*[@class=\"priority_picker_item_name\" and text()=\"Priority 2\"]"));
    public Button addTaskButon = new Button(By.xpath("//*[@class=\"bbdb467b f9408a0e _31cf99c5 _473810b4\" and text()=\"Add task\"]"));

    public Label titleItemCreated = new Label(By.xpath("//*[@class=\"markdown_content task_content\"]"));
    public Label dueDateItemCreated = new Label(By.xpath("//*[@class=\"task_list_item__info_tags\"]//*[contains(@class,\"date_t\")]"));
    public Control checkboxTask = new Control(By.xpath("//*[contains(@class,\"task_checkbox priority\")]"));

    public Control taskCreated = new Control(By.xpath("//*[@class=\"task_list_item__content\"]"));
    public Control listOfTasks = new Control(By.xpath("//*[@class=\"items\"]"));


}
