package com.vogella.android.robolectric;

import android.widget.LinearLayout;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class RobolectricActivityTest {

    private RobolectricActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(RobolectricActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldHaveDefaultMargin() throws Exception {
        TextView textView = (TextView) activity.findViewById(R.id.hello_textview);
        int bottomMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).bottomMargin;
        assertEquals(5, bottomMargin);
        fail("Check that margin top is 5, margin right 10 and margin left 10");
    }


    @Test
    public void checkActivityNotNull() throws Exception {
        assertNotNull(activity);
    }

    @Test
    public void shouldHaveCorrectAppName() throws Exception {
        // ensure R.string.app_name is set to Hello world!
    }


    @Test
    public void buttonClickShouldStartNewActivity() throws Exception
    {
        // performClick on button with R.id.startNextActivity  ID

        // now use Robolectric to check if the correct intent would be started
        // use Shadows.shadowOf(activity) and peekNextStartedActivity() to get intent
        // compare the intent component name with the  RobolectricSecondActivity class name
    }

    @Test
    public void testButtonClickShouldShowToast() throws Exception {
        // click on R.id.showToast

        // afterwards Toast should be shown
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("Lala") );
    }

    // TODO - Write Espresso Test for this Robolectric test
    // Compare runtime, which one is faster?
}