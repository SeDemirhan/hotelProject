package tests.us004;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class Sd_04 {
    //4- Acilan sayfada "Code","Name","Address",Phone","Email" ve "IdGroup"
    // bilgilerinin dogru girilmesinden sonra "Save" butonunun tiklanabilir  oldugu ve
    // "Hotel was inserted successfully" yazisinin gorulebilir oldugu dogrulanmali


    //1- "Code" butonuna tiklar
    //2- "Name" butonuna tiklar
    //3- "Address" butonuna tiklar
    //4- "Phone" butonuna tiklar
    //5- "Email" butonuna tiklar
    //6- "IDGroup" butonuna tiklar ve dropdowndan hotel tipini secer
    //7- "Save" butonuna tiklar

    @Test
    public void test() throws InterruptedException {
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        Thread.sleep(3000);
        //qaConcortPage.SystemManagementSekmesi.click();

        qaConcortPage.HotelManagementSekmesi.click();
        qaConcortPage.hotelListSekmesi.click();

        qaConcortPage.addHotelButonu.click();

        Actions actions=new Actions(Driver.getDriver());
        qaConcortPage.codeKutusu.click();

        actions.sendKeys(ConfigReader.getProperty("Code")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("Name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("Address1")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("Phone2")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("Email")).perform();

        Select select=new Select(qaConcortPage.IDGrupDropDown);
        select.selectByVisibleText("Hotel Type1");

        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);

        actions.click(qaConcortPage.createSaveButonu).perform();
        Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.HotelwasinsertedYazisi.isDisplayed());




    }
}
