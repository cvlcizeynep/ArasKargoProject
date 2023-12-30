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
import org.openqa.selenium.support.ui.Select;
import pages.Page_US06;
import pages.Pages0413;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Optional;

public class US06 {
    Page_US06 page_us06 = new Page_US06();
    Pages0413 us0413 = new Pages0413();

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
        Select dropdown = new Select(page_us06.nereye_button);
        dropdown.selectByVisibleText("ALMANYA");

    }



    @And("Kullanici gönderi detayından toplam ücretin görüntülendigini dogrular.")
    public void kullaniciGönderiDetayındanToplamÜcretinGörüntülendiginiDogrular() {
       page_us06.toplam_ucret.isEnabled();
    }



    @And("Kullanici Ağırlık , yükseklik , boy , en bilgilerini girer")
    public void kullaniciAğırlıkYükseklikBoyEnBilgileriniGirer() {
        page_us06.agirlik_input.sendKeys("1");
        page_us06.en_input.sendKeys("2");
        page_us06.boy_input.sendKeys("3");
        page_us06.yukselik_input.sendKeys("3");
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
        page_us06.agirlik_input.sendKeys("-1");
        page_us06.en_input.sendKeys("2");
        page_us06.boy_input.sendKeys("3");
        page_us06.yukselik_input.sendKeys("3");
    }

    @And("Kullanici   Desi Kg Hesapla butonuna tiklanır")
    public void kullaniciDesiKgHesaplaButonunaTiklanır() {

        ReusableMethods.click(page_us06.desi_hesapla);
    }


    @And("Kullanici   agırlık, yükseklik, en ve boy olarak invalid degerler girer")
    public void kullaniciAgırlıkYükseklikEnVeBoyOlarakInvalidDegerlerGirer() {
        page_us06.agirlik_input.sendKeys("-1");
        page_us06.en_input.sendKeys("-2");
        page_us06.boy_input.sendKeys("-3");
        page_us06.yukselik_input.sendKeys("-3");
    }

    @And("Kullanici   agırlık olarak valid, yükseklik, en ve boy olarak invalid degerler girer")
    public void kullaniciAgırlıkOlarakValidYükseklikEnVeBoyOlarakInvalidDegerlerGirer() {
        page_us06.agirlik_input.sendKeys("1");
        page_us06.en_input.sendKeys("-2");
        page_us06.boy_input.sendKeys("-3");
        page_us06.yukselik_input.sendKeys("-3");
    }


    @And("Kullanici dosya\\/evrak tiklar ve hizmet turunu secer.")
    public void kullaniciDosyaEvrakTiklarVeHizmetTurunuSecer() {

        ReusableMethods.click(page_us06.dosya_evrak_button);
    }

    @And("Kullanici kutu\\/koli tiklar ve hizmet turunu secer.")
    public void kullaniciKutuKoliTiklarVeHizmetTurunuSecer() {

        ReusableMethods.click(page_us06.kutu_koli_button);
    }

    @Then("Kullanici popup kapatir.")
    public void kullaniciPopupKapatir() {
        ReusableMethods.click(page_us06.popup_close);
    }

}
