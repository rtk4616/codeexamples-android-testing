/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.espresso.DataAdapterSample;

import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

/**
 * Tests to verify that the behavior of {@link LongListActivity} is correct.
 * <p>
 * Note that in order to scroll the list you shouldn't use {@link ViewActions#scrollTo()} as
 * {@link Espresso#onData(org.hamcrest.Matcher)} handles scrolling.</p>
 *
 * @see #onRow(String)
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class LongListActivityTest {

    private static final String TEXT_ITEM_30 = "item: 30";

    private static final String TEXT_ITEM_30_SELECTED = "30";

    private static final String TEXT_ITEM_60 = "item: 60";

    // Match the last item by matching its text.
    private static final String LAST_ITEM_ID = "item: 99";

    @Rule
    public ActivityTestRule<LongListActivity> mActivityRule = new ActivityTestRule<>(
            LongListActivity.class);

    /**
     * Test that the list is long enough for this sample, the last item shouldn't appear.
     */
    @Test
    public void lastItem_NotDisplayed() {
        // test that the LAST_ITEM_ID view does not exit as the list wasn't scrolled down.
        fail("TODO");
    }

    @Test
    public void list_Scrolls() {
        // Check that the LAST_ITEM_ID item is created. use helper method onRow() (see below)
        // matches(isCompletelyDisplayed()) can be used to check if the item is present
        fail("TODO");
    }

    /**
     * Clicks on a row and checks that the activity detected the click.
     */
    @Test
    public void row_Click() {
        // Click on view with R.id.rowContentTextView in row TEXT_ITEM_30.
        fail("TODO");
        // Check that the activity detected the click on the first column.
        onView(withId(R.id.selection_row_value))
                .check(matches(withText(TEXT_ITEM_30_SELECTED)));
    }


    @Test
    public void toggle_Click() {
        // Click on the R.id.rowToggleButton toggle button in row TEXT_ITEM_30
        fail("TODO");
        // Check that the R.id.rowToggleButton toggle button is checked.
        // use matches(isChecked()
        fail("TODO");
    }


    @Test
    public void toggle_ClickDoesntPropagate() {
        // Click on the rows with TEXT_ITEM_30 on the child view with ID R.id.rowContentTextView
        fail("TODO");
        // Click on the R.id.rowToggleButton toggle button, in the TEXT_ITEM_60 row.
        fail("TODO");
        // the toogle button should have consumed the click event
        // check that the activity didn't update the R.id.selection_row_value
        // it should still contain TEXT_ITEM_30_SELECTED
        fail("TODO");
    }


    private static DataInteraction onRow(String str) {
        return onData(hasEntry(equalTo(LongListActivity.ROW_TEXT), is(str)));
    }
}