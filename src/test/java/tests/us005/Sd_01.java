package tests.us005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_01 {

    //1- "System Management" Menusunun icerisinde "Hotel List" sekmesi gorunmeli ,
    // tiklanilabilmeli ve acilan sayfada "LIST OF HOTELS" table'i gorunmeli

    //1-Kullanici Concort Hotel (Admin) sayfasina gider.
    //2-Sag ustte log in butonunu tiklar ardindan Username ve Sifre girilmeli
    //3-Acilan sayfada sol menuden "System Management" menusunun altindaki "Hotel Management" sekmesine  tiklar
    //4-Ardindan "Hotel List" secegine tiklar.
    // 5-Acilan sayfada "LIST OF HOTELS" yazisi gorunmeli

    @Test
    public void test() throws InterruptedException {

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        qaConcortPage.hotelListSekmesi.click();
        Thread.sleep(3000);
        Assert.assertTrue(qaConcortPage.listOfHotelYazisi.isDisplayed());

    }


}
