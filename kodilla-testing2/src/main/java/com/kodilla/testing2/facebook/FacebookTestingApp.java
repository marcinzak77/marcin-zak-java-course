package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_INPUT_NAME = "//input[contains(@name, \"firstname\")]";
    public static final String XPATH_INPUT_LASTNAME = "//input[contains(@name, \"lastname\")]";
    public static final String XPATH_INPUT_EMAIL = "//input[contains(@name, \"reg_email\")]";
    public static final String XPATH_WAIT_FOREMAIL = "//input[contains(@name, \"reg_email_confirmation\")]";
    public static final String XPATH_INPUT_PASS = "//input[contains(@name, \"reg_passwd\")]";
    public static final String XPATH_SELECT_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATX_SELECT_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATX_SELECT_YEAR = "//select[contains(@name, \"birthday_year\")]";
    public static final String XPATX_SELECT_GENDER = "//span[contains(@data-name, \"gender_wrapper\")]/span[2]/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDrivers(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT_NAME));
        searchField.sendKeys("John");

        searchField = driver.findElement(By.xpath(XPATH_INPUT_LASTNAME));
        searchField.sendKeys("Smith");

        searchField = driver.findElement(By.xpath(XPATH_INPUT_EMAIL));
        searchField.sendKeys("test@test.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOREMAIL)).isDisplayed()) ;

        searchField = driver.findElement(By.xpath(XPATH_WAIT_FOREMAIL));
        searchField.sendKeys("test@test.com");

        searchField = driver.findElement(By.xpath(XPATH_INPUT_PASS));
        searchField.sendKeys("MySecretPass123");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDate = new Select(selectCombo);
        selectDate.selectByValue("20");

        selectCombo = driver.findElement(By.xpath(XPATX_SELECT_MONTH));
        selectDate = new Select(selectCombo);
        selectDate.selectByIndex(8);

        selectCombo = driver.findElement(By.xpath(XPATX_SELECT_YEAR));
        selectDate = new Select(selectCombo);
        selectDate.selectByValue("1985");

        selectCombo = driver.findElement(By.xpath(XPATX_SELECT_GENDER));
        selectCombo.click();
    }
}
