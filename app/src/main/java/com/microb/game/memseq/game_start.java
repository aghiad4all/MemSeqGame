package com.microb.game.memseq;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class game_start extends AppCompatActivity {

    String text="";
    String seqHidden="";
    TextView seq;
    TextView levelIndicator;
    EditText answer;
    ProgressBar progressBar;
    MyCountDownTimer myCountDownTimer;
    CountDownTimer gameCountDownTimer;
    int time=0;
    int level=1;
    int lives=3;
    int passes=3;
    int progress;
    int oldHIghScore;
    //***Keyboard Row 1
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;

    //***Keyboard Row 2
    Button bQ;
    Button bW;
    Button bE;
    Button bR;
    Button bT;
    Button bY;
    Button bU;
    Button bI;
    Button bO;
    Button bP;

    //***Keyboard Row 3
    Button bA;
    Button bS;
    Button bD;
    Button bF;
    Button bG;
    Button bH;
    Button bJ;
    Button bK;
    Button bL;

    //***Keyboard Row 4
    Button bZ;
    Button bX;
    Button bC;
    Button bV;
    Button bB;
    Button bN;
    Button bM;

    //***Keyboard Row 5
    Button bSpace;
    Button bDel;

    //***Mode Keys
    Button bPass;
    Button bNext;

    //***Lives Indicator
    Button live1;
    Button live2;
    Button live3;

    private SharedPreferences preferenceSettings;
    private SharedPreferences.Editor preferenceEditor;
    private static final int PREFERENCE_MODE_PRIVATE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        seq=(TextView)findViewById(R.id.textView);
        levelIndicator=(TextView)findViewById(R.id.textView2);
        answer = (EditText)findViewById(R.id.editText);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        //***Keyboard Row 1
        b1ButtonListener();
        b2ButtonListener();
        b3ButtonListener();
        b4ButtonListener();
        b5ButtonListener();
        b6ButtonListener();
        b7ButtonListener();
        b8ButtonListener();
        b9ButtonListener();
        b0ButtonListener();

        //***Keyboard Row 2
        bQButtonListener();
        bWButtonListener();
        bEButtonListener();
        bRButtonListener();
        bTButtonListener();
        bYButtonListener();
        bUButtonListener();
        bIButtonListener();
        bOButtonListener();
        bPButtonListener();

        //***Keyboard Row 3
        bAButtonListener();
        bSButtonListener();
        bDButtonListener();
        bFButtonListener();
        bGButtonListener();
        bHButtonListener();
        bJButtonListener();
        bKButtonListener();
        bLButtonListener();

        //***Keyboard Row 4
        bZButtonListener();
        bXButtonListener();
        bCButtonListener();
        bVButtonListener();
        bBButtonListener();
        bNButtonListener();
        bMButtonListener();

        //***Keyboard Row 5
        bSpaceButtonListener();
        bDelButtonListener();

        //***Mode buttons
        bPassButtonListener();
        bNextButtonListener();

        //***lives Indicator
        live1=(Button)findViewById(R.id.button46);
        live2=(Button)findViewById(R.id.button47);
        live3=(Button)findViewById(R.id.button48);

        seq= (TextView)findViewById(R.id.textView);
        generateRandomChars(level+2);

        disableButtons();
        progressBar.setProgress(100);
        myCountDownTimer = new MyCountDownTimer(5000, 100);
        myCountDownTimer.start();

        preferenceSettings = getPreferences(PREFERENCE_MODE_PRIVATE);
        preferenceEditor = preferenceSettings.edit();
    }

    //***Action Listener Keyboard Row 1
    public void b1ButtonListener(){
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "1";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b2ButtonListener(){
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"2";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b3ButtonListener(){
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"3";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b4ButtonListener(){
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"4";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b5ButtonListener(){
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"5";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b6ButtonListener(){
        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"6";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b7ButtonListener(){
        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"7";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b8ButtonListener(){
        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"8";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b9ButtonListener(){
        b9=(Button)findViewById(R.id.button10);
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"9";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }
    public void b0ButtonListener(){
        b0=(Button)findViewById(R.id.button11);
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"0";
                answer.setText(text,TextView.BufferType.EDITABLE);
            }


        });
    }

    //***Action Listener Keyboard Row 2
    public void bQButtonListener(){
        bQ=(Button)findViewById(R.id.button12);
        bQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "Q";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bWButtonListener(){
        bW=(Button)findViewById(R.id.button13);
        bW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "W";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bEButtonListener(){
        bE=(Button)findViewById(R.id.button14);
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "E";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bRButtonListener(){
        bR=(Button)findViewById(R.id.button15);
        bR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "R";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bTButtonListener(){
        bT=(Button)findViewById(R.id.button16);
        bT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "T";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bYButtonListener(){
        bY=(Button)findViewById(R.id.button17);
        bY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "Y";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bUButtonListener(){
        bU=(Button)findViewById(R.id.button18);
        bU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "U";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bIButtonListener(){
        bI=(Button)findViewById(R.id.button19);
        bI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "I";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bOButtonListener(){
        bO=(Button)findViewById(R.id.button20);
        bO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "O";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bPButtonListener(){
        bP=(Button)findViewById(R.id.button21);
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "P";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }

    //***Action Listener Keyboard Row 3
    public void bAButtonListener(){
        bA=(Button)findViewById(R.id.button22);
        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "A";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bSButtonListener(){
        bS=(Button)findViewById(R.id.button23);
        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "S";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bDButtonListener(){
        bD=(Button)findViewById(R.id.button24);
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "D";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bFButtonListener(){
        bF=(Button)findViewById(R.id.button25);
        bF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "F";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bGButtonListener(){
        bG=(Button)findViewById(R.id.button26);
        bG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "G";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bHButtonListener(){
        bH=(Button)findViewById(R.id.button27);
        bH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "H";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bJButtonListener(){
        bJ=(Button)findViewById(R.id.button28);
        bJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "J";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bKButtonListener(){
        bK=(Button)findViewById(R.id.button29);
        bK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "K";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bLButtonListener(){
        bL=(Button)findViewById(R.id.button30);
        bL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "L";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }

    //***Action Listener Keyboard Row 4
    public void bZButtonListener(){
        bZ=(Button)findViewById(R.id.button31);
        bZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "Z";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bXButtonListener(){
        bX=(Button)findViewById(R.id.button32);
        bX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "X";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bCButtonListener(){
        bC=(Button)findViewById(R.id.button33);
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "C";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bVButtonListener(){
        bV=(Button)findViewById(R.id.button34);
        bV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "V";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bBButtonListener(){
        bB=(Button)findViewById(R.id.button35);
        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "B";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bNButtonListener(){
        bN=(Button)findViewById(R.id.button36);
        bN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "N";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bMButtonListener(){
        bM=(Button)findViewById(R.id.button37);
        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + "M";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }

    //***Action Listener Keyboard Row 5
    public void bSpaceButtonListener(){
        bSpace=(Button)findViewById(R.id.button42);
        bSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = text + " ";
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }
    public void bDelButtonListener(){
        bDel=(Button)findViewById(R.id.button43);
        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text != null && text.length() > 0 ) {
                    text = text.substring(0, text.length()-1);
                }
                answer.setText(text, TextView.BufferType.EDITABLE);
            }


        });
    }

    //***Action Listener Mode Keys
    public void bPassButtonListener(){
        bPass=(Button)findViewById(R.id.button44);
        bPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passes > 0) {
                    answer.setText("");
                    text="";
                    generateRandomChars(level+2);
                    disableButtons();
                    passes--;
                    bPass.setText("Pass(" + passes + ")");
                    progressBar.setProgress(100);
                    myCountDownTimer = new MyCountDownTimer(5000, 100);
                    myCountDownTimer.start();
                    Toast.makeText(getApplicationContext(), "The Level is:  " + level,
                            Toast.LENGTH_LONG).show();
                }
                if(passes==0){
                    Toast.makeText(getApplicationContext(), "You Have Used All Your Passes",
                            Toast.LENGTH_LONG).show();

                }
            }

        });
    }
    public void bNextButtonListener() {
        bNext = (Button) findViewById(R.id.button45);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seqHidden.equals(answer.getText().toString())) {
                    answer.setText("");
                    text="";
                    level++;
                    levelIndicator.setText(Integer.toString(level));
                    generateRandomChars(level+2);
                    disableButtons();
                    progressBar.setProgress(100);
                    myCountDownTimer = new MyCountDownTimer(5000, 100);
                    myCountDownTimer.start();
                    Toast.makeText(getApplicationContext(), "The Level is:  " + level,
                            Toast.LENGTH_LONG).show();
                }
                else{
                    lives--;
                    calcLives();
                    answer.setText("");
                    text="";
                    generateRandomChars(level+2);
                    disableButtons();
                    progressBar.setProgress(100);
                    myCountDownTimer = new MyCountDownTimer(5000, 100);
                    myCountDownTimer.start();
                }
                if(lives==0){
                    Intent finish = new Intent(game_start.this, FinishActivity.class);
                    finish.putExtra("level", level);
                    oldHIghScore=preferenceSettings.getInt("highscore", 0);
                    if(level>oldHIghScore){
                        preferenceEditor.putInt("HighScore", level);
                    }
                    startActivity(finish);
                }
            }


        });
    }
    //*** checks lives
    public void calcLives(){
        if(lives==2){
            live1.setBackgroundColor(Color.parseColor("#ff0000"));
            live2.setBackgroundColor(Color.parseColor("#ff0000"));
            live3.setBackgroundColor(Color.parseColor("#00ddff"));
        }
        else if(lives==1){
            live1.setBackgroundColor(Color.parseColor("#ff0000"));
            live2.setBackgroundColor(Color.parseColor("#00ddff"));
            live3.setBackgroundColor(Color.parseColor("#00ddff"));
        }
        else if(lives==0){
            live1.setBackgroundColor(Color.parseColor("#00ddff"));
            live2.setBackgroundColor(Color.parseColor("#00ddff"));
            live3.setBackgroundColor(Color.parseColor("#00ddff"));
        }
    }
    public void generateRandomChars(int level){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < level+1) {
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        String saltStr = salt.toString();
        seq.setText(saltStr);
    }
    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            int progress = (int) (millisUntilFinished/50);
            progressBar.setProgress(progress);
        }

        @Override
        public void onFinish() {
            seqHidden=seq.getText().toString();
            seq.setText("");
            progressBar.setProgress(0);
            enableButtons();
        }
    }

    public void disableButtons(){
        //***Keyboard Row 1
        b1.setTextColor(Color.parseColor("#ff0000"));
        b1.setEnabled(false);
        b2.setTextColor(Color.parseColor("#ff0000"));
        b2.setEnabled(false);
        b3.setTextColor(Color.parseColor("#ff0000"));
        b3.setEnabled(false);
        b4.setTextColor(Color.parseColor("#ff0000"));
        b4.setEnabled(false);
        b5.setTextColor(Color.parseColor("#ff0000"));
        b5.setEnabled(false);
        b6.setTextColor(Color.parseColor("#ff0000"));
        b6.setEnabled(false);
        b7.setTextColor(Color.parseColor("#ff0000"));
        b7.setEnabled(false);
        b8.setTextColor(Color.parseColor("#ff0000"));
        b8.setEnabled(false);
        b9.setTextColor(Color.parseColor("#ff0000"));
        b9.setEnabled(false);
        b0.setTextColor(Color.parseColor("#ff0000"));
        b0.setEnabled(false);

        //***Keyboard Row 2
        bQ.setTextColor(Color.parseColor("#ff0000"));
        bQ.setEnabled(false);
        bW.setTextColor(Color.parseColor("#ff0000"));
        bW.setEnabled(false);
        bE.setTextColor(Color.parseColor("#ff0000"));
        bE.setEnabled(false);
        bR.setTextColor(Color.parseColor("#ff0000"));
        bR.setEnabled(false);
        bT.setTextColor(Color.parseColor("#ff0000"));
        bT.setEnabled(false);
        bY.setTextColor(Color.parseColor("#ff0000"));
        bY.setEnabled(false);
        bU.setTextColor(Color.parseColor("#ff0000"));
        bU.setEnabled(false);
        bI.setTextColor(Color.parseColor("#ff0000"));
        bI.setEnabled(false);
        bO.setTextColor(Color.parseColor("#ff0000"));
        bO.setEnabled(false);
        bP.setTextColor(Color.parseColor("#ff0000"));
        bP.setEnabled(false);

        //***Keyboard Row 3
        bA.setTextColor(Color.parseColor("#ff0000"));
        bA.setEnabled(false);
        bS.setTextColor(Color.parseColor("#ff0000"));
        bS.setEnabled(false);
        bD.setTextColor(Color.parseColor("#ff0000"));
        bD.setEnabled(false);
        bF.setTextColor(Color.parseColor("#ff0000"));
        bF.setEnabled(false);
        bG.setTextColor(Color.parseColor("#ff0000"));
        bG.setEnabled(false);
        bH.setTextColor(Color.parseColor("#ff0000"));
        bH.setEnabled(false);
        bJ.setTextColor(Color.parseColor("#ff0000"));
        bJ.setEnabled(false);
        bK.setTextColor(Color.parseColor("#ff0000"));
        bK.setEnabled(false);
        bL.setTextColor(Color.parseColor("#ff0000"));
        bL.setEnabled(false);

        //***Keyboard Row 4
        bZ.setTextColor(Color.parseColor("#ff0000"));
        bZ.setEnabled(false);
        bX.setTextColor(Color.parseColor("#ff0000"));
        bX.setEnabled(false);
        bC.setTextColor(Color.parseColor("#ff0000"));
        bC.setEnabled(false);
        bV.setTextColor(Color.parseColor("#ff0000"));
        bV.setEnabled(false);
        bB.setTextColor(Color.parseColor("#ff0000"));
        bB.setEnabled(false);
        bN.setTextColor(Color.parseColor("#ff0000"));
        bN.setEnabled(false);
        bM.setTextColor(Color.parseColor("#ff0000"));
        bM.setEnabled(false);

        //***Keyboard Row 5
        bSpace.setTextColor(Color.parseColor("#ff0000"));
        bSpace.setEnabled(false);
        bDel.setTextColor(Color.parseColor("#ff0000"));
        bDel.setEnabled(false);

        //***Mode Keys
        bPass.setTextColor(Color.parseColor("#ff0000"));
        bPass.setEnabled(false);
        bNext.setTextColor(Color.parseColor("#ff0000"));
        bNext.setEnabled(false);
    }
    public void enableButtons(){
        //***Keyboard Row 1
        b1.setTextColor(Color.parseColor("#fff555"));
        b1.setEnabled(true);
        b2.setTextColor(Color.parseColor("#fff555"));
        b2.setEnabled(true);
        b3.setTextColor(Color.parseColor("#fff555"));
        b3.setEnabled(true);
        b4.setTextColor(Color.parseColor("#fff555"));
        b4.setEnabled(true);
        b5.setTextColor(Color.parseColor("#fff555"));
        b5.setEnabled(true);
        b6.setTextColor(Color.parseColor("#fff555"));
        b6.setEnabled(true);
        b7.setTextColor(Color.parseColor("#fff555"));
        b7.setEnabled(true);
        b8.setTextColor(Color.parseColor("#fff555"));
        b8.setEnabled(true);
        b9.setTextColor(Color.parseColor("#fff555"));
        b9.setEnabled(true);
        b0.setTextColor(Color.parseColor("#fff555"));
        b0.setEnabled(true);

        //***Keyboard Row 2
        bQ.setTextColor(Color.parseColor("#fff555"));
        bQ.setEnabled(true);
        bW.setTextColor(Color.parseColor("#fff555"));
        bW.setEnabled(true);
        bE.setTextColor(Color.parseColor("#fff555"));
        bE.setEnabled(true);
        bR.setTextColor(Color.parseColor("#fff555"));
        bR.setEnabled(true);
        bT.setTextColor(Color.parseColor("#fff555"));
        bT.setEnabled(true);
        bY.setTextColor(Color.parseColor("#fff555"));
        bY.setEnabled(true);
        bU.setTextColor(Color.parseColor("#fff555"));
        bU.setEnabled(true);
        bI.setTextColor(Color.parseColor("#fff555"));
        bI.setEnabled(true);
        bO.setTextColor(Color.parseColor("#fff555"));
        bO.setEnabled(true);
        bP.setTextColor(Color.parseColor("#fff555"));
        bP.setEnabled(true);

        //***Keyboard Row 3
        bA.setTextColor(Color.parseColor("#fff555"));
        bA.setEnabled(true);
        bS.setTextColor(Color.parseColor("#fff555"));
        bS.setEnabled(true);
        bD.setTextColor(Color.parseColor("#fff555"));
        bD.setEnabled(true);
        bF.setTextColor(Color.parseColor("#fff555"));
        bF.setEnabled(true);
        bG.setTextColor(Color.parseColor("#fff555"));
        bG.setEnabled(true);
        bH.setTextColor(Color.parseColor("#fff555"));
        bH.setEnabled(true);
        bJ.setTextColor(Color.parseColor("#fff555"));
        bJ.setEnabled(true);
        bK.setTextColor(Color.parseColor("#fff555"));
        bK.setEnabled(true);
        bL.setTextColor(Color.parseColor("#fff555"));
        bL.setEnabled(true);

        //***Keyboard Row 4
        bZ.setTextColor(Color.parseColor("#fff555"));
        bZ.setEnabled(true);
        bX.setTextColor(Color.parseColor("#fff555"));
        bX.setEnabled(true);
        bC.setTextColor(Color.parseColor("#fff555"));
        bC.setEnabled(true);
        bV.setTextColor(Color.parseColor("#fff555"));
        bV.setEnabled(true);
        bB.setTextColor(Color.parseColor("#fff555"));
        bB.setEnabled(true);
        bN.setTextColor(Color.parseColor("#fff555"));
        bN.setEnabled(true);
        bM.setTextColor(Color.parseColor("#fff555"));
        bM.setEnabled(true);

        //***Keyboard Row 5
        bSpace.setTextColor(Color.parseColor("#fff555"));
        bSpace.setEnabled(true);
        bDel.setTextColor(Color.parseColor("#fff555"));
        bDel.setEnabled(true);

        //***Mode Keys
        bPass.setTextColor(Color.parseColor("#fff555"));
        bPass.setEnabled(true);
        bNext.setTextColor(Color.parseColor("#fff555"));
        bNext.setEnabled(true);
    }

}
