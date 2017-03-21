package com.example.testing.myappiumtest;

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



public class FirstTest {

    public static WebDriver driver;
    public static String number;
    public static String minus="bt_sub";
    public static String equal="bt_equal";
    public static String backspace="bt_backspace";
    public static String deleteClr="//android.widget.Button";
    public static String plus="bt_add";


    @Before

    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "Juha");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, "6.0.1");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void testFirstCalculator() {


        deleteClrButton(deleteClr);
        numberButton("7");
        subtractButton(minus);
        numberButton("3");
        equalButton(equal);
        backspaceButton(backspace);

        WebElement teksti =  driver.findElement(By.id("txtCalc"));

        Assert.assertEquals("4. Muokataan.", teksti.getAttribute("text"));

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    @Test
    public void plusTwoNumbers(){
        deleteClrButton(deleteClr);
        numberButton("5");
        plusButton(plus);
        numberButton("5");
        numberButton("5");
        equalButton(equal);
        backspaceButton(backspace);

        WebElement teksti =  driver.findElement(By.id("txtCalc"));

        Assert.assertEquals("60. Muokataan.", teksti.getAttribute("text"));

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @After
    public void End() {
        driver.quit();
    }


    public static void numberButton(String number){
        // Click on number x button.
        driver.findElement(By.name(number)).click();
    }

    public static void subtractButton(String minus){
        //clicks "-" button
        driver.findElement(By.id(minus)).click();
    }

    public static void plusButton(String plus){
        //clicks + button
        driver.findElement(By.id(plus)).click();
    }

    public static void equalButton(String equal){
        //clicks = button
        driver.findElement(By.id(equal)).click();
    }

    public static void backspaceButton(String backspace){
        //clicks backspace button
        driver.findElement(By.id(backspace)).click();
    }

    public static void resultField(String result){
        //result field

    }

    public static void deleteClrButton(String deleteClr){
        driver.findElements(By.xpath(deleteClr)).get(0).click();
    }

    public static void calculateExpectedValue(String firstNumber, String secondNumber, String calcButton){
        //first number -+/* second number

    }
}

