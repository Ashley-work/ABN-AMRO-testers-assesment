package com.abnamro.apps.referenceandroid.pages.home;

import androidx.test.espresso.ViewInteraction;
import com.abnamro.apps.referenceandroid.R;
import com.abnamro.apps.referenceandroid.actions.baseAction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class HomePage extends baseAction {
    public int getMessageIcon() {
        return R.id.fab;
    }

    public ViewInteraction getWelcomeText() {
        return onView(
                withText("Hello World!")
        );
    }

    public ViewInteraction getClickMessageIconText() {
        return onView(
                withText("Replace with your own action")
        );
    }
}
