package MeusKost;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the website
            driver.get("https://elektrihind.ee/borsihind/");

            //selle peaks asendama WebDriverWait-iga koos ExpectedConditions
            Thread.sleep(5000);

            // Locate the element containing the electricity price
            WebElement priceElement = driver.findElement(By.cssSelector(".price.ng-binding"));

            // Extract and print the electricity price
            String price = priceElement.getText().split(" ")[0];
            String unit = priceElement.findElement(By.cssSelector("small.ng-binding")).getText();
            System.out.println("Current electricity price: " + price);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}