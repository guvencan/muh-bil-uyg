package com.siyah.myapplication.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.siyah.myapplication.R;

import java.text.NumberFormat;

/**
 * Created by siyah-pc on 12.12.2015.
 */
public class Sekil2Fragment extends android.app.Fragment {

    EditText a;
    EditText b;
    EditText T;
    EditText Stress;
    EditText j;
    Button coz;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil2_sayfa, container, false);

        coz = (Button) v.findViewById(R.id.button2);
        a = (EditText) v.findViewById(R.id.editText5);
        b = (EditText) v.findViewById(R.id.editText6);
        T = (EditText) v.findViewById(R.id.editText9);
        j = (EditText) v.findViewById(R.id.editText7);
        Stress = (EditText) v.findViewById(R.id.editText8);

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

                    double jUs = (Math.PI * Math.pow(a1, 3) * Math.pow(b1, 3)) / (Math.pow(a1, 2) + Math.pow(b1, 2));
                    double St = (2 * T1) / (Math.PI * a1 * Math.pow(b1, 3));

                    NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(4);
                    String S = nf.format(jUs);
                    String S2 = nf.format(St);

                    j.setText(String.valueOf(S));
                    Stress.setText(String.valueOf(S2));

                    InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                }
            }
        });


        return v;
    }
}
