package tests.us001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Sd_02  {

     /*
    "2-Rezervasyon kutulari gorunur,guncel,etkin olmali ve
        Check availability butonu tiklanabilir olmali"
    */

    // 1) Ekranin sol ust kisminda bulunan Concort Hotel yazisina tiklanip ana sayfaya geri gelinir.
    // 2) Sayfanin ortasinda bulunan rezervasyon kutulari gorunur durumdadir.
    // 3) Rezervasyon kutularinda gerekli bilgiler girilir.
    // 4) "Check availability " butonuna tiklanir  ve Rooms sayfasina yonlendirilir.

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));


        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.gelismisButonu.click();
        qaConcortPage.gelismisLink.click();

        qaConcortPage.AnaSayfaConcortHotelYazisi.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        qaConcortPage.CheckInDateYazisi.click();
        qaConcortPage.checkOutDateYazisi.click();

        Select select=new Select(qaConcortPage.roomTypeDropDown);
        select.selectByValue("7");

        Select select1=new Select(qaConcortPage.adultsDropDown);
        select1.selectByValue("5");

        qaConcortPage.checkAvailability.click();
        Assert.assertTrue(qaConcortPage.roomsBasligi.isDisplayed());

Driver.closeDriver();

    }
}
