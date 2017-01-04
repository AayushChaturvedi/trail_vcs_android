package com.example.aayush.counter_r2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button IncButton, DecButton, LcListen;
    TextView cTV;

    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IncButton=(Button)findViewById(R.id.IncButton);
        cTV = (TextView)findViewById(R.id.cTV);
        IncButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        c++;
                        cTV.setText(c + "");
                    }
                }
        );
        DecButton=(Button)findViewById(R.id.DecButton);
        DecButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        c--;
                        cTV.setText(c + "");
                    }
                }
        );
        LcListen= (Button)findViewById(R.id.button2);
        LcListen.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        cTV.setText("You gave a long click!");
                        return false;
                    }
                }
        );
        LcListen.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        cTV.setText(c + "");
                    }
                }
        );
    }
}
