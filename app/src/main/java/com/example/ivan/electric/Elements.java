package com.example.ivan.electric;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Elements extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.elements, container, false);
        final ImageView image;
        image=(ImageView) rootView.findViewById(R.id.imagePnev);
        Button startBtn=(Button)rootView.findViewById(R.id.button2);
        Button stopBtn=(Button)rootView.findViewById(R.id.button3);
        if(image==null) throw new AssertionError();
        image.setBackgroundResource(R.drawable.animpnev);
        image.setVisibility(View.INVISIBLE);
        final AnimationDrawable anim=(AnimationDrawable)image.getBackground();
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);
                if(anim.isRunning()){
                    anim.stop();
                }
                anim.start();
            }

        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim.stop();
            }
        });
        return rootView;
    }
}
