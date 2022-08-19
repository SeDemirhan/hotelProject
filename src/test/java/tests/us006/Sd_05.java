package tests.us006;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

public class Sd_05 {
    //"List of Hotel Rooms" sayfasindaki  "Search" butonunun
    // tiklanabilir ve  bilgi girildiginde search edilebiliyor olmali

    //1. Yönetici olarak giris yaptigi hesaptan "Hotel Management" dropdown menüsüne tiklar.
    //2. Menüde acilan seceneklerden "Hotel Rooms" linkine tiklar
    //3. ID Hotel, Code; Name, IDGroup Room Type ve IsAvailable bolumlerine istenen formatta bilgileri girer
    //4. "Search" butonuna tiklar

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.HotelManagementSekmesi.click();
        Thread.sleep(2000);
        qaConcortPage.hotelRoomsSekmesi.click();
        qaConcortPage.addHotelRoomSekmesi.isDisplayed();


        Actions actions=new Actions(Driver.getDriver());
        Select select=new Select(qaConcortPage.hotelRoomListIDHotel);
        select.selectByIndex(4);
        actions.sendKeys(Keys.TAB).perform();
        qaConcortPage.hotelRoomListCode.sendKeys("34");
        actions.sendKeys(Keys.TAB).perform();
        qaConcortPage.hotelRoomListName.sendKeys("Serdar");
        actions.sendKeys(Keys.TAB).perform();
        qaConcortPage.hotelRoomListLocation.sendKeys("İstanbul");
        actions.sendKeys(Keys.TAB).perform();
        qaConcortPage.hotelRoomListPrice.sendKeys("200");

        Thread.sleep(3000);
        /*
        Select select1=new Select(qaConcortPage.hotelRoomListIDGroupRoomTypes);
        qaConcortPage.hotelRoomListIDGroupRoomTypes.click();
        select.selectByIndex(5);

         */
        WebElement dropDownMenuIDGroupRoomType = Driver.getDriver().findElement(By.xpath("//select[@id='lkpGroupRoomTypes']"));
        Select dropDownListIDGroupRoomType = new Select(dropDownMenuIDGroupRoomType);
        dropDownListIDGroupRoomType.selectByVisibleText("Single");
        /*
        Select select2=new Select(qaConcortPage.hotelRoomListIsAvailable);
        qaConcortPage.hotelRoomListIsAvailable.click();
        select.selectByIndex(1);

        */
        WebElement dropDownMenuIsAvailable = Driver.getDriver().findElement(By.xpath("//select[@name='IsAvailable']"));
        Select dropDownListIsAvailable = new Select(dropDownMenuIsAvailable);
        dropDownListIsAvailable.selectByVisibleText("True");

        qaConcortPage.hotelRoomListSearch.click();

    }
}
