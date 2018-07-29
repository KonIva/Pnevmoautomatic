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
import android.widget.Toast;

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
         try{
         operation();
         }catch (NumberFormatException e){
         textView19.setText("Введите число");
         }
        }



     public void operation(){
         String firstM=editText3.getText().toString();
         String secondM=editText4.getText().toString();
         float firstM2 = 0;
         float secondM2=0;
         if(firstM.length()>0||secondM.length()>0){
         firstM2=Float.parseFloat(firstM);
         secondM2=Float.parseFloat(secondM);}
         String end=String.valueOf(firstM2+secondM2);
         float ampers=(firstM2+secondM2)/400;
         String ampers1=String.valueOf(ampers);
         textView19.setText(end+" Вт\n"+ampers1+" Ампер");
     }
    }

