package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Gridtest {

    public static void main(String[] args) throws MalformedURLException {
        String node="http://localhost:4444/";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WIN10);

        WebDriver driver = new RemoteWebDriver(new URL(node),caps);
        driver.get("httpS://www.google.com");


    }
}
