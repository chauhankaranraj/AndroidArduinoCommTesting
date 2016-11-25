package com.example.karanraj.chauhan.androidarduinocomm2;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by karanraj on 11/25/16.
 */

public class TestActivity extends Activity {

    public static final String EXTRAS_DEVICE_NAME = "DEVICE_NAME";
    public static final String EXTRAS_DEVICE_ADDRESS = "DEVICE_ADDRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
