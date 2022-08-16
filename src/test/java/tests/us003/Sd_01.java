package tests.us003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Sd_01 {

    //1-"Create a new account" butonu gorunebilir ve tiklanabilir olmali

    //1-Kullanıcı concorthotel sayfasına gider
    //2-create a new account butonunu görebilmeli.
    //3-Bu butona tıklayabilmeli ve ilgili sayfaya yönlendirilmeli.

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));
        QAConcortPage qaConcortPage =new QAConcortPage();
        qaConcortPage.anaSayfaLoginButonu.isDisplayed();
        qaConcortPage.createaNewButonu.isDisplayed();
        qaConcortPage.anaSayfaLoginButonu.click();
        qaConcortPage.createaNewButonu.click();





    }


}
