package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import pages.Pages0413;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04_13StepDefinitions {

    Pages0413 us0413;

    @Given("Kullanici gecerli Web Sayfasina Gider")
    public void kullanici_gecerli_web_sayfasina_gider() throws InterruptedException {
        us0413=new Pages0413();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);
        SearchContext searchContext = Driver.getDriver().findElement(By.xpath("//efilli-layout-default[@class='efilli-layout-default']")).getShadowRoot();
        WebElement hepsiniKabulEt = searchContext.findElement(By.className("banner__accept-button"));
        hepsiniKabulEt.click();
        Driver.getDriver().findElement(By.xpath("//div[@class='popup-close']")).click();
    }

    @Given("Kullanici Surdurulebilirlik Tiklar")
    public void kullanici_surdurulebilirlik_tiklar() {
        us0413=new Pages0413();
        us0413.SurdurebilirlikButton.click();
    }
    @Given("Kullanici Kalite Yonetim Sistemi Tiklar")
    public void kullanici_kalite_yonetim_sistemi_tiklar() {
        us0413=new Pages0413();
        us0413.KaliteYonetimSistemiButton.click();

    }

    //TC01 Kullanici Kalite Yonetim SistemiBilgi Guvenligi Yonetim Sistemi  Ulasabilmeli
    @Given("Kullanici Mukemmellikte Kararlılık Tiklar")
    public void kullanici_mukemmellikte_kararlılık_tiklar() {
        us0413=new Pages0413();
        us0413.MukemmellikteKaralilikButton.click();
    }
    @Given("Kullanici Mükemmellikte Belgesini Dogrular")
    public void kullanici_mükemmellikte_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());
    }

    // TC02 Kullanici Kalite Yonetim Sistemi Hizmet Yeterlilik Ulasabilmeli
    @Given("Kullanici Hizmet Yeterlilik BelgesiTiklar")
    public void kullanici_hizmet_yeterlilik_belgesi_tiklar() {
        us0413.HizmetYeterlilikBelgesiButton.click();
    }
    @Then("Kullanici Hizmet Yeterlilik Belgesi Belgesini Dogrular")
    public void kullanici_hizmet_yeterlilik_belgesi_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());

    }
    //TC03 Kullanici Kalite Yönetim Sistemi Türkiye Mukemmellik Odulu Ulasabilmeli
    @Given("Kullanici Türkiye Mukemmellik Odulu Tiklar")
    public void kullanici_türkiye_mukemmellik_odulu_tiklar() {
        us0413.TurkiyeMukemmellikOduluBelgeButton.click();
    }
    @Then("Kullanici Türkiye Mükemmellik Odulu Belgesini Dogrular")
    public void kullanici_türkiye_mükemmellik_odulu_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());

    }
    //TC04 Kullanici Kalite Yonetim Sistemi Bilgi Guvenlıgı Yonetim Sistemi Belgesi Ulasabilmeli
    @Given("Kullanici Bilgi Guvenlıgı Yonetim Sistemi Belgesi Tiklar")
    public void kullanici_bilgi_guvenlıgı_yonetim_sistemi_belgesi_tiklar() {
        us0413.BilgiGüvenligiYonetimSistemiBelgesiButton.click();
    }
    @Then("Kullanici Bilgi Guvenlıgı Yonetim Sistemi Belgesi Dogrular")
    public void kullanici_bilgi_guvenlıgı_yonetim_sistemi_belgesi_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());

    }
    // TC05 Kullanici Kalite Yonetim Sistemi Mükemmellikte Yetkinlik uc Yıldız Ulaşabilmeli
    @Given("Kullanici Mükemmellikte Yetkinlik uc Yıldız Tiklar")
    public void kullanici_mükemmellikte_yetkinlik_uc_yıldız_tiklar() {
        us0413.MukemmellikteYetkinlik3YıldızBelgesiButton.click();
    }
    @Then("Kullanici Mükemmellikte Yetkinlik uc Yıldız Belgesini Dogrular")
    public void kullanici_mükemmellikte_yetkinlik_uc_yıldız_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());
    }

    // TC06 Kullanici Kalite Yonetim Sistemi Mükemmellikte Yetkinlik fort Yıldız Ulaşabilmeli
    @Given("Kullanici Mükemmellikte Yetkinlik dort Yıldız Tiklar")
    public void kullanici_mükemmellikte_yetkinlik_dort_yıldız_tiklar() {
        us0413.MukemmellikteYetkinlik4YıldızBelgesiButton.click();
    }
    @Then("Kullanici Mükemmellikte Yetkinlik dort Yıldız Belgesini Dogrular")
    public void kullanici_mükemmellikte_yetkinlik_dort_yıldız_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());
    }

    // TC07 Kullanici Kalite Yonetim Sistemi Mükemmellikte Yetkinlik bes Yıldız Ulaşabilmeli
    @Given("Kullanici Mükemmellikte Yetkinlik bes Yıldız Tiklar")
    public void kullanici_mükemmellikte_yetkinlik_bes_yıldız_tiklar() {
        us0413.MukemmellikteYetkinlik5YıldızBelgesiButton.click();
    }
    @Then("Kullanici Mükemmellikte Yetkinlik bes Yıldız Belgesini Dogrular")
    public void kullanici_mükemmellikte_yetkinlik_bes_yıldız_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());

    }

    // TC08 Kullanici Kalite Yonetim Sistemi Kalite Yönetim Sistemi Belgesi Ulaşabilmeli
    @Given("KullaniciKalite Yönetim Sistemi Belgesi Tiklar")
    public void kullanici_kalite_yönetim_sistemi_belgesi_tiklar() {
        us0413.KaliteYonetimSistemiBelgesiButton.click();

    }
    @Then("Kullanici Kalite Yönetim Sistemi  Belgesini Dogrular")
    public void kullanici_kalite_yönetim_sistemi_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());

    }

    //TC09 Kullanici Kalite Yonetim Sistemi Müşteri Memnuniyeti Yönetim Sistemi Belgesi Ulaşabilmeli
    @Given("Kullanici Müşteri Memnuniyeti Yönetim Sistemi Belgesi Tiklar")
    public void kullanici_müşteri_memnuniyeti_yönetim_sistemi_belgesi_tiklar() {
        us0413.MüşteriMemnuniyetiYönetimSistemiBelgesiButton.click();
    }
    @Then("Kullanici Müşteri Memnuniyeti Yönetim Sistemi Belgesini Dogrular")
    public void kullanici_müşteri_memnuniyeti_yönetim_sistemi_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());


    }

    //TC10 Kullanici Kalite Yonetim Sistemi Çevre Yönetim Sistemi Belgesi Ulaşabilmeli
    @Given("Kullanici Çevre Yönetim Sistemi Belgesi Tiklar")
    public void kullanici_çevre_yönetim_sistemi_belgesi_tiklar() {
        us0413.ÇevreYönetimSistemiBelgesiButton.click();

    }
    @Then("Kullanici Çevre Yönetim Sistemi  Belgesini Dogrular")
    public void kullanici_çevre_yönetim_sistemi_belgesini_dogrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());


    }

    //TC11 Kullanici Kalite Yonetim Sistemi İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi Ulaşabilmeli
    @Given("Kullanici İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi Tiklar")
    public void kullanici_i̇ş_sağlığı_ve_güvenliği_yönetim_sistemi_belgesi_tiklar() {
        us0413.İşSağlığıGüvenliğiYönetimSistemiBelgesiButton.click();

    }
    @Then("Kullanici İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi Doğrular")
    public void kullanici_i̇ş_sağlığı_ve_güvenliği_yönetim_sistemi_belgesi_doğrular() {
        ReusableMethods.ekranResmi();
        //Assert.assertTrue(us0413.MukBelgeFotu.isDisplayed());


    }
    @Then("Üyelik Girişini Tıklar")
    public void üyelik_girişini_tıklar() {
        us0413=new Pages0413();
        us0413.UyelikGirisButton.click();

    }
    @Then("Üyelik Girişini Doğrular")
    public void üyelik_girişini_doğrular() throws InterruptedException {
        us0413=new Pages0413();
        ReusableMethods.switchToWindow(1);
        Thread.sleep(3000);
        Assert.assertTrue(us0413.GirisDogrulama.isDisplayed());


    }

}



