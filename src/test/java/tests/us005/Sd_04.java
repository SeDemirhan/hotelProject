package tests.us005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

import java.util.Set;

public class Sd_04 {

    //4- sistem mesaji olarak "Hotel was updated successfully" yazisi gorunmeli,
    // "ok" butonuna tiklanilabilmeli

    //1-Kullanici Concort Hotel (Admin) sayfasina gider.
    //2-Sag ustte log in butonunu tiklar ardindan Username ve Sifre girilmeli
    //3-Acilan sayfada sol menuden "System Management" menusunun altindaki "Hotel Management" sekmesine  tiklar
    //4-Ardindan "Hotel List" secegine tiklar.
    //5-"LIST OF HOTELS" tablosunda bulunan "DETAILS"  butonu gorulmeli ardindan tiklanmali
    //6-"Hotel Data" bolumunde butun bilgiler girilir
    //7-"Save" butonuna tiklanir ve HTML kodu ile yazilmis sistem mesaji cikar.
    //8-"Hotel was updated successfully" yazisi gorulmeli
    //9-"OK" butonu tiklanilabilmeli

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

        Assert.assertTrue(qaConcortPage.hotolDataCode.isEnabled());
        qaConcortPage.hotolDataCode.clear();
        Thread.sleep(3000);
        qaConcortPage.hotolDataCode.sendKeys("34");
        Assert.assertTrue(qaConcortPage.hotelDataName.isDisplayed());
        qaConcortPage.hotelDataName.clear();
        qaConcortPage.hotelDataName.sendKeys("Serdar");
        Assert.assertTrue(qaConcortPage.hotelDataAdress.isDisplayed());
        qaConcortPage.hotelDataAdress.clear();
        qaConcortPage.hotelDataAdress.sendKeys("İstanbul");
        Assert.assertTrue(qaConcortPage.hotelDataPhone.isDisplayed());
        qaConcortPage.hotelDataPhone.clear();
        qaConcortPage.hotelDataPhone.sendKeys("987654");
        Assert.assertTrue(qaConcortPage.hotelDataEmail.isDisplayed());
        qaConcortPage.hotelDataEmail.clear();
        qaConcortPage.hotelDataEmail.sendKeys("asd@gmail.com");

        //Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.TAB);

        qaConcortPage.hotelDataGroup.click();
        Select select = new Select(qaConcortPage.hotelDataGroup);
        select.selectByIndex(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB);

        Assert.assertTrue(qaConcortPage.hotelDataSaveBotınu.isDisplayed());
        qaConcortPage.hotelDataSaveBotınu.click();
        Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.HotelwasupdatedsuccessfullyYazisi.isDisplayed());
        Thread.sleep(2000);
        qaConcortPage.hotelDataOkButonu.click();

    }
}