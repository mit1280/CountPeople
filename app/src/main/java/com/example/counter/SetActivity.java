package com.example.counter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

public class SetActivity extends AppCompatActivity {
    private EditText SetNumber;
    private Button SetN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        SetNumber = (EditText)findViewById(R.id.setNumber);
        SetNumber.requestFocus();
        SetN = (Button) findViewById(R.id.setN);
        SetN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SetActivity.this, MainActivity.class);
                myIntent.putExtra("Count", SetNumber.getText().toString());
                startActivity(myIntent);
            }
        });
    }

}
