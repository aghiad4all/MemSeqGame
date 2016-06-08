package com.microb.game.memseq;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton start;
    ImageButton instruction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartButtonListener();
    }
    public void StartButtonListener(){
        start=(ImageButton)findViewById(R.id.imageButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aintent = new Intent(MainActivity.this, game_start.class);
                mp.start();
                startActivity(aintent);
            }


        });
    }

    public void InstructionButtonListener(){
        instruction=(ImageButton)findViewById(R.id.imageButton2);
        instruction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent aintent = new Intent(MainActivity.this, InstructionActivity.class);
                startActivity(aintent);
            }


        });
    }
}
