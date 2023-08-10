package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class StepDefinition_DashboardPage {
    public WebDriver driver;
    public DashboardPage dash;

    @Given("I am able to see the Dashboard header$")
    public void i_am_able_to_see_the_dasboard_header() {
        Assert.assertTrue(dash.dashboard().isDisplayed());
    }

    @Then("I validate the welcome banner contains message: \"([^\"]*)\"$")
    public void i_validate_the_welcome_banner_contains_message(String mssge) {
        String text = dash.welcomeHeader().getText();
        Assert.assertEquals(mssge,text);
    }

    @Then("I validate the feed container has at least \"(\\d+)\" (?:elements|element) inside$")
    public void i_Count_Container_elements(int numElements) {


    }


}
