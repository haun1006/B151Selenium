package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliiklerini ayarlamak için setProperty() methodu ile kullanırız.

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.

        WebDriver driver = new ChromeDriver();

        driver.get("https://techproeducation.com");
    }
}
