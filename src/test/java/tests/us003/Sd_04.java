package tests.us003;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Sd_04 {

    //4-Save butonu gorunur,tiklanabilir olmali

    //1-Kullanıcı concorthotel sayfasına gidebilmeli, create a new account butonuna tıklayabilmeli ve ,
    // Registration Form sayfasını görebilmeli.
    //2-Kullanıcı v eri girişlerini yapabilmeli , Save butonunu görebilmeli ve tıklayabilmeli.


    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));
        QAConcortPage qaConcortPage =new QAConcortPage();
        qaConcortPage.anaSayfaLoginButonu.click();
        qaConcortPage.createaNewButonu.click();

        Assert.assertTrue(qaConcortPage.registerYazisi.isDisplayed(),"Yazi gorunmuyor");

        qaConcortPage.userNameKutusu.click();

        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

        String userName=faker.name().name();
        System.out.println(userName);
        String pasword="Manager1!";
        System.out.println(pasword);

        actions.sendKeys(userName).
                sendKeys(Keys.TAB).
                sendKeys(pasword).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("SSNNubber")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("DrivigLicence")).perform();

        Select select=new Select(qaConcortPage.countryDropDown);
        select.selectByVisibleText("Turkey");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

        actions.sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("WorkingSector")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("day")).perform();

        qaConcortPage.saveButonu.click();
        qaConcortPage.saveButonu.isDisplayed();
        Thread.sleep(2000);
        qaConcortPage.okButotnu.click();

        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        Assert.assertTrue(qaConcortPage.successfullyYazisi.isDisplayed(),"Yazi gorunmuyor");











    }



}
