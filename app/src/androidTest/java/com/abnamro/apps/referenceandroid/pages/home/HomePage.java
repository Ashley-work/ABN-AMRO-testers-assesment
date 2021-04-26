package com.abnamro.apps.referenceandroid.pages.home;

import androidx.test.espresso.ViewInteraction;

import com.abnamro.apps.referenceandroid.R;
import com.abnamro.apps.referenceandroid.actions.BaseAction;

/**
 * This class exposes specific HomePage methods to the caller class and implements generic BaseAction methods to achieve its results
 */
public class HomePage extends BaseAction {
    // view retrieve methods
    private ViewInteraction getMessageIconView() {
        return this.returnViewActionById(R.id.fab);
    }

    private ViewInteraction getWelcomeTextView() {
        return this.returnViewActionByText("Hello World!");
    }

    private ViewInteraction getReplaceActionView() {
        return this.returnViewActionByText("Replace with your own action");
    }

    // view actions
    public HomePage clickMessageIcon() {
        clickButton(this.getMessageIconView());
        return this;
    }

    // view attribute methods
    public HomePage messageIconViewIsDisplayed() {
        viewIsShown(this.getMessageIconView());
        return this;
    }

    public HomePage welcomeTextViewIsDisplayed() {
        viewIsShown(this.getWelcomeTextView());
        return this;
    }

    public HomePage replaceActionViewIsDisplayed() {
        viewIsShown(this.getReplaceActionView());
        return this;
    }
}
