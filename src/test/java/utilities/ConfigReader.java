package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1-Properties objesi olusturacagız
    static Properties properties;

    //2-Bu class ın amacı configuration.properties dosyasını okumak
    //  ve oradaki key value ikililerini kullanarak istediğimiz key e ait value yi bize getirmek
    static {
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //3-Test class larından configReader class ına ulasıp yukarıdaki isimleri
    //  yapmamızı sağlayacak bir method
    public static  String getProperty(String key){

        String value=properties.getProperty(key);
        return value;
    }
}
