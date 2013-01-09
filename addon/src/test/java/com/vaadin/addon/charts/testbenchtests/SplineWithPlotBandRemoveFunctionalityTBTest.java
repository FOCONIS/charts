package com.vaadin.addon.charts.testbenchtests;

import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import com.vaadin.addon.charts.demoandtestapp.lineandscatter.SplineWithPlotBandRemoveFunctionality;
import com.vaadin.testbench.By;

public class SplineWithPlotBandRemoveFunctionalityTBTest extends
        AbstractTestBenchTest {

    boolean screenshotErrors = false;

    @Test
    public void test() throws IOException, AssertionError {

        startBrowser();
        try {
            driver.navigate().to(BASEURL + getTestViewName());

            waitBetweenShots();
            captureAndCompare("1-start");

            driver.findElement(By.id("vaadin-button")).click();
            waitBetweenShots();
            captureAndCompare("2-removed");

            driver.findElement(By.id("vaadin-button")).click();
            waitBetweenShots();
            captureAndCompare("1-start");

        } finally {
            driver.quit();
        }
        if (screenshotErrors) {
            Assert.fail("There are differences in creenshots");
        }
    }

    protected void captureAndCompare(String name) throws IOException {
        String imageName = getTestViewName() + "-" + name + ".png";
        File refImage = getReferenceImage(imageName);

        if (!refImage.exists()) {
            System.err.println("Reference image " + refImage.getAbsolutePath()
                    + " is missing!");
        }
        if (!testBench.compareScreen(refImage)) {
            screenshotErrors = true;
        }
    }

    protected void waitBetweenShots() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected String getTestViewName() {
        return "lineandscatter/"
                + SplineWithPlotBandRemoveFunctionality.class.getSimpleName();
    }

}
