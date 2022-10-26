package pages;

import control.Control;
import org.openqa.selenium.By;

public class CartPage {
    public Control firstItemInTheCart = new Control(By.xpath("//*[@class=\"inventory_item_name\"]"));
}
