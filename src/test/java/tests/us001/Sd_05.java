package tests.us001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Sd_05 extends ReusableMethods{
    /*
    "5-Alt bilgi(Footer) bilesenleri gorunur,
       tiklanabilir ve etkin olmali"
   */

    //1) Ana sayfada asagiya inilmeye devam edilir ve sayfa sonunda Footer bolumune gelinir.
    //2) Footer bolumundeki linklerin ve sosyal medya ikonlarinin tiklanabilir oldugu test edilir.

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.CHGelişmişGiris();

        ReusableMethods.scrollInToWiew(qaConcortPage.anaSayfaFooter);

        qaConcortPage.footerBlog.click();
        Assert.assertTrue(qaConcortPage.footerBlog.isEnabled());
        qaConcortPage.footerRooms.click();
        Assert.assertTrue(qaConcortPage.footerRooms.isEnabled());
        qaConcortPage.footerAmenitiestest.click();
        Assert.assertTrue(qaConcortPage.footerAmenitiestest.isEnabled());
        qaConcortPage.footerGiftCard.click();
        Assert.assertTrue(qaConcortPage.footerGiftCard.isEnabled());
        qaConcortPage.footerCareer.click();
        Assert.assertTrue(qaConcortPage.footerCareer.isEnabled());
        qaConcortPage.footerAboutUs.click();
        Assert.assertTrue(qaConcortPage.footerAboutUs.isEnabled());
        qaConcortPage.footerContactUs.click();
        Assert.assertTrue(qaConcortPage.footerContactUs.isEnabled());
        qaConcortPage.footerServices.click();
        Assert.assertTrue(qaConcortPage.footerServices.isEnabled());
        qaConcortPage.footerAdres.click();
        Assert.assertTrue(qaConcortPage.footerAdres.isEnabled());
        qaConcortPage.footerTelefon.click();
        Assert.assertTrue(qaConcortPage.footerTelefon.isEnabled());
        qaConcortPage.footerEmail.click();
        Assert.assertTrue(qaConcortPage.footerEmail.isEnabled());

        qaConcortPage.footerTwitter.click();
        Assert.assertTrue(qaConcortPage.footerTwitter.isEnabled());
        qaConcortPage.footerFaceBook.click();
        Assert.assertTrue(qaConcortPage.footerFaceBook.isEnabled());
        qaConcortPage.footerInstagram.click();
        Assert.assertTrue(qaConcortPage.footerInstagram.isEnabled());






    }
}
