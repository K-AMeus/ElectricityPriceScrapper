package MeusKost;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scraper {

    public static void scrape(int clientPrice) {

        // Set up the WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        try {
            // Navigate to the website
            driver.get("https://elektrihind.ee/borsihind/");

            //selle peaks asendama WebDriverWait-iga koos ExpectedConditions
            Thread.sleep(3000);

            // Locate the element containing the electricity price
            WebElement priceElement = driver.findElement(By.cssSelector(".price.ng-binding"));
            WebElement secondPriceElement = driver.findElement(By.xpath("//div[@class='col']//span[@class='price ng-binding']"));

            // Extract and print the electricity price
            String[] parts = priceElement.getText().split(" ");
            double price = Double.parseDouble(parts[0]);
            String unit = parts[1];

            System.out.println("Hetkel elektrihind: " + price + " " + unit);

            String[] secondParts = secondPriceElement.getText().split(" ");
            double secondPrice = Double.parseDouble(secondParts[0]);
            String secondUnit = secondParts[1];

            PriceAnalyzer priceAnalyzer = new PriceAnalyzer(price, secondPrice);

            System.out.println("Tänane keskmine: " + secondPrice + " " + secondUnit);

            if (priceAnalyzer.getPriceNow() < clientPrice) {
                System.out.println("Naudi enda elektrit");
            } else {
                System.out.println("Hetkel on hind sinu jaoks pisut liiga krõbe, näljarott!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();

        }
    }
}
