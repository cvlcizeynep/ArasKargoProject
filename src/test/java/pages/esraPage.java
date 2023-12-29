package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class esraPage {
    public esraPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@href='/musteri-iliskileri'])[1]")
    public WebElement musteriIliskileriButonu;

    @FindBy(xpath = "(//a[@href=\"/musteri-iliskileri/geri-bildirim-formu\"])[1]")
    public WebElement musteriIliskileriBildirimFormu;

    @FindBy(xpath = "//*[@class='popup-close']")
    public static WebElement bilgilendirmeYazisi;

    @FindBy(xpath = "//*[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c84697453-3 ng-star-inserted\"]")
    public WebElement kategoriSecme;

    @FindBy(xpath = "(//*[@class=\"mat-option-text\"])[1]")
    public WebElement bilgiButonu;

    @FindBy(xpath = "(//*[@class=\"mat-option-text\"])[2]")
    public WebElement islemTalep;

    @FindBy(xpath = "(//*[@class=\"mat-option-text\"])[3]")
    public WebElement oneriButonu;

    @FindBy(xpath = "(//*[@class=\"mat-option-text\"])[4]")
    public WebElement sikayetButonu;

    @FindBy(xpath = "(//*[@class=\"mat-option-text\"])[5]")
    public WebElement tesekkurButonu;
    @FindBy(xpath = "//*[@id=\"mat-select-value-1\"]")
    public WebElement butonDogrulama;


}