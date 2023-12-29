package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Page_US06;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Optional;

public class US06 {
    Page_US06 page_us06 = new Page_US06();

    Actions actions = new Actions(Driver.getDriver());

    @When("Kullanici ekrandaki ucreti hesapla butonuna tiklar")
    public void kullaniciEkrandakiUcretiHesaplaButonunaTiklar() {
        ReusableMethods.click(page_us06.ucreti_hesapla_button);
    }

    @Then("Kullanici acilan sayfada yurtdisi sekmesine tiklar.")
    public void kullaniciAcilanSayfadaYurtdisiSekmesineTiklar() {

        ReusableMethods.click(page_us06.yurtdisi_button);
    }

    @Then("Kullanici nereye\\(ülke) dropdownına tiklar ve random bir ülke secer.")
    public void kullaniciNereyeÜlkeDropdownınaTiklarVeRandomBirÜlkeSecer() {
        ReusableMethods.click(page_us06.nereye_button);
        //ReusableMethods.selectRandomTextFromDropdown(page_us06.nereye_button,);
        //**************************      dropdown & random class
    }



    @And("Kullanici gönderi detayından toplam ücretin görüntülendigini dogrular.")
    public void kullaniciGönderiDetayındanToplamÜcretinGörüntülendiginiDogrular() {
       page_us06.toplam_ucret.isEnabled();
    }



    @And("Kullanici Ağırlık , yükseklik , boy , en bilgilerini girer")
    public void kullaniciAğırlıkYükseklikBoyEnBilgileriniGirer() {
       // actions.sendKeys("1").sendKeys(Keys.TAB).sendKeys("3").sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2").perform();
    }

    @And("Kullanici  Desi Kg Hesapla butonuna tiklar.")
    public void kullaniciDesiKgHesaplaButonunaTiklar() {
        ReusableMethods.click(page_us06.desi_hesapla);
    }

    @And("Kullanici  Yeni Hesaplama Yap butonuna tiklar")
    public void kullaniciYeniHesaplamaYapButonunaTiklar() {
        ReusableMethods.click(page_us06.yenihesaplamayap_text);
    }

    @And("Kullanici ilgili sayfada oldugunu dogrular")
    public void kullaniciIlgiliSayfadaOldugunuDogrular() {
        Assert.assertEquals("Teslim süreleri ve ücret hesaplama",page_us06.ucrethesaplama_text);
    }

    @And("Kullanici  Gonderi Detayindan ucret goruntulendigini doğrular")
    public void kullaniciGonderiDetayindanUcretGoruntulendiginiDoğrular() {
        Assert.assertTrue(page_us06.toplam_ucret.isDisplayed());
    }

    @And("Kullanici   AĞIRLIK olarak invalid deger, yükseklik, en ve boy olarak valid degerler girer")
    public void kullaniciAĞIRLIKOlarakInvalidDegerYükseklikEnVeBoyOlarakValidDegerlerGirer() {
        //actions.sendKeys(page_us06.agirlik_input)
    }

    @And("Kullanici   Desi Kg Hesapla butonuna tiklanır")
    public void kullaniciDesiKgHesaplaButonunaTiklanır() {
        ReusableMethods.click(page_us06.desi_hesapla);
    }


    @And("Kullanici   agırlık, yükseklik, en ve boy olarak invalid degerler girer")
    public void kullaniciAgırlıkYükseklikEnVeBoyOlarakInvalidDegerlerGirer() {
    }

    @And("Kullanici   agırlık olarak valid, yükseklik, en ve boy olarak invalid degerler girer")
    public void kullaniciAgırlıkOlarakValidYükseklikEnVeBoyOlarakInvalidDegerlerGirer() {
    }


    @And("Kullanici dosya\\/evrak tiklar ve hizmet turunu secer.")
    public void kullaniciDosyaEvrakTiklarVeHizmetTurunuSecer() {
        ReusableMethods.click(page_us06.dosya_evrak_button);
    }

    @And("Kullanici kutu\\/koli tiklar ve hizmet turunu secer.")
    public void kullaniciKutuKoliTiklarVeHizmetTurunuSecer() {
        ReusableMethods.click(page_us06.kutu_koli_button);
    }

    @Given("Kullanici aras kargo sayfasına gider.")
    public void kullaniciArasKargoSayfasınaGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(10);
        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-default[@class='efilli-layout-default']")).getShadowRoot();
        WebElement rejectButton = searchContext.findElement(By.className("banner__accept-button"));
        ReusableMethods.click(rejectButton);
    }
}
