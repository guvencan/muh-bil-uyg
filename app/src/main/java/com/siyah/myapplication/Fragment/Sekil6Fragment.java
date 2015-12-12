package com.siyah.myapplication.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.siyah.myapplication.R;

import java.text.NumberFormat;

/**
 * Created by siyah-pc on 12.12.2015.
 */
public class Sekil6Fragment extends android.app.Fragment {

    EditText a;
    EditText b;
    EditText T;
    EditText j;
    EditText St;
    Button coz;
    Switch sw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil6_sayfa, container, false);

        a = (EditText) v.findViewById(R.id.editText23);
        b = (EditText) v.findViewById(R.id.editText24);
        T = (EditText) v.findViewById(R.id.editText25);
        j = (EditText) v.findViewById(R.id.editText26);
        St = (EditText) v.findViewById(R.id.editText27);
        coz = (Button) v.findViewById(R.id.button6);
        sw = (Switch) v.findViewById(R.id.switch1);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a.getText().toString().equals("")  || T.getText().toString().equals("") ||b.getText().toString().equals("") )
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Gerekli yerleri doldurun.", Toast.LENGTH_SHORT).show();
                }
                else
                {

                double a1 = Double.valueOf(String.valueOf(a.getText()));
                double b1 = Double.valueOf(String.valueOf(b.getText()));
                double T1 = Double.valueOf(String.valueOf(T.getText()));
                double j1;

                if (sw.isChecked()){
                    j1 = 0.0915*Math.pow(b1,4)*((a1/b1)-0.8592);

                }else{
                    j1 = (Math.pow(a1,3)* Math.pow(b1,3))/((15*Math.pow(a1,2))+(20*Math.pow(b1,2)));
                }

                double q = j1/(b1*(0.2+(0.309*(a1/b1))-(0.418*Math.pow(a1/b1,2))));
                double St1 = T1/q;

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j1);
                String S2 = nf.format(St1);

                j.setText(String.valueOf(S));
                St.setText(String.valueOf(S2));

                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

            }

            }
        });



        return v;
    }
}
