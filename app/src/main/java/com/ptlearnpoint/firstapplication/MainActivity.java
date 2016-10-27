package com.ptlearnpoint.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sampleText = (TextView) findViewById(R.id.sample_txt);

        sampleText.setText("ptlearnpoint.com");

    }
}
