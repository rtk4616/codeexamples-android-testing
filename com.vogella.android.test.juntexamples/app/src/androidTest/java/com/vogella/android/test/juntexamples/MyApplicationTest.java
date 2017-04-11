package com.vogella.android.test.juntexamples;

import android.content.pm.PackageInfo;
import android.test.ApplicationTestCase;
import android.test.MoreAsserts;

import org.junit.Test;

/**
 * Created by vogella on 19.06.16.
 */

public class MyApplicationTest extends ApplicationTestCase<MyApplication> {

    private MyApplication application;

    public MyApplicationTest() {
        super(MyApplication.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        createApplication();
        application = getApplication();

    }


    public void testCorrectVersion() throws Exception {
        PackageInfo info = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        fail("Check that info is not null");
        fail("Use your custom regex matcher to ensure that info.versionName has only digits separated by .");
    }
}
