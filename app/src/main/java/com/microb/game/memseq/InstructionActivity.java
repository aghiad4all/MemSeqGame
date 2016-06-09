package com.microb.game.memseq;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class InstructionActivity extends AppCompatActivity {

    ImageButton goPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        InstructionButtonListener();
    }

    public void InstructionButtonListener(){
        goPlay=(ImageButton)findViewById(R.id.imageButton5);
        goPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aintent = new Intent(InstructionActivity.this, game_start.class);
                startActivity(aintent);
                finish();
            }
        });
    }
}
