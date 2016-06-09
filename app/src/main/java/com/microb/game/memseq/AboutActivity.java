package com.microb.game.memseq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AboutActivity extends AppCompatActivity {

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        BackButtonListener();
    }

    public void BackButtonListener(){
        back=(ImageButton)findViewById(R.id.imageButton6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aintent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(aintent);
                finish();
            }
        });
    }
}
