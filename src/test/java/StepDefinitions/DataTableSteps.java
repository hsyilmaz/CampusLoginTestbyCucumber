package StepDefinitions;

import Pages.Locators;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableSteps {
    Locators ls = new Locators();

    @When("User sends username and password")
    public void userSendsUsernameAndPassword(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++){
            ls.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));}
        System.out.println(listElement.size());


    }

    @And("User press login button")
    public void userPressLoginButton(DataTable element) {
        List<String> listElement = element.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ls.findAndClick(listElement.get(i));
        }
    }
}

