package tests.us004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;

public class Sd_01 {

    //1- "System Management" Menusunun icerisinde "Hotel List" sekmesi gorunmeli , tiklanilabilmeli .

    //1-Kullanici Concort Hotel (Admin) sayfasina gider.
    //2-Sag ustte log in butonunu tiklar ardindan Username ve Password bilgilerini girer
    //3-Acilan sayfada sol tarafta System Management menusunu ve
    //  sag tarafta liste seklinde  LISTOFUSERS tablosunu gorebilir

    @Test
    public void test(){
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        Assert.assertTrue(qaConcortPage.SystemManagementSekmesi.isDisplayed());
        Assert.assertTrue(qaConcortPage.ListofusersYazisi.isDisplayed(),"Yazi gorunmuyor");

    }
}
