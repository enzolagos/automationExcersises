package pages;

import control.*;
import org.openqa.selenium.By;

public class HomePage {
    public Button cartButton = new Button(By.id("shopping_cart_container"));
    public Button sortButton = new Button(By.xpath("//*[@class='product_sort_container']"));
    public OptionFromList lowToHighOption = new OptionFromList(By.xpath("//option[@value=\"lohi\"]"));
    public Label nameFirstElementLocated = new Label(By.xpath("//*[@class=\"inventory_item_name\"]"));
    public Button addToCartFirstElementLocatedButton = new Button(By.xpath("//*[@class=\"btn btn_primary btn_small btn_inventory\"]"));
    public Label cantItemsInTheCart = new Label(By.xpath("//*[@class=\"shopping_cart_badge\"]"));

}
