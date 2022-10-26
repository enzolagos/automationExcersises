package cleanTest.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class CRUDtodoist extends TestBaseTodoist{
    @Test
    public void verifyCreationModificationEliminationOfItem() throws InterruptedException {
        //Login
        String userName = "enzo.lagos@nybblegroup.com";
        String password = "nybbletesting";
        mainPage.loginButton.click();
        loginModal.login(userName,password);
        Assertions.assertTrue(homePage.inboxButton.isControlDisplayed(),"Error no se cargo la pagina");

        //Selecciono proyecto
        mainProject.projectForTesting.click();
        Session.getInstance().waitURLToChange("https://todoist.com/app/project/2301300351");

        //Aniado item
        mainProject.addItemButton.click();
        String taskTitle = ""+new Date().getTime();
        mainProject.itemNameTextbox.addText(taskTitle);
        mainProject.dueDateButton.click();
        mainProject.todayDueDateButton.click();
        mainProject.priorityItemButton.click();
        mainProject.priorityItemButton.waitUntilChangeState("aria-expanded","true");
        mainProject.priorityOneOption.click();
        mainProject.addTaskButon.click();
        Assertions.assertEquals(taskTitle, mainProject.titleItemCreated.getText(),"El task no se creo");
        Assertions.assertEquals("Today", mainProject.dueDateItemCreated.getText(), "Error el task no se creo con el due date correcto");
        Assertions.assertEquals(mainProject.checkboxTask.getAttribute("class"),"task_checkbox priority_4","Error la prioridad no es la asignada");

        //Modifico item
        mainProject.taskCreated.click();
        taskPage.taskDueDate.click();
        taskPage.tomorrowDueDateButton.click();
        taskPage.priorityItemButton.click();
        taskPage.priorityTwoOption.click();
        taskPage.closeWindowButton.click();
        Assertions.assertEquals("Tomorrow", mainProject.dueDateItemCreated.getText(), "Error el duedate del task no se modifico");
        Assertions.assertEquals(mainProject.checkboxTask.getAttribute("class"),"task_checkbox priority_3","Error la prioridad no es la asignada");

        //Elimino item
        mainProject.taskCreated.click();
        taskPage.menuTask.click();
        taskPage.deleteOption.click();
        taskPage.deleteAccept.click();
        Assertions.assertEquals("1",mainProject.listOfTasks.getAttribute("childElementCount"),"Error no se ha eliminado el item");


    }
}
