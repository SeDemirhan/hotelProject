package tests.us005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class Sd_05 {
    //5- "General Data" kisminda "Delete Hotel" yazisinin gorulebilir ve "Delete"  butonu tiklanilabilir olmali
    // ardindan"Hotel successfully deleted" yazisi gorunmeli ve "ok" butonuna tiklanilabilmeli

    //1-Kullanici Concort Hotel (Admin) sayfasina gider.
    //2-Sag ustte log in butonunu tiklar ardindan Username ve Sifre girilmeli
    //3-Acilan sayfada sol menuden "System Management" menusunun altindaki "Hotel Management" sekmesine  tiklar
    //4-Ardindan "Hotel List" secegine tiklar.
    //5-"LIST OF HOTELS" tablosunda bulunan "DETAILS"  butonu gorulmeli ardindan tiklanmali
    //6-Tekrar "DETAILS" kisminda "General Data" bolumune gidilir
    //7-"Delete Hotel" Kisminda "DELETE" butonu gorunur olmali
    //8-"DELETE' butonuna tiklanilmali
    //9-"Hotel successfully deleted" yazisi gorunmeli ve ardindan "OK" butonuna basilmali

    @Test
    public void test() throws InterruptedException {

        QAConcortPage qaConcortPage = new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        qaConcortPage.hotelListSekmesi.click();
        Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.detailsButonu.isDisplayed());
        qaConcortPage.detailsButonu.click();
        Thread.sleep(3000);

        String ilkHandle = Driver.getDriver().getWindowHandle();
        Set<String> set = Driver.getDriver().getWindowHandles();
        String ikinciHandle = "";

        for (String w : set
        ) {
            if (!w.equals(ilkHandle)) {
                ikinciHandle = w;
            }

        }
        Driver.getDriver().switchTo().window(ikinciHandle);

        ReusableMethods.scrollDown();

        Assert.assertTrue(qaConcortPage.editHotelDeleteButonu.isDisplayed());
        qaConcortPage.editHotelDeleteButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.WouldyouliketocontinueYazisi.isDisplayed());
        qaConcortPage.WouldyouliketocontinueOkButonu.click();

        Assert.assertTrue(qaConcortPage.HotelsuccessfullydeletedYazisi.isDisplayed());
        qaConcortPage.HotelsuccessfullydeletedOkButonu.click();

    }
}