package com.timecapsule.app.locationpick.controller;

import android.content.Intent;

/**
 * Created by catwong on 3/17/17.
 */

public interface MediaListener {
     void goToCamera(Intent intent);
     void goToVideo(Intent intent);
     void goToAudio();
}