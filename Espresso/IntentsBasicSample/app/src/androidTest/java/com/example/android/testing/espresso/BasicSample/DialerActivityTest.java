package com.example.android.testing.espresso.BasicSample;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.app.Instrumentation.ActivityResult;
import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DialerActivityTest {

    private static final String VALID_PHONE_NUMBER = "123-345-6789";

    private static final Uri INTENT_DATA_PHONE_NUMBER = Uri.parse("tel:" + VALID_PHONE_NUMBER);

    private static String PACKAGE_ANDROID_DIALER = "com.android.phone";

    static {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Starting with Android Lollipop the dialer package has changed.
            PACKAGE_ANDROID_DIALER = "com.android.server.telecom";
        }
    }

    /**
     * A JUnit {@link Rule @Rule} to init and release Espresso Intents before and after each
     * test run.
     * <p>
     * Rules are interceptors which are executed for each test method and will run before
     * any of your setup code in the {@link Before @Before} method.
     * <p>
     * This rule is based on {@link ActivityTestRule} and will create and launch of the activity
     * for you and also expose the activity under test.
     */
    @Rule
    public IntentsTestRule<DialerActivity> mActivityRule = new IntentsTestRule<>(
            DialerActivity.class);

    @Before
    public void stubAllExternalIntents() {
        // By default Espresso Intents does not stub any Intents. Stubbing needs to be setup before
        // every test run. In this case all external Intents will be blocked.
        intending(not(isInternal())).respondWith(new ActivityResult(Activity.RESULT_OK, null));
    }

    @Before
    public void grantPhonePermission() {
        // In M+, trying to call a number will trigger a runtime dialog. Make sure
        // the permission is granted before running this test.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getInstrumentation().getUiAutomation().executeShellCommand(
                    "pm grant " + getTargetContext().getPackageName()
                            + " android.permission.CALL_PHONE");
        }
    }

    @Test
    public void typeNumber_ValidInput_InitiatesCall() {
        // Types a phone number into the dialer edit text field and presses the call button.
        onView(withId(R.id.edit_text_caller_number))
                .perform(typeText(VALID_PHONE_NUMBER), closeSoftKeyboard());
        onView(withId(R.id.button_call_number)).perform(click());

        // Verify that an intent to the dialer was sent with the correct action, phone
        // number and package. Think of Intents intended API as the equivalent to Mockito's verify.
        // ACTION: Intent.ACTION_CALL
        // DATA: INTENT_DATA_PHONE_NUMBER
        fail("TODO");
    }

    @Test
    public void pickContactButton_click_SelectsPhoneNumber() {
        // Stub all Intents to ContactsActivity to return VALID_PHONE_NUMBER.
        // Use hasComponent(hasShortClassName(".ContactsActivity")) for intenting
        // respondWith an ActivityResult
        // Ise Activity.RESULT_OK and use ContactsActivity.createResultData(VALID_PHONE_NUMBER) to build it
        // Note that the Activity is never launched and result is stubbed.

        // Click the R.id.button_pick_contact pick contact button.

        // Check that the VALID_PHONE_NUMBER number is displayed in the R.id.edit_text_caller_number view.
        fail("TODO");
    }
}
