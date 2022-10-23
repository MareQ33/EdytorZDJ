package com.example.edytorzdj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.Veigar);
        SeekBar seekBar1 = findViewById(R.id.seek1);
        SeekBar seekBar2 = findViewById(R.id.seek2);
        SeekBar seekBar3 = findViewById(R.id.seek3);


    }
}