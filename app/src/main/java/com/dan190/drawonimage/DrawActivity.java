package com.dan190.drawonimage;

import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dan on 18/03/2017.
 */

public class DrawActivity extends AppCompatActivity {
    private CanvasView canvas;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_activity);
        canvas = (CanvasView) findViewById(R.id.canvas);
    }
}
