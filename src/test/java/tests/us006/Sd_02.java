package tests.us006;

import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_02 {

    //"Add Hotel Room" butonu gorulur, tiklanabilir ve dogru sayfaya yönlendirebiliyor olmali

    //1. "Add Hotel Room" butonuna tiklar

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        Thread.sleep(2000);
        qaConcortPage.hotelRoomsSekmesi.click();
        qaConcortPage.addHotelRoomSekmesi.isDisplayed();
        qaConcortPage.addHotelRoomSekmesi.click();
    }
}
