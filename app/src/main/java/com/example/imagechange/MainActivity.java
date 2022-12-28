package com.example.imagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b;
    ImageView iv;
    boolean lp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.btn);
        iv=(ImageView) findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lp=!lp;
                if(lp){
                    iv.setImageResource(R.drawable.a);
                }
                else{
                    iv.setImageResource(R.drawable.aa);
                }
            }
        });
    }
}