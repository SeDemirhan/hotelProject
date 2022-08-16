package tests.us001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Sd_03 extends TestBase {



    /*
    "3- Welcome To Our Hotel kismi gorunur olmali ve
         Our Rooms bolumu tiklanabilir ve gorunur olmali."
    */

    // 1) Ekranin sol ust kisminda bulunan Concort Hotel yazisina tiklanip ana sayfaya geri gelinir.
    // 2) Ana sayfada asagiya inilir ve "Welcome To Our Hotel" yazisi gorunur.
    // 3) "Welcome To Our Hotel" yazisinin sol altinda sosyal medya ikonlari tiklanip test edilir.
    // 4) Ana sayfada asagiya inilmeye devam edilir ve "Our Rooms" yazisi gorunur.
    // 5) "Our Rooms" yazisi altindaki odalar tiklanir ve test  edilir.

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.CHGelişmişGiris();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();


            Thread.sleep(2000);


        Assert.assertTrue(qaConcortPage.WelcomeToOurHotelYazisi.isDisplayed(),"yazı görünmüyor");

        qaConcortPage.facebookIkonu.click();
        qaConcortPage.gmailIkonu.click();
        qaConcortPage.instagramIkonu.click();

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);

        Assert.assertTrue(qaConcortPage.ourRoomsYazisi.isDisplayed(),"our room yazı görünmüyor");

        qaConcortPage.ChrisDaughertyRooms.click();
        Assert.assertTrue(qaConcortPage.ilkOdaGirisBasligi.isDisplayed());



    }

}
