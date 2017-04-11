/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.ServiceTestRuleSample;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ServiceTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

/**
 * JUnit4 test that uses a {@link ServiceTestRule} to interact with a bound service.
 * <p>
 * {@link ServiceTestRule} is a JUnit rule that provides a
 * simplified mechanism to start and shutdown your service before
 * and after the duration of your test. It also guarantees that the service is successfully
 * connected when starting (or binding to) a service. The service can be started
 * (or bound) using one of the helper methods. It will automatically be stopped (or unbound) after
 * the test completes and any methods annotated with
 * <a href="http://junit.sourceforge.net/javadoc/org/junit/After.html"><code>After</code></a> are
 * finished.
 * <p>
 * Note: This rule doesn't support {@link android.app.IntentService} because it's automatically
 * destroyed when {@link android.app.IntentService#onHandleIntent(android.content.Intent)} finishes
 * all outstanding commands. So there is no guarantee to establish a successful connection
 * in a timely manner.
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class LocalServiceTest {
    @Rule
    public final ServiceTestRule mServiceRule = new ServiceTestRule();

    @Test
    public void testWithBoundService() throws TimeoutException {
        Context targetContext = InstrumentationRegistry.getTargetContext();
        Intent intent = new Intent(targetContext, LocalService.class);
        LocalService.LocalBinder iBinder = (LocalService.LocalBinder) mServiceRule.bindService(intent);
        LocalService service = iBinder.getService();
        service.getRandomInt();
        // Create the service Intent.
        

        // Put some extras into the intent for the service via the Intent.
        // Bind the service and grab a reference to the binder with ServiceRule.bindService

        // Get the reference to the service, so you can call public methods on the binder directly.

        // Verify that the service is working correctly and gives you a integer
    	// via getRandomInt()
    }
}
