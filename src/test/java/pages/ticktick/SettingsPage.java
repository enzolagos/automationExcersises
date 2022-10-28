package pages.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class SettingsPage {
    public Button profileSettingsButton = new Button(By.xpath("//*[@href=\"#settings/profile\"]"));
}
