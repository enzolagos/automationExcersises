package pages.ticktick;

import control.*;
import org.openqa.selenium.By;

public class HabitPage {
    public Button addHabitButton = new Button(By.xpath("//*[@class=\"inline-block w-[18px] h-[18px] mr-[8px] cursor-pointer\"]"));
    public TextBox habitTitle = new TextBox(By.xpath("//*[@placeholder=\"Daily Check-in\"]"));
    public Button saveButton = new Button(By.xpath("//*[text()=\"Save\"]"));
    public Control habitControl = new Control(By.xpath("//*[@class=\"absolute z-[1] inset-y-0 inset-x-[20px]  false false\"]"));
    public Button habitOptionsButton = new Button(By.xpath("//*[@title=\"more\"]"));
    public Button deleteOptionButton = new Button(By.xpath("//*[text()=\"Delete\"]/.."));
    public Button deleteHabitButton = new Button(By.xpath("//button[text()=\"Delete\"]"));
    public Label developAHabitLabel = new Label(By.xpath("//*[@class=\"title_wenfT\"]"));
}
