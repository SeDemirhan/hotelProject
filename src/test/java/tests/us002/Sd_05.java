package tests.us002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_05 {

    //4-Log in butonu gorunur, tiklanabilir olmali ve basarili giris yapilabilmeli

    //1-Kullanici Concort Hotel sayfasina gider.
    //2-Sag ustteki log in butonuna tiklar.
    //3-Log in sayfasindaki bilgileri girer.
    //4-Alttaki log in butonuna tiklar.
    //5-Ilgili sayfaya yonlendirilir.

    @Test
    public void test(){
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        Assert.assertTrue(qaConcortPage.ListofusersYazisi.isDisplayed(),"yazi gorunmuyor");


    }
}
