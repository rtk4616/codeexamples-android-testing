package com.vogella.android.test.juntexamples.mockito;

import android.content.Context;
import android.content.Intent;
import android.support.test.runner.AndroidJUnit4;

import com.vogella.android.test.juntexamples.OutgoingCallReceiver;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class OutgoingCallReceiverTest {
    private OutgoingCallReceiver mReceiver;
    private Context mContext;

    @Before
    public void setUp() {
        mReceiver = new OutgoingCallReceiver();
        // TODO create mContext mock;
    }



    @Test
    public void activityShouldGetCorrectIntentData() {
        // prepare data for onReceive and call it
        Intent intent = new Intent(Intent.ACTION_NEW_OUTGOING_CALL);
        intent.putExtra(Intent.EXTRA_PHONE_NUMBER, "01234567890");

        mReceiver.onReceive(mContext, intent);

        // See MockitoExampleForArgumentCapture for a working argument capture implementation
        // assert that resultData from mReceiver

        // what did receiver do?
        // Use ArgumentCaptor.forClass to capture the intent
        // Fill the argument with the correct verify call
        // Extract the intent data for the test

    }
}