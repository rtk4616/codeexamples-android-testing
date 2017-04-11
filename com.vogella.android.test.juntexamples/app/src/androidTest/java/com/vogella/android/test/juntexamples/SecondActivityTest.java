package com.vogella.android.test.juntexamples;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {

// TODO override ActivityTestRule to provide a custom intent for your SecondActivity

    @Test
    public void ensureIntentDataIsDisplayed() throws Exception {
//        SecondActivity activity = rule.getActivity();

      // ensure that R.id.target is a TextView, not null and show the data passed to it via the intent via the "MYKEY" key
        fail("implement");
    }
}