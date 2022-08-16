package tests.us005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

import java.util.Set;

public class Sd_02 {

    //2 - Tabloda bulunan "Details" Butonunun gorulebilir ve tiklanabilir olmasi gerekir,
    // Acilacak olan sayfada ise
    // "Edit Hotel" yazisi gorunmeli,"General Data","Photos","Properties" sekmeleri bulunmali


    //1-Kullanici Concort Hotel (Admin) sayfasina gider.
    //2-Sag ustte log in butonunu tiklar ardindan Username ve Sifre girilmeli
    //3-Acilan sayfada sol menuden "System Management" menusunun altindaki "Hotel Management" sekmesine  tiklar
    //4-Ardindan "Hotel List" secegine tiklar.
    //5-"LIST OF HOTELS" tablosunda bulunan "DETAILS"  butonu gorulmeli ardindan tiklanmali
    //6-"Edit Hotel" basliginin altinda "General Data", "Photos", "Properties" bolumleri bulunmali ve tiklanabilir olmali
    //7-Acilacak "Edit Hotel" sayfasinda "Hotel Data" bolumu bulunmali

    @Test
    public void test() throws InterruptedException {

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        qaConcortPage.hotelListSekmesi.click();
        Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.detailsButonu.isDisplayed());
        qaConcortPage.detailsButonu.click();
        Thread.sleep(3000);

        String ilkHandle= Driver.getDriver().getWindowHandle();
        Set<String>set=Driver.getDriver().getWindowHandles();
        String ikinciHandle="";

        for (String w:set
             ) {
            if (!w.equals(ilkHandle)){
                ikinciHandle=w;
            }

        }
        Driver.getDriver().switchTo().window(ikinciHandle);


        Assert.assertTrue(qaConcortPage.genaralDataButonu.isDisplayed());
        Assert.assertTrue(qaConcortPage.genaralDataButonu.isEnabled());
        Assert.assertTrue(qaConcortPage.photosButonu.isDisplayed());
        Assert.assertTrue(qaConcortPage.photosButonu.isEnabled());
        Assert.assertTrue(qaConcortPage.propertiesButonu.isDisplayed());
        Assert.assertTrue(qaConcortPage.propertiesButonu.isEnabled());

        Assert.assertTrue(qaConcortPage.editHotelYazisi.isDisplayed());
        Assert.assertTrue(qaConcortPage.genaralDataButonu.isEnabled());
        Assert.assertTrue(qaConcortPage.hotelDataYazisi.isDisplayed());
        Assert.assertTrue(qaConcortPage.hotelDataYazisi.isEnabled());


    }





}
