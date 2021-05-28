package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Info;
    private Button Reset, Set, Inr, Dec, SetN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = this.getIntent().getExtras();
        if(b!=null){
            Info = (TextView) findViewById(R.id.text);
            Info.setText(b.getString("Count"));
        }

        Info = (TextView) findViewById(R.id.text);
        Inr = (Button)findViewById(R.id.plse);
        Dec = (Button)findViewById(R.id.minus);
        Reset = (Button)findViewById(R.id.Reset);
        Set = (Button)findViewById(R.id.Set);

        Inr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info = (TextView)findViewById(R.id.text);
                int x=Integer.parseInt(Info.getText().toString());
                x=x+1;
                Info.setText(String.valueOf(x));
            }
        });
        Dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info = (TextView)findViewById(R.id.text);
                int x=Integer.parseInt(Info.getText().toString());
                x=x-1;
                Info.setText(String.valueOf(x));
            }
        });
        Set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SetActivity.class);
                startActivity(intent);
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(String.valueOf(0));
            }
        });
    }
}