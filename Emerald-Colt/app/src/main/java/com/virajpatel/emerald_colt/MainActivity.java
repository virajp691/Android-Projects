package com.virajpatel.emerald_colt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called by TopSectionFragment on button click
    @Override
    public void createMeme(String top, String bot) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.Botfragment);
        bottomFragment.setImageText(top,bot);
    }
}
