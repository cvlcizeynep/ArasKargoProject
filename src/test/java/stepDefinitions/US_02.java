package stepDefinitions;

import ArasKargoTeam2.pages.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02 {
    US02 page = new US02();
    @Given("Kullanici siteye gider")
    public void kullaniciSiteyeGider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        ReusableMethods.bekle(2);
        page.popClose.click();

    }

    @When("Sayfanın header kısmındaki Hizmetlerimiz linkine hover yapar")
    public void sayfanınHeaderKısmındakiHizmetlerimizLinkineHoverYapar() {
        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(page.hizmetlerimizLink).perform();
        ReusableMethods.bekle(1);

    }

    @And("Acılan dropdown menude  Ambalaj urunlerimiz linkine tıklar")
    public void acılanDropdownMenudeAmbalajUrunlerimizLinkineTıklar() {
        page.ambalajUrun.click();
        ReusableMethods.bekle(1);

    }

    @Then("Ambalaj fiyatları butonunun goruldugunu dogrular")
    public void ambalajFiyatlarıButonununGoruldugunuDogrular() {
        Assert.assertTrue(page.fiyatAmbalaj.isDisplayed());
        Driver.closeDriver();

    }
}
