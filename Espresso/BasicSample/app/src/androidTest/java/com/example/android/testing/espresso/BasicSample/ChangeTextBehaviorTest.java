package com.example.android.testing.espresso.BasicSample;

import android.app.Activity;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Basic tests showcasing simple view matchers and actions like {@link ViewMatchers#withId},
 * {@link ViewActions#click} and {@link ViewActions#typeText}.
 * <p>
 * Note that there is no need to tell Espresso that a view is in a different {@link Activity}.
 */
@RunWith(AndroidJUnit4.class)
public class ChangeTextBehaviorTest {

    public static final String STRING_TO_BE_TYPED = "Espresso";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void changeText_sameActivity() {
        // Type STRING_TO_BE_TYPED into R.id.editTextUserInput and callcloseSoftKeyboard

        // Then press the button with the R.id.changeTextBt ID


        // Check that the text was changed the view with R.id.textToBeChanged
    }

    @Test
    public void changeText_newActivity() {

        // Type STRING_TO_BE_TYPED into R.id.editTextUserInput text and then press the R.id.activityChangeTextBtn button.
        // new activity is started, if R.id.show_text_view contains the text
    }
}