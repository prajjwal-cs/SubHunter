package com.example.subhunter;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.util.Log;
import android.widget.ImageView;
import java.util.Random;

public class SubHunter extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Debugging", "In onCreate");
        newGame();
        draw();
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.d("Debugging", "In onTouchEvent");
        takeShot();

        return true;
    }
    public void newGame() {
        Log.d("Debugging", "In newGame");
    }
    void takeShot() {
        Log.d("Debugging", "In takeShot");
        draw();
    }
    void draw() {
        Log.d("Debugging", "In draw");
    }
}