package com.abnamro.apps.referenceandroid.actions;

import androidx.test.espresso.ViewInteraction;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public abstract class baseAction {
    public void clickKebabMenu() {
        openActionBarOverflowOrOptionsMenu(getApplicationContext());
    }

    public void clickButton(Integer resourceId){
        onView(withId(resourceId))
                .perform(click())
                .check(matches(isDisplayed()));
    }

    public void clickButton(ViewInteraction vi){
                vi.perform(click());
                viewIsShown(vi);
    }

    public void viewIsShown(ViewInteraction vi) {
        vi.check(matches(isDisplayed()));
    }

    public void viewIsShown(Integer resourceId) {
        onView(withId(resourceId))
                .check(matches((isDisplayed())));
    }
}
