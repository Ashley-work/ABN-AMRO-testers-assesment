package com.abnamro.apps.referenceandroid;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.GrantPermissionRule;

import com.abnamro.apps.referenceandroid.pages.home.HomePage;
import com.abnamro.apps.referenceandroid.utils.CustomFailureHandler;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

/**
 * Testsuite for tests regarding the homePage, only knows what test to execute while leaving the impl to HomePageObject
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class HomePageTest {
    private static HomePage homePage;
    private ActivityScenarioRule<MainActivity> mActivityTestRule;
    private CustomFailureHandler mScreenshotTestRule;
    private GrantPermissionRule mGrantPermissionRule;

    @Rule
    public TestRule chain =
            RuleChain.outerRule(mGrantPermissionRule = GrantPermissionRule.grant(READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE))
                    .around(mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class))
                    .around(mScreenshotTestRule = new CustomFailureHandler());

    // TODO: executed once in whole suite, but requires the method and by extension field to be static, find a nicer solution
    @BeforeClass
    public static void initialize() {
        homePage = new HomePage();
    }

    // start suite with visibility test before interacting with them
    @Test
    public void welcomeTextVisibilityTest() {
        homePage.welcomeTextViewIsDisplayed();
    }

    @Test
    public void messageIconVisibilityTest() {
        homePage.messageIconViewIsDisplayed();
    }

    // start interactions
    @Test
    public void clickMessageIconAndReplaceActionVisibilityTest() {
        homePage
                .clickMessageIcon()
                .replaceActionViewIsDisplayed();
    }

    //TODO: add tests which checks on the absence of certain elements/default values
}
