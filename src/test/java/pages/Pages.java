package pages;
import org.apache.commons.compress.compressors.pack200.Pack200Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class Pages {
    public Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (xpath = "//*[@data-gdpr-single-choice-accept='true']")
    public WebElement cookies;

    @FindBy(xpath = "//*[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")
    public WebElement inloggen;


    @FindBy(id="join_neu_email_field")
    public WebElement email;


     Actions action= new Actions(Driver.getDriver());
    public void inLogin(){
        inloggen.click();
        ReusableMethods.wait(3);
        action.click(email).sendKeys(ConfigReader.getProperty("eMail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("sifre"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

    }
    @FindBy(id = "global-enhancements-search-query")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//*[@class='height-placeholder'])[1]")
    public WebElement ilkUrun;

    @FindBy(id = "variation-selector-0")
    public WebElement selectMaat;

    @FindBy(id = "variation-selector-1")
            public WebElement renkSec;

    @FindBy(id = "listing-page-quantity-select")
            public WebElement urunSayisi;

    @FindBy(xpath = "//*[@data-skip-bin-overlay='true']")
            public WebElement onayla;


Select select=new Select(selectMaat);
    public void urunuSepeteAt(){
       selectMaat.click();
       select.selectByIndex(1);
       renkSec.click();
       select.selectByIndex(1);
       urunSayisi.click();
       select.selectByIndex(1);
       onayla.click();
    }
@FindBy(className = "wt-btn wt-width-full wt-btn--primary")
public WebElement toshoppingcard;

    @FindBy(className = "submit-button-text")
    public WebElement toPay;
    @FindBy(id = "country_id2-select")
    public WebElement Land;

    @FindBy(id="name36")
    public WebElement name;
    Select select2=new Select(Land);
    Actions actions2=new Actions(Driver.getDriver());
    public void bilgileriDoldur(){
        toshoppingcard.click();
        toPay.click();

        select2.selectByIndex(10);
        name.click();
        actions2.sendKeys(ConfigReader.getProperty("name"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("postcode"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .click()
                .perform();



    }


}
