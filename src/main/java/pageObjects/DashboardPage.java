package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public WebDriver ldriver;

    public DashboardPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="/html/body/div[3]/div[1]/div[1]/h1")
    @CacheLookup
    WebElement TxtDashboardPanel;

    @FindBy(xpath="//*[@id=\"configuration-steps-card\"]/div[2]/div[1]/div/h4")
    @CacheLookup
    WebElement TxtWelcomeHeader;

    @FindBy(xpath="/html/body/div[3]/div[1]/section/div")
    @CacheLookup
    WebElement ContainerFeeds;

    public WebElement dashboard(){return TxtDashboardPanel;}

    public WebElement welcomeHeader(){
        return TxtWelcomeHeader;
    }

    public WebElement containerFeeds(){
        return ContainerFeeds;
    }


}
