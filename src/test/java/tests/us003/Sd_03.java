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

public class Sd_03 {

    //3-Textboxlar kullanici bilgilerini kabul edebilir olmali

    //1-Kullanıcı concorthotel sayfasına girebilir, create a new account butonuna tıklayabilir,
    //  Registration Form sayfasını görebilmeli.
    //2-Username,Password,Email ,Full Name,Phone No,Sosial Security Number,Driving Licence,
    //  Adress,Working Sector butonuna tıklanabilmeli ve veri girişi yapılabilmeli.
    //3-Country , State ve Birth Day butonlarına tıklanabilmeli ve seçim yapılabilmeli.

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
        String password="Manager1!";





        actions.sendKeys(userName).
                sendKeys(Keys.TAB).
                sendKeys(password).
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











    }
}
