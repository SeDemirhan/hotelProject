package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

public class QAConcortPage {

    public WebDriver driver;

    public QAConcortPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement gelismisButonu;
    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement gelismisLink;
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLogin;
    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userNameKutusu;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordKutusu;
    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    public void ConcortHotelLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ilkLogin.click();
        qaConcortPage.userNameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
        qaConcortPage.loginButonu.click();
    }
    public void CHGelişmişGiris(){

        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.gelismisButonu.click();
        qaConcortPage.gelismisLink.click();
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement anasayfaHome;
    @FindBy(xpath = "(//li[@class='nav-item'])[1]")
    public WebElement anasayfaRooms;
    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement anasayfaRestourant;
    @FindBy(xpath = "(//li[@class='nav-item'])[3]")
    public WebElement anasayfaAbout;
    @FindBy(xpath = "(//li[@class='nav-item'])[4]")
    public WebElement anasayfaBlog;
    @FindBy(xpath = "(//li[@class='nav-item'])[5]")
    public WebElement anasayfaContact;
    @FindBy(xpath = "(//li[@class='nav-item'])[6]")
    public WebElement anasayfaLogin;

    @FindBy(className = "navbar-brand")
    public WebElement AnaSayfaConcortHotelYazisi;

    @FindBy(id = "checkin_date")
    public WebElement CheckInDateYazisi;

    @FindBy(id = "checkout_date")
    public WebElement checkOutDateYazisi;

    @FindBy(id = "IDRoomType")
    public WebElement roomTypeDropDown;

    @FindBy(id = "AdultCount")
    public WebElement adultsDropDown;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement checkAvailability;

    @FindBy(xpath = "(//div[@class='text'])[1]")
    public WebElement roomsBasligi;

    @FindBy(xpath = "(//h2[@class='mb-4'])[1]")
    public WebElement WelcomeToOurHotelYazisi;

    @FindBy(xpath = "(//span[@class='icon-facebook'])[1]")
    public WebElement facebookIkonu;

    @FindBy(xpath = "//span[@class='icon-google-plus']")
    public WebElement gmailIkonu;

    @FindBy(xpath = "(//span[@class='icon-instagram'])[1]")
    public WebElement instagramIkonu;

    @FindBy(xpath = "(//h2[@class='mb-4'])[3]")
    public WebElement ourRoomsYazisi;

    @FindBy(xpath = "(//span[@class='icon-long-arrow-right'])[1]")
    public WebElement ChrisDaughertyRooms;

    @FindBy(xpath = "//h2[@class='mb-4']")
    public WebElement ilkOdaGirisBasligi;

    @FindBy(xpath = "//h2[text()='Recent Blog']")
    public WebElement RecentBlogYazisi;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 6']")
    public WebElement texts6Yazisi;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 5']")
    public WebElement texts5Yazisi;

    @FindBy(xpath = "//a[text()='Even the all-powerful Pointing has no control about the blind texts 4']")
    public WebElement texts4Yazisi;

    @FindBy(xpath = "//h1[text()='Blog6']")
    public WebElement Blog6Yazisi;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement Blog5Yazisi;

    @FindBy(xpath = "//h1[text()='Blog4']")
    public WebElement Blog4Yazisi;

    @FindBy(xpath = "//span[text()='Instagram']")
    public WebElement InstagramYazisi;

    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[1]")
    public WebElement InstagramFoto1;

    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[3]")
    public WebElement InstagramFoto3;

    @FindBy(xpath = "//img[@src='/FileStorage/2/13/2655410insta-5.jpg']")
    public WebElement InsatgramFoto1Gorunurlugu;

    @FindBy(xpath = "//div[@class='mfp-counter']")
    public WebElement InsatgramFoto3Gorunurlugu;

    @FindBy(xpath = "//footer[@class='ftco-footer ftco-bg-dark ftco-section']")
    public WebElement anaSayfaFooter;

    @FindBy(xpath = "(//a[text()='Blog'])[2]")
    public WebElement footerBlog;

    @FindBy(xpath = "(//a[text()='Rooms'])[2]")
    public WebElement footerRooms;

    @FindBy(xpath = "//a[text()='Amenities test']")
    public WebElement footerAmenitiestest;

    @FindBy(xpath = "//a[text()='Gift Card']")
    public WebElement footerGiftCard;

    @FindBy(xpath = "(//a[text()='Career'])[1]")
    public WebElement footerCareer;

    @FindBy(xpath = "(//a[text()='About Us'])[1]")
    public WebElement footerAboutUs;

    @FindBy(xpath = "(//a[text()='Contact Us'])[1]")
    public WebElement footerContactUs;

    @FindBy(xpath = "(//a[text()='Services'])[1]")
    public WebElement footerServices;

    @FindBy(xpath = "(//span[@class='text'])[1]")
    public WebElement footerAdres;

    @FindBy(xpath = "(//span[@class='text'])[2]")
    public WebElement footerTelefon;

    @FindBy(xpath = "(//span[@class='text'])[3]")
    public WebElement footerEmail;

    @FindBy(xpath = "//span[@class='icon-twitter']")
    public WebElement footerTwitter;

    @FindBy(xpath = "(//li[@class='ftco-animate fadeInUp ftco-animated'])[5]")
    public WebElement footerFaceBook;

    @FindBy(xpath = "(//li[@class='ftco-animate fadeInUp ftco-animated'])[6]")
    public WebElement footerInstagram;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement anaSayfaLoginButonu;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement LoginYazisi;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement ListofusersYazisi;

    @FindBy(xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createaNewButonu;

    @FindBy(xpath = "//h1[@class='mb-4 bread']")
    public WebElement registerYazisi;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement registerUserName;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButotnu;

    @FindBy(id = "DescriptionDiv")
    public WebElement successfullyYazisi;

    @FindBy(xpath = "(//i[@class='icon-users'])[2]")
    public WebElement HotelManagementSekmesi;

    @FindBy(xpath = "//a[@id='menuYonetim']")
    public WebElement SystemManagementSekmesi;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListSekmesi;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelButonu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelYazisi;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeKutusu;

    @FindBy(xpath = "//select[@name='IDGroup']")
    public WebElement IDGrupDropDown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement createSaveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement HotelwasinsertedYazisi;

    @FindBy(xpath= "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfHotelYazisi;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsButonu;

    @FindBy(xpath = "//*[text()='General Data']")
    public WebElement genaralDataButonu;

    @FindBy(xpath = "//*[text()='Photos']")
    public WebElement photosButonu;

    @FindBy(xpath = "//*[text()='Properties']")
    public WebElement propertiesButonu;

    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editHotelYazisi;

    @FindBy(xpath = "(//div[@class='caption'])[2]")
    public WebElement hotelDataYazisi;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement hotolDataCode;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement hotelDataName;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement hotelDataAdress;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement hotelDataPhone;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement hotelDataEmail;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement hotelDataGroup;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement hotelDataSaveBotınu;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement hotelDataOkButonu;

    @FindBy(xpath = "//button[@id='btnDelete']")
    public WebElement editHotelDeleteButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement HotelwasupdatedsuccessfullyYazisi;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement WouldyouliketocontinueYazisi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement WouldyouliketocontinueOkButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement HotelsuccessfullydeletedYazisi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement HotelsuccessfullydeletedOkButonu;




















}
