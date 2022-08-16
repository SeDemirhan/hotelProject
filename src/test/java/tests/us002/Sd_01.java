package tests.us002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Sd_01 {

    //1-Log in butonu gorunur, tiklanabilir olmali, ilgili yere yonlendirmeli

    //1-Kullanici Concort Hotel sayfasina gider.
    //2-Sag ustte log in butonunu gorur.
    //3-Log in butonuna tiklar.
    //4-Ilgili sayfaya yonlendirilir.

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();


        qaConcortPage.anaSayfaLoginButonu.isDisplayed();
        qaConcortPage.anaSayfaLoginButonu.click();



    }
}
