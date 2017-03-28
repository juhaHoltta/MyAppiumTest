package com.example.testing.myappiumtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

import pageObjects.CalculatorMainPage;
import pageObjects.CommonPageObjects;

//import pageObjects.CalculatorMainPage;

/**
 * Created by Juha on 24.3.2017.
 */

public class CalculatorTestWithPageObj extends CommonPageObjects {
    //static WebDriver driver;
    //with page object model


        @Test
        public void testSumOperation(){
            CalculatorMainPage onCalculatorMainPage = new CalculatorMainPage(driver);
            onCalculatorMainPage.clickNumberTwoButton();
            onCalculatorMainPage.clickMinusButton();
            onCalculatorMainPage.clickNumberFiveButton();

        }





    }

