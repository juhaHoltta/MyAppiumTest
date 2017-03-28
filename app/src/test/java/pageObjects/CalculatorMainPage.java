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

    WebDriver driver;
    public static String number;
    By minus = By.id("bt_sub");
    public static String equal="bt_equal";
    public static String backspace="bt_backspace";
    public static String deleteClr="//android.widget.Button";
    public static String plus="bt_add";

    public CalculatorMainPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickNumberTwoButton()
    {
        driver.findElement(By.id("bt_02")).click();
    }
    public void clickNumberTreeButton()
    {
        driver.findElement(By.id("bt_03")).click();
    }
    public void clickNumberFourButton()
    {
        driver.findElement(By.id("bt_04")).click();
    }
    public void clickNumberFiveButton()
    {
        driver.findElement(By.id("bt_05")).click();
    }
    public void clickMinusButton()
    {
        driver.findElement(minus).click();
    }


}

