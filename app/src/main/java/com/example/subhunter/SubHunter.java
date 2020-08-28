package com.example.subhunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class SubHunter extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onTouchEvent (MotionEvent motionEvent) {
        return true;
    }
}