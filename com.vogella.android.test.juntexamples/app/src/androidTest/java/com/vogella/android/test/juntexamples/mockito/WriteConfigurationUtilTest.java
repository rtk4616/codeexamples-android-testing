package com.vogella.android.test.juntexamples.mockito;


import android.content.Context;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.FileOutputStream;

import static org.junit.Assert.fail;
@RunWith(AndroidJUnit4.class)
public class WriteConfigurationUtilTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    Context context;

    @Mock
    FileOutputStream fileOutputStream;

    @Test
    public void writeShouldWriteTwiceToFileSystem() {
        try {
            fail("Not yet implemented");
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
