package tests.us004;

import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_02 {

    //2- Acilan sayfada "LIST OF HOTELS" table'i gorunmeli

    //1-Acilan sayfada sol menuden "System Management" menusunun altindaki "Hotel Management" sekmesine  tiklar
    //2-Ardindan "Hotel List" secegine tiklar.

    @Test
    public void test() throws InterruptedException {

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();
        Thread.sleep(3000);
        //qaConcortPage.SystemManagementSekmesi.click();

        qaConcortPage.HotelManagementSekmesi.click();
        qaConcortPage.hotelListSekmesi.click();

    }



}
