package com.abnamro.apps.referenceandroid;


import android.view.View;
import android.view.ViewGroup;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.abnamro.apps.referenceandroid.pages.home.HomeMenu;
import com.abnamro.apps.referenceandroid.pages.home.HomePage;


import org.hamcrest.core.IsInstanceOf;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class HomePageTest {
    HomePage homePage;
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void initialize() {
        homePage = new HomePage();
    }

    @Test
    public void mainActivityTest() throws InterruptedException {
        homePage.clickButton(homePage.getWelcomeText());
        homePage.clickButton(homePage.getMessageIcon());
        homePage.viewIsShown(homePage.getClickMessageIconText());
    }
}
