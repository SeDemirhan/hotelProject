package tests.us006;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Sd_04 {

    //"Price" textboxuna sayfada verilen
    // tum fiyat kutulari drag and drop yapilabilmeli (200, 300, 400, 500, 600, 700)

    //1. "200" yazili fiyat kutusuna "Price" textboxuna drag and drop yapar.
    // 2. "300" yazili fiyat kutusuna "Price" textboxuna drag and drop yapar.
    // 3. "400" yazili fiyat kutusuna "Price" textboxuna drag and drop yapar.
    //4. "500" yazili fiyat kutusuna "Price" textboxuna drag and drop yapar.
    //5. "600" yazili fiyat kutusuna "Price" textboxuna drag and drop yapar.
    //6. "700" yazili fiyat kutusuna "Price" textboxuna drag and drop yapar.

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        Thread.sleep(2000);
        qaConcortPage.hotelRoomsSekmesi.click();
        qaConcortPage.addHotelRoomSekmesi.isDisplayed();
        qaConcortPage.addHotelRoomSekmesi.click();

        Thread.sleep(3000);
        ReusableMethods.scrollInToWiew(qaConcortPage.hotelRoomPrice);

        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(qaConcortPage.hotelRoomPrice200, qaConcortPage.hotelRoomPrice).perform();
        qaConcortPage.hotelRoomPrice.clear();

        actions.dragAndDrop(qaConcortPage.hotelRoomPrice300, qaConcortPage.hotelRoomPrice).perform();
        qaConcortPage.hotelRoomPrice.clear();

        actions.dragAndDrop(qaConcortPage.hotelRoomPrice400, qaConcortPage.hotelRoomPrice).perform();
        qaConcortPage.hotelRoomPrice.clear();

        actions.dragAndDrop(qaConcortPage.hotelRoomPrice500, qaConcortPage.hotelRoomPrice).perform();
        qaConcortPage.hotelRoomPrice.clear();

        actions.dragAndDrop(qaConcortPage.hotelRoomPrice600, qaConcortPage.hotelRoomPrice).perform();
        qaConcortPage.hotelRoomPrice.clear();

        actions.dragAndDrop(qaConcortPage.hotelRoomPrice700, qaConcortPage.hotelRoomPrice).perform();
        qaConcortPage.hotelRoomPrice.clear();

    }


}
