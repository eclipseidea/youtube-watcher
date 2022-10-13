import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void sleep(TimeUnit unit, long time) {
        try {
            unit.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        for (int i = 0;i<200;i++){
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.youtube.com/watch?v=IoqcKb4m6Z4");
            chromeDriver.manage().window().fullscreen();
            chromeDriver.findElement(By.className("ytp-play-button")).click();
            sleep(TimeUnit.SECONDS,200);
            chromeDriver.close();
        }
    }
}
