package tests.us004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_03 {
    //3- Acilan table da "Add Hotel" butonunun tiklanabilir ve
    // tiklandiginda "Create Hotel" sayfasinin acildigi gorulmeli

    //1- Sag ustte bulunan add hotel butonuna tiklar
    //2- Create Hotel sayfasini gorebilir

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        Thread.sleep(3000);
        //qaConcortPage.SystemManagementSekmesi.click();

        qaConcortPage.HotelManagementSekmesi.click();
        qaConcortPage.hotelListSekmesi.click();

        qaConcortPage.addHotelButonu.click();
        Assert.assertTrue(qaConcortPage.createHotelYazisi.isDisplayed(),"Yazi gorunmuyor");
    }
}
