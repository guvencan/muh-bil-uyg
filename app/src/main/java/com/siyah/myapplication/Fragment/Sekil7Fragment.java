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
public class Sekil7Fragment extends android.app.Fragment {

    EditText kenar;
    EditText T;
    EditText j;
    EditText St;
    Button coz;
    Switch sw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil7_sayfa, container, false);

        kenar = (EditText) v.findViewById(R.id.editText28);
        T = (EditText) v.findViewById(R.id.editText29);
        j =(EditText) v.findViewById(R.id.editText30);
        St =(EditText) v.findViewById(R.id.editText31);
        coz = (Button) v.findViewById(R.id.button7) ;
        sw = (Switch) v.findViewById(R.id.switch2);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(kenar.getText().toString().equals("")  || T.getText().toString().equals("")  )
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Gerekli yerleri doldurun.", Toast.LENGTH_SHORT).show();
                }
                else
                {

                double k = Double.valueOf(String.valueOf(kenar.getText()));
                double T1 = Double.valueOf(String.valueOf(T.getText()));
                double j1;
                double Stress;

                if (sw.isChecked()){
                    j1 = 0.0649*Math.pow(k,4);
                    Stress = 8.157*(T1/Math.pow(k,3));
                }
                else{
                    j1 = 0.1154*Math.pow(k,4);
                    Stress = 5.297*(T1/Math.pow(k,3));
                }

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j1);
                String S2 = nf.format(Stress);

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
