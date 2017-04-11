package com.vogella.android.test.juntexamples.mockitotests;

import com.vogella.android.test.juntexamples.MyApplication;
import com.vogella.android.test.juntexamples.util.ConfigureThreadingUtil;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by vogella on 19.06.16.
 */

public class ConfigureThreadingUtilTests {
    @Test
    public void testApplication (){
        // mock MyApplication
        // call ConfigureThreadingUtil.configureThreadPool
        // verify that getNumberOfThreads was called on app


    }
}
