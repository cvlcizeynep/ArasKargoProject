package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import pages.Pages0413;
import pages.US07;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US07_StepDef {

    Pages0413 us0413;
    US07 us07;


String expectedTitle=Driver.driver.getTitle();

    @Given("Kullanici urle gider")
    public void kullanici_urle_gider() throws InterruptedException {
        us0413=new Pages0413();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);
        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-default[@class='efilli-layout-default']")).getShadowRoot();
        WebElement hepsiniKabulEt = searchContext.findElement(By.className("banner__accept-button"));
        hepsiniKabulEt.click();
        Driver.getDriver().findElement(By.xpath("//div[@class='popup-close']")).click();


    }
    @When("Acilan sayfada alertler varsa kapatir")
    public void acilan_sayfada_alertler_varsa_kapatir() {

    }
    @When("Sayfada sol asagi kisinda bulunan en yakin subeler butonuna tiklar")
    public void sayfada_sol_asagi_kisinda_bulunan_en_yakin_subeler_butonuna_tiklar() {
        us07 =new US07();
        us07.enyakinSube.click();
        ReusableMethods.waitFor(2);


    }
    @Then("En yakin subeler butonunun tiklanabilir oldugunu dogrular")
    public void en_yakin_subeler_butonunun_tiklanabilir_oldugunu_dogrular() {
        us07 =new US07();
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }


    @When("Arama islemi seciniz okuna tiklar")
    public void arama_islemi_seciniz_okuna_tiklar() {
        us07 =new US07();
        us07.searchBox.click();



    }
    @When("Acilan dropdowndan subelerimizi secer")
    public void acilan_dropdowndan_subelerimizi_secer() {
        us07=new US07();
        us07.subelerimiz.click();

    }
    @When("Konumla buldan arama yapar")
    public void konumla_buldan_arama_yapar() {
        us07=new US07();
        us07.konum.click();

    }
    @Then("Kulanici konumuna en yakin subelerin listelendigini dogrular")
    public void kulanici_konumuna_en_yakin_subelerin_listelendigini_dogrular() {
        us07=new US07();
        assert us07.konumSonuc.isDisplayed();

    }
    @When("Il ilce seceneklerinden secim yaparak arama yapar")
    public void ıl_ilce_seceneklerinden_secim_yaparak_arama_yapar() {
        us07=new US07();
        us07.ilIlce.sendKeys("Ankara");
        us07.adresGir.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.click(us07.ara);

    }
    @Then("Secilen il ilceye gore listelenme yapildigini dogrular")
    public void secilen_il_ilceye_gore_listelenme_yapildigini_dogrular() {
        us07=new US07();
        assert us07.konumSonuc.isDisplayed();

    }

    @When("Acilan dropdowndan Aras burasi secenegini tiklar")
    public void acilan_dropdowndan_aras_burasi_secenegini_tiklar() {
        us07=new US07();
        us07.arasBurasi.click();

    }
    @When("Esnaf modunu secili hale getirir")
    public void esnaf_modunu_secili_hale_getirir() {
        us07=new US07();
        us07.esnaf.click();
    }
    @When("Konumla aramayi secerek arama yapar")
    public void konumla_aramayi_secerek_arama_yapar() {
        us07=new US07();
        us07.konum.click();

    }
    @Then("Kullanici kendine en yakin Aras Burasi noktalarinin listelendigini dogrular")
    public void kullanici_kendine_en_yakin_aras_burasi_noktalarinin_listelendigini_dogrular() {
        us07=new US07();
        assert us07.konumSonuc.isDisplayed();

    }

    @Then("Kullanici sectigi il ilceye gore Aras Burasi noktalarinin listelendigini dogrular")
    public void kullanici_sectigi_il_ilceye_gore_aras_burasi_noktalarinin_listelendigini_dogrular() {
        us07=new US07();
        us07.ilIlce.sendKeys("Kars");
        us07.adres2.click();
        ReusableMethods.waitFor(2);
    }


        @When("Dolap modunu secili hale getirir")
        public void dolap_modunu_secili_hale_getirir () {
            us07=new US07();
            us07.dolap.click();


        }










    }