package tests.us001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Sd_01  {
    /*
    "1- Concort Hotel yazisi (anasayfa yonlendirme),Home,Rooms,
        Restaurant,About,Blog,Contact,
        Log in buttonlar gorunur,tiklanabilir
        ve ilgili yere yonlendirebillir olmali"
    */

    // 1) Kullanici Concort Hotel sayfasina gider.
    // 2) Sayfanin ust kisminda bulunan butonlar gorunur durumdadir.
    // 3) Istenilen butona tiklanildiginda ilgili yere yonlendirir.

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.gelismisButonu.click();
        qaConcortPage.gelismisLink.click();

        qaConcortPage.anasayfaHome.click();
        Assert.assertTrue(qaConcortPage.anasayfaHome.isDisplayed());
        qaConcortPage.anasayfaRooms.click();
        Assert.assertTrue(qaConcortPage.anasayfaRooms.isDisplayed());
        qaConcortPage.anasayfaRestourant.click();
        Assert.assertTrue(qaConcortPage.anasayfaRestourant.isDisplayed());
        qaConcortPage.anasayfaAbout.click();
        Assert.assertTrue(qaConcortPage.anasayfaAbout.isDisplayed());
        qaConcortPage.anasayfaBlog.click();
        Assert.assertTrue(qaConcortPage.anasayfaBlog.isDisplayed());
        qaConcortPage.anasayfaContact.click();
        Assert.assertTrue(qaConcortPage.anasayfaContact.isDisplayed());
        qaConcortPage.anasayfaLogin.click();
        Assert.assertTrue(qaConcortPage.anasayfaLogin.isDisplayed());

        Driver.closeDriver();


    }

}
