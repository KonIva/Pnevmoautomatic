package com.example.ivan.electric;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Invertors extends Fragment implements View.OnClickListener{

    private EditText editText3;
    private EditText editText4;
    private Button button;
    private TextView textView19;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.invertors, container,false);
        editText3=(EditText)rootView.findViewById(R.id.editText3);
        editText4=(EditText)rootView.findViewById(R.id.editText4);
        button=(Button)rootView.findViewById(R.id.button);
        button.setOnClickListener(this);
        textView19=(TextView)rootView.findViewById(R.id.textView19);

        return rootView;
    }

    @Override
    public void onClick(View v) {

        String firstM=editText3.getText().toString();
        String secondM=editText4.getText().toString();
        float end1=Float.parseFloat(firstM)+Float.parseFloat(secondM);
        String end=String.valueOf(end1);
        float ampers=end1/400;
        String ampers1=String.valueOf(ampers);
        textView19.setText(end1+" Вт\n"+ampers1+" Ампер");
        }
    }

