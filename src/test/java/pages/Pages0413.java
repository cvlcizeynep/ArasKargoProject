package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Pages0413 {
    public Pages0413() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement SurdurebilirlikButton;

    @FindBy(xpath = "//*[text()='Kalite Yönetim Sistemi']")
    public WebElement KaliteYonetimSistemiButton;

    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement carpı;

    @FindBy(xpath = "//*[text()='Mükemmellikte Kararlılık']")
    public WebElement MukemmellikteKaralilikButton;
    @FindBy(xpath = "//*[@id=\"mat-dialog-6\"]/mat-dialog-content/swiper/div/div/img")
    public WebElement MukBelgeFotu;

    @FindBy(xpath = "//div[text()='Hizmet Yeterlilik Belgesi']")
    public WebElement HizmetYeterlilikBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement HizmetBelgeFotu;

    @FindBy(xpath = "//div[text()='Türkiye Mükemmellik Ödülü']")
    public WebElement TurkiyeMukemmellikOduluBelgeButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement TurkiyeMukemmellikFotu;

    @FindBy(xpath = "//div[text()='Bilgi Güvenliği Yönetim Sistemi Belgesi']")
    public WebElement BilgiGüvenligiYonetimSistemiBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement BilgiGüvenligiYonetimFotu;

    @FindBy(xpath = "//div[text()='Mükemmellikte Yetkinlik 3 Yıldız']")
    public WebElement MukemmellikteYetkinlik3YıldızBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement MukemmellikteYetkinlik3YildizFotu;

    @FindBy(xpath = "//div[text()='Mükemmellikte Yetkinlik 4 Yıldız']")
    public WebElement MukemmellikteYetkinlik4YıldızBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement MukemmellikteYetkinlik4YıldızFotu;

    @FindBy(xpath = "//div[text()='Mükemmellikte Yetkinlik 5 Yıldız']")
    public WebElement MukemmellikteYetkinlik5YıldızBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement MukemmellikteYetkinlik5YıldızForu;


    @FindBy(xpath = "//div[text()='Kalite Yönetim Sistemi Belgesi']")
    public WebElement KaliteYonetimSistemiBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement KaliteYonetimSistemiBelgesiFotu;

    @FindBy(xpath = "//div[text()='Müşteri Memnuniyeti Yönetim Sistemi Belgesi']")
    public WebElement MüşteriMemnuniyetiYönetimSistemiBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement MüşteriMemnuniyetiYönetimSistemiBelgesiFotu;


    @FindBy(xpath = "//div[text()='Çevre Yönetim Sistemi Belgesi']")
    public WebElement ÇevreYönetimSistemiBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement ÇevreYönetimSistemiBelgesiFotu;

    @FindBy(xpath = "//div[text()='İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi']")
    public WebElement İşSağlığıGüvenliğiYönetimSistemiBelgesiButton;
    @FindBy(xpath = "(//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement İşSağlığıGüvenliğiYönetiSistemiBelgesiFotu;

    @FindBy(xpath = "//span[text()='Üye Girişi']")
    public WebElement UyelikGirisButton;

    @FindBy(xpath = "//input[@id='ButtonLogin']")
    public WebElement GirisDogrulama;

    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement Textkutu;







}

