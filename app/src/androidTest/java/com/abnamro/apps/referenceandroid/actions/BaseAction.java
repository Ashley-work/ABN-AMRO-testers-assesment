package com.abnamro.apps.referenceandroid.actions;

import androidx.test.espresso.ViewInteraction;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * This class contains methods to return a viewAction and methods to take actions on viewActions.
 */
public abstract class BaseAction {
    public ViewInteraction returnViewActionById(Integer resourceId) {
        return onView(
                withId(resourceId)
        );
    }

    public ViewInteraction returnViewActionByText(String text) {
        return onView(
                withText(text)
        );
    }

    public void clickKebabMenu() {
        openActionBarOverflowOrOptionsMenu(getApplicationContext());
    }

    public void clickButton(ViewInteraction vi) {
        vi.perform(click());
        viewIsShown(vi);
    }

    public void viewIsShown(ViewInteraction vi) {
        vi.check(matches(isDisplayed()));
    }
}
