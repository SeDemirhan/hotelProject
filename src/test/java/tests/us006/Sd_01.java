package tests.us006;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_01 {
    //"Hotel Rooms" yazisi gorulur ve tiklanabilir olmali

    //1. Yönetici olarak giris yaptigi hesaptan "Hotel Management" dropdown menüsüne tiklar.
    //2. Menüde acilan seceneklerden "Hotel Rooms" linkine tiklar

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        Thread.sleep(2000);
        qaConcortPage.hotelRoomsSekmesi.click();
    }
}