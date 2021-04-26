package com.abnamro.apps.referenceandroid.utils;

import android.graphics.Bitmap;

import androidx.test.runner.screenshot.ScreenCapture;
import androidx.test.runner.screenshot.Screenshot;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.IOException;

/**
 * This class extends the TestWatcher class from JUnit so that overrided methods can be called, in this case on failure
 */
public class CustomFailureHandler extends TestWatcher {
    @Override
    // gets called whenever an error/exception is thrown
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        takeScreenshot(description);
    }

    // TODO: current impl only works on android sdk 30 (android 11) on pixel 3a. Fix (file permissions)
    private void takeScreenshot(Description description) {
        String filename = description.getTestClass().getSimpleName() + "-" + description.getMethodName();

        ScreenCapture capture = Screenshot.capture();
        capture.setName(filename);
        capture.setFormat(Bitmap.CompressFormat.PNG);

        try {
            capture.process();
        } catch (IOException e) {
            // TODO: temp impl, add logger.
            e.printStackTrace();
        }
    }
}
