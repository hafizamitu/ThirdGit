package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickerM {

    public static void main(String[] args) {

       // String expectedDate = "18";
        String expectedMonth = "SEP";
        String expectedYear = "2026";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com");
        driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
        // to select date
        WebElement monthYear = driver.findElement(By.className("month2"));
        System.out.println(monthYear.getText());
        String monthYearValue = monthYear.getText();
        String[] monthYearValueArr = monthYearValue.split(" ");
        String targetMonth = monthYearValueArr[0];
        String targetYear = monthYearValueArr[1];

            while (!(targetMonth.equals(expectedMonth) && targetYear.equals(expectedYear))) {
            driver.findElement(By.id("img2Nex")).click();
            monthYear = driver.findElement(By.className("month2"));
            monthYearValue = monthYear.getText();
            System.out.println(monthYearValue);
            
            monthYearValueArr = monthYearValue.split(" ");
            targetMonth = monthYearValueArr[0];
            targetYear = monthYearValueArr[1];
            System.out.println(monthYearValueArr[0]);
            System.out.println(monthYearValueArr[1]);

        }

       // driver.findElement(By.xpath("(//li[text()='" + expectedDate + "'])[1]")).click();

    }

}
