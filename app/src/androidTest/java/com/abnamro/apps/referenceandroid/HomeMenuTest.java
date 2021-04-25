package com.abnamro.apps.referenceandroid;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import com.abnamro.apps.referenceandroid.pages.home.HomeMenu;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class HomeMenuTest {
    HomeMenu homeMenu;

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void initialize() {
        homeMenu = new HomeMenu();
    }

    @Test
    public void mainActivityTest() throws InterruptedException {
        homeMenu.viewIsShown(homeMenu.getAppName());
        homeMenu.clickKebabMenu();
        homeMenu.viewIsShown(homeMenu.getSettingsMenuItem());
    }
}
