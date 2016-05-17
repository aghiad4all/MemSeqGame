package com.microb.game.memseq;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class game_start extends AppCompatActivity {

    String text="";
    TextView seq;
    EditText answer;
    int level=3;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        seq=(TextView)findViewById(R.id.textView);
        answer = (EditText)findViewById(R.id.editText);

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

        seq= (TextView)findViewById(R.id.textView);
        seq.setText(generateRandomChars(level));
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
                if(seq.getText().toString().equals(answer.getText().toString())){
                    answer.setText("");

                }
                Toast.makeText(getApplicationContext(), "The Level is:  "+level,
                        Toast.LENGTH_LONG).show();
            }


        });
    }
    public void bNextButtonListener(){
        bNext=(Button)findViewById(R.id.button45);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(seq.getText().toString().equals(answer.getText().toString())){
                    answer.setText("");
                    level++;
                }
                Toast.makeText(getApplicationContext(), "The Level is:  "+level,
                        Toast.LENGTH_LONG).show();
            }


        });
    }


    public String generateRandomChars(int level){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < level+1) {
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
