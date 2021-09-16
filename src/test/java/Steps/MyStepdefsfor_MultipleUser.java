package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class MyStepdefsfor_MultipleUser {
    @When("^user at the login page of the application$")
    public void userAtTheLoginPageOfTheApplication() {
        System.out.println("userAtTheLoginPageOfTheApplication");

    }

    @When("^user logs in with following username and password$")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) {
        List<List<String>> list_of_rows = dataTable.raw();
        for (List<String> row : list_of_rows) {
            for (String str : row) {
                System.out.println("Data : " + str);
            }
        }
    }

    @Then("^user should be able to login with correct user name and password$")
    public void userShouldBeAbleToLoginWithCorrectUserNameAndPassword() {
        System.out.println("userShouldBeAbleToLoginWithCorrectUserNameAndPassword");
    }
}
