package stepDefinitions;

import ArasKargoTeam2.pages.US02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_10 {
    US02 page = new US02();

    @When("Sayfanın header kısmındaki Kariyer linkine hover yapar")
    public void sayfanınHeaderKısmındakiKariyerLinkineHoverYapar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.kariyerLink).perform();
        ReusableMethods.bekle(2);
    }

    @And("Acılan dropdown menuden Gelecegin Bizde Onem Tasir linkine tıklar")
    public void acılanDropdownMenudenGeleceginBizdeOnemTasirLinkineTıklar() {
        ReusableMethods.click(page.gelecekLink);
        ReusableMethods.bekle(1);

    }

    @Then("Aras Kargo İsbasvurulari basligi altındaki butonların tıklanabilir oldugunu dogrular")
    public void arasKargoİsbasvurulariBasligiAltındakiButonlarınTıklanabilirOldugunuDogrular() {
        Assert.assertTrue(page.linkedinLink.isDisplayed() && page.linkedinLink.isEnabled());
        Assert.assertTrue(page.kariyerLinkMKdds.isDisplayed() && page.kariyerLinkMKdds.isEnabled());
        Assert.assertTrue(page.secretLink.isDisplayed() && page.secretLink.isEnabled());
        Assert.assertTrue(page.elemanLink.isDisplayed() && page.elemanLink.isEnabled());

        Driver.closeDriver();
    }
}
