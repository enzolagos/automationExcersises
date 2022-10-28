package cleanTest.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import singletonSession.Session;

public class ListsTest extends TestBaseTickTick{
    @Test
    public void verifyUserCanCreateAListAndAddATask() throws InterruptedException {
        //login
        homePage.signInButton.click();
        Session.getInstance().waitURLToChange("https://ticktick.com/signin");
        loginPage.login("testeoTest@gmail.com","testeoTest");
        Assertions.assertTrue(mainPage.inboxTitleLabel.isControlDisplayed(), "Error el usuario no se pudo loguear");

        //test
        String projectTitle = "Testing List";
        mainPage.addListButton.click();
        mainPage.titleList.setText(projectTitle);
        mainPage.saveButton.click();
        Assertions.assertTrue(mainPage.createProjectButton(projectTitle).isControlDisplayed(), "El proyecto no se creo");

        Thread.sleep(2000);
        mainPage.createProjectButton(projectTitle).click();
    }
}
