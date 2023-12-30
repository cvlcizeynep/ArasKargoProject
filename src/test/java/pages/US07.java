package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07 {

    public US07() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popUpKapatma;
    @FindBy(xpath = "//span[contains(text(),'En Yakın Şubeler')]")
    public WebElement enyakinSube;
    @FindBy(css = ".mat-select-placeholder.mat-select-min-line.ng-tns-c84697453-19.ng-star-inserted")
    public WebElement searchBox;
    @FindBy(xpath = "//span[contains(text(),'Aras Burası Noktaları')]")
    public WebElement arasBurasi;
    @FindBy(xpath = "//span[contains(text(),'Şubelerimiz')]")
    public WebElement subelerimiz;
    @FindBy(xpath = "//img[@src='/assets/images/icons/esnaf.svg']")
    public WebElement esnaf;
    @FindBy(xpath = "//img[@src='/assets/images/icons/dolap.svg']")
    public WebElement dolap;
    @FindBy(css = "div[class='mt-4 pt-3 mapform__location'] mat-icon[role='img']")
    public WebElement konum;
    @FindBy(css = "#mat-input-6")
    public WebElement ilIlce;
    @FindBy(css = "button[class='small-btn mt-4']")
    public  WebElement ara;
    @FindBy(xpath = "//div[@class='results__header']")
    public WebElement konumSonuc;
    @FindBy (xpath = "//span[normalize-space()='Ankara - Akyurt']")
    public WebElement adresGir;
    @FindBy(xpath = "//span[normalize-space()='Kars - Merkez']")
    public WebElement adres2;














}
