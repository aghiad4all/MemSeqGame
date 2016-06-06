package com.microb.game.memseq;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

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
        //tempScore= Integer.valueOf(getIntent().getStringExtra("level").toString());
        tempScore=1;
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
                String text = "Look at my awesome picture";
                Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.logo);
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+"/Logo.png";
                OutputStream out = null;
                File file=new File(path);
                try {
                    out = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                path=file.getPath();
                Uri bmpUri = Uri.parse("file://"+path);
                Intent shareIntent = new Intent();
                shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.putExtra(Intent.EXTRA_STREAM, bmpUri);
                shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                shareIntent.setType("image/*");
                startActivity(Intent.createChooser(shareIntent,"Share with"));


            }
        });
    }

}
