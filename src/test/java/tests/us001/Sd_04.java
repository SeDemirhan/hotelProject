package tests.us001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Sd_04  {

    /*
    "4-Recent Blog bolumunun gorunur,tiklanabilir olmali ve
       ilgili yere gitmeli - Instagram bolumu gorunur ve
       tiklanabilir olmali"
    */

    //1) Ana Sayfada asagiya inilmeye devam edilir ve "Recent Blog" yazisi gorunur.
    //2) "Recent Blog" yazisi altindaki resim ve yazilarin tiklanabilir oldugu test dilir
    //3) Ana sayfada asagiya inilmeye devam edilir ve "Instagram" yazisi gorunur.
    //4)"Instagram" yazisi altindaki resimlerin tiklanabilir oldugu test edilir

   @Test
    public void test() throws InterruptedException {


       Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));

       QAConcortPage qaConcortPage=new QAConcortPage();
       qaConcortPage.CHGelişmişGiris();

       Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);

      Assert.assertTrue(qaConcortPage.RecentBlogYazisi.isDisplayed(),"yazi gorunmuyor");

      qaConcortPage.texts6Yazisi.click();
      Thread.sleep(2000);
      Assert.assertTrue(qaConcortPage.Blog6Yazisi.isDisplayed());
      qaConcortPage.anasayfaHome.click();
       actions.sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);


       qaConcortPage.anasayfaHome.click();
       actions.sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).
               sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);

       qaConcortPage.InstagramYazisi.isDisplayed();
       Thread.sleep(2000);

       qaConcortPage.InstagramFoto1.click();
       Thread.sleep(2000);
       Assert.assertTrue(qaConcortPage.InsatgramFoto1Gorunurlugu.isDisplayed());








   }




}
