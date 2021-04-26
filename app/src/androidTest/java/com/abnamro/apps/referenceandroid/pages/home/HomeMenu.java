package com.abnamro.apps.referenceandroid.pages.home;

import androidx.test.espresso.ViewInteraction;

import com.abnamro.apps.referenceandroid.actions.BaseAction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * This class exposes specific HomeMenu methods to the caller class and implements generic BaseAction methods to achieve its results
 */
public class HomeMenu extends BaseAction {

    private ViewInteraction settingsMenuItemView() {
        return this.returnViewActionByText("Settings");
    }

    private ViewInteraction appNameMenuTextView() {
        return this.returnViewActionByText("ReferenceAndroid");
    }

    public HomeMenu clickSettingsMenuItem() {
        clickButton(this.settingsMenuItemView());
        return this;
    }

    public HomeMenu clickHomeKebabMenu() {
        this.clickKebabMenu();
        return this;
    }

    // view attribute methods
    public HomeMenu getSettingsMenuItemViewIsDisplayed() {
        viewIsShown(this.settingsMenuItemView());
        return this;
    }

    public HomeMenu getAppNameMenuTextViewIsDisplayed() {
        viewIsShown(this.appNameMenuTextView());
        return this;
    }
}

