package com.virajpatel.intent_example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Bacon.class);
        final EditText applesInput = (EditText)findViewById(R.id.applesInput);
        String input = applesInput.getText().toString();
        i.putExtra("applesMessage", input);

        startActivity(i);
    }
}
