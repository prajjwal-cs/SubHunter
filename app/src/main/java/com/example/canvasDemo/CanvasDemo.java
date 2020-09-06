package com.example.canvasDemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class CanvasDemo extends Activity {

    ImageView myImageView;
    Bitmap myBlankBitmap;
    Canvas myCanvas;
    Paint myPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize all the objects ready for drawing.
        int widthInPixels = 800;
        int heightInPixels = 800;

        // Create a new Bitmap
        myBlankBitmap = Bitmap.createBitmap(widthInPixels,
                heightInPixels, Bitmap.Config.ARGB_8888);

        // Initialize the ImageView and associate it
        // with the Bitmap to draw on
        myCanvas = new Canvas(myBlankBitmap);

        // Initialize the imageView and the paint
        myImageView = new ImageView(this);
        myPaint = new Paint();
        // Draw on the Bitmap
        // Wipe the Bitmap with a blue color
        myCanvas.drawColor(Color.argb(25, 0, 0, 255));

        // Resize the text
        myPaint.setTextSize(100);
    }
}
