package tests.us006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Sd_03 {
    //"""IDHotel"" ,""Code"" ,""Name"" ,""Location"" ,""Description"" ,""Price"",
    //""Room Type"" , ""Max Adult count"",""Max Children count"",""Approved""
    // bolumlerine istenen formatta bilgilerin girilerek otel odasi kaydi yapilabilmeli"

    // 1. "IDHotel" dropdown menüsüne tiklar ve acilan seceneklerden bir otel secer.
    // 2. "Code" texboxuna tiklayip gecerli bir sayi girer.
    //3. "Name" textboxuna tiklayip gecerli formatta bir oda ismi girer.
    //4. "Adres" textboxuna tiklayip gecerli formatta bir adres girer.
    //5. "Description" textboxuna tiklayip odaya iliskin gecerli bir aciklama girer.
    //6. "Price" textboxuna tiklayip gecerli formatta bir fiyat bilgisi girer.
    //7. "Room Type" dropdown menüsüne tiklar ve acilan seceneklerden bir oda tipini belirler.
    //8. "Max Adult Count" textboxuna tiklar ve gecerli formatta bir sayi girer.
    //9. "Max Children Count" textboxuna tiklar ve gecerli formatta bir sayi girer.
    //10. "Approved" kutusuna tiklar.
    //11. "Save" butonuna tiklar.

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        Thread.sleep(2000);
        qaConcortPage.hotelRoomsSekmesi.click();
        qaConcortPage.addHotelRoomSekmesi.isDisplayed();
        qaConcortPage.addHotelRoomSekmesi.click();
        //qaConcortPage.selectHotelDropDown.click();

        Select select=new Select(qaConcortPage.selectHotelDropDown);
        select.selectByIndex(11);


        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("34");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("Serdar");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("İstanbul");
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Naber").perform();
        Thread.sleep(3000);
        ReusableMethods.scrollInToWiew(qaConcortPage.hotelRoomPrice);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("200");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).perform();

        // qaConcortPage.roomTypeDropDown.click();

        Select select1=new Select(qaConcortPage.hotelRoomTypeDropDown);
        select1.selectByIndex(4);

        actions.sendKeys(Keys.TAB).
        sendKeys("scrollInToWiew").
                sendKeys(Keys.TAB).
        sendKeys("MaxChildCount").
                sendKeys(Keys.TAB).perform();
        qaConcortPage.hotelRoomIsAvailable.click();
        actions.sendKeys(Keys.TAB).perform();
        qaConcortPage.hotelRoomSaveButonu.click();
Thread.sleep(2000);
      Assert.assertTrue(qaConcortPage.FillAllFieldsPleaseYazisi.isDisplayed());
        qaConcortPage.FillAllFieldsPleaseOkButonu.click();





    }

}
