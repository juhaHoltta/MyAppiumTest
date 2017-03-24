package pageObjects;

        import java.net.MalformedURLException;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.util.concurrent.TimeUnit;

        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.lift.match.TextMatcher;
        import org.openqa.selenium.remote.CapabilityType;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.remote.RemoteWebDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.w3c.dom.Text;


/**
 * Created by Juha on 22.3.2017.
 */

public class CalculatorMainPage {

    public static WebDriver driver;
    public static String number;
    public static String minus="bt_sub";
    public static String equal="bt_equal";
    public static String backspace="bt_backspace";
    public static String deleteClr="//android.widget.Button";
    public static String plus="bt_add";

public CalculatorMainPage clickNumberButton(String number){
            // Click on number x button.
            driver.findElement(By.name(number)).click();
            return new CalculatorMainPage();
        }


}

