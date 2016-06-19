package com.virajpatel.emerald_colt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment{

    private static TextView topText;
    private static TextView botText;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topText = (TextView)view.findViewById(R.id.TopText);
        botText = (TextView)view.findViewById(R.id.BotText);
        return view;
    }

    public void setImageText(String top, String bot){
        topText.setText(top);
        botText.setText(bot);
    }


}
