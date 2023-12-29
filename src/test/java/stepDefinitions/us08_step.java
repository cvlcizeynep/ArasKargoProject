package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.esraPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.chrome.ChromeDriver;

import static utilities.BrowserUtilities.scrollToElement;
import static utilities.Driver.driver;

public class us08_step {
    esraPage us08 = new esraPage();


    @Given("Kullanici aras kargo sayfa url'sine gider")
    public void kullaniciArasKargoSayfaUrlSineGider()throws InterruptedException{
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
    }
    @When("Kullanici ekrandaki bilgilendirme yazisini kapatir")
    public void kullaniciEkrandakiBilgilendirmeYazisiniKapatir()  {
        if (us08.bilgilendirmeYazisi.isDisplayed()) {
            ReusableMethods.click(us08.bilgilendirmeYazisi);
            ReusableMethods.waitFor(2);


        }
    }
        @Then("Kullanici musteri iliskileri sekmesine gelir ve acilan drop down'dan geri bildirim formuna tiklar")
        public void kullaniciMusteriIliskileriSekmesineGelirVeAcilanDropDownDanGeriBildirimFormunaTiklar () {
            Actions actions = new Actions(driver);
            actions.moveToElement(us08.musteriIliskileriButonu).perform();
            ReusableMethods.waitFor(2);

            us08.musteriIliskileriBildirimFormu.click();
            ReusableMethods.waitFor(3);


        }

        @Then("Kullanici bireysel hizmetler alaninda kategori sekmesini tiklar")
        public void kullaniciBireyselHizmetlerAlanindaKategoriSekmesiniTiklar () {

            ReusableMethods.click(us08.kategoriSecme);
            ReusableMethods.waitFor(2);

        }

        //tc01
        @And("Kullanici bilgi butonunu tiklar ve kullanilabildigini dogrular")
        public void kullaniciBilgiButonunuTiklarVeKullanilabildiginiDogrular () {
            ReusableMethods.click(us08.bilgiButonu);
            ReusableMethods.waitFor(3);
            Assert.assertTrue(us08.butonDogrulama.isDisplayed());
            ReusableMethods.waitFor(3);
        }

        //tc02
        @And("Kullanici islem-talep butonunu tiklar ve kullanilabildigini dogrular")
        public void kullaniciIslemTalepButonunuTiklarVeKullanilabildiginiDogrular () {
            ReusableMethods.click(us08.islemTalep);
            ReusableMethods.waitFor(3);
            Assert.assertTrue(us08.butonDogrulama.isDisplayed());
            ReusableMethods.waitFor(3);
        }

        //tc03
        @And("Kullanici oneri butonunu tiklar ve kullanilabildigini dogrular")
        public void kullaniciOneriButonunuTiklarVeKullanilabildiginiDogrular () {
            ReusableMethods.click(us08.oneriButonu);
            ReusableMethods.waitFor(3);
            Assert.assertTrue(us08.butonDogrulama.isDisplayed());
            ReusableMethods.waitFor(3);


        }

        //tc04
        @And("Kullanici sikayet-problem butonunu tiklar ve kullanilabildigini dogrular")
        public void kullaniciSikayetProblemButonunuTiklarVeKullanilabildiginiDogrular () {

            ReusableMethods.click(us08.sikayetButonu);
            ReusableMethods.waitFor(3);
            Assert.assertTrue(us08.butonDogrulama.isDisplayed());
            ReusableMethods.waitFor(3);


        }

        //tc05
        @And("Kullanici tesekkurler butonunu tiklar ve kullanilabildigini dogrular")
        public void kullaniciTesekkurlerButonunuTiklarVeKullanilabildiginiDogrular () {
            ReusableMethods.click(us08.tesekkurButonu);
            ReusableMethods.waitFor(3);
            Assert.assertTrue(us08.butonDogrulama.isDisplayed());
            ReusableMethods.waitFor(3);


        }

    }
