package com.example.orginalrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
private ImageView img;
private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img=findViewById(R.id.imageView2);
        txt=findViewById(R.id.textView2);
        Intent intent=getIntent();
        img.setImageResource(intent.getIntExtra("image",0));
        txt.setText(intent.getStringExtra("Details"));
    }
}