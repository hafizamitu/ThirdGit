package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerSA {
    public static void main(String[] args) throws InterruptedException {
        String expDate = "31";
        String expMonth = "December";
        String expYear = "2024";

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[1]/div/button")).click();
        WebElement monthYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div"));
        System.out.println(monthYear.getText());

        String monthYearValue = monthYear.getText();
        String[] monthYearValueA = monthYearValue.split(" ");
        String targetMonth = monthYearValueA[0];
        String targetYear = monthYearValueA[1];

        while (!(targetMonth.equals(expMonth) && targetYear.equals(expYear))) {
            Thread.sleep(100);
            driver.findElement(By.xpath("//a[@aria-label='Next Month']")).click();
            monthYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div"));
            monthYearValue = monthYear.getText();
            System.out.println(monthYearValue);
            monthYearValueA = monthYearValue.split(" ");
            targetMonth = monthYearValueA[0];
            targetYear = monthYearValueA[1];
            System.out.println(monthYearValueA[0]);
            System.out.println(monthYearValueA[1]);

        }

        driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar'] //a[text()='" + expDate + "']"))
                .click();

    }

}
