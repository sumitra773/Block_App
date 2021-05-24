package com.example.android.block_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondBlock extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button takeMe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_block);

        textView = findViewById(R.id.tx_view);
        imageView = findViewById(R.id.img_view);
        takeMe = findViewById(R.id.btn_me);

        takeMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kids.nationalgeographic.com/animals/mammals/facts/pig"));
                startActivity(intent);

            }
        });
    }
}