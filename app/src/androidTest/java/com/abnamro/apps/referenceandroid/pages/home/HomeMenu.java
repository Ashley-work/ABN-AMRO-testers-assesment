package com.abnamro.apps.referenceandroid.pages.home;

import androidx.test.espresso.ViewInteraction;
import com.abnamro.apps.referenceandroid.actions.baseAction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class HomeMenu extends baseAction {

    public ViewInteraction getSettingsMenuItem() {
        return onView(
                withText("Settings")
        );
    }

    public ViewInteraction getAppName() {
        return onView(
                withText("ReferenceAndroid")
        );
    }
}

