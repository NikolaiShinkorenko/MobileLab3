package com.example.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrameLayoutActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageButton imageButton;
    private int[] images = {R.drawable.fire_cat, R.drawable.look_cat, R.drawable.prison_cat,
    R.drawable.melon_cat, R.drawable.grass_cat, R.drawable.water_cat, R.drawable.like_cat};
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageButton = (ImageButton) findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImageIndex < images.length - 1) {
                    currentImageIndex++;
                }
                else {
                    currentImageIndex = 0;
                }
                imageView.setImageResource(images[currentImageIndex]);
            }
        });
    }
}