package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class LoginSteps {
    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        System.out.println("user_is_on_login_page()");
        //throw new PendingException();
    }

    @When("^User enters <user name> and pass(\\d+)$")
    public void user_enters_user_name_and_pass(int arg1) throws Throwable {
        System.out.println("user_enters_user_name_and_pass");
        //throw new PendingException();
    }

    @When("^Click on login button$")
    public void click_on_login_button() throws Throwable {

       // throw new PendingException("click_on_login_button");
    }

    @Then("^User is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() throws Throwable {
        System.out.println("user_is_navigated_to_the_home_page");
        //throw new PendingException();
    }


}