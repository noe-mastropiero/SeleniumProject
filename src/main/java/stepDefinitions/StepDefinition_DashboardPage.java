package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObjects.BaseClass;
import pageObjects.DashboardPage;

public class StepDefinition_DashboardPage extends BaseClass {

    @Given("I am able to see the Dashboard header$")
    public void i_am_able_to_see_the_dasboard_header() {
        dash = new DashboardPage(BaseClass.ldriver);
        Assert.assertTrue(dash.dashboardisDisplayed());
    }

    @Then("I validate the welcome banner contains message: \"([^\"]*)\"$")
    public void i_validate_the_welcome_banner_contains_message(String mssge) {

    }

    @Then("I validate the feed container has at least \"(\\d+)\" (?:elements|element) inside$")
    public void i_Count_Container_elements(int numElements) {


    }


}
