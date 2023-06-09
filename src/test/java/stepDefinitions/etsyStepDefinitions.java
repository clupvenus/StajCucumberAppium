package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class etsyStepDefinitions {
    Pages pages=new Pages();

    @Given("Kullanici etsy sayfasina gider.")
    public void kullanici_etsy_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @Given("Cookies i kabul eder.")
    public void cookies_i_kabul_eder() {
        pages.cookies.click();
    }

    @Given("Kullanici dogru bilgilerle giris yapar.")
    public void kullanici_dogru_bilgilerle_giris_yapar() {
        pages.inLogin();
    }


    @Given("Kullanici istedigi bir urunun {string} arama kutusuna yazar ve aratir.")
    public void kullanici_istedigi_bir_urunun_arama_kutusuna_yazar_ve_aratir(String arama) {
        ReusableMethods.wait(3);
        pages.aramaKutusu.sendKeys(arama+ Keys.ENTER);


    }
    @Given("Cikan sonuclardan ilkine tiklar.")
    public void cikan_sonuclardan_ilkine_tiklar() {
        ReusableMethods.wait(2);
        pages.ilkUrun.click();
    }
    @Given("Urunu sepete ekler.")
    public void urunu_sepete_ekler() {
        pages.urunuSepeteAt();

    }
    @Given("Odeme sayfasina gider ve bilgilerini doldurur.")
    public void odeme_sayfasina_gider_ve_bilgilerini_doldurur() {
        pages.bilgileriDoldur();
    }
    @Given("Browseri kapatir.")
    public void browseri_kapatir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
