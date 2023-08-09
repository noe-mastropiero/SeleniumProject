package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common {
    public WebDriver ldriver;

    public Common(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[@id=\"nopSideBarPusher\"]/i")
    @CacheLookup
    WebElement BtnHamburgerMenu;

    @FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
    @CacheLookup
    WebElement BtnLogout;

    @FindBy(xpath="/html/body/div[3]/aside/a/img[2]")
    @CacheLookup
    WebElement LinkLogo;

    @FindBy(xpath ="//*[@id=\"navbarText\"]/ul/li[2]")
    @CacheLookup
    WebElement TxtUsrName;





}
