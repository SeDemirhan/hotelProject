package tests.us003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Sd_02 {

    //2-"Registration Form" sayfasi gorunur olmalı

    //1-Kullanıcı concorthotel sayfasına gidebilmeli ve create a new account butonuna tıklayabilmeli.
    //2-Kullanıcı Registration Form sayfasını görebilmeli.

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));
        QAConcortPage qaConcortPage =new QAConcortPage();
        qaConcortPage.anaSayfaLoginButonu.click();
        qaConcortPage.createaNewButonu.click();

        Assert.assertTrue(qaConcortPage.registerYazisi.isDisplayed(),"Yazi gorunmuyor");




    }
}
