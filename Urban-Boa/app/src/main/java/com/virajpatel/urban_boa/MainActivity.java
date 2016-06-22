package com.virajpatel.urban_boa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    ViewGroup main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_layout = (ViewGroup)findViewById(R.id.main_layout);
        main_layout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent event){
                        moveButton();
                        return true;
                    }
                }
        );
    }

    public void moveButton(){
        View main_button = findViewById(R.id.main_button);
        TransitionManager.beginDelayedTransition(main_layout);
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        main_button.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = main_button.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        main_button.setLayoutParams(sizeRules);
    }
}
