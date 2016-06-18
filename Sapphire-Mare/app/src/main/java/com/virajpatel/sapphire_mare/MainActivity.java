package com.virajpatel.sapphire_mare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coolButton = (Button)findViewById(R.id.coolButton);

        // On click button Event
        coolButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView coolTF = (TextView)findViewById(R.id.coolTF);
                        coolTF.setText("Button Clicked");
                    }
                }
        );

        coolButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView coolTF = (TextView)findViewById(R.id.coolTF);
                        coolTF.setText("Button Long Clicked");
                        return false;
                    }
                }
        );
    }
}
