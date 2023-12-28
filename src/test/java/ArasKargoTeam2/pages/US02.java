package ArasKargoTeam2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02 {
    public US02() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li//a[text()='Hizmetlerimiz']")
    public WebElement hizmetlerimizLink;

    @FindBy(xpath = "//a[text()='Ambalaj Ürünlerimiz']")
    public WebElement ambalajUrun;

    @FindBy(css = "[title='Ambalaj fiyatları']")
    public WebElement fiyatAmbalaj;

    @FindBy(css = "div.popup-close")
    public WebElement popClose;

    @FindBy(xpath = "//li//a[text()='Kariyer']")
    public WebElement kariyerLink;

    @FindBy(xpath = "//a[text()='Geleceğin Bizde Önem Taşır']")
    public WebElement gelecekLink;
    @FindBy(css= "[title='LinkedIn']")
    public WebElement linkedinLink;

    @FindBy(css = "[title='Kariyer net logo']")
    public WebElement kariyerLinkMKdds;
    @FindBy(css = "[title='Secretcv logo']")
    public WebElement secretLink;

    @FindBy(css = "[title='Eleman net logo']")
    public WebElement elemanLink;
}
