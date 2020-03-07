import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


public class firstTest {
    public static void main(String[] args) {

        String baseURL = "https://www.pracuj.pl/";


        System.out.println("Hello in first class");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        String actualTitle = driver.getTitle();
        System.out.println("tytul z wrorcony:" + actualTitle);

        String expectedTitle = "Praca2 - Pracuj.pl";

        assertThat(actualTitle).isEqualTo(expectedTitle);

        driver.close();



    }

}
