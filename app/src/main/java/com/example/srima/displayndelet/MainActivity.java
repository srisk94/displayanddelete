package com.example.srima.displayndelet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView tv;
    Button delete;
    Button addfile;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.fromedit);
        delete=(Button)findViewById(R.id.button2);
        addfile=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.ed);
        addfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(editText.getText().toString());
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
    }

}
