/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_scheduler;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Guest()
 */
public class web {

    /**
     * @param args the command line arguments
     */
    public static String scrape() throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Justin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.dcds.edu/page.cfm?p=8256&period=week";
        String expectedTitle = "Detroit Country Day School: Academics Individual Classes Calendar";
        String actualTitle = "";
        String inputString, hasLength, classesText;
        hasLength = "";
        classesText = "";
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        driver.findElement(By.name("username")).sendKeys("lee1801");
        driver.findElement(By.name("password")).sendKeys("aaruurayhh`");
        driver.findElement(By.name("submit")).click();
        driver.get("https://www.dcds.edu/page.cfm?p=8256&start=06/02/2016&period=week");;

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        // get the actual value of the title
        try {
            actualTitle = driver.getTitle();
//            System.out.println(actualTitle);
//            if (actualTitle.contentEquals(expectedTitle)) {
//                System.out.println("Test Passed!");
//            } else {
//                System.out.println("Test Failed");
//            }
            hasLength = driver.findElement(By.id("calendar_titlebar")).getText();
//            System.out.println(hasLength);

            classesText = driver.findElement(By.className("listonly_block")).getText();
//            System.out.println(classesText);
        } catch (Exception e) {
            System.err.println("Failed from exception " + e.toString());
        }
        Thread.sleep(5000);

        //close Firefox
        driver.close();
        return inputString = hasLength + classesText;

    }

}
