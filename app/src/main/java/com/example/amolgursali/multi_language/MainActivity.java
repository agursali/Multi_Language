package com.example.amolgursali.multi_language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.txt);
        imageView=(ImageView)findViewById(R.id.img);
        txt.setText(getString(R.string.welcome));
        imageView.setImageResource(R.mipmap.flag);
    }
}
