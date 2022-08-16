package tests.us002;

import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Sd_03 {

    //3-Log in sayfasindaki password textbox'i gorunur ve deger girilebilir olmali

    //1-Kullanici Concort Hotel sayfasina gider.
    //2-Sag ustteki log in butonuna tiklar.
    //3-Log in sayfasindaki password textbox'ini gorur
    //4-Password textbox'ina bilgisini girer.

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));

        QAConcortPage qaConcortPage = new QAConcortPage();
        qaConcortPage.anaSayfaLoginButonu.click();

        qaConcortPage.password.isDisplayed();

        qaConcortPage.password.click();
        qaConcortPage.password.sendKeys(ConfigReader.getProperty("CHValidPassword"));



    }
}