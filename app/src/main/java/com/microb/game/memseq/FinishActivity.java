package com.microb.game.memseq;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    TextView score;
    TextView ifHighScore;

    ImageButton restart;
    ImageButton share;

    int highScore;
    int tempScore;
    private SharedPreferences preferenceSettings;
    private SharedPreferences.Editor preferenceEditor;
    private static final int PREFERENCE_MODE_PRIVATE=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        score = (TextView)findViewById(R.id.textView4);
        ifHighScore=(TextView)findViewById(R.id.textView5);

        restart= (ImageButton)findViewById(R.id.imageButton3);
        share= (ImageButton)findViewById(R.id.imageButton4);

        //***Check high Score
        preferenceSettings = getPreferences(PREFERENCE_MODE_PRIVATE);
        preferenceEditor = preferenceSettings.edit();
        tempScore= Integer.valueOf(getIntent().getStringExtra("level").toString());
        highScore =  preferenceSettings.getInt("highScore", 0);
        if(tempScore>highScore){
            preferenceEditor.putInt("highScore",tempScore);
            ifHighScore.setText("New High Score!");
        }
        /////////////////////////////////////////////////////
        score.setText(Integer.toString(tempScore));
        restartButtonListener();
        sharetButtonListener();
    }

    public void restartButtonListener(){
        restart=(ImageButton)findViewById(R.id.imageButton3);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.start);
        restart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent aintent = new Intent(FinishActivity.this, game_start.class);
                mp.start();
                startActivity(aintent);
            }
        });
    }

    public void sharetButtonListener(){
        share=(ImageButton)findViewById(R.id.imageButton4);
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Select a file from sdcard to share
                String fileName = "gameover.png";//Name of an image
                String externalStorageDirectory = Environment.getExternalStorageDirectory().toString();
                String myDir = externalStorageDirectory + "/saved_images/"; // the file will be in saved_images
                Uri uri = Uri.parse("file:///" + myDir + fileName);

                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/html");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, (String) v.getTag(R.string.app_name));
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "I am having so much fun playing MEMSEQ, my Latest score is: "+tempScore);
                shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
                startActivity(Intent.createChooser(shareIntent, "Share Deal"));
            }
        });
    }

}
