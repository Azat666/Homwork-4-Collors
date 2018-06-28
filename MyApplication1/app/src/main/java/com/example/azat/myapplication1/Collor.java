package com.example.azat.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Collor extends AppCompatActivity {
    SeekBar seekred;
    SeekBar seekgreen;
    SeekBar seekblue;
    LinearLayout linearLayout;
    TextView number1;
    TextView number2;
    TextView number3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collor);
        seekred = findViewById(R.id.seekred);
        seekgreen =  findViewById(R.id.seekgreen);
        seekblue =  findViewById(R.id.seeblue);
        linearLayout = findViewById(R.id.liner);
        number1 =  findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 =  findViewById(R.id.number3);
        seekred.setMax(255);
        seekgreen.setMax(255);
        seekblue.setMax(255);
        seekred.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                collerChange();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekgreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                collerChange();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekblue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                collerChange();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void collerChange(){
        int redvalue,greenvalue,bluevalue;
        redvalue = seekred.getProgress();
        greenvalue = seekgreen.getProgress();
        bluevalue = seekblue.getProgress();
        linearLayout.setBackgroundColor(0xff000000 + redvalue * 0x10000 + greenvalue * 0x100 + bluevalue);
        number1.setText(String.valueOf(redvalue));
        number2.setText(String.valueOf(greenvalue));
        number3.setText(String.valueOf(bluevalue));
    }
}
