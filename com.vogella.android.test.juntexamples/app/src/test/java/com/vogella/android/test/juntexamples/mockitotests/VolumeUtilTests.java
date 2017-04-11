package com.vogella.android.test.juntexamples.mockitotests;

import android.media.AudioManager;

import com.vogella.android.test.juntexamples.util.VolumeUtil;

import org.junit.Test;
import org.mockito.Mockito;

import static android.media.AudioManager.RINGER_MODE_NORMAL;
import static android.media.AudioManager.RINGER_MODE_SILENT;
import static android.media.AudioManager.STREAM_RING;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * Created by vogella on 19.06.16.
 */

public class VolumeUtilTests {
    @Test
    public void testNormalRingerIsMaximized(){
        // 1.) mock AudioManager
        // 2.) configure Audiomanager to return RINGER_MODE_NORMAL if getRinderMode is called
        // 3.) configure Audiomanager to return 100 if getStreamMaxVolume(STREAM_RING) is called
        // 4.) call VolumeUtil.maximizeVolume with Audiomanager -> code under test
        // 5.) verify that setStreamVolume(STREAM_RING, 100, 0) was called on audioManager

    }

    @Test
    public void testSilentRingerIsNotDisturbed() {
        // 1. Prepare AudioManager mock
        // 2.) configure audiomanager to return "RINGER_MODE_SILENT" if getRingerMode is called
        // 3.) call VolumeUtil.maximizeVolume with audio manager
        // 4.) verify that getRingerMode()
        // 5.) Ensure that nothing more was called


    }


}
