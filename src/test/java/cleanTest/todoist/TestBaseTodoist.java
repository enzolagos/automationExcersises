package cleanTest.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoist.*;
import singletonSession.Session;

public class TestBaseTodoist {
    public MainPage mainPage = new MainPage();
    public Login loginModal = new Login();
    public HomePage homePage = new HomePage();
    public MainProject mainProject = new MainProject();
    public TaskPage taskPage = new TaskPage();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get("https://todoist.com/es");
    }
    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
