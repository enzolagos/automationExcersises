package pages.todoist;

import control.Button;
import control.OptionFromList;
import org.openqa.selenium.By;

public class TaskPage {
    public Button taskDueDate = new Button(By.xpath("//*[@class=\"PkhZiTa _9KUWmzz a8af2163 _98cd5c3f _45ffe137 f9408a0e _8c75067a\"]"));
    public Button tomorrowDueDateButton = new Button(By.xpath("//*[@data-track=\"scheduler|date_shortcut_tomorrow\"]"));
    public Button priorityItemButton = new Button(By.xpath("//*[text()=\"P1\"]"));
    public Button closeWindowButton = new Button(By.xpath("//*[@aria-label = \"Close modal\"]"));
    public OptionFromList priorityTwoOption = new OptionFromList(By.xpath("//*[@class=\"priority_picker_item_name\" and text()=\"Priority 2\"]"));
    public Button menuTask = new Button(By.xpath("//*[@aria-label = \"More actions\"]"));
    public Button deleteOption = new Button(By.xpath("//*[contains(text(),'Delete') and @class=\"a83bd4e0 a8d37c6e f9408a0e\"]"));
    public Button deleteAccept = new Button(By.xpath("//*[contains(text(),'Delete') and @class=\"bbdb467b f9408a0e _31cf99c5 _473810b4\"]"));
}
