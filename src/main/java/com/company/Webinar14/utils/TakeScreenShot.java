package com.company.Webinar14.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;


public class TakeScreenShot {

    public static void screesnshotCatcher(WebDriver driver, String fileName){
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File simpleShot = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir") + "/artifacts/" + fileName + ".png");
        try {
            FileUtils.copyFile(simpleShot, destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
