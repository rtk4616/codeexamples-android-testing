package com.vogella.android.test.juntexamples;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class ContextInstrumentationTests {
    Context appContext;

    public void setup(){
        // Context of the app under test.
        appContext = InstrumentationRegistry.getTargetContext();
    }
    @Test
    public void packageNameShouldBeCorrect() throws Exception {
        // ensure that the package of the appContext is "com.vogella.android.test.juntexamples"
    }
    @Test
    public void appNameShouldBeCorrect() throws Exception {
        // ensure R.string.app_name is set to "JUnit Examples"

    }

    @Test
    public void mainActivityLayoutShouldHaveConstraintLayoutAsRoot() throws Exception {
        // the root node of R.layout.activity_main should be a ConstraintLayout.class
    }
}