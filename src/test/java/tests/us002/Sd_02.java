package tests.us002;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Sd_02 extends TestBase {

    //2-Log in sayfasindaki username textbox'i gorunur ve deger girilebilir olmali

    //1-Kullanici Concort Hotel sayfasina gider.
    //2-Sag ustteki log in butonuna tiklar.
    //3-Log in sayfasindaki username textbox'ini gorur
    //4-Username textbox'ina bilgisini girer.

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.anaSayfaLoginButonu.click();
        qaConcortPage.userName.isDisplayed();

        qaConcortPage.userName.click();
        qaConcortPage.userName.sendKeys(ConfigReader.getProperty("CHValidUsername"));






    }
}
